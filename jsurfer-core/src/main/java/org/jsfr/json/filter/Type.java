package org.jsfr.json.filter;

import org.jsfr.json.provider.JsonProvider;

/**
 * Types that `type()` method can return. See {@link ItemMethod#TYPE}.
 */
public enum Type {
    /**
     *
     */
    NULL {
        @Override
        public boolean isInstanceOf(Object obj, JsonProvider<?, ?, ?> provider) {
            return provider.isPrimitiveNull(obj);
        }
    },
    /**
     *
     */
    NUMBER {
        @Override
        public boolean isInstanceOf(Object obj, JsonProvider<?, ?, ?> provider) {
            return provider.isPrimitiveNumber(obj);
        }
    },
    /**
     *
     */
    STRING {
        @Override
        public boolean isInstanceOf(Object obj, JsonProvider<?, ?, ?> provider) {
            return provider.isPrimitiveString(obj);
        }
    },
    /**
     *
     */
    BOOLEAN {
        @Override
        public boolean isInstanceOf(Object obj, JsonProvider<?, ?, ?> provider) {
            return provider.isPrimitiveBoolean(obj);
        }
    },
    /**
     *
     */
    ARRAY,
    /**
     *
     */
    OBJECT;

    public boolean isInstanceOf(Object obj, JsonProvider<?, ?, ?> provider) {
        return false;
    }

    @Override
    public String toString() {
        return name().toLowerCase();
    }

    public static Type from(String value) {
        for (Type type : values()) {
            if (type.toString().equalsIgnoreCase(value)) {
                return type;
            }
        }
        return null;
    }
}
