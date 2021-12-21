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

package org.jsfr.json.path;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

import com.google.gson.Gson;
import org.jsfr.json.Book;
import org.jsfr.json.exception.JsonPathCompilerException;
import org.jsfr.json.exception.JsonSurfingException;
import org.jsfr.json.provider.JavaCollectionProvider;
import org.jsfr.json.resolver.PoJoResolver;
import org.junit.Test;

import static org.jsfr.json.TestUtils.readClasspathResource;
import static org.jsfr.json.compiler.JsonPathCompiler.compile;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;

public class JsonPathTest {

    @Test
    public void shallResolvePath() {
        String json = readClasspathResource("sample2.json", StandardCharsets.UTF_8);
        Object retrieved =
            compile("$[0].calculationAgent.cconsol").resolve(new Gson().fromJson(json, Object.class),
                JavaCollectionProvider.INSTANCE);
        assertEquals("59999", retrieved);
    }

    @Test
    public void shallResolvePOJO() {
        Book book = new Book();
        book.setAuthor("Leo");
        book.setCategory("Fiction");
        book.setPrice(100.0d);
        book.setTitle("JsonSurfer is great!");
        assertEquals("Leo", compile("$.author").resolve(book, new PoJoResolver()));
        assertEquals("Fiction", compile("$.category").resolve(book, new PoJoResolver()));
        assertEquals(100.0d, compile("$.price").resolve(book, new PoJoResolver()));
        assertEquals("JsonSurfer is great!", compile("$.title").resolve(book, new PoJoResolver()));

        List<String> list = Arrays.asList("foo", "bar");
        HashMap<String, Object> map = new HashMap<>();
        map.put("list", list);
        assertEquals("bar", compile("$.list[1]").resolve(list, new PoJoResolver()));
        assertEquals(Arrays.asList("foo", "bar"), compile("$.list").resolve(map, JavaCollectionProvider.INSTANCE));

        int[] array = new int[]{12, 34};
        assertEquals(34, compile("$[1]").resolve(array, new PoJoResolver()));
        assertEquals(12, compile("$[0]").resolve(array, new PoJoResolver()));
    }

    @Test
    public void shallEnsureJsonPathCapacity() {
        JsonPath path =
            compile("$.a.b.c.d.e.f.g.h.a.b.c.d.e.f.g.h.a.b.c.d.e.f.g.h.a.b.c.d.e.f.g.h.a.b.c.d.e.f.g.h");
        assertEquals(41, path.size);
    }

    @Test
    public void shallMatch() {
        JsonPath path1 = compile("$..store..book..book[?(@.category==\"fiction\")]..title");
        JsonPath path2 = compile("$..store..book.store.book[?(@.category==\"fiction\")]..title");
        JsonPath path3 = compile("$..store..book.store[?(@.category==\"fiction\")]..title");
        JsonPath path4 = compile("$..book..book..book..store.book[?(@.category==\"fiction\")]..title");
        JsonPath position = compile("$.book.store.book.store.book[1].volumes[1].title");
        assertTrue(path1.matchWithDeepScan(position));
        assertTrue(path2.matchWithDeepScan(position));
        assertFalse(path3.matchWithDeepScan(position));
        assertFalse(path4.matchWithDeepScan(position));
    }

    @Test
    public void shallMatchArrayElementsAsObject() {
        //given
        JsonPath position = compile("$.book[2].store.title");
        JsonPath path = compile("$.book.store.title");

        //when
        boolean matched = path.match(position);

        //then
        assertTrue(matched);
    }

    @Test
    public void shallMatchObjectAsArrayElement() {
        //given
        JsonPath position = compile("$.book.store.title");
        JsonPath path = compile("$.book[0].store.title");

        //when
        boolean matched = path.match(position);

        //then
        assertTrue(matched);
    }

    @Test
    public void shallMatchObjectAsArrayWildcard() {
        //given
        JsonPath position = compile("$.book.store.title");
        JsonPath path = compile("$.book[*].store.title");

        //when
        boolean matched = path.match(position);

        //then
        assertTrue(matched);
    }

    @Test
    public void laxIsSupportedSyntaxMode() {
        //given
        JsonPath position = compile("$.book.store.title");

        //when
        JsonPath path1 = compile("lax $.book[*].store.title");
        boolean matched1 = path1.match(position);

        //then
        assertTrue(matched1);
    }

    @Test
    public void strictIsNotSupportedSyntaxMode() {
        //given
        String path = "strict $.book[*].store.title";

        //when
        JsonSurfingException exception = assertThrows(
            JsonSurfingException.class,
            () -> compile(path));

        //then
        assertEquals("Strict JsonPath mode not yet supported", exception.getMessage());
    }

    @Test
    public void compilerErrorsShouldBeHandled() {
        //given
        String path1 = "$((@@$#229))";
        String path2 = "";
        String path3 = "[1,2,3]";
        String path4 = "$.store.book\n[?(@.author=~ /abc)]";

        //when
        JsonPathCompilerException exception1 = assertThrows(
            JsonPathCompilerException.class,
            () -> compile(path1)
        );
        JsonPathCompilerException exception2 = assertThrows(
            JsonPathCompilerException.class,
            () -> compile(path2)
        );
        JsonPathCompilerException exception3 = assertThrows(
            JsonPathCompilerException.class,
            () -> compile(path3)
        );
        JsonPathCompilerException exception4 = assertThrows(
            JsonPathCompilerException.class,
            () -> compile(path4)
        );

        //then
        assertEquals("Unexpected token at line 1, columns 1 to 2", exception1.getMessage());
        assertEquals("Unexpected token at line 1, columns 0 to 0", exception2.getMessage());
        assertEquals("Unexpected token at line 1, columns 0 to 1", exception3.getMessage());
        assertEquals("Unexpected token at line 2, columns 14 to 18", exception4.getMessage());
    }

    @Test
    public void arrayRange() {
        //given
        JsonPath path = compile("$.book[0 to 2]");

        //when
        boolean matched1 = path.match(compile("$.book[0]"));
        boolean matched2 = path.match(compile("$.book[1]"));
        boolean matched3 = path.match(compile("$.book[2]"));

        //then
        assertTrue(matched1);
        assertTrue(matched2);
        assertTrue(matched3);
    }

    @Test
    public void arraySlicing() {
        //given
        JsonPath path = compile("$.book[0:2]");

        //when
        boolean matched1 = path.match(compile("$.book[0]"));
        boolean matched2 = path.match(compile("$.book[1]"));
        boolean matched3 = path.match(compile("$.book[2]"));

        //then
        assertTrue(matched1);
        assertTrue(matched2);
        assertFalse(matched3);
    }
}
