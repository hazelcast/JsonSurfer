package org.jsfr.json.filter;

import org.jsfr.json.PrimitiveHolder;
import org.jsfr.json.path.JsonPath;
import org.jsfr.json.provider.JsonProvider;

public class ConstantPredicate extends BasicJsonPathFilter {

    private final boolean result;

    public ConstantPredicate(JsonPath relativePath, boolean positive) {
        super(relativePath);
        this.result = positive;
    }

    @Override
    public boolean applyOnPrimitive(JsonPath jsonPosition, PrimitiveHolder primitiveHolder, JsonProvider<?, ?, ?> jsonProvider) {
        return this.result;
    }

    @Override
    public boolean applyOnObject(JsonPath jsonPosition, JsonProvider<?, ?, ?> jsonProvider) {
        return this.result;
    }

    @Override
    public boolean applyOnArray(JsonPath jsonPosition, Integer length, JsonProvider<?, ?, ?> jsonProvider) {
        return this.result;
    }

}
