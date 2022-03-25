package org.jsfr.json.filter;

import java.util.HashMap;
import java.util.Map;

/**
 * A method that can be called on path element inside filter expressions.
 */
public enum ItemMethod {
    /**
     * The type() method returns a character string that names the type of the SQL/JSON item.
     * Let I be the SQL/JSON item, then I.type() is:
     * — If I is the SQL/JSON null, then “null”.
     * — If I is true or false, then “boolean”.
     * — If I is numeric, then “number”.
     * — If I is a character string, then “string”.
     * — If I is an SQL/JSON array, then “array”.
     * — If I is an SQL/JSON object, then “object”.
     *
     * For example, to retain only numeric SQL/JSON items, one might use:
     * $[*]?(@.type() == "number")
     */
    TYPE;

    private static final Map<String, ItemMethod> NAME_TO_METHOD_MAPPING = new HashMap<>();

    static {
        for (ItemMethod method : values()) {
            NAME_TO_METHOD_MAPPING.put(method.toString(), method);
        }
    }

    public static ItemMethod from(String value) {
        return NAME_TO_METHOD_MAPPING.get(value);
    }

    @Override
    public String toString() {
        return name().toLowerCase();
    }
}
