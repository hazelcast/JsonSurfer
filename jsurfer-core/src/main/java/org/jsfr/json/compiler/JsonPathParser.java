// Generated from JsonPath.g4 by ANTLR 4.9.3

package org.jsfr.json.compiler;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class JsonPathParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, ANY_INDEX=19, OPEN_SQ_BRACKET=20, CLOSE_SQ_BRACKET=21, TO=22, 
		COMMA=23, COLON=24, NegationOperator=25, AndOperator=26, OrOperator=27, 
		NUM=28, QUOTED_STRING=29, BOOL=30, NULL=31, NE=32, KEY=33, WS=34;
	public static final int
		RULE_path = 0, RULE_syntaxMode = 1, RULE_relativePath = 2, RULE_searchChild = 3, 
		RULE_anyChild = 4, RULE_any = 5, RULE_index = 6, RULE_indexes = 7, RULE_filter = 8, 
		RULE_childNode = 9, RULE_array = 10, RULE_filterExpr = 11, RULE_filterExist = 12, 
		RULE_filterGtNum = 13, RULE_filterGeNum = 14, RULE_filterLtNum = 15, RULE_filterLeNum = 16, 
		RULE_filterEqualNum = 17, RULE_filterNEqualNum = 18, RULE_filterEqualBool = 19, 
		RULE_filterNEqualBool = 20, RULE_filterEqualStr = 21, RULE_filterNEqualStr = 22, 
		RULE_filterEqualNull = 23, RULE_filterNEqualNull = 24, RULE_filterMatchRegex = 25;
	private static String[] makeRuleNames() {
		return new String[] {
			"path", "syntaxMode", "relativePath", "searchChild", "anyChild", "any", 
			"index", "indexes", "filter", "childNode", "array", "filterExpr", "filterExist", 
			"filterGtNum", "filterGeNum", "filterLtNum", "filterLeNum", "filterEqualNum", 
			"filterNEqualNum", "filterEqualBool", "filterNEqualBool", "filterEqualStr", 
			"filterNEqualStr", "filterEqualNull", "filterNEqualNull", "filterMatchRegex"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'$'", "'lax'", "'strict'", "'..'", "'.*'", "'*'", "'.'", "'?('", 
			"')'", "'('", "'exists'", "'@'", "'>'", "'>='", "'<'", "'<='", "'=='", 
			"'like_regex'", "'[*]'", "'['", "']'", "'to'", "','", "':'", "'!'", "'&&'", 
			"'||'", null, null, null, "'null'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, "ANY_INDEX", "OPEN_SQ_BRACKET", 
			"CLOSE_SQ_BRACKET", "TO", "COMMA", "COLON", "NegationOperator", "AndOperator", 
			"OrOperator", "NUM", "QUOTED_STRING", "BOOL", "NULL", "NE", "KEY", "WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "JsonPath.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public JsonPathParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class PathContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(JsonPathParser.EOF, 0); }
		public SyntaxModeContext syntaxMode() {
			return getRuleContext(SyntaxModeContext.class,0);
		}
		public List<RelativePathContext> relativePath() {
			return getRuleContexts(RelativePathContext.class);
		}
		public RelativePathContext relativePath(int i) {
			return getRuleContext(RelativePathContext.class,i);
		}
		public PathContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_path; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JsonPathVisitor ) return ((JsonPathVisitor<? extends T>)visitor).visitPath(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PathContext path() throws RecognitionException {
		PathContext _localctx = new PathContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_path);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(53);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__1 || _la==T__2) {
				{
				setState(52);
				syntaxMode();
				}
			}

			setState(55);
			match(T__0);
			setState(59);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << ANY_INDEX) | (1L << OPEN_SQ_BRACKET))) != 0)) {
				{
				{
				setState(56);
				relativePath();
				}
				}
				setState(61);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(62);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SyntaxModeContext extends ParserRuleContext {
		public SyntaxModeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_syntaxMode; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JsonPathVisitor ) return ((JsonPathVisitor<? extends T>)visitor).visitSyntaxMode(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SyntaxModeContext syntaxMode() throws RecognitionException {
		SyntaxModeContext _localctx = new SyntaxModeContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_syntaxMode);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(64);
			_la = _input.LA(1);
			if ( !(_la==T__1 || _la==T__2) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RelativePathContext extends ParserRuleContext {
		public SearchChildContext searchChild() {
			return getRuleContext(SearchChildContext.class,0);
		}
		public ChildNodeContext childNode() {
			return getRuleContext(ChildNodeContext.class,0);
		}
		public ArrayContext array() {
			return getRuleContext(ArrayContext.class,0);
		}
		public AnyChildContext anyChild() {
			return getRuleContext(AnyChildContext.class,0);
		}
		public AnyContext any() {
			return getRuleContext(AnyContext.class,0);
		}
		public RelativePathContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relativePath; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JsonPathVisitor ) return ((JsonPathVisitor<? extends T>)visitor).visitRelativePath(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelativePathContext relativePath() throws RecognitionException {
		RelativePathContext _localctx = new RelativePathContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_relativePath);
		try {
			setState(71);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(66);
				searchChild();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(67);
				childNode();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(68);
				array();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(69);
				anyChild();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(70);
				any();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SearchChildContext extends ParserRuleContext {
		public TerminalNode KEY() { return getToken(JsonPathParser.KEY, 0); }
		public TerminalNode QUOTED_STRING() { return getToken(JsonPathParser.QUOTED_STRING, 0); }
		public ArrayContext array() {
			return getRuleContext(ArrayContext.class,0);
		}
		public SearchChildContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_searchChild; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JsonPathVisitor ) return ((JsonPathVisitor<? extends T>)visitor).visitSearchChild(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SearchChildContext searchChild() throws RecognitionException {
		SearchChildContext _localctx = new SearchChildContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_searchChild);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(73);
			match(T__3);
			setState(74);
			_la = _input.LA(1);
			if ( !(_la==QUOTED_STRING || _la==KEY) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(76);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				{
				setState(75);
				array();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AnyChildContext extends ParserRuleContext {
		public AnyChildContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_anyChild; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JsonPathVisitor ) return ((JsonPathVisitor<? extends T>)visitor).visitAnyChild(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnyChildContext anyChild() throws RecognitionException {
		AnyChildContext _localctx = new AnyChildContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_anyChild);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(78);
			match(T__4);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AnyContext extends ParserRuleContext {
		public AnyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_any; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JsonPathVisitor ) return ((JsonPathVisitor<? extends T>)visitor).visitAny(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnyContext any() throws RecognitionException {
		AnyContext _localctx = new AnyContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_any);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(80);
			match(T__5);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IndexContext extends ParserRuleContext {
		public TerminalNode OPEN_SQ_BRACKET() { return getToken(JsonPathParser.OPEN_SQ_BRACKET, 0); }
		public TerminalNode NUM() { return getToken(JsonPathParser.NUM, 0); }
		public TerminalNode CLOSE_SQ_BRACKET() { return getToken(JsonPathParser.CLOSE_SQ_BRACKET, 0); }
		public IndexContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_index; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JsonPathVisitor ) return ((JsonPathVisitor<? extends T>)visitor).visitIndex(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IndexContext index() throws RecognitionException {
		IndexContext _localctx = new IndexContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_index);
		try {
			setState(87);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPEN_SQ_BRACKET:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(82);
				match(OPEN_SQ_BRACKET);
				setState(83);
				match(NUM);
				setState(84);
				match(CLOSE_SQ_BRACKET);
				}
				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(85);
				match(T__6);
				setState(86);
				match(NUM);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IndexesContext extends ParserRuleContext {
		public TerminalNode OPEN_SQ_BRACKET() { return getToken(JsonPathParser.OPEN_SQ_BRACKET, 0); }
		public List<TerminalNode> NUM() { return getTokens(JsonPathParser.NUM); }
		public TerminalNode NUM(int i) {
			return getToken(JsonPathParser.NUM, i);
		}
		public TerminalNode CLOSE_SQ_BRACKET() { return getToken(JsonPathParser.CLOSE_SQ_BRACKET, 0); }
		public List<TerminalNode> TO() { return getTokens(JsonPathParser.TO); }
		public TerminalNode TO(int i) {
			return getToken(JsonPathParser.TO, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(JsonPathParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(JsonPathParser.COMMA, i);
		}
		public IndexesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_indexes; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JsonPathVisitor ) return ((JsonPathVisitor<? extends T>)visitor).visitIndexes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IndexesContext indexes() throws RecognitionException {
		IndexesContext _localctx = new IndexesContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_indexes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(89);
			match(OPEN_SQ_BRACKET);
			setState(90);
			match(NUM);
			setState(93);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TO) {
				{
				setState(91);
				match(TO);
				setState(92);
				match(NUM);
				}
			}

			setState(103);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(95);
				match(COMMA);
				setState(96);
				match(NUM);
				setState(99);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TO) {
					{
					setState(97);
					match(TO);
					setState(98);
					match(NUM);
					}
				}

				}
				}
				setState(105);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(106);
			match(CLOSE_SQ_BRACKET);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FilterContext extends ParserRuleContext {
		public FilterExprContext filterExpr() {
			return getRuleContext(FilterExprContext.class,0);
		}
		public FilterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_filter; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JsonPathVisitor ) return ((JsonPathVisitor<? extends T>)visitor).visitFilter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FilterContext filter() throws RecognitionException {
		FilterContext _localctx = new FilterContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_filter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(108);
			match(T__7);
			setState(109);
			filterExpr(0);
			setState(110);
			match(T__8);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ChildNodeContext extends ParserRuleContext {
		public TerminalNode KEY() { return getToken(JsonPathParser.KEY, 0); }
		public TerminalNode QUOTED_STRING() { return getToken(JsonPathParser.QUOTED_STRING, 0); }
		public ArrayContext array() {
			return getRuleContext(ArrayContext.class,0);
		}
		public ChildNodeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_childNode; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JsonPathVisitor ) return ((JsonPathVisitor<? extends T>)visitor).visitChildNode(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ChildNodeContext childNode() throws RecognitionException {
		ChildNodeContext _localctx = new ChildNodeContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_childNode);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(112);
			match(T__6);
			setState(113);
			_la = _input.LA(1);
			if ( !(_la==QUOTED_STRING || _la==KEY) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(115);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				setState(114);
				array();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArrayContext extends ParserRuleContext {
		public IndexContext index() {
			return getRuleContext(IndexContext.class,0);
		}
		public IndexesContext indexes() {
			return getRuleContext(IndexesContext.class,0);
		}
		public TerminalNode ANY_INDEX() { return getToken(JsonPathParser.ANY_INDEX, 0); }
		public FilterContext filter() {
			return getRuleContext(FilterContext.class,0);
		}
		public ArrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JsonPathVisitor ) return ((JsonPathVisitor<? extends T>)visitor).visitArray(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayContext array() throws RecognitionException {
		ArrayContext _localctx = new ArrayContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_array);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(120);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				setState(117);
				index();
				}
				break;
			case 2:
				{
				setState(118);
				indexes();
				}
				break;
			case 3:
				{
				setState(119);
				match(ANY_INDEX);
				}
				break;
			}
			setState(123);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__7) {
				{
				setState(122);
				filter();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FilterExprContext extends ParserRuleContext {
		public TerminalNode NegationOperator() { return getToken(JsonPathParser.NegationOperator, 0); }
		public List<FilterExprContext> filterExpr() {
			return getRuleContexts(FilterExprContext.class);
		}
		public FilterExprContext filterExpr(int i) {
			return getRuleContext(FilterExprContext.class,i);
		}
		public FilterEqualNumContext filterEqualNum() {
			return getRuleContext(FilterEqualNumContext.class,0);
		}
		public FilterNEqualNumContext filterNEqualNum() {
			return getRuleContext(FilterNEqualNumContext.class,0);
		}
		public FilterEqualStrContext filterEqualStr() {
			return getRuleContext(FilterEqualStrContext.class,0);
		}
		public FilterNEqualStrContext filterNEqualStr() {
			return getRuleContext(FilterNEqualStrContext.class,0);
		}
		public FilterMatchRegexContext filterMatchRegex() {
			return getRuleContext(FilterMatchRegexContext.class,0);
		}
		public FilterEqualBoolContext filterEqualBool() {
			return getRuleContext(FilterEqualBoolContext.class,0);
		}
		public FilterNEqualBoolContext filterNEqualBool() {
			return getRuleContext(FilterNEqualBoolContext.class,0);
		}
		public FilterEqualNullContext filterEqualNull() {
			return getRuleContext(FilterEqualNullContext.class,0);
		}
		public FilterNEqualNullContext filterNEqualNull() {
			return getRuleContext(FilterNEqualNullContext.class,0);
		}
		public FilterGtNumContext filterGtNum() {
			return getRuleContext(FilterGtNumContext.class,0);
		}
		public FilterGeNumContext filterGeNum() {
			return getRuleContext(FilterGeNumContext.class,0);
		}
		public FilterLtNumContext filterLtNum() {
			return getRuleContext(FilterLtNumContext.class,0);
		}
		public FilterLeNumContext filterLeNum() {
			return getRuleContext(FilterLeNumContext.class,0);
		}
		public FilterExistContext filterExist() {
			return getRuleContext(FilterExistContext.class,0);
		}
		public TerminalNode AndOperator() { return getToken(JsonPathParser.AndOperator, 0); }
		public TerminalNode OrOperator() { return getToken(JsonPathParser.OrOperator, 0); }
		public FilterExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_filterExpr; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JsonPathVisitor ) return ((JsonPathVisitor<? extends T>)visitor).visitFilterExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FilterExprContext filterExpr() throws RecognitionException {
		return filterExpr(0);
	}

	private FilterExprContext filterExpr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		FilterExprContext _localctx = new FilterExprContext(_ctx, _parentState);
		FilterExprContext _prevctx = _localctx;
		int _startState = 22;
		enterRecursionRule(_localctx, 22, RULE_filterExpr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(145);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				setState(126);
				match(NegationOperator);
				setState(127);
				match(T__9);
				setState(128);
				filterExpr(0);
				setState(129);
				match(T__8);
				}
				break;
			case 2:
				{
				setState(131);
				filterEqualNum();
				}
				break;
			case 3:
				{
				setState(132);
				filterNEqualNum();
				}
				break;
			case 4:
				{
				setState(133);
				filterEqualStr();
				}
				break;
			case 5:
				{
				setState(134);
				filterNEqualStr();
				}
				break;
			case 6:
				{
				setState(135);
				filterMatchRegex();
				}
				break;
			case 7:
				{
				setState(136);
				filterEqualBool();
				}
				break;
			case 8:
				{
				setState(137);
				filterNEqualBool();
				}
				break;
			case 9:
				{
				setState(138);
				filterEqualNull();
				}
				break;
			case 10:
				{
				setState(139);
				filterNEqualNull();
				}
				break;
			case 11:
				{
				setState(140);
				filterGtNum();
				}
				break;
			case 12:
				{
				setState(141);
				filterGeNum();
				}
				break;
			case 13:
				{
				setState(142);
				filterLtNum();
				}
				break;
			case 14:
				{
				setState(143);
				filterLeNum();
				}
				break;
			case 15:
				{
				setState(144);
				filterExist();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(155);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(153);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
					case 1:
						{
						_localctx = new FilterExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_filterExpr);
						setState(147);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(148);
						match(AndOperator);
						setState(149);
						filterExpr(17);
						}
						break;
					case 2:
						{
						_localctx = new FilterExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_filterExpr);
						setState(150);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(151);
						match(OrOperator);
						setState(152);
						filterExpr(16);
						}
						break;
					}
					} 
				}
				setState(157);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class FilterExistContext extends ParserRuleContext {
		public List<RelativePathContext> relativePath() {
			return getRuleContexts(RelativePathContext.class);
		}
		public RelativePathContext relativePath(int i) {
			return getRuleContext(RelativePathContext.class,i);
		}
		public FilterExistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_filterExist; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JsonPathVisitor ) return ((JsonPathVisitor<? extends T>)visitor).visitFilterExist(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FilterExistContext filterExist() throws RecognitionException {
		FilterExistContext _localctx = new FilterExistContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_filterExist);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(158);
			match(T__10);
			setState(159);
			match(T__9);
			setState(160);
			match(T__11);
			setState(164);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << ANY_INDEX) | (1L << OPEN_SQ_BRACKET))) != 0)) {
				{
				{
				setState(161);
				relativePath();
				}
				}
				setState(166);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(167);
			match(T__8);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FilterGtNumContext extends ParserRuleContext {
		public TerminalNode NUM() { return getToken(JsonPathParser.NUM, 0); }
		public List<RelativePathContext> relativePath() {
			return getRuleContexts(RelativePathContext.class);
		}
		public RelativePathContext relativePath(int i) {
			return getRuleContext(RelativePathContext.class,i);
		}
		public FilterGtNumContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_filterGtNum; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JsonPathVisitor ) return ((JsonPathVisitor<? extends T>)visitor).visitFilterGtNum(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FilterGtNumContext filterGtNum() throws RecognitionException {
		FilterGtNumContext _localctx = new FilterGtNumContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_filterGtNum);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(169);
			match(T__11);
			setState(173);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << ANY_INDEX) | (1L << OPEN_SQ_BRACKET))) != 0)) {
				{
				{
				setState(170);
				relativePath();
				}
				}
				setState(175);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(176);
			match(T__12);
			setState(177);
			match(NUM);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FilterGeNumContext extends ParserRuleContext {
		public TerminalNode NUM() { return getToken(JsonPathParser.NUM, 0); }
		public List<RelativePathContext> relativePath() {
			return getRuleContexts(RelativePathContext.class);
		}
		public RelativePathContext relativePath(int i) {
			return getRuleContext(RelativePathContext.class,i);
		}
		public FilterGeNumContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_filterGeNum; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JsonPathVisitor ) return ((JsonPathVisitor<? extends T>)visitor).visitFilterGeNum(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FilterGeNumContext filterGeNum() throws RecognitionException {
		FilterGeNumContext _localctx = new FilterGeNumContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_filterGeNum);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(179);
			match(T__11);
			setState(183);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << ANY_INDEX) | (1L << OPEN_SQ_BRACKET))) != 0)) {
				{
				{
				setState(180);
				relativePath();
				}
				}
				setState(185);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(186);
			match(T__13);
			setState(187);
			match(NUM);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FilterLtNumContext extends ParserRuleContext {
		public TerminalNode NUM() { return getToken(JsonPathParser.NUM, 0); }
		public List<RelativePathContext> relativePath() {
			return getRuleContexts(RelativePathContext.class);
		}
		public RelativePathContext relativePath(int i) {
			return getRuleContext(RelativePathContext.class,i);
		}
		public FilterLtNumContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_filterLtNum; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JsonPathVisitor ) return ((JsonPathVisitor<? extends T>)visitor).visitFilterLtNum(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FilterLtNumContext filterLtNum() throws RecognitionException {
		FilterLtNumContext _localctx = new FilterLtNumContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_filterLtNum);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(189);
			match(T__11);
			setState(193);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << ANY_INDEX) | (1L << OPEN_SQ_BRACKET))) != 0)) {
				{
				{
				setState(190);
				relativePath();
				}
				}
				setState(195);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(196);
			match(T__14);
			setState(197);
			match(NUM);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FilterLeNumContext extends ParserRuleContext {
		public TerminalNode NUM() { return getToken(JsonPathParser.NUM, 0); }
		public List<RelativePathContext> relativePath() {
			return getRuleContexts(RelativePathContext.class);
		}
		public RelativePathContext relativePath(int i) {
			return getRuleContext(RelativePathContext.class,i);
		}
		public FilterLeNumContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_filterLeNum; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JsonPathVisitor ) return ((JsonPathVisitor<? extends T>)visitor).visitFilterLeNum(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FilterLeNumContext filterLeNum() throws RecognitionException {
		FilterLeNumContext _localctx = new FilterLeNumContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_filterLeNum);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(199);
			match(T__11);
			setState(203);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << ANY_INDEX) | (1L << OPEN_SQ_BRACKET))) != 0)) {
				{
				{
				setState(200);
				relativePath();
				}
				}
				setState(205);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(206);
			match(T__15);
			setState(207);
			match(NUM);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FilterEqualNumContext extends ParserRuleContext {
		public TerminalNode NUM() { return getToken(JsonPathParser.NUM, 0); }
		public List<RelativePathContext> relativePath() {
			return getRuleContexts(RelativePathContext.class);
		}
		public RelativePathContext relativePath(int i) {
			return getRuleContext(RelativePathContext.class,i);
		}
		public FilterEqualNumContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_filterEqualNum; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JsonPathVisitor ) return ((JsonPathVisitor<? extends T>)visitor).visitFilterEqualNum(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FilterEqualNumContext filterEqualNum() throws RecognitionException {
		FilterEqualNumContext _localctx = new FilterEqualNumContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_filterEqualNum);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(209);
			match(T__11);
			setState(213);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << ANY_INDEX) | (1L << OPEN_SQ_BRACKET))) != 0)) {
				{
				{
				setState(210);
				relativePath();
				}
				}
				setState(215);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(216);
			match(T__16);
			setState(217);
			match(NUM);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FilterNEqualNumContext extends ParserRuleContext {
		public TerminalNode NE() { return getToken(JsonPathParser.NE, 0); }
		public TerminalNode NUM() { return getToken(JsonPathParser.NUM, 0); }
		public List<RelativePathContext> relativePath() {
			return getRuleContexts(RelativePathContext.class);
		}
		public RelativePathContext relativePath(int i) {
			return getRuleContext(RelativePathContext.class,i);
		}
		public FilterNEqualNumContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_filterNEqualNum; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JsonPathVisitor ) return ((JsonPathVisitor<? extends T>)visitor).visitFilterNEqualNum(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FilterNEqualNumContext filterNEqualNum() throws RecognitionException {
		FilterNEqualNumContext _localctx = new FilterNEqualNumContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_filterNEqualNum);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(219);
			match(T__11);
			setState(223);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << ANY_INDEX) | (1L << OPEN_SQ_BRACKET))) != 0)) {
				{
				{
				setState(220);
				relativePath();
				}
				}
				setState(225);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(226);
			match(NE);
			setState(227);
			match(NUM);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FilterEqualBoolContext extends ParserRuleContext {
		public TerminalNode BOOL() { return getToken(JsonPathParser.BOOL, 0); }
		public List<RelativePathContext> relativePath() {
			return getRuleContexts(RelativePathContext.class);
		}
		public RelativePathContext relativePath(int i) {
			return getRuleContext(RelativePathContext.class,i);
		}
		public FilterEqualBoolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_filterEqualBool; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JsonPathVisitor ) return ((JsonPathVisitor<? extends T>)visitor).visitFilterEqualBool(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FilterEqualBoolContext filterEqualBool() throws RecognitionException {
		FilterEqualBoolContext _localctx = new FilterEqualBoolContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_filterEqualBool);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(229);
			match(T__11);
			setState(233);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << ANY_INDEX) | (1L << OPEN_SQ_BRACKET))) != 0)) {
				{
				{
				setState(230);
				relativePath();
				}
				}
				setState(235);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(236);
			match(T__16);
			setState(237);
			match(BOOL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FilterNEqualBoolContext extends ParserRuleContext {
		public TerminalNode NE() { return getToken(JsonPathParser.NE, 0); }
		public TerminalNode BOOL() { return getToken(JsonPathParser.BOOL, 0); }
		public List<RelativePathContext> relativePath() {
			return getRuleContexts(RelativePathContext.class);
		}
		public RelativePathContext relativePath(int i) {
			return getRuleContext(RelativePathContext.class,i);
		}
		public FilterNEqualBoolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_filterNEqualBool; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JsonPathVisitor ) return ((JsonPathVisitor<? extends T>)visitor).visitFilterNEqualBool(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FilterNEqualBoolContext filterNEqualBool() throws RecognitionException {
		FilterNEqualBoolContext _localctx = new FilterNEqualBoolContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_filterNEqualBool);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(239);
			match(T__11);
			setState(243);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << ANY_INDEX) | (1L << OPEN_SQ_BRACKET))) != 0)) {
				{
				{
				setState(240);
				relativePath();
				}
				}
				setState(245);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(246);
			match(NE);
			setState(247);
			match(BOOL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FilterEqualStrContext extends ParserRuleContext {
		public TerminalNode QUOTED_STRING() { return getToken(JsonPathParser.QUOTED_STRING, 0); }
		public List<RelativePathContext> relativePath() {
			return getRuleContexts(RelativePathContext.class);
		}
		public RelativePathContext relativePath(int i) {
			return getRuleContext(RelativePathContext.class,i);
		}
		public FilterEqualStrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_filterEqualStr; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JsonPathVisitor ) return ((JsonPathVisitor<? extends T>)visitor).visitFilterEqualStr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FilterEqualStrContext filterEqualStr() throws RecognitionException {
		FilterEqualStrContext _localctx = new FilterEqualStrContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_filterEqualStr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(249);
			match(T__11);
			setState(253);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << ANY_INDEX) | (1L << OPEN_SQ_BRACKET))) != 0)) {
				{
				{
				setState(250);
				relativePath();
				}
				}
				setState(255);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(256);
			match(T__16);
			setState(257);
			match(QUOTED_STRING);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FilterNEqualStrContext extends ParserRuleContext {
		public TerminalNode NE() { return getToken(JsonPathParser.NE, 0); }
		public TerminalNode QUOTED_STRING() { return getToken(JsonPathParser.QUOTED_STRING, 0); }
		public List<RelativePathContext> relativePath() {
			return getRuleContexts(RelativePathContext.class);
		}
		public RelativePathContext relativePath(int i) {
			return getRuleContext(RelativePathContext.class,i);
		}
		public FilterNEqualStrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_filterNEqualStr; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JsonPathVisitor ) return ((JsonPathVisitor<? extends T>)visitor).visitFilterNEqualStr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FilterNEqualStrContext filterNEqualStr() throws RecognitionException {
		FilterNEqualStrContext _localctx = new FilterNEqualStrContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_filterNEqualStr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(259);
			match(T__11);
			setState(263);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << ANY_INDEX) | (1L << OPEN_SQ_BRACKET))) != 0)) {
				{
				{
				setState(260);
				relativePath();
				}
				}
				setState(265);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(266);
			match(NE);
			setState(267);
			match(QUOTED_STRING);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FilterEqualNullContext extends ParserRuleContext {
		public TerminalNode NULL() { return getToken(JsonPathParser.NULL, 0); }
		public List<RelativePathContext> relativePath() {
			return getRuleContexts(RelativePathContext.class);
		}
		public RelativePathContext relativePath(int i) {
			return getRuleContext(RelativePathContext.class,i);
		}
		public FilterEqualNullContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_filterEqualNull; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JsonPathVisitor ) return ((JsonPathVisitor<? extends T>)visitor).visitFilterEqualNull(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FilterEqualNullContext filterEqualNull() throws RecognitionException {
		FilterEqualNullContext _localctx = new FilterEqualNullContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_filterEqualNull);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(269);
			match(T__11);
			setState(273);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << ANY_INDEX) | (1L << OPEN_SQ_BRACKET))) != 0)) {
				{
				{
				setState(270);
				relativePath();
				}
				}
				setState(275);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(276);
			match(T__16);
			setState(277);
			match(NULL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FilterNEqualNullContext extends ParserRuleContext {
		public TerminalNode NE() { return getToken(JsonPathParser.NE, 0); }
		public TerminalNode NULL() { return getToken(JsonPathParser.NULL, 0); }
		public List<RelativePathContext> relativePath() {
			return getRuleContexts(RelativePathContext.class);
		}
		public RelativePathContext relativePath(int i) {
			return getRuleContext(RelativePathContext.class,i);
		}
		public FilterNEqualNullContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_filterNEqualNull; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JsonPathVisitor ) return ((JsonPathVisitor<? extends T>)visitor).visitFilterNEqualNull(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FilterNEqualNullContext filterNEqualNull() throws RecognitionException {
		FilterNEqualNullContext _localctx = new FilterNEqualNullContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_filterNEqualNull);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(279);
			match(T__11);
			setState(283);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << ANY_INDEX) | (1L << OPEN_SQ_BRACKET))) != 0)) {
				{
				{
				setState(280);
				relativePath();
				}
				}
				setState(285);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(286);
			match(NE);
			setState(287);
			match(NULL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FilterMatchRegexContext extends ParserRuleContext {
		public TerminalNode QUOTED_STRING() { return getToken(JsonPathParser.QUOTED_STRING, 0); }
		public List<RelativePathContext> relativePath() {
			return getRuleContexts(RelativePathContext.class);
		}
		public RelativePathContext relativePath(int i) {
			return getRuleContext(RelativePathContext.class,i);
		}
		public FilterMatchRegexContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_filterMatchRegex; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JsonPathVisitor ) return ((JsonPathVisitor<? extends T>)visitor).visitFilterMatchRegex(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FilterMatchRegexContext filterMatchRegex() throws RecognitionException {
		FilterMatchRegexContext _localctx = new FilterMatchRegexContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_filterMatchRegex);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(289);
			match(T__11);
			setState(293);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << ANY_INDEX) | (1L << OPEN_SQ_BRACKET))) != 0)) {
				{
				{
				setState(290);
				relativePath();
				}
				}
				setState(295);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(296);
			match(T__17);
			setState(297);
			match(QUOTED_STRING);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 11:
			return filterExpr_sempred((FilterExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean filterExpr_sempred(FilterExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 16);
		case 1:
			return precpred(_ctx, 15);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3$\u012e\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\3\2\5\28\n\2\3\2\3\2\7\2<\n\2\f\2\16\2?\13\2\3\2"+
		"\3\2\3\3\3\3\3\4\3\4\3\4\3\4\3\4\5\4J\n\4\3\5\3\5\3\5\5\5O\n\5\3\6\3\6"+
		"\3\7\3\7\3\b\3\b\3\b\3\b\3\b\5\bZ\n\b\3\t\3\t\3\t\3\t\5\t`\n\t\3\t\3\t"+
		"\3\t\3\t\5\tf\n\t\7\th\n\t\f\t\16\tk\13\t\3\t\3\t\3\n\3\n\3\n\3\n\3\13"+
		"\3\13\3\13\5\13v\n\13\3\f\3\f\3\f\5\f{\n\f\3\f\5\f~\n\f\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r"+
		"\u0094\n\r\3\r\3\r\3\r\3\r\3\r\3\r\7\r\u009c\n\r\f\r\16\r\u009f\13\r\3"+
		"\16\3\16\3\16\3\16\7\16\u00a5\n\16\f\16\16\16\u00a8\13\16\3\16\3\16\3"+
		"\17\3\17\7\17\u00ae\n\17\f\17\16\17\u00b1\13\17\3\17\3\17\3\17\3\20\3"+
		"\20\7\20\u00b8\n\20\f\20\16\20\u00bb\13\20\3\20\3\20\3\20\3\21\3\21\7"+
		"\21\u00c2\n\21\f\21\16\21\u00c5\13\21\3\21\3\21\3\21\3\22\3\22\7\22\u00cc"+
		"\n\22\f\22\16\22\u00cf\13\22\3\22\3\22\3\22\3\23\3\23\7\23\u00d6\n\23"+
		"\f\23\16\23\u00d9\13\23\3\23\3\23\3\23\3\24\3\24\7\24\u00e0\n\24\f\24"+
		"\16\24\u00e3\13\24\3\24\3\24\3\24\3\25\3\25\7\25\u00ea\n\25\f\25\16\25"+
		"\u00ed\13\25\3\25\3\25\3\25\3\26\3\26\7\26\u00f4\n\26\f\26\16\26\u00f7"+
		"\13\26\3\26\3\26\3\26\3\27\3\27\7\27\u00fe\n\27\f\27\16\27\u0101\13\27"+
		"\3\27\3\27\3\27\3\30\3\30\7\30\u0108\n\30\f\30\16\30\u010b\13\30\3\30"+
		"\3\30\3\30\3\31\3\31\7\31\u0112\n\31\f\31\16\31\u0115\13\31\3\31\3\31"+
		"\3\31\3\32\3\32\7\32\u011c\n\32\f\32\16\32\u011f\13\32\3\32\3\32\3\32"+
		"\3\33\3\33\7\33\u0126\n\33\f\33\16\33\u0129\13\33\3\33\3\33\3\33\3\33"+
		"\2\3\30\34\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\2"+
		"\4\3\2\4\5\4\2\37\37##\2\u0140\2\67\3\2\2\2\4B\3\2\2\2\6I\3\2\2\2\bK\3"+
		"\2\2\2\nP\3\2\2\2\fR\3\2\2\2\16Y\3\2\2\2\20[\3\2\2\2\22n\3\2\2\2\24r\3"+
		"\2\2\2\26z\3\2\2\2\30\u0093\3\2\2\2\32\u00a0\3\2\2\2\34\u00ab\3\2\2\2"+
		"\36\u00b5\3\2\2\2 \u00bf\3\2\2\2\"\u00c9\3\2\2\2$\u00d3\3\2\2\2&\u00dd"+
		"\3\2\2\2(\u00e7\3\2\2\2*\u00f1\3\2\2\2,\u00fb\3\2\2\2.\u0105\3\2\2\2\60"+
		"\u010f\3\2\2\2\62\u0119\3\2\2\2\64\u0123\3\2\2\2\668\5\4\3\2\67\66\3\2"+
		"\2\2\678\3\2\2\289\3\2\2\29=\7\3\2\2:<\5\6\4\2;:\3\2\2\2<?\3\2\2\2=;\3"+
		"\2\2\2=>\3\2\2\2>@\3\2\2\2?=\3\2\2\2@A\7\2\2\3A\3\3\2\2\2BC\t\2\2\2C\5"+
		"\3\2\2\2DJ\5\b\5\2EJ\5\24\13\2FJ\5\26\f\2GJ\5\n\6\2HJ\5\f\7\2ID\3\2\2"+
		"\2IE\3\2\2\2IF\3\2\2\2IG\3\2\2\2IH\3\2\2\2J\7\3\2\2\2KL\7\6\2\2LN\t\3"+
		"\2\2MO\5\26\f\2NM\3\2\2\2NO\3\2\2\2O\t\3\2\2\2PQ\7\7\2\2Q\13\3\2\2\2R"+
		"S\7\b\2\2S\r\3\2\2\2TU\7\26\2\2UV\7\36\2\2VZ\7\27\2\2WX\7\t\2\2XZ\7\36"+
		"\2\2YT\3\2\2\2YW\3\2\2\2Z\17\3\2\2\2[\\\7\26\2\2\\_\7\36\2\2]^\7\30\2"+
		"\2^`\7\36\2\2_]\3\2\2\2_`\3\2\2\2`i\3\2\2\2ab\7\31\2\2be\7\36\2\2cd\7"+
		"\30\2\2df\7\36\2\2ec\3\2\2\2ef\3\2\2\2fh\3\2\2\2ga\3\2\2\2hk\3\2\2\2i"+
		"g\3\2\2\2ij\3\2\2\2jl\3\2\2\2ki\3\2\2\2lm\7\27\2\2m\21\3\2\2\2no\7\n\2"+
		"\2op\5\30\r\2pq\7\13\2\2q\23\3\2\2\2rs\7\t\2\2su\t\3\2\2tv\5\26\f\2ut"+
		"\3\2\2\2uv\3\2\2\2v\25\3\2\2\2w{\5\16\b\2x{\5\20\t\2y{\7\25\2\2zw\3\2"+
		"\2\2zx\3\2\2\2zy\3\2\2\2{}\3\2\2\2|~\5\22\n\2}|\3\2\2\2}~\3\2\2\2~\27"+
		"\3\2\2\2\177\u0080\b\r\1\2\u0080\u0081\7\33\2\2\u0081\u0082\7\f\2\2\u0082"+
		"\u0083\5\30\r\2\u0083\u0084\7\13\2\2\u0084\u0094\3\2\2\2\u0085\u0094\5"+
		"$\23\2\u0086\u0094\5&\24\2\u0087\u0094\5,\27\2\u0088\u0094\5.\30\2\u0089"+
		"\u0094\5\64\33\2\u008a\u0094\5(\25\2\u008b\u0094\5*\26\2\u008c\u0094\5"+
		"\60\31\2\u008d\u0094\5\62\32\2\u008e\u0094\5\34\17\2\u008f\u0094\5\36"+
		"\20\2\u0090\u0094\5 \21\2\u0091\u0094\5\"\22\2\u0092\u0094\5\32\16\2\u0093"+
		"\177\3\2\2\2\u0093\u0085\3\2\2\2\u0093\u0086\3\2\2\2\u0093\u0087\3\2\2"+
		"\2\u0093\u0088\3\2\2\2\u0093\u0089\3\2\2\2\u0093\u008a\3\2\2\2\u0093\u008b"+
		"\3\2\2\2\u0093\u008c\3\2\2\2\u0093\u008d\3\2\2\2\u0093\u008e\3\2\2\2\u0093"+
		"\u008f\3\2\2\2\u0093\u0090\3\2\2\2\u0093\u0091\3\2\2\2\u0093\u0092\3\2"+
		"\2\2\u0094\u009d\3\2\2\2\u0095\u0096\f\22\2\2\u0096\u0097\7\34\2\2\u0097"+
		"\u009c\5\30\r\23\u0098\u0099\f\21\2\2\u0099\u009a\7\35\2\2\u009a\u009c"+
		"\5\30\r\22\u009b\u0095\3\2\2\2\u009b\u0098\3\2\2\2\u009c\u009f\3\2\2\2"+
		"\u009d\u009b\3\2\2\2\u009d\u009e\3\2\2\2\u009e\31\3\2\2\2\u009f\u009d"+
		"\3\2\2\2\u00a0\u00a1\7\r\2\2\u00a1\u00a2\7\f\2\2\u00a2\u00a6\7\16\2\2"+
		"\u00a3\u00a5\5\6\4\2\u00a4\u00a3\3\2\2\2\u00a5\u00a8\3\2\2\2\u00a6\u00a4"+
		"\3\2\2\2\u00a6\u00a7\3\2\2\2\u00a7\u00a9\3\2\2\2\u00a8\u00a6\3\2\2\2\u00a9"+
		"\u00aa\7\13\2\2\u00aa\33\3\2\2\2\u00ab\u00af\7\16\2\2\u00ac\u00ae\5\6"+
		"\4\2\u00ad\u00ac\3\2\2\2\u00ae\u00b1\3\2\2\2\u00af\u00ad\3\2\2\2\u00af"+
		"\u00b0\3\2\2\2\u00b0\u00b2\3\2\2\2\u00b1\u00af\3\2\2\2\u00b2\u00b3\7\17"+
		"\2\2\u00b3\u00b4\7\36\2\2\u00b4\35\3\2\2\2\u00b5\u00b9\7\16\2\2\u00b6"+
		"\u00b8\5\6\4\2\u00b7\u00b6\3\2\2\2\u00b8\u00bb\3\2\2\2\u00b9\u00b7\3\2"+
		"\2\2\u00b9\u00ba\3\2\2\2\u00ba\u00bc\3\2\2\2\u00bb\u00b9\3\2\2\2\u00bc"+
		"\u00bd\7\20\2\2\u00bd\u00be\7\36\2\2\u00be\37\3\2\2\2\u00bf\u00c3\7\16"+
		"\2\2\u00c0\u00c2\5\6\4\2\u00c1\u00c0\3\2\2\2\u00c2\u00c5\3\2\2\2\u00c3"+
		"\u00c1\3\2\2\2\u00c3\u00c4\3\2\2\2\u00c4\u00c6\3\2\2\2\u00c5\u00c3\3\2"+
		"\2\2\u00c6\u00c7\7\21\2\2\u00c7\u00c8\7\36\2\2\u00c8!\3\2\2\2\u00c9\u00cd"+
		"\7\16\2\2\u00ca\u00cc\5\6\4\2\u00cb\u00ca\3\2\2\2\u00cc\u00cf\3\2\2\2"+
		"\u00cd\u00cb\3\2\2\2\u00cd\u00ce\3\2\2\2\u00ce\u00d0\3\2\2\2\u00cf\u00cd"+
		"\3\2\2\2\u00d0\u00d1\7\22\2\2\u00d1\u00d2\7\36\2\2\u00d2#\3\2\2\2\u00d3"+
		"\u00d7\7\16\2\2\u00d4\u00d6\5\6\4\2\u00d5\u00d4\3\2\2\2\u00d6\u00d9\3"+
		"\2\2\2\u00d7\u00d5\3\2\2\2\u00d7\u00d8\3\2\2\2\u00d8\u00da\3\2\2\2\u00d9"+
		"\u00d7\3\2\2\2\u00da\u00db\7\23\2\2\u00db\u00dc\7\36\2\2\u00dc%\3\2\2"+
		"\2\u00dd\u00e1\7\16\2\2\u00de\u00e0\5\6\4\2\u00df\u00de\3\2\2\2\u00e0"+
		"\u00e3\3\2\2\2\u00e1\u00df\3\2\2\2\u00e1\u00e2\3\2\2\2\u00e2\u00e4\3\2"+
		"\2\2\u00e3\u00e1\3\2\2\2\u00e4\u00e5\7\"\2\2\u00e5\u00e6\7\36\2\2\u00e6"+
		"\'\3\2\2\2\u00e7\u00eb\7\16\2\2\u00e8\u00ea\5\6\4\2\u00e9\u00e8\3\2\2"+
		"\2\u00ea\u00ed\3\2\2\2\u00eb\u00e9\3\2\2\2\u00eb\u00ec\3\2\2\2\u00ec\u00ee"+
		"\3\2\2\2\u00ed\u00eb\3\2\2\2\u00ee\u00ef\7\23\2\2\u00ef\u00f0\7 \2\2\u00f0"+
		")\3\2\2\2\u00f1\u00f5\7\16\2\2\u00f2\u00f4\5\6\4\2\u00f3\u00f2\3\2\2\2"+
		"\u00f4\u00f7\3\2\2\2\u00f5\u00f3\3\2\2\2\u00f5\u00f6\3\2\2\2\u00f6\u00f8"+
		"\3\2\2\2\u00f7\u00f5\3\2\2\2\u00f8\u00f9\7\"\2\2\u00f9\u00fa\7 \2\2\u00fa"+
		"+\3\2\2\2\u00fb\u00ff\7\16\2\2\u00fc\u00fe\5\6\4\2\u00fd\u00fc\3\2\2\2"+
		"\u00fe\u0101\3\2\2\2\u00ff\u00fd\3\2\2\2\u00ff\u0100\3\2\2\2\u0100\u0102"+
		"\3\2\2\2\u0101\u00ff\3\2\2\2\u0102\u0103\7\23\2\2\u0103\u0104\7\37\2\2"+
		"\u0104-\3\2\2\2\u0105\u0109\7\16\2\2\u0106\u0108\5\6\4\2\u0107\u0106\3"+
		"\2\2\2\u0108\u010b\3\2\2\2\u0109\u0107\3\2\2\2\u0109\u010a\3\2\2\2\u010a"+
		"\u010c\3\2\2\2\u010b\u0109\3\2\2\2\u010c\u010d\7\"\2\2\u010d\u010e\7\37"+
		"\2\2\u010e/\3\2\2\2\u010f\u0113\7\16\2\2\u0110\u0112\5\6\4\2\u0111\u0110"+
		"\3\2\2\2\u0112\u0115\3\2\2\2\u0113\u0111\3\2\2\2\u0113\u0114\3\2\2\2\u0114"+
		"\u0116\3\2\2\2\u0115\u0113\3\2\2\2\u0116\u0117\7\23\2\2\u0117\u0118\7"+
		"!\2\2\u0118\61\3\2\2\2\u0119\u011d\7\16\2\2\u011a\u011c\5\6\4\2\u011b"+
		"\u011a\3\2\2\2\u011c\u011f\3\2\2\2\u011d\u011b\3\2\2\2\u011d\u011e\3\2"+
		"\2\2\u011e\u0120\3\2\2\2\u011f\u011d\3\2\2\2\u0120\u0121\7\"\2\2\u0121"+
		"\u0122\7!\2\2\u0122\63\3\2\2\2\u0123\u0127\7\16\2\2\u0124\u0126\5\6\4"+
		"\2\u0125\u0124\3\2\2\2\u0126\u0129\3\2\2\2\u0127\u0125\3\2\2\2\u0127\u0128"+
		"\3\2\2\2\u0128\u012a\3\2\2\2\u0129\u0127\3\2\2\2\u012a\u012b\7\24\2\2"+
		"\u012b\u012c\7\37\2\2\u012c\65\3\2\2\2\36\67=INY_eiuz}\u0093\u009b\u009d"+
		"\u00a6\u00af\u00b9\u00c3\u00cd\u00d7\u00e1\u00eb\u00f5\u00ff\u0109\u0113"+
		"\u011d\u0127";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}