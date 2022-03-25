/*
 * MIT License
 *
 * Copyright (c) 2019 WANG Lingsong
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package org.jsfr.json.compiler;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Set;
import java.util.TreeMap;
import java.util.regex.Pattern;

import org.antlr.v4.runtime.BailErrorStrategy;
import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.jsfr.json.compiler.JsonPathParser.RelativePathContext;
import org.jsfr.json.exception.JsonPathCompilerException;
import org.jsfr.json.filter.ConstantPredicate;
import org.jsfr.json.filter.EqualityBoolPredicate;
import org.jsfr.json.filter.EqualityNullPredicate;
import org.jsfr.json.filter.EqualityNumPredicate;
import org.jsfr.json.filter.EqualityStrPredicate;
import org.jsfr.json.filter.EqualityTypePredicate;
import org.jsfr.json.filter.ExistencePredicate;
import org.jsfr.json.filter.FilterBuilder;
import org.jsfr.json.filter.GreaterOrEqualThanNumPredicate;
import org.jsfr.json.filter.GreaterThanNumPredicate;
import org.jsfr.json.filter.ItemMethod;
import org.jsfr.json.filter.JsonPathFilter;
import org.jsfr.json.filter.LessOrEqualThanNumPredicate;
import org.jsfr.json.filter.LessThanNumPredicate;
import org.jsfr.json.filter.MatchRegexPredicate;
import org.jsfr.json.filter.NotEqualityBoolPredicate;
import org.jsfr.json.filter.NotEqualityNullPredicate;
import org.jsfr.json.filter.NotEqualityNumPredicate;
import org.jsfr.json.filter.NotEqualityStrPredicate;
import org.jsfr.json.filter.NotEqualityTypePredicate;
import org.jsfr.json.filter.Type;
import org.jsfr.json.path.JsonPath;
import org.jsfr.json.path.SyntaxMode;

/**
 * Created by Leo on 2015/4/1.
 */
@SuppressWarnings({"checkstyle:ClassFanOutComplexity", "checkstyle:MethodCount", "checkstyle:ClassDataAbstractionCoupling"})
public class JsonPathCompiler extends JsonPathBaseVisitor<Void> {

    private JsonPath.Builder pathBuilder;

    private FilterBuilder filterBuilder;

    private JsonPath.Builder filterPathBuilder;

    @Override
    public Void visitPath(JsonPathParser.PathContext ctx) {
        final SyntaxMode mode;
        if (ctx.syntaxMode() != null) {
            mode = SyntaxMode.parse(ctx.syntaxMode().getText());
            if (mode == null) {
                throw new InputMismatchException("Invalid json path mode. Supported: lax");
            }
        } else {
            mode = SyntaxMode.LAX;
        }
        pathBuilder = JsonPath.Builder.start(mode);
        return super.visitPath(ctx);
    }

    private JsonPath.Builder currentPathBuilder() {
        return filterPathBuilder != null ? filterPathBuilder : pathBuilder;
    }

    @Override
    public Void visitSearchChild(JsonPathParser.SearchChildContext ctx) {
        String key = getKeyOrQuotedString(ctx);
        currentPathBuilder().scan();
        JsonPathParser.ArrayContext array = ctx.array();
        if (array != null) {
            array(key, array);
        } else {
            currentPathBuilder().child(key);
        }
        return super.visitSearchChild(ctx);
    }


    @Override
    public Void visitChildNode(JsonPathParser.ChildNodeContext ctx) {
        String key = getKeyOrQuotedString(ctx);
        JsonPathParser.ArrayContext array = ctx.array();
        if (array != null) {
            array(key, array);
        } else {
            currentPathBuilder().child(key);
        }
        return super.visitChildNode(ctx);
    }

    @Override
    public Void visitRelativePath(RelativePathContext ctx) {
        if (ctx.array() != null) {
            array(null, ctx.array());
        }
        return super.visitRelativePath(ctx);
    }

