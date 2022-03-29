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

package org.jsfr.json.filter;

import org.jsfr.json.PrimitiveHolder;
import org.jsfr.json.path.JsonPath;
import org.jsfr.json.provider.JsonProvider;

import java.util.Iterator;

/**
 * Created by Leo on 2017/4/4.
 */
public class AndPredicate extends AggregatePredicate {

    // AndPredicate becomes stateful

    @Override
    public boolean applyOnPrimitive(JsonPath jsonPosition, PrimitiveHolder primitiveHolder, JsonProvider<?, ?, ?> jsonProvider) {
        Iterator<JsonPathFilter> itr = this.getFilters().iterator();
        while (itr.hasNext()) {
            JsonPathFilter filter = itr.next();
            if (filter.applyOnPrimitive(jsonPosition, primitiveHolder, jsonProvider)) {
                itr.remove();
            }
        }
        return this.getFilters().isEmpty();
    }

    @Override
    public boolean applyOnObject(JsonPath jsonPosition, JsonProvider<?, ?, ?> jsonProvider) {
        Iterator<JsonPathFilter> itr = this.getFilters().iterator();
        while (itr.hasNext()) {
            JsonPathFilter filter = itr.next();
            if (filter.applyOnObject(jsonPosition, jsonProvider)) {
                itr.remove();
            }
        }
        return this.getFilters().isEmpty();
    }

    @Override
    public boolean applyOnArray(JsonPath jsonPosition, Integer length, JsonProvider<?, ?, ?> jsonProvider) {
        Iterator<JsonPathFilter> itr = this.getFilters().iterator();
        while (itr.hasNext()) {
            JsonPathFilter filter = itr.next();
            if (filter.applyOnArray(jsonPosition, length, jsonProvider)) {
                itr.remove();
            }
        }
        return this.getFilters().isEmpty();
    }

}
