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

import java.util.ArrayList;
import java.util.Collection;
import java.util.Objects;

import org.jsfr.json.filter.JsonPathFilter;
import org.jsfr.json.path.ArrayIndex;
import org.jsfr.json.path.ChildNode;
import org.jsfr.json.path.JsonPath;
import org.jsfr.json.path.PathOperator;

public class JsonFilterVerifier implements JsonSaxHandler {

    private static final int INITIAL_DEPTH = 0;

    private final SurfingConfiguration config;
    private final JsonPathFilter jsonPathFilter;
    private final Collection<BufferedListener> bufferedListeners;
    private final JsonFilterVerifier dependency;
    private final JsonPosition currentPosition;
    private final Integer currentArrayIndex;
    private boolean verified;
    private int stackDepth;

    private Integer arrayElementVisited = -1;

    public JsonFilterVerifier(JsonPosition currentPosition, SurfingConfiguration config,
        JsonPathFilter jsonPathFilter, JsonFilterVerifier dependency) {
        this.currentPosition = currentPosition;
        this.config = config;
        this.jsonPathFilter = jsonPathFilter;
        this.dependency = dependency;
        this.bufferedListeners = new ArrayList<>();
        if (currentPosition.isInsideArray()) {
           this.currentArrayIndex =  ((ArrayIndex) currentPosition.peek()).getArrayIndex();
        } else {
           this.currentArrayIndex = null;
        }
    }

    public JsonPathListener addListener(JsonPathListener listener) {
        BufferedListener newListener = new BufferedListener(this.config, listener);
        this.bufferedListeners.add(newListener);
        return newListener;
    }

    private void invokeBuffer() {
        if (dependency != null) {
            dependency.bufferedListeners.addAll(this.bufferedListeners);
        } else {
            for (BufferedListener buffer : this.bufferedListeners) {
                buffer.invokeBufferedValue();
            }
        }
    }

    @Override
    public boolean startJSON() {
        return true;
    }

    @Override
    public boolean endJSON() {
        return false;
    }

    @Override
    public boolean startObject() {
        this.stackDepth++;
        return true;
    }

    @Override
    public boolean startObjectEntry(String key) {
        if (this.arrayElementVisited != -1
            && !Objects.equals(getIndexInDepth(this.currentPosition, stackDepth), this.arrayElementVisited)) {
            return true;
        }
        if (!this.verified && this.jsonPathFilter.applyOnObject(this.currentPosition,
            this.config.getJsonProvider())) {
            this.verified = true;
        }
        if (this.currentPosition.isInsideArray(this.stackDepth)) {
            this.arrayElementVisited = getIndexInDepth(this.currentPosition, this.stackDepth);
        }
        return true;
    }

    @Override
    public boolean endObject() {
        this.stackDepth--;
        return this.endObjectOrArray();
    }

    @Override
    public boolean startArray() {
        if (isKeylessArray(currentPosition)) {
            this.stackDepth++;
        }
        if (this.arrayElementVisited != -1
            && !Objects.equals(getIndexInDepth(this.currentPosition, stackDepth), this.arrayElementVisited)) {
            return true;
        }
        if (!this.verified && this.jsonPathFilter.applyOnArray(this.currentPosition, this.currentArrayIndex,
            null, this.config.getJsonProvider())) {
            this.verified = true;
        }
        if (this.currentPosition.isInsideArray(this.stackDepth)) {
            this.arrayElementVisited = getIndexInDepth(this.currentPosition, this.stackDepth);
        }
        return true;
    }

    @Override
    public boolean endArray() {
        JsonPath arrayPosition = this.currentPosition.derivePath(this.currentPosition.pathDepth() + 1);
        if (!this.verified && this.jsonPathFilter.applyOnArray(
            arrayPosition,
            this.currentArrayIndex, getLength(arrayPosition, this.stackDepth), this.config.getJsonProvider())) {
            this.verified = true;
        }
        if (isKeylessArray(arrayPosition)) {
            this.stackDepth--;
        }
        return this.endObjectOrArray();
    }

    @Override
    public boolean primitive(PrimitiveHolder primitiveHolder) {
        if (this.verified) {
            return true;
        }
        if (this.arrayElementVisited != -1
            && !Objects.equals(getIndexInDepth(this.currentPosition, stackDepth), this.arrayElementVisited)) {
            return true;
        }
        if (this.stackDepth != INITIAL_DEPTH && this.currentPosition.isInsideArray()) {
            return true;
        }
        if (this.jsonPathFilter.applyOnPrimitive(this.currentPosition, primitiveHolder, this.config.getJsonProvider())) {
            this.verified = true;
        }
        if (this.currentPosition.isInsideArray(this.stackDepth)) {
            this.arrayElementVisited = getIndexInDepth(this.currentPosition, this.stackDepth);
        }
        return true;
    }

    private boolean endObjectOrArray() {
        if (this.stackDepth == INITIAL_DEPTH - 1) {
            if (this.verified) {
                this.invokeBuffer();
            }
            return false;
        }
        return true;
    }

    private static Integer getLength(JsonPath currentPosition, int depth) {
        Integer indexInDepth = getIndexInDepth(currentPosition, depth);
        if (indexInDepth != null) {
            return indexInDepth + 1;
        }
        return null;
    }

    private static Integer getIndexInDepth(JsonPath currentPosition, int depth) {
        int pathDepth = currentPosition.pathDepth();
        if (pathDepth <= depth) {
            return null;
        }
        PathOperator operator = currentPosition.get(pathDepth - 1 - depth);
        if (operator instanceof ArrayIndex) {
             return ((ArrayIndex) operator).getArrayIndex();
        }
        return null;
    }

    private static boolean isKeylessArray(JsonPath currentPosition) {
        PathOperator last = currentPosition.peek();
        if (last.getType() == PathOperator.Type.ROOT) {
            return true;
        }
        if (last.getType() == PathOperator.Type.ARRAY || last.getType() == PathOperator.Type.OBJECT) {
            return ((ChildNode) last).getKey() == null;
        }
        throw new IllegalStateException("only array or root expected here");
    }
}
