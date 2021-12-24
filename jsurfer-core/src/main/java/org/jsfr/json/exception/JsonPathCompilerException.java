package org.jsfr.json.exception;

import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Token;

public class JsonPathCompilerException extends JsonSurfingException {

    public JsonPathCompilerException(String message) {
        super(message);
    }

    public JsonPathCompilerException(Throwable cause) {
        super(cause);
    }

    public JsonPathCompilerException(String message, Throwable cause) {
        super(message, cause);
    }

    public static JsonPathCompilerException from(RuntimeException e) {
        if (e instanceof JsonPathCompilerException) {
            return (JsonPathCompilerException) e;
        }
        if (e.getCause() instanceof RecognitionException) {
            return fromInputMismatchException((RecognitionException) e.getCause());
        }
        if (e instanceof RecognitionException) {
            return fromInputMismatchException((RecognitionException) e);
        }
        return new JsonPathCompilerException(e);
    }

    private static JsonPathCompilerException fromInputMismatchException(RecognitionException e) {
        Token token = e.getOffendingToken();
        int startColumn = token.getCharPositionInLine();
        int endColumn = startColumn + token.getStopIndex() - token.getStartIndex() + 1;
        String msg;
        if (startColumn == endColumn) {
            msg = String.format("Unexpected token at line %d, column %d", token.getLine(), startColumn);
        } else {
            msg = String.format("Unexpected token at line %d, columns %d to %d", token.getLine(), startColumn, endColumn);
        }

        if (e.getMessage() != null) {
            msg += ": " + e.getMessage();
        }

        return new JsonPathCompilerException(msg, e);
    }
}
