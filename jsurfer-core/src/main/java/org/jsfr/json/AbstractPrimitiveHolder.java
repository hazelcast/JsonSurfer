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

import java.io.IOException;

/**
 * Created by Administrator on 2015/7/18 0018.
 */
public abstract class AbstractPrimitiveHolder implements PrimitiveHolder {

    private boolean executed;
    private Object value;
    private final SurfingConfiguration surfingConfiguration;

    public AbstractPrimitiveHolder(SurfingConfiguration surfingConfiguration) {
        this.surfingConfiguration = surfingConfiguration;
    }

    public void init() {
        this.executed = false;
        this.value = null;
    }

    @Override
    public Object getValue() {
        if (executed) {
            return value;
        } else {
            this.executed = true;
            try {
                value = doGetValue();
            } catch (Exception e) {
                surfingConfiguration.getErrorHandlingStrategy().handleParsingException(e);
            }
            return value;
        }
    }

    @Override
    public void setValue(Object value) {
        this.executed = true;
        this.value = value;
    }

    public void skipValue() {
        if (!executed) {
            this.executed = true;
            try {
                doSkipValue();
            } catch (Exception e) {
                surfingConfiguration.getErrorHandlingStrategy().handleParsingException(e);
            }
        }
    }

    protected abstract void doSkipValue() throws IOException;


    protected abstract Object doGetValue() throws IOException;

}
