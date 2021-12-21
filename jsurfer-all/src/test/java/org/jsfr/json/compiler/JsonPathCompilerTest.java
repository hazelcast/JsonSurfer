package org.jsfr.json.compiler;

import org.jsfr.json.exception.JsonSurfingException;
import org.junit.Test;

import static org.jsfr.json.compiler.JsonPathCompiler.unescapeString;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class JsonPathCompilerTest {

    @Test
    public void test_unescapeString() {
        assertEquals("", unescapeString("\"\""));
        assertEquals("foo", unescapeString("\"foo\""));
        assertEquals("\"", unescapeString("\"\\\"\""));
        assertEquals("\'", unescapeString("\"\'\""));
        assertEquals("\'", unescapeString("\"\\\'\""));
        assertEquals("\b", unescapeString("\"\\b\""));
        assertEquals("\b", unescapeString("\"\b\""));
        assertEquals("\f", unescapeString("\"\\f\""));
        assertEquals("\f", unescapeString("\"\f\""));
        assertEquals("\n", unescapeString("\"\\n\""));
        assertEquals("\n", unescapeString("\"\n\""));
        assertEquals("\r", unescapeString("\"\\r\""));
        assertEquals("\r", unescapeString("\"\r\""));
        assertEquals("\t", unescapeString("\"\\t\""));
        assertEquals("\t", unescapeString("\"\t\""));
        assertEquals("\u0123", unescapeString("\"\\u0123\""));
        assertEquals("\u0123", unescapeString("\"\u0123\""));
        // all at once
        assertEquals("foo\"''\b\b\f\f\n\n\r\r\t\t\u0123\u0123bar",
                unescapeString("\"foo\\\"\\''\\b\b\\f\f\\n\n\\r\r\\t\t\\u0123\u0123bar\""));
    }

    @Test
    public void test_unescapeString_errors() {
        assertThrows(AssertionError.class, () -> unescapeString(""));

        Throwable e = assertThrows(JsonSurfingException.class, () -> unescapeString("\"\\u123\""));
        assertEquals("Invalid escape", e.getMessage());

        e = assertThrows(JsonSurfingException.class, () -> unescapeString("\"\\e\""));
        assertEquals("Invalid escape", e.getMessage());

        e = assertThrows(AssertionError.class, () -> unescapeString("\"\"\""));
        assertEquals("unexpected end quote", e.getMessage());
    }
}