    @Override
    public Void visitChildrenNode(JsonPathParser.ChildrenNodeContext ctx) {
        int i = 0;
        String[] strings = new String[ctx.QUOTED_STRING().size()];
        for (TerminalNode node : ctx.QUOTED_STRING()) {
            String quotedString = node.getText();
            strings[i++] = unescapeString(quotedString);
        }
        currentPathBuilder().children(strings);
        return super.visitChildren(ctx);
    }

    @Override
    public Void visitAnyChild(JsonPathParser.AnyChildContext ctx) {
        currentPathBuilder().anyChild();
        return super.visitAnyChild(ctx);
    }

    @Override
    public Void visitAny(JsonPathParser.AnyContext ctx) {
        currentPathBuilder().any();
        return super.visitAny(ctx);
    }

    @Override
    public Void visitFilterExpr(JsonPathParser.FilterExprContext ctx) {
        Void rst;
        if (ctx.NegationOperator() != null) {
            filterBuilder.startNegationPredicate();
            rst = super.visitFilterExpr(ctx);
            filterBuilder.endNegationAndPredicate();
        } else if (ctx.AndOperator() != null) {
            filterBuilder.startAndPredicate();
            rst = super.visitFilterExpr(ctx);
            filterBuilder.endAndPredicate();
        } else if (ctx.OrOperator() != null) {
            filterBuilder.startOrPredicate();
            rst = super.visitFilterExpr(ctx);
            filterBuilder.endOrPredicate();
        } else {
            rst = super.visitFilterExpr(ctx);
        }
        return rst;
    }

    private JsonPath.Builder createFilterPathBuilder() {
        return JsonPath.Builder.startFilterPath();
    }

    @Override
    public Void visitFilterEqualNum(JsonPathParser.FilterEqualNumContext ctx) {
        filterPathBuilder = createFilterPathBuilder();
        Void rst = super.visitFilterEqualNum(ctx);
        filterBuilder.append(
            new EqualityNumPredicate(filterPathBuilder.build(), new BigDecimal(ctx.NUM().getText())));
        filterPathBuilder = null;
        return rst;
    }

    @Override
    public Void visitFilterNEqualNum(JsonPathParser.FilterNEqualNumContext ctx) {
        filterPathBuilder = createFilterPathBuilder();
        Void rst = super.visitFilterNEqualNum(ctx);
        filterBuilder.append(
            new NotEqualityNumPredicate(filterPathBuilder.build(), new BigDecimal(ctx.NUM().getText())));
        filterPathBuilder = null;
        return rst;
    }

    @Override
    public Void visitFilterEqualBool(JsonPathParser.FilterEqualBoolContext ctx) {
        filterPathBuilder = createFilterPathBuilder();
        Void rst = super.visitFilterEqualBool(ctx);
        filterBuilder.append(
            new EqualityBoolPredicate(filterPathBuilder.build(), Boolean.parseBoolean(ctx.BOOL().getText())));
        filterPathBuilder = null;
        return rst;
    }

    @Override
    public Void visitFilterNEqualBool(JsonPathParser.FilterNEqualBoolContext ctx) {
        filterPathBuilder = createFilterPathBuilder();
        Void rst = super.visitFilterNEqualBool(ctx);
        filterBuilder.append(
            new NotEqualityBoolPredicate(filterPathBuilder.build(), Boolean.parseBoolean(ctx.BOOL().getText())));
        filterPathBuilder = null;
        return rst;
    }

    @Override
    public Void visitFilterEqualNull(JsonPathParser.FilterEqualNullContext ctx) {
        filterPathBuilder = createFilterPathBuilder();
        Void rst = super.visitFilterEqualNull(ctx);
        filterBuilder.append(
            new EqualityNullPredicate(filterPathBuilder.build()));
        filterPathBuilder = null;
        return rst;
    }

    @Override
    public Void visitFilterNEqualNull(JsonPathParser.FilterNEqualNullContext ctx) {
        filterPathBuilder = createFilterPathBuilder();
        Void rst = super.visitFilterNEqualNull(ctx);
        filterBuilder.append(
            new NotEqualityNullPredicate(filterPathBuilder.build()));
        filterPathBuilder = null;
        return rst;
    }

