package org.jsfr.json.provider;

final class CastUtil {

    private CastUtil() {
    }

    static <T> T castJavaObject(Object value, Class<T> tClass) {
        if (tClass.isInstance(value) || value == null) {
            return tClass.cast(value);
        } else if (tClass == String.class) {
            return tClass.cast(value.toString());
        } else {
            throw new ClassCastException("Cannot cast " + value.getClass().getName() + " to " + tClass.getName());
        }
    }

}
