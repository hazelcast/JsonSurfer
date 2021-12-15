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

import org.json.simple.parser.JSONParser;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.StringReader;

public final class JsonSimpleParser implements JsonParserAdapter {

    /**
     * Immutable shared instance
     */
    public static final JsonSimpleParser INSTANCE = new JsonSimpleParser();

    private JsonSimpleParser() {
    }

    @Override
    public void parse(Reader reader, SurfingContext context) {
        parseImpl(reader, context);
    }

    private void parseImpl(Reader reader, SurfingContext context) {
        JSONParser parser = new JSONParser();
        try {
            parser.parse(reader, new JsonSimpleHandlerAdapter(context));
        } catch (Exception e) {
            context.getConfig().getErrorHandlingStrategy().handleParsingException(e);
        }
    }

    @Override
    public void parse(String json, SurfingContext context) {
        parseImpl(new StringReader(json), context);
    }

    @Override
    public void parse(InputStream inputStream, SurfingContext context) {
        parseImpl(new InputStreamReader(inputStream, context.getConfig().getParserCharset()), context);
    }

    @Override
    public ResumableParser createResumableParser(Reader reader, SurfingContext context) {
        throw new UnsupportedOperationException("Unsupported");
    }

    @Override
    public ResumableParser createResumableParser(String json, SurfingContext context) {
        throw new UnsupportedOperationException("Unsupported");
    }

    @Override
    public ResumableParser createResumableParser(InputStream json, SurfingContext context) {
        throw new UnsupportedOperationException("Unsupported");
    }

    @Override
    public NonBlockingParser createNonBlockingParser(SurfingContext context) {
        throw new UnsupportedOperationException("Unsupported");
    }

}