    @Override
    public Void visitFilterExist(JsonPathParser.FilterExistContext ctx) {
        filterPathBuilder = createFilterPathBuilder();
        Void rst = super.visitFilterExist(ctx);
        filterBuilder.append(new ExistencePredicate(filterPathBuilder.build()));
        filterPathBuilder = null;
        return rst;
    }

    @Override
    public Void visitFilterGtNum(JsonPathParser.FilterGtNumContext ctx) {
        filterPathBuilder = createFilterPathBuilder();
        Void rst = super.visitFilterGtNum(ctx);
        filterBuilder.append(
            new GreaterThanNumPredicate(filterPathBuilder.build(), new BigDecimal(ctx.NUM().getText())));
        filterPathBuilder = null;
        return rst;
    }

    @Override
    public Void visitFilterGeNum(JsonPathParser.FilterGeNumContext ctx) {
        filterPathBuilder = createFilterPathBuilder();
        Void rst = super.visitFilterGeNum(ctx);
        filterBuilder.append(
            new GreaterOrEqualThanNumPredicate(filterPathBuilder.build(), new BigDecimal(ctx.NUM().getText())));
        filterPathBuilder = null;
        return rst;
    }

    @Override
    public Void visitFilterLtNum(JsonPathParser.FilterLtNumContext ctx) {
        filterPathBuilder = createFilterPathBuilder();
        Void rst = super.visitFilterLtNum(ctx);
        filterBuilder.append(
            new LessThanNumPredicate(filterPathBuilder.build(), new BigDecimal(ctx.NUM().getText())));
        filterPathBuilder = null;
        return rst;
    }

    @Override
    public Void visitFilterLeNum(JsonPathParser.FilterLeNumContext ctx) {
        filterPathBuilder = createFilterPathBuilder();
        Void rst = super.visitFilterLeNum(ctx);
        filterBuilder.append(
            new LessOrEqualThanNumPredicate(filterPathBuilder.build(), new BigDecimal(ctx.NUM().getText())));
        filterPathBuilder = null;
        return rst;
    }

    @Override
    public Void visitFilterEqualStr(JsonPathParser.FilterEqualStrContext ctx) {
        filterPathBuilder = createFilterPathBuilder();
        Void rst = super.visitFilterEqualStr(ctx);
        filterBuilder.append(
            new EqualityStrPredicate(filterPathBuilder.build(), unescapeString(ctx.QUOTED_STRING().getText())));
        filterPathBuilder = null;
        return rst;
    }

    @Override
    public Void visitFilterNEqualStr(JsonPathParser.FilterNEqualStrContext ctx) {
        filterPathBuilder = createFilterPathBuilder();
        Void rst = super.visitFilterNEqualStr(ctx);
        filterBuilder.append(
            new NotEqualityStrPredicate(filterPathBuilder.build(), unescapeString(ctx.QUOTED_STRING().getText())));
        filterPathBuilder = null;
        return rst;
    }

    @Override
    public Void visitFilterMatchRegex(JsonPathParser.FilterMatchRegexContext ctx) {
        filterPathBuilder = createFilterPathBuilder();
        Void rst = super.visitFilterMatchRegex(ctx);
        filterBuilder.append(new MatchRegexPredicate(filterPathBuilder.build(),
            toPattern(ctx.QUOTED_STRING().getText())));
        filterPathBuilder = null;
        return rst;
    }

    @Override
    public Void visitFilterItemMethodEqual(JsonPathParser.FilterItemMethodEqualContext ctx) {
        filterPathBuilder = createFilterPathBuilder();
        Void rst = super.visitFilterItemMethodEqual(ctx);
        ItemMethod itemMethod = getItemMethod(ctx.itemMethod());
        if (itemMethod == ItemMethod.TYPE) {
            Type type = getType(ctx.QUOTED_STRING());
            if (type == null) {
                filterBuilder.append(new ConstantPredicate(filterPathBuilder.build(), false));
            } else {
                filterBuilder.append(new EqualityTypePredicate(filterPathBuilder.build(), type));
            }
        } else {
            throw new InputMismatchException("Unsupported item method: " + itemMethod);
        }
        filterPathBuilder = null;
        return rst;
    }

