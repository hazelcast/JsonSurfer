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

import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

import org.jsfr.json.filter.JsonPathFilter;

public class ArrayIndexes extends FilterableChildNode {

    private final Set<Integer> indexes;
    private final TreeMap<Integer, Integer> ranges;

    public ArrayIndexes(String key, JsonPathFilter jsonPathFilter,
        Set<Integer> indexes, TreeMap<Integer, Integer> ranges) {
        super(key, jsonPathFilter);
        this.indexes = indexes;
        this.ranges = ranges;
    }

    @Override
    public boolean match(PathOperator pathOperator) {
        if (!super.match(pathOperator)) {
            return false;
        }
        if (pathOperator instanceof ArrayIndex) {
            int arrayIndex = ((ArrayIndex) pathOperator).getArrayIndex();
            if (indexes.contains(arrayIndex)) {
                return true;
            }
            Entry<Integer, Integer> range = ranges.floorEntry(arrayIndex);
            return range != null && range.getValue() >= arrayIndex;
        }
        throw new IllegalStateException("unexpected path operator: " + pathOperator);
    }

    @Override
    public Type getType() {
        return Type.ARRAY;
    }

    @Override
    public String toString() {
        StringBuilder res = new StringBuilder();
        res.append(super.toString());
        res.append('[');

        for (Integer index : indexes) {
            res.append(index).append(',');
        }

        for (Entry<Integer, Integer> range : ranges.entrySet()) {
            res
                    .append(range.getKey())
                    .append(" to ")
                    .append(range.getValue())
                    .append(',');
        }

        if (res.length() == 1) {
            res.append(']');
        } else {
            res.setCharAt(res.length() - 1, ']');
        }
        res.append(super.getJsonPathFilter() != null ? "?(@...)" : "");
        return res.toString();
    }
}
