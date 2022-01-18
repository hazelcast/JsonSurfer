/*
 * MIT License
 *
 * Copyright (c) 2019 WANG Lingsong
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package org.jsfr.json;

import org.hamcrest.CustomMatcher;
import org.hamcrest.Description;
import org.hamcrest.TypeSafeMatcher;
import org.jsfr.json.compiler.JsonPathCompiler;
import org.jsfr.json.path.JsonPath;
import org.jsfr.json.provider.JavaCollectionProvider;
import org.jsfr.json.provider.JsonProvider;
import org.junit.Ignore;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.io.InputStream;
import java.math.BigInteger;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import static java.util.Arrays.asList;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsCollectionContaining.hasItems;
import static org.jsfr.json.TestUtils.readClasspathResource;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.isA;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.hamcrest.MockitoHamcrest.argThat;

public abstract class JsonSurferTest<O extends P, A extends P, P> {

    protected static final Logger LOGGER = LoggerFactory.getLogger(JsonSurferTest.class);

    protected JsonSurfer surfer;

    protected JsonProvider<O, A, P> provider;

    private final JsonPathListener print = (value, context) -> LOGGER.debug("Received value: {}", value);

    protected InputStream read(String resourceName) throws IOException {
        return ClassLoader.getSystemResourceAsStream(resourceName);
    }

    protected String readAsString(String resourceName) {
        return readClasspathResource(resourceName, surfer.getParserCharset());
    }

    @Test
    public void testTypeCasting() throws Exception {
        surfer.configBuilder()
            .bind("$.store.book[*]", (value, context) -> assertNotNull(context.cast(value, Book.class)))
            .bind("$.expensive",
                (value, context) -> assertEquals(10L, context.cast(value, Long.class).longValue()))
            .bind("$.store.book[0].price",
                (value, context) -> assertEquals(8.95d, context.cast(value, Double.class), 0))
            .bind("$.store.book[1].title",
                (value, context) -> assertEquals("Sword of Honour", context.cast(value, String.class)))
            .buildAndSurf(read("sample.json"));
    }

    @Test
    public void testWildcardAtRoot() throws Exception {
        Collection<Object> collection = surfer.collectAll("[\n"
            + "    {\n"
            + "      \"type\"  : \"iPhone\",\n"
            + "      \"number\": \"0123-4567-8888\"\n"
            + "    },\n"
            + "    {\n"
            + "      \"type\"  : \"home\",\n"
            + "      \"number\": \"0123-4567-8910\"\n"
            + "    }\n"
            + "  ]", JsonPathCompiler.compile("$[*]"));
        LOGGER.debug("Collect all at root - {}", collection);
        assertEquals(2, collection.size());
    }

    @Test
    public void testTypeBindingOne() throws Exception {
        Book book = surfer.collectOne(read("sample.json"), Book.class, JsonPathCompiler.compile("$..book[1]"));
        assertEquals("Evelyn Waugh", book.getAuthor());
    }

    @Test
    public void testTypeBindingOneWithFilter() throws Exception {
        Book book = surfer.collectOne(read("sample.json"), Book.class,
            JsonPathCompiler.compile("$..book[*]?(@.category==\"fiction\")"),
            JsonPathCompiler.compile("$..book[*]?(@.price>9)"));
        assertEquals("Evelyn Waugh", book.getAuthor());
    }

    @Test
    public void testTypeBindingCollection() throws Exception {
        Collection<Book> book =
            surfer.collectAll(read("sample.json"), Book.class, JsonPathCompiler.compile("$..book[*]"));
        assertEquals(4, book.size());
        assertEquals("Nigel Rees", book.iterator().next().getAuthor());
    }

    @Test
    public void testSurfingIterator() throws Exception {
        Iterator<Object> iterator =
            surfer.iterator(read("sample.json"), JsonPathCompiler.compile("$.store.book[*]"));
        int count = 0;
        while (iterator.hasNext()) {
            LOGGER.debug("Iterator next: {}", iterator.next());
            count++;
        }
        assertEquals(4, count);
    }

    @Test
    public void testResumableParser() throws Exception {
        SurfingConfiguration config = surfer.configBuilder()
            .bind("$.store.book[0]", new JsonPathListener() {

                @Override
                public void onValue(Object value, ParsingContext context) {
                    LOGGER.debug("First pause");
                    context.pause();
                }
            })
            .bind("$.store.book[1]", new JsonPathListener() {

                @Override
                public void onValue(Object value, ParsingContext context) {
                    LOGGER.debug("Second pause");
                    context.pause();
                }
            }).build();
        ResumableParser parser = surfer.createResumableParser(read("sample.json"), config);
        assertFalse(parser.resume());
        LOGGER.debug("Start parsing");
        parser.parse();
        LOGGER.debug("Resume from the first pause");
        assertTrue(parser.resume());
        LOGGER.debug("Resume from the second pause");
        assertTrue(parser.resume());
        LOGGER.debug("Parsing stopped");
        assertFalse(parser.resume());
    }

    @Test
    public void testTransientMap() throws Exception {
        surfer.configBuilder()
            .bind("$.store.book[1]", (value, context) -> context.save("foo", "bar"))
            .bind("$.store.book[2]",
                (value, context) -> assertEquals("bar", context.load("foo", String.class)))
            .bind("$.store.book[0]", (value, context) -> assertNull(context.load("foo", String.class)))
            .buildAndSurf(read("sample.json"));
    }

    @Test
    public void testJsonPathFilterEqualBoolean() throws Exception {
        JsonPathListener mockListener = mock(JsonPathListener.class);
        surfer.configBuilder().bind("$.store.book[*]?(@.marked==true)", mockListener)
            .buildAndSurf(read("sample_filter.json"));

        verify(mockListener, times(1)).onValue(argThat(new CustomMatcher<Object>("test filter") {

            @Override
            public boolean matches(Object o) {
                return provider.primitive("Moby Dick").equals(resolveObject(o, "title"));
            }

        }), any(ParsingContext.class));
    }

    @Test
    public void testJsonPathFilterEqualNumber() throws Exception {
        JsonPathListener mockListener = mock(JsonPathListener.class);
        surfer.configBuilder().bind("$.store.book[*]?(@.price==8.95)", mockListener)
            .buildAndSurf(read("sample_filter.json"));

        verify(mockListener, times(1)).onValue(argThat(new CustomMatcher<Object>("test filter") {

            @Override
            public boolean matches(Object o) {
                return provider.primitive("Sayings of the Century").equals(resolveObject(o, "title"));
            }
        }), any(ParsingContext.class));
    }

    @Test
    public void testJsonPathFilterGreaterThan() throws Exception {
        JsonPathListener mockListener = mock(JsonPathListener.class);
        surfer.configBuilder().bind("$.store.book[*]?(@.price>10)", mockListener)
            .buildAndSurf(read("sample_filter.json"));

        verify(mockListener, times(1)).onValue(argThat(new CustomMatcher<Object>("test filter") {

            @Override
            public boolean matches(Object o) {
                return provider.primitive("Sword of Honour").equals(resolveObject(o, "title"));
            }
        }), any(ParsingContext.class));

        verify(mockListener, times(1)).onValue(argThat(new CustomMatcher<Object>("test filter") {

            @Override
            public boolean matches(Object o) {
                return provider.primitive("The Lord of the Rings").equals(resolveObject(o, "title"));
            }
        }), any(ParsingContext.class));

    }

    @Test
    public void testJsonPathFilterLessThan() throws Exception {
        JsonPathListener mockListener = mock(JsonPathListener.class);
        surfer.configBuilder().bind("$.store.book[*]?(@.price<10)", mockListener)
            .buildAndSurf(read("sample.json"));

        O book1 = provider.createObject();
        provider.put(book1, "category", provider.primitive("reference"));
        provider.put(book1, "author", provider.primitive("Nigel Rees"));
        provider.put(book1, "title", provider.primitive("Sayings of the Century"));
        provider.put(book1, "price", provider.primitive(8.95));
        verify(mockListener).onValue(eq(book1), any(ParsingContext.class));

        O book2 = provider.createObject();
        provider.put(book2, "category", provider.primitive("fiction"));
        provider.put(book2, "author", provider.primitive("Herman Melville"));
        provider.put(book2, "title", provider.primitive("Moby Dick"));
        provider.put(book2, "isbn", provider.primitive("0-553-21311-3"));
        provider.put(book2, "price", provider.primitive(8.99));
        verify(mockListener).onValue(eq(book2), any(ParsingContext.class));
        verify(mockListener, times(2)).onValue(any(), any(ParsingContext.class));
    }

    @Test
    public void testJsonPathFilterEqualString1() throws Exception {
        JsonPathListener mockListener = mock(JsonPathListener.class);
        surfer.configBuilder().bind("$.store.book[*]?(@.description.year==\"2010\")", mockListener)
            .buildAndSurf(read("sample_filter.json"));
        verify(mockListener, times(1)).onValue(argThat(new CustomMatcher<Object>("Test filter") {

            @Override
            public boolean matches(Object o) {
                return provider.primitive("Sword of Honour").equals(resolveObject(o, "title"));
            }
        }), any(ParsingContext.class));
    }

    @Test
    public void testJsonPathFilterEqualString() throws Exception {
        JsonPathListener mockListener = mock(JsonPathListener.class);
        surfer.configBuilder().bind("$.store.book[*]?(@.category==\"fiction\")", mockListener)
            .buildAndSurf(read("sample_filter.json"));

        verify(mockListener, times(1)).onValue(argThat(new CustomMatcher<Object>("test filter") {

            @Override
            public boolean matches(Object o) {
                return provider.primitive("Sword of Honour").equals(resolveObject(o, "title"));
            }
        }), any(ParsingContext.class));

        verify(mockListener, times(1)).onValue(argThat(new CustomMatcher<Object>("test filter") {

            @Override
            public boolean matches(Object o) {
                return provider.primitive("The Lord of the Rings").equals(resolveObject(o, "title"));
            }
        }), any(ParsingContext.class));

        verify(mockListener, times(1)).onValue(argThat(new CustomMatcher<Object>("test filter") {

            @Override
            public boolean matches(Object o) {
                return provider.primitive("Moby Dick").equals(resolveObject(o, "title"));
            }
        }), any(ParsingContext.class));

    }

    @Test
    public void testJsonPathFilterExistence() throws Exception {

        JsonPathListener mockListener = mock(JsonPathListener.class);
        surfer.configBuilder().bind("$.store.book[*]?(@.isbn)", mockListener)
            .buildAndSurf(read("sample_filter.json"));

        verify(mockListener, times(1)).onValue(argThat(new CustomMatcher<Object>("test filter") {

            @Override
            public boolean matches(Object o) {
                return provider.primitive("The Lord of the Rings").equals(resolveObject(o, "title"));
            }
        }), any(ParsingContext.class));

        verify(mockListener, times(1)).onValue(argThat(new CustomMatcher<Object>("test filter") {

            @Override
            public boolean matches(Object o) {
                return provider.primitive("Moby Dick").equals(resolveObject(o, "title"));
            }
        }), any(ParsingContext.class));

    }

    @Test
    public void testJsonPathFilterExistence2() throws Exception {

        JsonPathListener mockListener = mock(JsonPathListener.class);
        surfer.configBuilder().bind("$.store.book[*]?(@.description)", mockListener)
            .buildAndSurf(read("sample_filter.json"));

        verify(mockListener, times(1)).onValue(argThat(new CustomMatcher<Object>("test filter") {

            @Override
            public boolean matches(Object o) {
                return provider.primitive("Sword of Honour").equals(resolveObject(o, "title"));
            }
        }), any(ParsingContext.class));

    }

    @Test
    public void testJsonPathFilterNegation() throws Exception {

        JsonPathListener mockListener = mock(JsonPathListener.class);
        surfer.configBuilder().bind("$.store.book[*]?(!(@.isbn))", mockListener)
            .buildAndSurf(read("sample_filter.json"));

        verify(mockListener, times(1)).onValue(argThat(new CustomMatcher<Object>("test filter") {

            @Override
            public boolean matches(Object o) {
                return provider.primitive("Sayings of the Century").equals(resolveObject(o, "title"));
            }
        }), any(ParsingContext.class));

        verify(mockListener, times(1)).onValue(argThat(new CustomMatcher<Object>("test filter") {

            @Override
            public boolean matches(Object o) {
                return provider.primitive("Sword of Honour").equals(resolveObject(o, "title"));
            }
        }), any(ParsingContext.class));

    }

    @Test
    public void testJsonPathFilterAggregate() throws Exception {
        JsonPathListener mockListener = mock(JsonPathListener.class);
        surfer.configBuilder()
            .bind("$.store.book[*]?(@.price < 10 || @.category && @.isbn && !(@.price<10))", mockListener)
            .buildAndSurf(read("sample_filter.json"));

        verify(mockListener, times(1)).onValue(argThat(new CustomMatcher<Object>("test filter") {

            @Override
            public boolean matches(Object o) {
                return provider.primitive("Sayings of the Century").equals(resolveObject(o, "title"));
            }
        }), any(ParsingContext.class));

        verify(mockListener, times(1)).onValue(argThat(new CustomMatcher<Object>("test filter") {

            @Override
            public boolean matches(Object o) {
                return provider.primitive("The Lord of the Rings").equals(resolveObject(o, "title"));
            }
        }), any(ParsingContext.class));

        verify(mockListener, times(1)).onValue(argThat(new CustomMatcher<Object>("test filter") {

            @Override
            public boolean matches(Object o) {
                return provider.primitive("Moby Dick").equals(resolveObject(o, "title"));
            }
        }), any(ParsingContext.class));

    }

    @Test
    public void testJsonPathFilterThenChild() throws Exception {
        JsonPathListener mockListener = mock(JsonPathListener.class);
        surfer.configBuilder().bind("$.store.book[*]?(@.description.year==\"2010\").author", mockListener)
            .buildAndSurf(read("sample_filter2.json"));
        verify(mockListener, times(1)).onValue(eq(provider.primitive("Evelyn Waugh")), any(ParsingContext.class));
        verify(mockListener, times(1)).onValue(eq(provider.primitive("Nigel Rees")), any(ParsingContext.class));
    }

    @Test
    public void testJsonPathFilterThenChildDeepScan() throws Exception {
        JsonPathListener mockListener = mock(JsonPathListener.class);
        surfer.configBuilder().bind("$.store.book[*]?(@.price==8.95)..year", mockListener)
            .buildAndSurf(read("sample_filter2.json"));
        verify(mockListener, times(1)).onValue(eq(provider.primitive("2010")), any(ParsingContext.class));
        verify(mockListener, times(2)).onValue(eq(provider.primitive("1997")), any(ParsingContext.class));
        verify(mockListener, times(1)).onValue(eq(provider.primitive("1998")), any(ParsingContext.class));
    }

    @Test
    public void testJsonPathFilterAfterDeepScanAndThenChildDeepScan() throws Exception {
        JsonPathListener mockListener = mock(JsonPathListener.class);
        surfer.configBuilder().bind("$..book[*]?(@.price==8.95)..year", mockListener)
            .buildAndSurf(read("sample_filter2.json"));
        verify(mockListener, times(1)).onValue(eq(provider.primitive("2010")), any(ParsingContext.class));
        verify(mockListener, times(2)).onValue(eq(provider.primitive("1997")), any(ParsingContext.class));
        verify(mockListener, times(1)).onValue(eq(provider.primitive("1998")), any(ParsingContext.class));
    }

    @Test
    public void testJsonPathFilterAggregateThenChild() throws Exception {
        JsonPathListener mockListener = mock(JsonPathListener.class);
        surfer.configBuilder()
            .bind("$.store.book[*]?(@.author==\"Nigel Rees\"||@.description.year==\"2010\").title", mockListener)
            .buildAndSurf(read("sample_filter2.json"));
        verify(mockListener, times(2)).onValue(eq(provider.primitive("Sayings of the Century")),
            any(ParsingContext.class));
        verify(mockListener, times(1)).onValue(eq(provider.primitive("Sword of Honour")),
            any(ParsingContext.class));

    }

    @Test
    public void testJsonPathDoubleFilter() throws Exception {
        JsonPathListener mockListener = mock(JsonPathListener.class);
        surfer.configBuilder()
            .bind("$.store.book[*]?(@.category==\"fiction\").volumes[*]?(@.year==\"1954\")", mockListener)
            .buildAndSurf(read("sample_filter2.json"));

        verify(mockListener, times(1)).onValue(argThat(new CustomMatcher<Object>("test filter") {

            @Override
            public boolean matches(Object o) {
                return provider.primitive("The Fellowship of the Ring").equals(resolveObject(o, "title"));
            }
        }), any(ParsingContext.class));

        verify(mockListener, times(1)).onValue(argThat(new CustomMatcher<Object>("test filter") {

            @Override
            public boolean matches(Object o) {
                return provider.primitive("The Two Towers").equals(resolveObject(o, "title"));
            }
        }), any(ParsingContext.class));

        verify(mockListener, times(0)).onValue(argThat(new CustomMatcher<Object>("test filter") {

            @Override
            public boolean matches(Object o) {
                return provider.primitive("The Return of the King").equals(resolveObject(o, "title"));
            }
        }), any(ParsingContext.class));

    }

    @Test
    public void testJsonPathDoubleFilterThenChild() throws Exception {
        JsonPathListener mockListener = mock(JsonPathListener.class);
        surfer.configBuilder()
            .bind("$.store.book[*]?(@.category==\"fiction\").volumes[*]?(@.year==\"1954\").title", mockListener)
            .buildAndSurf(read("sample_filter2.json"));

        verify(mockListener, times(1)).onValue(eq(provider.primitive("The Fellowship of the Ring")),
            any(ParsingContext.class));
        verify(mockListener, times(1)).onValue(eq(provider.primitive("The Two Towers")),
            any(ParsingContext.class));
        verify(mockListener, times(0)).onValue(eq(provider.primitive("The Return of the King")),
            any(ParsingContext.class));
    }

    @Test
    public void testJsonPathFilterNotMatch() throws Exception {
        JsonPathListener mockListener = mock(JsonPathListener.class);
        surfer.configBuilder().bind("$..book[*]?(@.category==\"comic\")", mockListener)
            .buildAndSurf(read("sample_filter2.json"));
        verify(mockListener, times(0)).onValue(any(), any(ParsingContext.class));
    }

    @Test
    public void testJsonPathFilterNotMatch2() throws Exception {
        JsonPathListener mockListener = mock(JsonPathListener.class);
        surfer.configBuilder().bind("$.store.book.title[*]?(@.title==\"comic\")", mockListener)
            .buildAndSurf(read("sample_filter2.json"));
        verify(mockListener, times(0)).onValue(any(), any(ParsingContext.class));
    }

    @Test
    public void testJsonPathDoubleFilterThenChildWithDeepScan() throws Exception {
        JsonPathListener mockListener = mock(JsonPathListener.class);
        surfer.configBuilder()
            .bind("$..book[*]?(@.category==\"fiction\" && @.volumes[2].year==\"1955\")..title",
                mockListener)
            .buildAndSurf(read("sample_filter2.json"));

        verify(mockListener, times(1)).onValue(eq(provider.primitive("The Fellowship of the Ring")),
            any(ParsingContext.class));
        verify(mockListener, times(1)).onValue(eq(provider.primitive("The Two Towers")),
            any(ParsingContext.class));
        verify(mockListener, times(1)).onValue(eq(provider.primitive("The Return of the King")),
            any(ParsingContext.class));
    }

    @Test
    public void testSampleJson() throws Exception {
        JsonPathListener mockListener = mock(JsonPathListener.class);
        surfer.configBuilder().bind("$.store.book[0].category", mockListener)
            .bind("$.store.book[0]", mockListener)
            .bind("$.store.car", mockListener)
            .bind("$.store.bicycle", mockListener)
            .buildAndSurf(read("sample.json"));

        O book = provider.createObject();
        provider.put(book, "category", provider.primitive("reference"));
        provider.put(book, "author", provider.primitive("Nigel Rees"));
        provider.put(book, "title", provider.primitive("Sayings of the Century"));
        provider.put(book, "price", provider.primitive(8.95));
        verify(mockListener).onValue(eq(book), any(ParsingContext.class));

        verify(mockListener).onValue(eq(provider.primitive("reference")), any(ParsingContext.class));

        P car1 = provider.primitive("ferrari");
        P car2 = provider.primitive("lamborghini");
        verify(mockListener).onValue(eq(car1), any(ParsingContext.class));
        verify(mockListener).onValue(eq(car2), any(ParsingContext.class));

        O bicycle = provider.createObject();
        provider.put(bicycle, "color", provider.primitive("red"));
        provider.put(bicycle, "price", provider.primitive(19.95d));
        verify(mockListener).onValue(eq(bicycle), any(ParsingContext.class));
    }

    @Test
    public void testSample2() throws Exception {
        JsonPathListener mockListener = mock(JsonPathListener.class);
        surfer.configBuilder()
            .bind("$[0].aiRuleEditorOriginal.+.barrierLevel", mockListener)
            .buildAndSurf(read("sample2.json"));
        verify(mockListener).onValue(eq(provider.primitive("0.8065")), any(ParsingContext.class));
    }

    @Test
    public void testStoppableParsing() throws Exception {
        JsonPathListener mockListener = mock(JsonPathListener.class);
        doNothing().when(mockListener)
            .onValue(any(), argThat(new TypeSafeMatcher<ParsingContext>() {

                @Override
                public boolean matchesSafely(ParsingContext parsingContext) {
                    parsingContext.stop();
                    return true;
                }

                @Override
                public void describeTo(Description description) {
                }
            }));

        surfer.configBuilder()
            .bind("$.store.book[0,1,2]", mockListener)
            .bind("$.store.book[3]", mockListener)
            .buildAndSurf(read("sample.json"));
        verify(mockListener, times(1))
            .onValue(any(), any(ParsingContext.class));

    }

    @Test
    public void testChildNodeWildcard() throws Exception {
        JsonPathListener mockListener = mock(JsonPathListener.class);
        surfer.configBuilder()
            .bind("$.store.*", mockListener)
            .buildAndSurf(read("sample.json"));
        verify(mockListener, times(7))
            .onValue(any(), any(ParsingContext.class));
    }

    @Test
    public void testAnyIndex() throws Exception {
        JsonPathListener mockListener = mock(JsonPathListener.class);
        surfer.configBuilder()
            .bind("$.store.book[*]", mockListener)
            .buildAndSurf(read("sample.json"));
        verify(mockListener, times(4))
            .onValue(any(), any(ParsingContext.class));
    }

    @Test
    public void testWildcardCombination() throws Exception {
        JsonPathListener mockListener = mock(JsonPathListener.class);
        surfer.configBuilder().bind("$.store.book[*].*", mockListener)
            .buildAndSurf(read("sample.json"));
        verify(mockListener, times(18)).onValue(any(),
            any(ParsingContext.class));
    }

    @Test
    public void testParsingArray() throws Exception {
        JsonPathListener wholeArray = mock(JsonPathListener.class);
        JsonPathListener stringElement = mock(JsonPathListener.class);
        JsonPathListener numberElement = mock(JsonPathListener.class);
        JsonPathListener booleanElement = mock(JsonPathListener.class);
        JsonPathListener nullElement = mock(JsonPathListener.class);
        JsonPathListener objectElement = mock(JsonPathListener.class);

        surfer.configBuilder().bind("$", wholeArray)
            .bind("$[0]", stringElement)
            .bind("$[1]", numberElement)
            .bind("$[2]", booleanElement)
            .bind("$[3]", nullElement)
            .bind("$[4]", objectElement)
            .buildAndSurf(read("array.json"));

        O object = provider.createObject();
        provider.put(object, "key", provider.primitive("value"));
        A array = provider.createArray();
        provider.add(array, provider.primitive("abc"));
        provider.add(array, provider.primitive(8.88));
        provider.add(array, provider.primitive(true));
        provider.add(array, provider.primitiveNull());
        provider.add(array, object);
        verify(wholeArray).onValue(eq(array), any(ParsingContext.class));
        verify(stringElement).onValue(eq(provider.primitive("abc")), any(ParsingContext.class));
        verify(numberElement).onValue(eq(provider.primitive(8.88)), any(ParsingContext.class));
        verify(booleanElement).onValue(eq(provider.primitive(true)), any(ParsingContext.class));
        verify(nullElement).onValue(eq(provider.primitiveNull()), any(ParsingContext.class));
        verify(objectElement).onValue(eq(object), any(ParsingContext.class));

    }

    @Test
    public void testDeepScan() throws Exception {
        JsonPathListener mockListener = mock(JsonPathListener.class);
        surfer.configBuilder().bind("$..author", mockListener)
            .bind("$..store..bicycle..color", mockListener)
            .buildAndSurf(read("sample.json"));
        verify(mockListener).onValue(eq(provider.primitive("Nigel Rees")), any(ParsingContext.class));
        verify(mockListener).onValue(eq(provider.primitive("Evelyn Waugh")), any(ParsingContext.class));
        verify(mockListener).onValue(eq(provider.primitive("Herman Melville")), any(ParsingContext.class));
        verify(mockListener).onValue(eq(provider.primitive("J. R. R. Tolkien")), any(ParsingContext.class));
        verify(mockListener).onValue(eq(provider.primitive("red")), any(ParsingContext.class));

    }

    @Test
    public void testDeepScan2() throws Exception {
        JsonPathListener mockListener = mock(JsonPathListener.class);
        surfer.configBuilder().bind("$..store..price", mockListener)
            .buildAndSurf(read("sample.json"));
        verify(mockListener).onValue(eq(provider.primitive(8.95)), any(ParsingContext.class));
        verify(mockListener).onValue(eq(provider.primitive(12.99)), any(ParsingContext.class));
        verify(mockListener).onValue(eq(provider.primitive(8.99)), any(ParsingContext.class));
        verify(mockListener).onValue(eq(provider.primitive(22.99)), any(ParsingContext.class));
        verify(mockListener).onValue(eq(provider.primitive(19.95)), any(ParsingContext.class));
    }

    @Test
    public void testAny() throws Exception {
        JsonPathListener mockListener = mock(JsonPathListener.class);
        surfer.configBuilder().bind("$.store..bicycle.*", mockListener)
            .buildAndSurf(read("sample.json"));
        verify(mockListener).onValue(eq(provider.primitive("red")), any(ParsingContext.class));
        verify(mockListener).onValue(eq(provider.primitive(19.95)), any(ParsingContext.class));
    }

    @Test
    public void testFindEverything() throws Exception {
        surfer.configBuilder()
            .bind("$.*", (value, context) -> LOGGER.trace("value: {}", value))
            .buildAndSurf(read("sample.json"));
    }

    @Test
    public void testIndexesAndChildrenOperator() throws Exception {
        JsonPathListener mockListener = mock(JsonPathListener.class);
        surfer.configBuilder().bind("$..book[1,3][\"author\", \"title\"]", mockListener)
            .buildAndSurf(read("sample.json"));
        verify(mockListener).onValue(eq(provider.primitive("Evelyn Waugh")), any(ParsingContext.class));
        verify(mockListener).onValue(eq(provider.primitive("Sword of Honour")), any(ParsingContext.class));
        verify(mockListener).onValue(eq(provider.primitive("J. R. R. Tolkien")), any(ParsingContext.class));
        verify(mockListener).onValue(eq(provider.primitive("The Lord of the Rings")), any(ParsingContext.class));
    }

    @Test
    public void testCollectAllRaw() throws Exception {
        Collection<Object> values = surfer.collectAll(read("sample.json"), "$..book[1,3][\"author\", \"title\"]");
        assertEquals(4, values.size());
        Iterator<Object> itr = values.iterator();
        itr.next();
        assertEquals("Sword of Honour", itr.next());
    }

    @Test
    public void testCollectOneRaw() throws Exception {
        Object value = surfer.collectOne(read("sample.json"), "$..book[1,3][\"author\", \"title\"]");
        assertEquals("Evelyn Waugh", value);
    }

    @Test
    public void testCollectAll() throws Exception {
        Collection<String> values = surfer.collectAll(read("sample.json"), String.class,
            JsonPathCompiler.compile("$..book[1,3][\"author\", \"title\"]"));
        assertEquals(4, values.size());
        assertEquals("Evelyn Waugh", values.iterator().next());
    }

    @Test
    public void testCollectAllFromString() throws Exception {
        Collection<Object> values =
            surfer.collectAll(readAsString("sample.json"), "$..book[1,3][\"author\", \"title\"]");
        assertEquals(4, values.size());
        assertEquals("Evelyn Waugh", values.iterator().next());
    }

    @Test
    public void testCollectOne() throws Exception {
        String value = surfer.collectOne(read("sample.json"), String.class,
            JsonPathCompiler.compile("$..book[1,3][\"author\", \"title\"]"));
        assertEquals("Evelyn Waugh", value);
    }

    @Test
    public void testCollectOneFromString() throws Exception {
        Object value = surfer.collectOne(readAsString("sample.json"), "$..book[1,3][\"author\", \"title\"]");
        assertEquals("Evelyn Waugh", value);
    }

    @Test
    public void testGetCurrentFieldName() throws Exception {
        surfer.configBuilder()
            .bind("$.store.book[0].title",
                (value, context) -> assertEquals(context.getCurrentFieldName(), "title"))
            .bind("$.store.book[0]", (value, context) -> assertEquals("book", context.getCurrentFieldName()))
            .bind("$.store.bicycle",
                (value, context) -> assertEquals(context.getCurrentFieldName(), "bicycle"))
            .buildAndSurf(read("sample.json"));
    }

    @Test
    public void testGetCurrentArrayIndex() throws Exception {
        surfer.configBuilder()
            .bind("$.store.book[3]", (value, context) -> assertEquals(context.getCurrentArrayIndex(), 3))
            .bind("$.store", (value, context) -> assertEquals(context.getCurrentArrayIndex(), -1))
            .buildAndSurf(read("sample.json"));
    }

    @Test
    public void testExample1() throws Exception {
        surfer.configBuilder().bind("$.store.book[*].author", print).buildAndSurf(read("sample.json"));
    }

    @Test
    public void testExample2() throws Exception {
        surfer.configBuilder().bind("$..author", print).buildAndSurf(read("sample.json"));
    }

    @Test
    public void testExample3() throws Exception {
        surfer.configBuilder().bind("$.store.*", print).buildAndSurf(read("sample.json"));
    }

    @Test
    public void testExample4() throws Exception {
        surfer.configBuilder().bind("$.store..price", print).buildAndSurf(read("sample.json"));
    }

    @Test
    public void testExample5() throws Exception {
        surfer.configBuilder().bind("$..book[2]", print).buildAndSurf(read("sample.json"));
    }

    @Test
    public void testExample6() throws Exception {
        surfer.configBuilder().bind("$..book[0,1]", print).buildAndSurf(read("sample.json"));
    }

    @Test
    public void testStoppable() throws Exception {
        surfer.configBuilder().bind("$..book[0,1]", new JsonPathListener() {

            @Override
            public void onValue(Object value, ParsingContext parsingContext) {
                parsingContext.stop();
                //System.out.println(value);
            }
        }).buildAndSurf(read("sample.json"));
    }

    @Test
    public void testPluggableProvider() throws Exception {
        JsonPathListener mockListener = mock(JsonPathListener.class);
        surfer.configBuilder().withJsonProvider(JavaCollectionProvider.INSTANCE)
            .bind("$.store", mockListener)
            .buildAndSurf(read("sample.json"));
        verify(mockListener).onValue(isA(HashMap.class), any(ParsingContext.class));
    }

    @Test
    public void testErrorStrategySuppressException() throws Exception {

        JsonPathListener mock = mock(JsonPathListener.class);
        doNothing().doThrow(RuntimeException.class).doThrow(RuntimeException.class).when(mock)
            .onValue(any(), any(ParsingContext.class));

        surfer.configBuilder().bind("$.store.book[*]", mock)
            .withErrorStrategy(new ErrorHandlingStrategy() {

                @Override
                public void handleParsingException(Exception e) {
                    // suppress exception
                }

                @Override
                public void handleExceptionFromListener(Exception e, ParsingContext context) {
                    // suppress exception
                }
            })
            .buildAndSurf(read("sample.json"));
        verify(mock, times(4)).onValue(any(), any(ParsingContext.class));
    }

    @Test
    public void testErrorStrategyThrowException() {

        JsonPathListener mock = mock(JsonPathListener.class);
        doNothing().doThrow(RuntimeException.class).doThrow(RuntimeException.class).when(mock)
            .onValue(any(Object.class), any(ParsingContext.class));
        try {
            surfer.configBuilder().bind("$.store.book[*]", mock).buildAndSurf(read("sample.json"));
        } catch (Exception e) {
            // catch mock exception
        }
        verify(mock, times(2)).onValue(any(), any(ParsingContext.class));
    }

    @Test
    public void testCollectOneFoundNothing() throws Exception {
        String jsonPathFoundNothing = "$..authors";
        Object expireNull = surfer.collectOne(read("sample.json"), jsonPathFoundNothing);
        assertNull(expireNull);
    }

    @Test
    public void testJsonPathFilterMatchRegex() throws Exception {
        JsonPathListener mockListener = mock(JsonPathListener.class);
        surfer.configBuilder().bind("$.store.book[*]?(@.isbn like_regex \"\\\\d-\\\\d\\\\d\\\\d-21311-\\\\d\")", mockListener)
            .buildAndSurf(read("sample_filter.json"));
        verify(mockListener, times(1)).onValue(argThat(new CustomMatcher<Object>("Test filter") {

            @Override
            public boolean matches(Object o) {
                return provider.primitive("Moby Dick").equals(resolveObject(o, "title"));
            }
        }), any(ParsingContext.class));
    }

    @Test
    public void testJsonPathFilterMatchRegexFlags() throws Exception {
        JsonPathListener mockListener = mock(JsonPathListener.class);
        surfer.configBuilder()
            .bind("$.store.book[*]?(@.author like_regex \"(?i)tolkien\")", mockListener)
            .buildAndSurf(read("sample_filter.json"));
        verify(mockListener, times(1)).onValue(argThat(new CustomMatcher<Object>("Test filter") {

            @Override
            public boolean matches(Object o) {
                return provider.primitive("The Lord of the Rings").equals(resolveObject(o, "title"));
            }
        }), any(ParsingContext.class));
    }

    @Test
    public void testJsonPathFilterWithMultipleBinding() throws Exception {
        JsonPathListener mockListener1 = mock(JsonPathListener.class);
        JsonPathListener mockListener2 = mock(JsonPathListener.class);
        JsonPathListener mockListener3 = mock(JsonPathListener.class);

        surfer.configBuilder()
            .bind("$.store.book[0,1]", mockListener1)
            .bind("$.store.book[*]?(@.author==\"Herman Melville\")", mockListener2)
            .bind("$.store.book[*]?(@.author==\"Nigel Rees\")", mockListener3)
            .buildAndSurf(read("sample_filter.json"));

        verify(mockListener1, times(2)).onValue(any(), any(ParsingContext.class));
        verify(mockListener2, times(1)).onValue(any(), any(ParsingContext.class));
        verify(mockListener3, times(1)).onValue(any(), any(ParsingContext.class));
    }

    @Test
    public void testJsonPathFilterWithMultipleBindingAndSharedConfig() throws Exception {
        JsonPathListener mockListener1 = mock(JsonPathListener.class);
        JsonPathListener mockListener2 = mock(JsonPathListener.class);
        JsonPathListener mockListener3 = mock(JsonPathListener.class);
        JsonPathListener mockListener4 = mock(JsonPathListener.class);

        SurfingConfiguration config = surfer.configBuilder()
            .bind("$.store.book[0,1]", mockListener1)
            .bind("$.store.book[*]?(@.author==\"Herman Melville\")", mockListener2)
            .bind("$.store.book[*]?(@.author==\"Nigel Rees\")", mockListener3)
            .bind("$.store.book[*]?(@.volumes)", mockListener4)
            .build();
        surfer.surf(read("sample_filter.json"), config);
        surfer.surf(read("sample_filter2.json"), config);

        verify(mockListener1, times(4)).onValue(any(), any(ParsingContext.class));
        verify(mockListener2, times(2)).onValue(any(), any(ParsingContext.class));
        verify(mockListener3, times(3)).onValue(any(), any(ParsingContext.class));
        verify(mockListener4, times(2)).onValue(any(), any(ParsingContext.class));
    }

    @Test
    public void testMultipleBindingWithAndWithoutFilter() throws Exception {

        JsonPathListener mockListener1 = mock(JsonPathListener.class);
        JsonPathListener mockListener2 = mock(JsonPathListener.class);
        JsonPathListener mockListener3 = mock(JsonPathListener.class);

        surfer.configBuilder()
            .bind("$.store.book[*]?(@.category == \"reference\")", mockListener1)
            .bind("$.store.bicycle.color", mockListener2)
            .bind("$.store.bicycle", mockListener3)
            .buildAndSurf(read("sample.json"));

        verify(mockListener1, times(1)).onValue(any(), any(ParsingContext.class));
        verify(mockListener2, times(1)).onValue(any(), any(ParsingContext.class));
        verify(mockListener3, times(1)).onValue(any(), any(ParsingContext.class));

    }

    @Test
    public void testCollector() throws Exception {
        Collector collector = surfer.collector(read("sample.json"));
        ValueBox<String> box1 = collector.collectOne("$.store.book[1].category", String.class);
        ValueBox<Object> box2 = collector.collectOne("$.store.book[2].isbn");
        ValueBox<Collection<Object>> box3 = collector.collectAll("$.store.book[*]");
        assertNull(box1.get());
        assertNull(box2.get());
        assertEquals(0, box3.get().size());
        collector.exec();
        assertEquals("fiction", box1.get());
        assertEquals("0-553-21311-3", box2.get());
        assertEquals(4, box3.get().size());
    }

    @Test
    public void testArrayIndex() throws Exception {
        Collector collector = surfer.collector(read("array.json"));
        ValueBox<String> box1 = collector.collectOne("$[0]", String.class);
        ValueBox<Boolean> box2 = collector.collectOne("$.2", Boolean.class);
        collector.exec();
        assertEquals("abc", box1.get());
        assertTrue(box2.get());
    }

    @Test
    public void testFilterEqOnArrayElement() throws Exception {
        // given
        Collector collector = surfer.collector(read("array.json"));

        // when
        ValueBox<Boolean> boolVal = collector.collectOne("$[*]?(@ == true)", Boolean.class);
        ValueBox<String> stringValSingleQuote = collector.collectOne("$[*]?(@ == \"abc\")", String.class);
        ValueBox<Double> decimalVal = collector.collectOne("$[*]?(@ == 8.88)", Double.class);
        collector.exec();

        //then
        assertEquals(Boolean.TRUE, boolVal.get());
        assertEquals("abc", stringValSingleQuote.get());
        assertEquals(Double.valueOf(8.88d), decimalVal.get());
    }

    @Test
    public void testFilterGtOnArrayElement() throws Exception {
        // given
        Collector collector = surfer.collector(read("array.json"));

        // when
        ValueBox<Double> gtVal = collector.collectOne("$[*]?(@ > 8)", Double.class);
        ValueBox<Double> geVal1 = collector.collectOne("$[*]?(@ >= 8.87)", Double.class);
        ValueBox<Double> geVal2 = collector.collectOne("$[*]?(@ >= 8.88)", Double.class);
        collector.exec();

        //then
        assertEquals(Double.valueOf(8.88d), gtVal.get());
        assertEquals(Double.valueOf(8.88d), geVal1.get());
        assertEquals(Double.valueOf(8.88d), geVal2.get());
    }

    @Test
    public void testFilterLtOnArrayElement() throws Exception {
        // given
        Collector collector = surfer.collector(read("array.json"));

        // when
        ValueBox<Double> ltVal = collector.collectOne("$[*]?(@ < 9)", Double.class);
        ValueBox<Double> leVal1 = collector.collectOne("$[*]?(@ < 8.89)", Double.class);
        ValueBox<Double> leVal2 = collector.collectOne("$[*]?(@ <= 8.88)", Double.class);
        collector.exec();

        //then
        assertEquals(Double.valueOf(8.88d), ltVal.get());
        assertEquals(Double.valueOf(8.88d), leVal1.get());
        assertEquals(Double.valueOf(8.88d), leVal2.get());
    }

    @Test
    public void testFilterNEqOnArrayBoolElement() throws Exception {
        // given
        Collector collector = surfer.collector(read("array.json"));

        // when
        ValueBox<Collection<Object>> ne1 = collector.collectAll("$[*]?(@ != true)", Object.class);
        ValueBox<Collection<Object>> ne2 = collector.collectAll("$[*]?(@ <> true)", Object.class);
        collector.exec();

        //then
        assertThat(ne1.get(), hasItems("abc", 8.88, json("key", "value"), null));
        assertThat(ne2.get(), hasItems("abc", 8.88, json("key", "value"), null));
    }

    @Test
    public void testFilterNEqOnArrayStrElement() throws Exception {
        // given
        Collector collector = surfer.collector(read("array.json"));

        // when
        ValueBox<Collection<Object>> ne1 = collector.collectAll("$[*]?(@ != \"abc\")", Object.class);
        ValueBox<Collection<Object>> ne2 = collector.collectAll("$[*]?(@ <> \"abc\")", Object.class);
        collector.exec();

        //then
        assertThat(ne1.get(), hasItems(8.88, true, json("key", "value"), null));
        assertThat(ne2.get(), hasItems(8.88, true, json("key", "value"), null));
    }

    @Test
    public void testFilterNEqOnArrayNumElement() throws Exception {
        // given
        Collector collector = surfer.collector(read("array.json"));

        // when
        ValueBox<Collection<Object>> ne1 = collector.collectAll("$[*]?(@ != 8.88)", Object.class);
        ValueBox<Collection<Object>> ne2 = collector.collectAll("$[*]?(@ <> 8.88)", Object.class);
        collector.exec();

        //then
        assertThat(ne1.get(), hasItems("abc", true, null, json("key", "value")));
        assertThat(ne2.get(), hasItems("abc", true, null, json("key", "value")));
    }

    @Test
    public void testSqlArrayRange() throws Exception {
        JsonPath path = JsonPathCompiler.compile("$[1 to 2]");
        Collector collector = surfer.collector(read("array.json"));
        ValueBox<Collection<Object>> box = collector.collectAll(path, Object.class);
        collector.exec();
        assertEquals(asList(8.88, true), box.get());
    }

    @Test
    public void testSqlPropertyQuoting() throws Exception {
        JsonPath path = JsonPathCompiler.compile("$.\"store\".\"book\"[0].\"author\"");
        Collector collector = surfer.collector(read("sample.json"));
        ValueBox<String> box = collector.collectOne(path, String.class);
        collector.exec();
        assertEquals("Nigel Rees", box.get());
    }

    @Ignore("this path relaxation is not supported yet")
    @Test
    public void testObjectToRootArrayPathRelaxation() throws IOException {
        //given
        Collector collector = surfer.collector(read("sample4.json"));
        String path = "$.number";

        //when
        Collection<Object> many = collector.collectAll(path).get();
        collector.exec();

        //then
        assertEquals(asList("0123-4567-8888", "0123-4567-8910"), many);
    }

    @Test
    public void testObjectToArrayPathRelaxation() throws IOException {
        //given
        Collector collector = surfer.collector(read("sample5.json"));
        String path = "$.phones.number";

        //when
        ValueBox<Collection<Object>> many = collector.collectAll(path);
        collector.exec();

        //then
        assertEquals(asList("0123-4567-8888", "0123-4567-8910"), many.get());
    }

    @Ignore("this path relaxation is not supported yet")
    @Test
    public void testArrayToObjectPathRelaxation() throws IOException {
        //given
        Collector collector = surfer.collector(read("sample3.json"));
        String path = "$[*].number";

        //when
        ValueBox<Collection<Object>> many = collector.collectAll(path);
        collector.exec();

        //then
        assertEquals(Collections.singletonList("0123-4567-8888"), many.get());
    }

    @Test
    public void testArrayElementsByWildcard() throws IOException {
        //given
        Collector collector = surfer.collector(read("array.json"));
        JsonPath path = JsonPathCompiler.compile("$[*]");

        //when
        ValueBox<Collection<Object>> box = collector.collectAll(path, Object.class);
        collector.exec();

        //then
        assertEquals(5, box.get().size());
    }

    @Test
    public void testNestedArrays() throws IOException {
        //given
        Collector collector = surfer.collector(read("nested_array.json"));
        JsonPath path1 = JsonPathCompiler.compile("$[0]");
        JsonPath path2 = JsonPathCompiler.compile("$[2]");

        //when
        ValueBox<Collection<Object>> box1 = collector.collectAll(path1, Object.class);
        ValueBox<Collection<Object>> box2 = collector.collectAll(path2, Object.class);
        collector.exec();

        //then
        assertEquals(1, box1.get().size());
        Map<Object, Object> el  = new HashMap<>();
        List<?> item = (List<?>) box1.get().iterator().next();
        assertEquals(1, ((Number) item.get(0)).intValue());
        assertEquals("2", item.get(1));
        assertEquals(3, ((Number) item.get(2)).intValue());
        assertEquals(1, ((Number) ((Map<?, ?>) item.get(3)).get("t")).intValue());
        assertEquals(3, ((Number) box2.get().iterator().next()).intValue());
    }

    @Test
    public void testNestedArraysSecondLevelIndex() throws IOException {
        //given
        Collector collector = surfer.collector(read("nested_array.json"));
        JsonPath path = JsonPathCompiler.compile("$[0][1]");

        //when
        ValueBox<Collection<Object>> box = collector.collectAll(path, Object.class);
        collector.exec();

        //then
        assertEquals(1, box.get().size());
        assertEquals("2", box.get().iterator().next());
    }

    @Test
    public void testQuoteRemoving() throws IOException {
        //given
        Collector collector = surfer.collector(read("sample_filter.json"));
        JsonPath path = JsonPathCompiler.compile(
                "$.store.book[*]?(@.title == \"\\\"quoted\\\", 'apostrophe' and newline \\n\\t in title\").price");

        //when
        ValueBox<Collection<Object>> box = collector.collectAll(path, Object.class);
        collector.exec();

        //then
        assertEquals(1, box.get().size());
        assertEquals(42.42, box.get().iterator().next());
    }

    @Test
    public void testQuoteRemoving_regex() throws IOException {
        //given
        Collector collector = surfer.collector(read("sample_filter.json"));
        JsonPath path = JsonPathCompiler.compile(
                "$.store.book[*]?(@.title like_regex \"\\\"quoted\\\", 'apostrophe' and newline \\n\\t in title\").price");

        //when
        ValueBox<Collection<Object>> box = collector.collectAll(path, Object.class);
        collector.exec();

        //then
        assertEquals(1, box.get().size());
        assertEquals(42.42, box.get().iterator().next());
    }

    @Test
    public void testRegexFilterOnArrayElement() throws IOException {
        //given
        Collector collector = surfer.collector(read("array_strings.json"));
        JsonPath path = JsonPathCompiler.compile(
            "$[*]?(@ like_regex \"foo\")");

        //when
        ValueBox<Collection<Object>> box = collector.collectAll(path, Object.class);
        collector.exec();

        //then
        assertEquals(asList("foo", "foo1"), box.get());
    }

    @Test
    public void testRegexFilterOnArrayElementCaseInsensitive() throws IOException {
        //given
        Collector collector = surfer.collector(read("array_strings.json"));
        JsonPath path = JsonPathCompiler.compile(
            "$[*]?(@ like_regex \"(?i)foo\")");

        //when
        ValueBox<Collection<Object>> box = collector.collectAll(path, Object.class);
        collector.exec();

        //then
        assertEquals(asList("Foo", "foo", "foo1"), box.get());
    }

    @Test
    public void testRegexFilterMatchEverythingIfEmpty() throws IOException {
        //given
        Collector collector = surfer.collector(read("array_strings.json"));
        JsonPath path = JsonPathCompiler.compile(
            "$[*]?(@ like_regex \"\")");

        //when
        ValueBox<Collection<Object>> box = collector.collectAll(path, Object.class);
        collector.exec();

        //then
        assertEquals(12, box.get().size());
    }

    @Test
    public void testProviderCastPrimitivesToItself() {
        //given

        //when
        P intVal = provider.primitive(1);
        P lonVal = provider.primitive(2L);
        P bigIntVal = provider.primitive(BigInteger.valueOf(3));
        P doubleVal = provider.primitive(4.0d);
        P boolVal = provider.primitive(false);
        P strVal = provider.primitive("str");

        //then
        assertEquals(intVal, provider.cast(intVal, intVal.getClass()));
        assertEquals(lonVal, provider.cast(lonVal, lonVal.getClass()));
        assertEquals(bigIntVal, provider.cast(bigIntVal, bigIntVal.getClass()));
        assertEquals(doubleVal, provider.cast(doubleVal, doubleVal.getClass()));
        assertEquals(boolVal, provider.cast(boolVal, boolVal.getClass()));
        assertEquals(strVal, provider.cast(strVal, strVal.getClass()));
    }

    @Test
    public void testProviderCastNulls() {
        //given

        //when
        P intVal = provider.primitive(1);
        P lonVal = provider.primitive(2L);
        P bigIntVal = provider.primitive(BigInteger.valueOf(3));
        P doubleVal = provider.primitive(4.0d);
        P boolVal = provider.primitive(false);
        P strVal = provider.primitive("str");
        P nullVal = provider.primitiveNull();

        //then
        assertNull(provider.cast(null, intVal.getClass()));
        assertNull(provider.cast(null, lonVal.getClass()));
        assertNull(provider.cast(null, bigIntVal.getClass()));
        assertNull(provider.cast(null, doubleVal.getClass()));
        assertNull(provider.cast(null, boolVal.getClass()));
        assertNull(provider.cast(null, strVal.getClass()));
    }

    @Test
    public void testProviderCastPrimitivesToString() {
        //given

        //when
        P intVal = provider.primitive(1);
        P lonVal = provider.primitive(2L);
        P bigIntVal = provider.primitive(BigInteger.valueOf(3));
        P doubleVal = provider.primitive(4.0d);
        P boolVal = provider.primitive(false);
        P strVal = provider.primitive("str");
        P nullVal = provider.primitiveNull();

        //then
        assertEquals("1", provider.cast(intVal, String.class));
        assertEquals("2", provider.cast(lonVal, String.class));
        assertEquals("3", provider.cast(bigIntVal, String.class));
        assertEquals("4.0", provider.cast(doubleVal, String.class));
        assertEquals("false", provider.cast(boolVal, String.class));
        assertEquals("str", provider.cast(strVal, String.class));
        assertNull(provider.cast(nullVal, String.class));
    }

    @Test
    public void testProviderCastException() {
        //given
        class TempClass {

        }

        //when
        P intVal = provider.primitive(1);
        P lonVal = provider.primitive(2L);
        P bigIntVal = provider.primitive(BigInteger.valueOf(3));
        P doubleVal = provider.primitive(4.0d);
        P boolVal = provider.primitive(false);
        P strVal = provider.primitive("str");

        //then
        assertThrows(ClassCastException.class, () -> provider.cast(intVal, TempClass.class));
        assertThrows(ClassCastException.class, () -> provider.cast(lonVal, TempClass.class));
        assertThrows(ClassCastException.class, () -> provider.cast(bigIntVal, TempClass.class));
        assertThrows(ClassCastException.class, () -> provider.cast(doubleVal, TempClass.class));
        assertThrows(ClassCastException.class, () -> provider.cast(boolVal, TempClass.class));
        assertThrows(ClassCastException.class, () -> provider.cast(strVal, TempClass.class));
    }

    @Test
    public void testIndexAndFilter() throws IOException {
        //given
        Collector collector = surfer.collector(read("array_strings.json"));
        JsonPath path1 = JsonPathCompiler.compile(
            "$[0]?(@ like_regex \"(?i)foo\")");
        JsonPath path2 = JsonPathCompiler.compile(
            "$[1]?(@ like_regex \"(?i)foo\")");

        //when
        ValueBox<Collection<Object>> box1 = collector.collectAll(path1, Object.class);
        ValueBox<Collection<Object>> box2 = collector.collectAll(path2, Object.class);
        collector.exec();

        //then
        assertTrue(box1.get().isEmpty());
        assertEquals(Collections.singletonList("Foo"), box2.get());
    }

    @Test
    public void testIndexRangeAndFilter() throws IOException {
        //given
        Collector collector = surfer.collector(read("array_strings.json"));
        JsonPath path1 = JsonPathCompiler.compile(
            "$[0 to 1]?(@ like_regex \"(?i)foo\")");
        JsonPath path2 = JsonPathCompiler.compile(
            "$[1 to 2]?(@ like_regex \"(?i)foo\")");
        JsonPath path3 = JsonPathCompiler.compile(
            "$[1,2,3]?(@ like_regex \"(?i)foo\")");

        //when
        ValueBox<Collection<Object>> box1 = collector.collectAll(path1, Object.class);
        ValueBox<Collection<Object>> box2 = collector.collectAll(path2, Object.class);
        ValueBox<Collection<Object>> box3 = collector.collectAll(path3, Object.class);
        collector.exec();

        //then
        assertEquals(Collections.singletonList("Foo"), box1.get());
        assertEquals(asList("Foo", "foo"), box2.get());
        assertEquals(asList("Foo", "foo", "foo1"), box3.get());
    }

    private Object json(String key, String value) {
        O object = this.provider.createObject();
        this.provider.put(object, key, this.provider.primitive(value));
        return this.provider.cast(object, Object.class);
    }

    private Object resolveObject(Object o, String name) {
        return this.provider.resolve(cast(o), name);
    }

    @SuppressWarnings("unchecked")
    private static <T> T cast(Object o) {
        try {
            return (T) o;
        } catch (ClassCastException e) {
            return null;
        }
    }

}
