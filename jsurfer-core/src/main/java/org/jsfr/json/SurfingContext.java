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

import org.jsfr.json.SurfingConfiguration.Binding;
import org.jsfr.json.SurfingConfiguration.IndefinitePathBinding;
import org.jsfr.json.filter.CloneableJsonPathFilter;
import org.jsfr.json.filter.JsonPathFilter;
import org.jsfr.json.path.ArrayIndex;
import org.jsfr.json.path.ChildNode;
import org.jsfr.json.path.PathOperator;
import org.jsfr.json.path.PathOperator.Type;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.function.Function;

/**
 * Receives JSON reading events from input data JSON parser, matches and delegates those events to filters
 * verifier (if there are filters registered in JSON path) and to content dispatcher that does value collection.
 *
 * SurfingContext is not thread-safe.
 */
public class SurfingContext implements ParsingContext, JsonSaxHandler {

    private boolean stopped;
    private boolean paused;
    private JsonPosition currentPosition;
    private Map<String, Object> transientMap;
    private final ContentDispatcher dispatcher = new ContentDispatcher();
    private final FilterVerifierDispatcher filterVerifierDispatcher;
    private final SurfingConfiguration config;

    SurfingContext(SurfingConfiguration config) {
        this.config = config;
        if (config.hasFilter()) {
            this.filterVerifierDispatcher = new FilterVerifierDispatcher();
            this.dispatcher.addReceiver(this.filterVerifierDispatcher);
        } else {
            this.filterVerifierDispatcher = null;
        }
    }

    private void doMatching(PrimitiveHolder primitiveHolder) {

        LinkedList<JsonPathListener> listeners = null;
        int currentDepth = currentPosition.pathDepth();

        if (config.hasFilter()) {

            // skip matching if "skipOverlappedPath" is enabled
            if (config.isSkipOverlappedPath() && dispatcher.size() > 1) {
                return;
            }
            for (IndefinitePathBinding binding : config.getIndefinitePathLookup()) {
                if (binding.minimumPathDepth <= currentDepth) {
                    listeners = doMatchingWithFilter(binding, primitiveHolder, listeners, false);
                } else {
                    break;
                }
            }
            Binding[] bindings = config.getDefinitePathBind(currentDepth);
            if (bindings != null) {
                for (Binding binding : bindings) {
                    listeners = doMatchingWithFilter(binding, primitiveHolder, listeners, true);
                }
            }

        } else {
            // skip matching if "skipOverlappedPath" is enabled
            if (config.isSkipOverlappedPath() && !dispatcher.isEmpty()) {
                return;
            }

            for (IndefinitePathBinding binding : config.getIndefinitePathLookup()) {
                if (binding.minimumPathDepth <= currentDepth) {
                    listeners = doMatching(binding, primitiveHolder, listeners, false);
                } else {
                    break;
                }
            }
            Binding[] bindings = config.getDefinitePathBind(currentDepth);
            if (bindings != null) {
                for (Binding binding : bindings) {
                    listeners = doMatching(binding, primitiveHolder, listeners, true);
                }
            }

        }

        if (listeners != null) {
            JsonCollector collector = new JsonCollector(listeners, this, config);
            dispatcher.addReceiver(collector);
        }

    }

    private LinkedList<JsonPathListener> doMatchingWithFilter(Binding binding, PrimitiveHolder primitiveHolder,
        LinkedList<JsonPathListener> listeners, boolean definiteBinding) {
        boolean matched = definiteBinding
            ? binding.jsonPath.match(currentPosition) : binding.jsonPath.matchWithDeepScan(currentPosition);
        if (matched) {
            if (binding.filter != null) {
                // JsonPathFilter is stateful so clone is required
                // TODO not clone for stateless filter
                this.filterVerifierDispatcher.addVerifier(binding, new JsonFilterVerifier(currentPosition, config,
                    (JsonPathFilter) ((CloneableJsonPathFilter) binding.filter).cloneMe(),
                    this.filterVerifierDispatcher.getVerifier(binding.dependency)));
            } else {
                if (primitiveHolder != null) {
                    dispatchPrimitiveWithFilter(binding.getListeners(), primitiveHolder.getValue(), binding.dependency);
                } else {
                    JsonFilterVerifier verifier = this.filterVerifierDispatcher.getVerifier(binding.dependency);
                    return mergeCollections(listeners, binding.listeners,
                            verifier != null ? verifier::addListener : Function.identity());
                }
            }
        }
        return listeners;
    }

    /**
     * Adds elements from `srcColl` into `targetColl`, transforming them using
     * the `srcMapping`. If `targetColl` is null, creates a new collection.
     */
    private static <T> LinkedList<T> mergeCollections(LinkedList<T> targetColl, T[] srcColl, Function<T, T> srcMapping) {
        if (targetColl == null) {
            targetColl = new LinkedList<>();
        }
        for (T element : srcColl) {
            targetColl.add(srcMapping.apply(element));
        }
        return targetColl;
    }

    private LinkedList<JsonPathListener> doMatching(Binding binding, PrimitiveHolder primitiveHolder,
        LinkedList<JsonPathListener> listeners, boolean definiteBinding) {
        boolean matched = definiteBinding ? binding.jsonPath.match(currentPosition)
            : binding.jsonPath.matchWithDeepScan(currentPosition);
        if (matched) {
            if (primitiveHolder != null) {
                dispatchPrimitive(binding.getListeners(), primitiveHolder.getValue());
            } else {
                return mergeCollections(listeners, binding.listeners, Function.identity());
            }
        }
        return listeners;
    }

