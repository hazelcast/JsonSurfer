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
    public boolean apply(JsonPath jsonPosition, PrimitiveHolder primitiveHolder, JsonProvider jsonProvider) {
        if (!this.getRelativePath().matchFilterPath(jsonPosition)) {
            return false;
        }
        switch (type) {
            case ARRAY:
                return primitiveHolder == null && jsonPosition.isInsideArray();
            case OBJECT:
                return primitiveHolder == null && jsonPosition.isInsideObject();
            default:
                return primitiveHolder != null
                    && (this.getRelativePath().isInsideArray() == jsonPosition.isInsideArray())
                    && this.type.isInstanceOf(primitiveHolder.getValue(), jsonProvider);
        }
    }

}
