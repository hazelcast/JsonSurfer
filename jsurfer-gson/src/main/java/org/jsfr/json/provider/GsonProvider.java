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

package org.jsfr.json.provider;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonNull;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;

import java.math.BigInteger;

import static org.jsfr.json.provider.CastUtil.castJavaObject;

public class GsonProvider implements JsonProvider<JsonObject, JsonArray, JsonElement> {

    /**
     * Immutable shared instance
     */
    public static final GsonProvider INSTANCE = new GsonProvider();

    private final Gson internalGson;

    public GsonProvider() {
        this(new GsonBuilder().create());
    }

    public GsonProvider(Gson internalGson) {
        this.internalGson = internalGson;
    }

    @Override
    public JsonObject createObject() {
        return new JsonObject();
    }

    @Override
    public JsonArray createArray() {
        return new JsonArray();
    }

    @Override
    public void put(JsonObject object, String key, JsonElement value) {
        object.add(key, value);
    }

    @Override
    public void add(JsonArray array, JsonElement value) {
        array.add(value);
    }

    @Override
    public Object resolve(JsonObject object, String key) {
        return object.get(key);
    }

    @Override
    public Object resolve(JsonArray array, int index) {
        return array.get(index);
    }

    @Override
    public JsonElement primitive(boolean value) {
        return new JsonPrimitive(value);
    }

    @Override
    public JsonElement primitive(int value) {
        return new JsonPrimitive(value);
    }

    @Override
    public JsonElement primitive(BigInteger value) {
        return new JsonPrimitive(value);
    }

    @Override
    public JsonElement primitive(double value) {
        return new JsonPrimitive(value);
    }

    @Override
    public JsonElement primitive(long value) {
        return new JsonPrimitive(value);
    }

    @Override
    public JsonElement primitive(String value) {
        if (value == null) {
            return this.primitiveNull();
        }
        return new JsonPrimitive(value);
    }

    @Override
    public JsonElement primitiveNull() {
        return JsonNull.INSTANCE;
    }

    @Override
    public <T> T cast(JsonElement value, Class<T> tClass) {
        if (value == null || isPrimitiveNull(value)) {
            return tClass.cast(null);
        }
        if (internalGson.getAdapter(tClass) != null) {
            T casted = internalGson.fromJson(value, tClass);
            if (casted != null) {
                return casted;
            }
        }
        return castJavaObject(value, tClass);
    }

    @Override
    public boolean isPrimitiveNull(Object value) {
        return value instanceof JsonNull;
    }

    @Override
    public boolean isPrimitiveNumber(Object value) {
        boolean isPrimitive = value instanceof JsonPrimitive;
        if (!isPrimitive) {
            return false;
        }
        return ((JsonPrimitive) value).isNumber();
    }

    @Override
    public boolean isPrimitiveBoolean(Object value) {
        boolean isPrimitive = value instanceof JsonPrimitive;
        if (!isPrimitive) {
            return false;
        }
        return ((JsonPrimitive) value).isBoolean();
    }

    @Override
    public boolean isPrimitiveString(Object value) {
        boolean isPrimitive = value instanceof JsonPrimitive;
        if (!isPrimitive) {
            return false;
        }
        return ((JsonPrimitive) value).isString();
    }
}