    @Override
    public Void visitFilterItemMethodNEqual(JsonPathParser.FilterItemMethodNEqualContext ctx) {
        filterPathBuilder = createFilterPathBuilder();
        Void rst = super.visitFilterItemMethodNEqual(ctx);
        ItemMethod itemMethod = getItemMethod(ctx.itemMethod());
        if (itemMethod == ItemMethod.TYPE) {
            Type type = getType(ctx.QUOTED_STRING());
            if (type == null) {
                filterBuilder.append(new ConstantPredicate(filterPathBuilder.build(), true));
            } else {
                filterBuilder.append(new NotEqualityTypePredicate(filterPathBuilder.build(), type));
            }
        } else {
            throw new InputMismatchException("Unsupported item method: " + itemMethod);
        }
        filterPathBuilder = null;
        return rst;
    }

    static String unescapeString(String quotedString) {
        assert quotedString.startsWith("\"") && quotedString.endsWith("\"");
        StringBuilder res = new StringBuilder(quotedString.length() - 2);
        int end = quotedString.length() - 1;
        for (int i = 1; i < end; i++) {
            char ch = quotedString.charAt(i);
            assert ch != '"' : "unexpected end quote";
            if (ch == '\\') {
                ch = quotedString.charAt(++i);
                switch (ch) {
                    case '"':
                    case '\'':
                    case '\\':
                    case '/':
                        break;

                    case 'b':
                        ch = '\b';
                        break;

                    case 'f':
                        ch = '\f';
                        break;

                    case 'n':
                        ch = '\n';
                        break;

                    case 'r':
                        ch = '\r';
                        break;

                    case 't':
                        ch = '\t';
                        break;

                    case 'u':
                        if (i + 4 >= end) {
                            throw new JsonPathCompilerException("Invalid escape");
                        }
                        ch = (char) Integer.parseInt(""
                                + quotedString.charAt(++i)
                                + quotedString.charAt(++i)
                                + quotedString.charAt(++i)
                                + quotedString.charAt(++i), 16);
                        break;

                    default:
                        throw new JsonPathCompilerException("Invalid escape");
                }
            }
            res.append(ch);
        }
        return res.toString();
    }

    private static String getKeyOrQuotedString(JsonPathParser.ChildNodeContext ctx) {
        return ctx.KEY() != null
            ? ctx.KEY().getText()
            : unescapeString(ctx.QUOTED_STRING().getText());
    }

    private static String getKeyOrQuotedString(JsonPathParser.SearchChildContext ctx) {
        return ctx.KEY() != null
            ? ctx.KEY().getText()
            : unescapeString(ctx.QUOTED_STRING().getText());
    }

    private static Pattern toPattern(String str) {
        if (!str.startsWith("\"") || !str.endsWith("\"")) {
            throw new JsonPathCompilerException("Invalid regex literal pattern");
        }
        String unquoted = unescapeString(str);
        return Pattern.compile(unquoted);
    }

    private void array(String key, JsonPathParser.ArrayContext ctx) {
        JsonPathFilter jsonPathFilter = null;
        if (ctx.filter() != null) {
            filterBuilder = new FilterBuilder();
            super.visitFilter(ctx.filter());
            jsonPathFilter = filterBuilder.build();
        }
        JsonPath.Builder pathBuilder = currentPathBuilder();
        if (ctx.index() != null) {
            arrayIndex(key, jsonPathFilter, pathBuilder, ctx.index());
        } else if (ctx.indexes() != null) {
            arrayIndexes(key, jsonPathFilter, pathBuilder, ctx.indexes());
        } else if (ctx.ANY_INDEX() != null) {
            arrayWildcard(key, jsonPathFilter, pathBuilder);
        }
    }

