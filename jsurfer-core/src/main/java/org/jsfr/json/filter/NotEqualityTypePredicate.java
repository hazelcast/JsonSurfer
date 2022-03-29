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
    public boolean apply(JsonPath jsonPosition, PrimitiveHolder primitiveHolder, JsonProvider jsonProvider) {
        if (!this.getRelativePath().matchFilterPath(jsonPosition)) {
            return false;
        }
        switch (type) {
            case ARRAY:
                return primitiveHolder != null || jsonPosition.isInsideObject();
            case OBJECT:
                return primitiveHolder != null || jsonPosition.isInsideArray();
            default:
                if (primitiveHolder == null) {
                    JsonPath parent = jsonPosition.derivePath(jsonPosition.pathDepth() - 1);
                    return this.getRelativePath().isInsideArray() == parent.isInsideArray();
                } else {
                   return  (this.getRelativePath().isInsideArray() == jsonPosition.isInsideArray())
                        && !this.type.isInstanceOf(primitiveHolder.getValue(), jsonProvider);
                }
        }
    }

}
