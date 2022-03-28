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

import org.jsfr.json.filter.JsonPathFilter;

public class JsonFilterVerifier implements JsonSaxHandler {

    private final SurfingConfiguration config;
    private final JsonPathFilter jsonPathFilter;
    private final Collection<BufferedListener> bufferedListeners;
    private final JsonFilterVerifier dependency;
    private final JsonPosition currentPosition;
    private boolean verified;
    private int stackDepth;

    private int arrayLength;

    public JsonFilterVerifier(JsonPosition currentPosition, SurfingConfiguration config,
        JsonPathFilter jsonPathFilter, JsonFilterVerifier dependency) {
        this.currentPosition = currentPosition;
        this.config = config;
        this.jsonPathFilter = jsonPathFilter;
        this.dependency = dependency;
        this.bufferedListeners = new ArrayList<>();
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
        if (!this.verified && this.jsonPathFilter.applyOnObject(this.currentPosition,
            this.config.getJsonProvider())) {
            this.verified = true;
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
        this.stackDepth++;
        if (!this.verified && this.jsonPathFilter.applyOnArray(this.currentPosition, null,
            this.config.getJsonProvider())) {
            this.verified = true;
        }
        return true;
    }

    @Override
    public boolean endArray() {
        this.stackDepth--;
        if (!this.verified && this.stackDepth == 0 && this.jsonPathFilter.applyOnArray(this.currentPosition,
            this.arrayLength, this.config.getJsonProvider())) {
            this.verified = true;
        }
        return this.endObjectOrArray();
    }

    private boolean endObjectOrArray() {

        if (this.stackDepth == 0) {
            if (this.verified) {
                this.invokeBuffer();
            }
            return false;
        }
        return true;
    }

    @Override
    public boolean primitive(PrimitiveHolder primitiveHolder) {
        if (this.stackDepth == 0) {
            this.arrayLength++;
        }
        if (this.verified) {
            return true;
        }
        if (this.currentPosition.isInsideArray()) {
            if (this.stackDepth != 0) {
                return true;
            }
            if (this.jsonPathFilter.applyOnPrimitive(this.currentPosition, primitiveHolder,
                this.config.getJsonProvider())) {
                this.invokeBuffer();
                this.verified = true;
            }
            return false;
        } else {
            if (this.jsonPathFilter.applyOnPrimitive(this.currentPosition, primitiveHolder,
                this.config.getJsonProvider())) {
                this.verified = true;
            }
        }
        return true;
    }

}