    private static void arrayIndex(String key, JsonPathFilter filter, JsonPath.Builder builder,
        JsonPathParser.IndexContext ctx) {
        builder.array(key, filter, Integer.parseInt(ctx.NUM().getText()));
    }

    private static void arrayIndexes(String key, JsonPathFilter filter, JsonPath.Builder builder,
        JsonPathParser.IndexesContext ctx) {
        Set<Integer> indexes = new HashSet<>();
        TreeMap<Integer, Integer> ranges = new TreeMap<>();
        List<ParseTree> children = ctx.children;
        assert ((TerminalNode) children.get(0)).getSymbol().getType() == JsonPathParser.OPEN_SQ_BRACKET;
        assert ((TerminalNode) children.get(children.size() - 1)).getSymbol().getType()
            == JsonPathParser.CLOSE_SQ_BRACKET;

        for (int i = 1; i < children.size() - 1; i++) {
            if (((TerminalNode) children.get(i)).getSymbol().getType() == JsonPathParser.COMMA) {
                continue;
            }
            int index = Integer.parseInt(children.get(i).getText());
            if (i + 1 < children.size()
                && ((TerminalNode) children.get(i + 1)).getSymbol().getType() == JsonPathParser.TO) {
                i += 2;
                int rangeEnd = Integer.parseInt(children.get(i).getText());
                if (rangeEnd < index) {
                    // TODO exception type?
                    // TODO negative indexes?
                    throw new RuntimeException("Array subscript invalid range");
                }
                ranges.put(index, rangeEnd);
            } else {
                indexes.add(index);
            }
        }
        builder.array(key, filter, indexes, ranges);
    }

    private static void arrayWildcard(String key, JsonPathFilter filter, JsonPath.Builder builder) {
        builder.arrayWildcard(key, filter);
    }

    private static ItemMethod getItemMethod(JsonPathParser.ItemMethodContext ctx) {
        String methodName = ctx.KEY().getText();
        ItemMethod itemMethod = ItemMethod.from(methodName);
        if (itemMethod == null) {
            throw new InputMismatchException(String.format("Invalid item method %s. Supported: %s", methodName,
                Arrays.toString(ItemMethod.values())));
        }
        return itemMethod;
    }

    private static Type getType(TerminalNode quoteString) {
        String typeName = unescapeString(quoteString.getText());
        return Type.from(typeName);
    }

    public static JsonPath[] compile(String... paths) {
        JsonPath[] jsonPaths = new JsonPath[paths.length];
        for (int i = 0; i < paths.length; i++) {
            jsonPaths[i] = compile(paths[i]);
        }
        return jsonPaths;
    }

    public static JsonPath compile(String path) {
        JsonPathLexer lexer = new JsonPathLexer(CharStreams.fromString(path));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        JsonPathParser parser = new JsonPathParser(tokens);
        parser.setErrorHandler(new BailErrorStrategy());
        JsonPathParser.PathContext tree;

        // replace the default ConsoleErrorListener with our ThrowingErrorListener
        parser.removeErrorListeners();
        lexer.removeErrorListeners();
        BaseErrorListener errorListener = new ThrowingErrorListener();
        parser.addErrorListener(errorListener);
        lexer.addErrorListener(errorListener);

        try {
            tree = parser.path();
        } catch (JsonPathCompilerException e) {
            throw e;
        } catch (RuntimeException e) {
            throw JsonPathCompilerException.from(e);
        }
        JsonPathCompiler compiler = new JsonPathCompiler();
        compiler.visit(tree);
        return compiler.pathBuilder.build();
    }

    private static class ThrowingErrorListener extends BaseErrorListener {

        @Override
        public void syntaxError(
                Recognizer<?, ?> recognizer,
                Object offendingSymbol,
                int line,
                int charPositionInLine,
                String msg,
                RecognitionException e
        ) {
            throw new JsonPathCompilerException("Line " + line + ", column " + charPositionInLine + ": " + msg);
        }
    }
}
