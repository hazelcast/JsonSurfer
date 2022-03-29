package org.jsfr.json.filter;

import org.jsfr.json.PrimitiveHolder;
import org.jsfr.json.path.JsonPath;
import org.jsfr.json.provider.JsonProvider;

public class NotEqualityTypePredicate extends BasicJsonPathFilter {

    private final Type type;

    public NotEqualityTypePredicate(JsonPath relativePath, Type type) {
        super(relativePath);
        this.type = type;
    }

    @Override
    public boolean applyOnPrimitive(JsonPath jsonPosition, PrimitiveHolder primitiveHolder,
        JsonProvider<?, ?, ?> jsonProvider) {
        if (!this.getRelativePath().matchFilterPath(jsonPosition)) {
            return false;
        }
        return this.type == Type.OBJECT || this.type == Type.ARRAY || (
            (this.getRelativePath().isInsideArray() == jsonPosition.isInsideArray())
                && !this.type.isInstanceOf(
                primitiveHolder.getValue(), jsonProvider));
    }

    @Override
    public boolean applyOnObject(JsonPath jsonPosition, JsonProvider<?, ?, ?> jsonProvider) {
        if (this.type == Type.OBJECT) {
            return false;
        }
        if (!this.getRelativePath().matchFilterPath(jsonPosition)) {
            return false;
        }
        JsonPath parent = jsonPosition.derivePath(jsonPosition.pathDepth() - 1);
        return this.getRelativePath().isInsideArray() == parent.isInsideArray();
    }

    @Override
    public boolean applyOnArray(JsonPath jsonPosition, Integer targetIndex, Integer length,
        JsonProvider<?, ?, ?> jsonProvider) {
        if (this.type == Type.ARRAY) {
            return false;
        }
        if (!this.getRelativePath().matchFilterPath(jsonPosition)) {
            return false;
        }
        JsonPath parent = jsonPosition.derivePath(jsonPosition.pathDepth() - 1);
        return this.getRelativePath().isInsideArray() == parent.isInsideArray();
    }

}
