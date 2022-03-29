package org.jsfr.json.filter;

import org.jsfr.json.PrimitiveHolder;
import org.jsfr.json.path.JsonPath;
import org.jsfr.json.provider.JsonProvider;

public class EqualityTypePredicate extends BasicJsonPathFilter {

    private final Type type;

    public EqualityTypePredicate(JsonPath relativePath, Type type) {
        super(relativePath);
        this.type = type;
    }

    @Override
    public boolean applyOnPrimitive(JsonPath jsonPosition, PrimitiveHolder primitiveHolder,
        JsonProvider<?, ?, ?> jsonProvider) {
        if (this.type == Type.OBJECT || this.type == Type.ARRAY) {
            return false;
        }
        if (!this.getRelativePath().matchFilterPath(jsonPosition)) {
            return false;
        }
        return (this.getRelativePath().isInsideArray() == jsonPosition.isInsideArray())
            && this.type.isInstanceOf(primitiveHolder.getValue(), jsonProvider);
    }

    @Override
    public boolean applyOnObject(JsonPath jsonPosition, JsonProvider<?, ?, ?> jsonProvider) {
        return this.type == Type.OBJECT && this.getRelativePath().matchFilterPath(jsonPosition);
    }

    @Override
    public boolean applyOnArray(JsonPath jsonPosition, Integer targetIndex, Integer length,
        JsonProvider<?, ?, ?> jsonProvider) {
        return this.type == Type.ARRAY && this.getRelativePath().matchFilterPath(jsonPosition);
    }

}
