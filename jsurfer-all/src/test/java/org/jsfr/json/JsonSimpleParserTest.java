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

import org.jsfr.json.provider.JsonSimpleProvider;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

/**
 * Created by Leo on 2017/8/26.
 */
public class JsonSimpleParserTest extends JsonSurferTest<JSONObject, JSONArray, Object> {

    @Before
    public void setUp() {
        provider = JsonSimpleProvider.INSTANCE;
        surfer = new JsonSurfer(JsonSimpleParser.INSTANCE, provider);
    }

    @Ignore
    @Override
    public void testTypeCasting() throws Exception {
        // ignore
    }

    @Ignore
    @Override
    public void testTypeBindingOne() throws Exception {
        // ignore
    }

    @Ignore
    @Override
    public void testTypeBindingOneWithFilter() throws Exception {
        // ignore
    }

    @Ignore
    @Override
    public void testTypeBindingCollection() throws Exception {
        // ignore
    }

    @Test(expected = UnsupportedOperationException.class)
    @Override
    public void testSurfingIterator() throws Exception {
        super.testSurfingIterator();
    }

    @Test(expected = UnsupportedOperationException.class)
    @Override
    public void testResumableParser() throws Exception {
        super.testResumableParser();
    }

}
