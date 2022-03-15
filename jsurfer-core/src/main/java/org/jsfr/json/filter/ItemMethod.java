package org.jsfr.json.filter;

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



    public static ItemMethod from(String value) {
        for (ItemMethod rename : values()) {
            if (rename.toString().equalsIgnoreCase(value)) {
                return rename;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return name().toLowerCase();
    }
}
