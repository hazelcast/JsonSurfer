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

import org.jsfr.json.path.ArrayIndex;
import org.jsfr.json.path.ChildNode;
import org.jsfr.json.path.JsonPath;
import org.jsfr.json.path.PathOperator;

class JsonPosition extends JsonPath {

    static JsonPosition start() {
        return new JsonPosition();
    }

    void stepIntoObject() {
        if (operators.length > size) {
            PathOperator next = operators[size];
            if (next instanceof ChildNode) {
                size++;
                ((ChildNode) next).setKey(null);
                return;
            }
        }
        push(new ChildNode(null));
    }

    void updateObjectEntry(String key) {
        ((ChildNode) peek()).setKey(key);
    }

    void stepOutObject() {
        pop();
    }

    void stepIntoArray() {
        PathOperator last = peek();
        pushArray(last);
    }

    void stepOutArray() {
        popArray(peek());
    }

    boolean isInsideArray() {
        PathOperator last = peek();
        return last instanceof ArrayIndex;
    }

    private void popArray(PathOperator node) {
        if (node instanceof ArrayIndex) {
            pop();
            ArrayIndex indexNode = (ArrayIndex) node;
            if (indexNode.getKey()  != null) {
                push(new ChildNode(indexNode.getKey()));
            }
        }
    }

    private void pushArray(PathOperator node) {
        if (node instanceof ChildNode && node.getType() == PathOperator.Type.OBJECT) {
            pop();
            push(new ArrayIndex(((ChildNode) node).getKey()));
        } else {
            if (operators.length > size) {
                PathOperator next = operators[size];
                if (next instanceof ArrayIndex) {
                    size++;
                    ((ArrayIndex) next).reset();
                    return;
                }
            }
            push(new ArrayIndex(null));
        }
    }
}
