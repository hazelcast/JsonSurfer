package org.jsfr.json.filter;

import java.util.HashMap;
import java.util.Map;

import org.jsfr.json.provider.JsonProvider;

/**
 * Types that `type()` method can return. See {@link ItemMethod#TYPE}.
 */
public enum Type {
    /**
     * Represents JSON null literal.
     */
    NULL {
        @Override
        public boolean isInstanceOf(Object obj, JsonProvider<?, ?, ?> provider) {
            return provider.isPrimitiveNull(obj);
        }
    },
    /**
     * Represents JSON `number` primitive type.
     */
    NUMBER {
        @Override
        public boolean isInstanceOf(Object obj, JsonProvider<?, ?, ?> provider) {
            return provider.isPrimitiveNumber(obj);
        }
    },
    /**
     * Represents JSON `string` primitive type.
     */
    STRING {
        @Override
        public boolean isInstanceOf(Object obj, JsonProvider<?, ?, ?> provider) {
            return provider.isPrimitiveString(obj);
        }
    },
    /**
     * Represents JSON `boolean` primitive type.
     */
    BOOLEAN {
        @Override
        public boolean isInstanceOf(Object obj, JsonProvider<?, ?, ?> provider) {
            return provider.isPrimitiveBoolean(obj);
        }
    },
    /**
     * Represents JSON `array` structured type.
     */
    ARRAY,
    /**
     * Represents JSON `object` structured type.
     */
    OBJECT;

    private static final Map<String, Type> NAME_TO_TYPE_MAPPING = new HashMap<>();

    static {
        for (Type item : values()) {
            NAME_TO_TYPE_MAPPING.put(item.toString(), item);
        }
    }

    public boolean isInstanceOf(Object obj, JsonProvider<?, ?, ?> provider) {
        throw new UnsupportedOperationException("should not be called");
    }

    @Override
    public String toString() {
        return name().toLowerCase();
    }

    public static Type from(String value) {
        return NAME_TO_TYPE_MAPPING.get(value);
    }
}