    private void dispatchPrimitiveWithFilter(JsonPathListener[] listeners, Object primitive, Binding dependency) {
        if (dependency != null) {
            JsonFilterVerifier filterVerifier = this.filterVerifierDispatcher.getVerifier(dependency);
            for (JsonPathListener listener : listeners) {
                JsonPathListener newListener = filterVerifier.addListener(listener);
                newListener.onValue(primitive, this);
            }
        } else {
            dispatchPrimitive(listeners, primitive);
        }
    }

    private void dispatchPrimitive(JsonPathListener[] listeners, Object primitive) {
        DispatchUtil.dispatchValueToListeners(primitive, listeners, this, config.getErrorHandlingStrategy());
    }

    @Override
    public boolean startJSON() {
        currentPosition = JsonPosition.start();
        doMatching(null);
        dispatcher.startJSON();
        return true;
    }

    @Override
    public boolean endJSON() {
        dispatcher.endJSON();
        // clear resources
        currentPosition.clear();
        currentPosition = null;
        this.stop();
        return true;
    }

    @Override
    public boolean startObject() {
        if (shouldBreak()) {
            return false;
        }
        PathOperator currentNode = currentPosition.peek();
        switch (currentNode.getType()) {
            case OBJECT:
                doMatching(null);
                break;
            case ARRAY:
                accumulateArrayIndex(currentNode);
//                startArrayElement();
                doMatching(null);
                break;
            case ROOT:
                break;
            default:
                throw new IllegalStateException();
        }
        currentPosition.stepIntoObject();
        dispatcher.startObject();
        return true;
    }

    @Override
    public boolean endObject() {
        if (shouldBreak()) {
            return false;
        }
        currentPosition.stepOutObject();
        dispatcher.endObject();
        return true;
    }

    @Override
    public boolean startObjectEntry(String key) {
        if (shouldBreak()) {
            return false;
        }
        currentPosition.updateObjectEntry(key);
        dispatcher.startObjectEntry(key);
        return true;
    }

    @Override
    public boolean startArray() {
        if (shouldBreak()) {
            return false;
        }
        PathOperator currentNode = currentPosition.peek();
        switch (currentNode.getType()) {
            case OBJECT:
                //doMatching(null);
                break;
            case ARRAY:
                accumulateArrayIndex(currentNode);
//                startArrayElement();
                doMatching(null);
                break;
            case ROOT:
                break;
            default:
                throw new IllegalStateException();
        }

        currentPosition.stepIntoArray();
        dispatcher.startArray();
        return true;
    }

    private void accumulateArrayIndex(PathOperator arrayIndex) {
        if (arrayIndex instanceof ArrayIndex) {
            ((ArrayIndex) arrayIndex).increaseArrayIndex();
        } else {
            throw new IllegalStateException("Only array and root array operators are expected");
        }
    }

    @Override
    public boolean endArray() {
        if (shouldBreak()) {
            return false;
        }
        currentPosition.stepOutArray();
        dispatcher.endArray();
        return true;
    }

    @Override
    public boolean primitive(PrimitiveHolder primitiveHolder) {
        if (shouldBreak()) {
            return false;
        }
        PathOperator currentNode = currentPosition.peek();
        switch (currentNode.getType()) {
            case OBJECT:
                doMatching(primitiveHolder);
                break;
            case ARRAY:
                accumulateArrayIndex(currentNode);
//                startArrayElement();
                doMatching(primitiveHolder);
                break;
            case ROOT:
                break;
            default:
                throw new IllegalStateException();
        }

        dispatcher.primitive(primitiveHolder);
        return true;
    }

    @Override
    public String getJsonPath() {
        return this.currentPosition.toString();
    }

    @Override
    public String getCurrentFieldName() {
        PathOperator top = this.currentPosition.peek();
        if (top instanceof ChildNode) {
            return ((ChildNode) top).getKey();
        } else {
            return null;
        }
    }

    @Override
    public int getCurrentArrayIndex() {
        PathOperator top = this.currentPosition.peek();
        if (top.getType() == Type.ARRAY) {
            return ((ArrayIndex) top).getArrayIndex();
        } else {
            return -1;
        }
    }

    @Override
    public void save(String key, Object value) {
        if (this.transientMap == null) {
            this.transientMap = new HashMap<>();
        }
        this.transientMap.put(key, value);
    }

    @Override
    public <T> T load(String key, Class<T> tClass) {
        return this.transientMap != null ? tClass.cast(this.transientMap.get(key)) : null;
    }

    @Override
    public <T> T cast(Object object, Class<T> tClass) {
        //noinspection unchecked
        return (T) this.config.getJsonProvider().cast(object, tClass);
    }

    public boolean shouldBreak() {
        return this.stopped || this.paused;
    }

    @Override
    public void stop() {
        this.stopped = true;
        this.paused = false;
    }

    @Override
    public boolean isStopped() {
        return this.stopped;
    }

    @Override
    public void pause() {
        this.paused = true;
    }

    @Override
    public void resume() {
        this.paused = false;
    }

    @Override
    public boolean isPaused() {
        return this.paused;
    }

    public SurfingConfiguration getConfig() {
        return config;
    }

}
