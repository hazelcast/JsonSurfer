// Generated from JsonPath.g4 by ANTLR 4.13.1

package org.jsfr.json.compiler;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class JsonPathParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, ANY_INDEX=20, OPEN_SQ_BRACKET=21, CLOSE_SQ_BRACKET=22, 
		TO=23, COMMA=24, COLON=25, NegationOperator=26, AndOperator=27, OrOperator=28, 
		NUM=29, QUOTED_STRING=30, BOOL=31, NULL=32, NE=33, KEY=34, WS=35;
	public static final int
		RULE_path = 0, RULE_syntaxMode = 1, RULE_relativePath = 2, RULE_searchChild = 3, 
		RULE_anyChild = 4, RULE_any = 5, RULE_index = 6, RULE_indexes = 7, RULE_filter = 8, 
		RULE_childNode = 9, RULE_array = 10, RULE_childrenNode = 11, RULE_filterExpr = 12, 
		RULE_filterExist = 13, RULE_filterGtNum = 14, RULE_filterGeNum = 15, RULE_filterLtNum = 16, 
		RULE_filterLeNum = 17, RULE_filterEqualNum = 18, RULE_filterNEqualNum = 19, 
		RULE_filterEqualBool = 20, RULE_filterNEqualBool = 21, RULE_filterEqualStr = 22, 
		RULE_filterNEqualStr = 23, RULE_filterEqualNull = 24, RULE_filterNEqualNull = 25, 
		RULE_filterMatchRegex = 26, RULE_filterItemMethodEqual = 27, RULE_filterItemMethodNEqual = 28, 
		RULE_itemMethod = 29;
	private static String[] makeRuleNames() {
		return new String[] {
			"path", "syntaxMode", "relativePath", "searchChild", "anyChild", "any", 
			"index", "indexes", "filter", "childNode", "array", "childrenNode", "filterExpr", 
			"filterExist", "filterGtNum", "filterGeNum", "filterLtNum", "filterLeNum", 
			"filterEqualNum", "filterNEqualNum", "filterEqualBool", "filterNEqualBool", 
			"filterEqualStr", "filterNEqualStr", "filterEqualNull", "filterNEqualNull", 
			"filterMatchRegex", "filterItemMethodEqual", "filterItemMethodNEqual", 
			"itemMethod"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'$'", "'lax'", "'strict'", "'..'", "'.*'", "'*'", "'.'", "'?('", 
			"')'", "'('", "'exists'", "'@'", "'>'", "'>='", "'<'", "'<='", "'=='", 
			"'like_regex'", "'()'", "'[*]'", "'['", "']'", "'to'", "','", "':'", 
			"'!'", "'&&'", "'||'", null, null, null, "'null'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, "ANY_INDEX", "OPEN_SQ_BRACKET", 
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

	@SuppressWarnings("CheckReturnValue")
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
			setState(61);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__1 || _la==T__2) {
				{
				setState(60);
				syntaxMode();
				}
			}

			setState(63);
			match(T__0);
			setState(67);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 3145968L) != 0)) {
				{
				{
				setState(64);
				relativePath();
				}
				}
				setState(69);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(70);
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

	@SuppressWarnings("CheckReturnValue")
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
			setState(72);
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

	@SuppressWarnings("CheckReturnValue")
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
		public ChildrenNodeContext childrenNode() {
			return getRuleContext(ChildrenNodeContext.class,0);
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
			setState(80);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(74);
				searchChild();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(75);
				childNode();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(76);
				array();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(77);
				childrenNode();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(78);
				anyChild();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(79);
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

	@SuppressWarnings("CheckReturnValue")
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
			setState(82);
			match(T__3);
			setState(83);
			_la = _input.LA(1);
			if ( !(_la==QUOTED_STRING || _la==KEY) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(85);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				{
				setState(84);
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

	@SuppressWarnings("CheckReturnValue")
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
			setState(87);
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

	@SuppressWarnings("CheckReturnValue")
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
			setState(89);
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

	@SuppressWarnings("CheckReturnValue")
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
			setState(96);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPEN_SQ_BRACKET:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(91);
				match(OPEN_SQ_BRACKET);
				setState(92);
				match(NUM);
				setState(93);
				match(CLOSE_SQ_BRACKET);
				}
				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(94);
				match(T__6);
				setState(95);
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

	@SuppressWarnings("CheckReturnValue")
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
			setState(98);
			match(OPEN_SQ_BRACKET);
			setState(99);
			match(NUM);
			setState(102);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TO) {
				{
				setState(100);
				match(TO);
				setState(101);
				match(NUM);
				}
			}

			setState(112);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(104);
				match(COMMA);
				setState(105);
				match(NUM);
				setState(108);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TO) {
					{
					setState(106);
					match(TO);
					setState(107);
					match(NUM);
					}
				}

				}
				}
				setState(114);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(115);
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

	@SuppressWarnings("CheckReturnValue")
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
			setState(117);
			match(T__7);
			setState(118);
			filterExpr(0);
			setState(119);
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

	@SuppressWarnings("CheckReturnValue")
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
			setState(121);
			match(T__6);
			setState(122);
			_la = _input.LA(1);
			if ( !(_la==QUOTED_STRING || _la==KEY) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(124);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				setState(123);
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

	@SuppressWarnings("CheckReturnValue")
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
			setState(129);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				setState(126);
				index();
				}
				break;
			case 2:
				{
				setState(127);
				indexes();
				}
				break;
			case 3:
				{
				setState(128);
				match(ANY_INDEX);
				}
				break;
			}
			setState(132);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__7) {
				{
				setState(131);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ChildrenNodeContext extends ParserRuleContext {
		public TerminalNode OPEN_SQ_BRACKET() { return getToken(JsonPathParser.OPEN_SQ_BRACKET, 0); }
		public List<TerminalNode> QUOTED_STRING() { return getTokens(JsonPathParser.QUOTED_STRING); }
		public TerminalNode QUOTED_STRING(int i) {
			return getToken(JsonPathParser.QUOTED_STRING, i);
		}
		public TerminalNode CLOSE_SQ_BRACKET() { return getToken(JsonPathParser.CLOSE_SQ_BRACKET, 0); }
		public List<TerminalNode> COMMA() { return getTokens(JsonPathParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(JsonPathParser.COMMA, i);
		}
		public ChildrenNodeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_childrenNode; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JsonPathVisitor ) return ((JsonPathVisitor<? extends T>)visitor).visitChildrenNode(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ChildrenNodeContext childrenNode() throws RecognitionException {
		ChildrenNodeContext _localctx = new ChildrenNodeContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_childrenNode);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(134);
			match(OPEN_SQ_BRACKET);
			setState(135);
			match(QUOTED_STRING);
			setState(140);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(136);
				match(COMMA);
				setState(137);
				match(QUOTED_STRING);
				}
				}
				setState(142);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(143);
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

	@SuppressWarnings("CheckReturnValue")
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
		public FilterItemMethodEqualContext filterItemMethodEqual() {
			return getRuleContext(FilterItemMethodEqualContext.class,0);
		}
		public FilterItemMethodNEqualContext filterItemMethodNEqual() {
			return getRuleContext(FilterItemMethodNEqualContext.class,0);
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
		int _startState = 24;
		enterRecursionRule(_localctx, 24, RULE_filterExpr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(167);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				setState(146);
				match(NegationOperator);
				setState(147);
				match(T__9);
				setState(148);
				filterExpr(0);
				setState(149);
				match(T__8);
				}
				break;
			case 2:
				{
				setState(151);
				filterEqualNum();
				}
				break;
			case 3:
				{
				setState(152);
				filterNEqualNum();
				}
				break;
			case 4:
				{
				setState(153);
				filterEqualStr();
				}
				break;
			case 5:
				{
				setState(154);
				filterNEqualStr();
				}
				break;
			case 6:
				{
				setState(155);
				filterMatchRegex();
				}
				break;
			case 7:
				{
				setState(156);
				filterEqualBool();
				}
				break;
			case 8:
				{
				setState(157);
				filterNEqualBool();
				}
				break;
			case 9:
				{
				setState(158);
				filterEqualNull();
				}
				break;
			case 10:
				{
				setState(159);
				filterNEqualNull();
				}
				break;
			case 11:
				{
				setState(160);
				filterGtNum();
				}
				break;
			case 12:
				{
				setState(161);
				filterGeNum();
				}
				break;
			case 13:
				{
				setState(162);
				filterLtNum();
				}
				break;
			case 14:
				{
				setState(163);
				filterLeNum();
				}
				break;
			case 15:
				{
				setState(164);
				filterExist();
				}
				break;
			case 16:
				{
				setState(165);
				filterItemMethodEqual();
				}
				break;
			case 17:
				{
				setState(166);
				filterItemMethodNEqual();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(177);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(175);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
					case 1:
						{
						_localctx = new FilterExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_filterExpr);
						setState(169);
						if (!(precpred(_ctx, 18))) throw new FailedPredicateException(this, "precpred(_ctx, 18)");
						setState(170);
						match(AndOperator);
						setState(171);
						filterExpr(19);
						}
						break;
					case 2:
						{
						_localctx = new FilterExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_filterExpr);
						setState(172);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(173);
						match(OrOperator);
						setState(174);
						filterExpr(18);
						}
						break;
					}
					} 
				}
				setState(179);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
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
		enterRule(_localctx, 26, RULE_filterExist);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(180);
			match(T__10);
			setState(181);
			match(T__9);
			setState(182);
			match(T__11);
			setState(186);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 3145968L) != 0)) {
				{
				{
				setState(183);
				relativePath();
				}
				}
				setState(188);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(189);
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

	@SuppressWarnings("CheckReturnValue")
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
		enterRule(_localctx, 28, RULE_filterGtNum);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(191);
			match(T__11);
			setState(195);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 3145968L) != 0)) {
				{
				{
				setState(192);
				relativePath();
				}
				}
				setState(197);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(198);
			match(T__12);
			setState(199);
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

	@SuppressWarnings("CheckReturnValue")
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
		enterRule(_localctx, 30, RULE_filterGeNum);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(201);
			match(T__11);
			setState(205);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 3145968L) != 0)) {
				{
				{
				setState(202);
				relativePath();
				}
				}
				setState(207);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(208);
			match(T__13);
			setState(209);
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

	@SuppressWarnings("CheckReturnValue")
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
		enterRule(_localctx, 32, RULE_filterLtNum);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(211);
			match(T__11);
			setState(215);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 3145968L) != 0)) {
				{
				{
				setState(212);
				relativePath();
				}
				}
				setState(217);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(218);
			match(T__14);
			setState(219);
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

	@SuppressWarnings("CheckReturnValue")
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
		enterRule(_localctx, 34, RULE_filterLeNum);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(221);
			match(T__11);
			setState(225);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 3145968L) != 0)) {
				{
				{
				setState(222);
				relativePath();
				}
				}
				setState(227);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(228);
			match(T__15);
			setState(229);
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

	@SuppressWarnings("CheckReturnValue")
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
		enterRule(_localctx, 36, RULE_filterEqualNum);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(231);
			match(T__11);
			setState(235);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 3145968L) != 0)) {
				{
				{
				setState(232);
				relativePath();
				}
				}
				setState(237);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(238);
			match(T__16);
			setState(239);
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

	@SuppressWarnings("CheckReturnValue")
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
		enterRule(_localctx, 38, RULE_filterNEqualNum);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(241);
			match(T__11);
			setState(245);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 3145968L) != 0)) {
				{
				{
				setState(242);
				relativePath();
				}
				}
				setState(247);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(248);
			match(NE);
			setState(249);
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

	@SuppressWarnings("CheckReturnValue")
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
		enterRule(_localctx, 40, RULE_filterEqualBool);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(251);
			match(T__11);
			setState(255);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 3145968L) != 0)) {
				{
				{
				setState(252);
				relativePath();
				}
				}
				setState(257);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(258);
			match(T__16);
			setState(259);
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

	@SuppressWarnings("CheckReturnValue")
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
		enterRule(_localctx, 42, RULE_filterNEqualBool);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(261);
			match(T__11);
			setState(265);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 3145968L) != 0)) {
				{
				{
				setState(262);
				relativePath();
				}
				}
				setState(267);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(268);
			match(NE);
			setState(269);
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

	@SuppressWarnings("CheckReturnValue")
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
		enterRule(_localctx, 44, RULE_filterEqualStr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(271);
			match(T__11);
			setState(275);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 3145968L) != 0)) {
				{
				{
				setState(272);
				relativePath();
				}
				}
				setState(277);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(278);
			match(T__16);
			setState(279);
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

	@SuppressWarnings("CheckReturnValue")
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
		enterRule(_localctx, 46, RULE_filterNEqualStr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(281);
			match(T__11);
			setState(285);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 3145968L) != 0)) {
				{
				{
				setState(282);
				relativePath();
				}
				}
				setState(287);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(288);
			match(NE);
			setState(289);
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

	@SuppressWarnings("CheckReturnValue")
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
		enterRule(_localctx, 48, RULE_filterEqualNull);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(291);
			match(T__11);
			setState(295);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 3145968L) != 0)) {
				{
				{
				setState(292);
				relativePath();
				}
				}
				setState(297);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(298);
			match(T__16);
			setState(299);
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

	@SuppressWarnings("CheckReturnValue")
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
		enterRule(_localctx, 50, RULE_filterNEqualNull);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(301);
			match(T__11);
			setState(305);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 3145968L) != 0)) {
				{
				{
				setState(302);
				relativePath();
				}
				}
				setState(307);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(308);
			match(NE);
			setState(309);
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

	@SuppressWarnings("CheckReturnValue")
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
		enterRule(_localctx, 52, RULE_filterMatchRegex);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(311);
			match(T__11);
			setState(315);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 3145968L) != 0)) {
				{
				{
				setState(312);
				relativePath();
				}
				}
				setState(317);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(318);
			match(T__17);
			setState(319);
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

	@SuppressWarnings("CheckReturnValue")
	public static class FilterItemMethodEqualContext extends ParserRuleContext {
		public ItemMethodContext itemMethod() {
			return getRuleContext(ItemMethodContext.class,0);
		}
		public TerminalNode QUOTED_STRING() { return getToken(JsonPathParser.QUOTED_STRING, 0); }
		public List<RelativePathContext> relativePath() {
			return getRuleContexts(RelativePathContext.class);
		}
		public RelativePathContext relativePath(int i) {
			return getRuleContext(RelativePathContext.class,i);
		}
		public FilterItemMethodEqualContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_filterItemMethodEqual; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JsonPathVisitor ) return ((JsonPathVisitor<? extends T>)visitor).visitFilterItemMethodEqual(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FilterItemMethodEqualContext filterItemMethodEqual() throws RecognitionException {
		FilterItemMethodEqualContext _localctx = new FilterItemMethodEqualContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_filterItemMethodEqual);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(321);
			match(T__11);
			setState(325);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(322);
					relativePath();
					}
					} 
				}
				setState(327);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
			}
			setState(328);
			itemMethod();
			setState(329);
			match(T__16);
			setState(330);
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

	@SuppressWarnings("CheckReturnValue")
	public static class FilterItemMethodNEqualContext extends ParserRuleContext {
		public ItemMethodContext itemMethod() {
			return getRuleContext(ItemMethodContext.class,0);
		}
		public TerminalNode NE() { return getToken(JsonPathParser.NE, 0); }
		public TerminalNode QUOTED_STRING() { return getToken(JsonPathParser.QUOTED_STRING, 0); }
		public List<RelativePathContext> relativePath() {
			return getRuleContexts(RelativePathContext.class);
		}
		public RelativePathContext relativePath(int i) {
			return getRuleContext(RelativePathContext.class,i);
		}
		public FilterItemMethodNEqualContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_filterItemMethodNEqual; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JsonPathVisitor ) return ((JsonPathVisitor<? extends T>)visitor).visitFilterItemMethodNEqual(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FilterItemMethodNEqualContext filterItemMethodNEqual() throws RecognitionException {
		FilterItemMethodNEqualContext _localctx = new FilterItemMethodNEqualContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_filterItemMethodNEqual);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(332);
			match(T__11);
			setState(336);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(333);
					relativePath();
					}
					} 
				}
				setState(338);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
			}
			setState(339);
			itemMethod();
			setState(340);
			match(NE);
			setState(341);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ItemMethodContext extends ParserRuleContext {
		public TerminalNode KEY() { return getToken(JsonPathParser.KEY, 0); }
		public ItemMethodContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_itemMethod; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JsonPathVisitor ) return ((JsonPathVisitor<? extends T>)visitor).visitItemMethod(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ItemMethodContext itemMethod() throws RecognitionException {
		ItemMethodContext _localctx = new ItemMethodContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_itemMethod);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(343);
			match(T__6);
			setState(344);
			match(KEY);
			setState(345);
			match(T__18);
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
		case 12:
			return filterExpr_sempred((FilterExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean filterExpr_sempred(FilterExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 18);
		case 1:
			return precpred(_ctx, 17);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001#\u015c\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0001\u0000\u0003\u0000"+
		">\b\u0000\u0001\u0000\u0001\u0000\u0005\u0000B\b\u0000\n\u0000\f\u0000"+
		"E\t\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002"+
		"Q\b\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003V\b\u0003\u0001"+
		"\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0003\u0006a\b\u0006\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0003\u0007g\b\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0003\u0007m\b\u0007\u0005\u0007o\b\u0007"+
		"\n\u0007\f\u0007r\t\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\t\u0001\t\u0001\t\u0003\t}\b\t\u0001\n\u0001\n\u0001"+
		"\n\u0003\n\u0082\b\n\u0001\n\u0003\n\u0085\b\n\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0005\u000b\u008b\b\u000b\n\u000b\f\u000b\u008e"+
		"\t\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0003"+
		"\f\u00a8\b\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0005\f\u00b0"+
		"\b\f\n\f\f\f\u00b3\t\f\u0001\r\u0001\r\u0001\r\u0001\r\u0005\r\u00b9\b"+
		"\r\n\r\f\r\u00bc\t\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0005\u000e"+
		"\u00c2\b\u000e\n\u000e\f\u000e\u00c5\t\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000f\u0001\u000f\u0005\u000f\u00cc\b\u000f\n\u000f\f\u000f"+
		"\u00cf\t\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010"+
		"\u0005\u0010\u00d6\b\u0010\n\u0010\f\u0010\u00d9\t\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0005\u0011\u00e0\b\u0011\n"+
		"\u0011\f\u0011\u00e3\t\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0012\u0001\u0012\u0005\u0012\u00ea\b\u0012\n\u0012\f\u0012\u00ed\t\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0005\u0013"+
		"\u00f4\b\u0013\n\u0013\f\u0013\u00f7\t\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0014\u0001\u0014\u0005\u0014\u00fe\b\u0014\n\u0014\f\u0014"+
		"\u0101\t\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0015\u0001\u0015"+
		"\u0005\u0015\u0108\b\u0015\n\u0015\f\u0015\u010b\t\u0015\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0016\u0001\u0016\u0005\u0016\u0112\b\u0016\n"+
		"\u0016\f\u0016\u0115\t\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001"+
		"\u0017\u0001\u0017\u0005\u0017\u011c\b\u0017\n\u0017\f\u0017\u011f\t\u0017"+
		"\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0018\u0001\u0018\u0005\u0018"+
		"\u0126\b\u0018\n\u0018\f\u0018\u0129\t\u0018\u0001\u0018\u0001\u0018\u0001"+
		"\u0018\u0001\u0019\u0001\u0019\u0005\u0019\u0130\b\u0019\n\u0019\f\u0019"+
		"\u0133\t\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u001a\u0001\u001a"+
		"\u0005\u001a\u013a\b\u001a\n\u001a\f\u001a\u013d\t\u001a\u0001\u001a\u0001"+
		"\u001a\u0001\u001a\u0001\u001b\u0001\u001b\u0005\u001b\u0144\b\u001b\n"+
		"\u001b\f\u001b\u0147\t\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001"+
		"\u001b\u0001\u001c\u0001\u001c\u0005\u001c\u014f\b\u001c\n\u001c\f\u001c"+
		"\u0152\t\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001d"+
		"\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0000\u0001\u0018\u001e"+
		"\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a"+
		"\u001c\u001e \"$&(*,.02468:\u0000\u0002\u0001\u0000\u0002\u0003\u0002"+
		"\u0000\u001e\u001e\"\"\u0170\u0000=\u0001\u0000\u0000\u0000\u0002H\u0001"+
		"\u0000\u0000\u0000\u0004P\u0001\u0000\u0000\u0000\u0006R\u0001\u0000\u0000"+
		"\u0000\bW\u0001\u0000\u0000\u0000\nY\u0001\u0000\u0000\u0000\f`\u0001"+
		"\u0000\u0000\u0000\u000eb\u0001\u0000\u0000\u0000\u0010u\u0001\u0000\u0000"+
		"\u0000\u0012y\u0001\u0000\u0000\u0000\u0014\u0081\u0001\u0000\u0000\u0000"+
		"\u0016\u0086\u0001\u0000\u0000\u0000\u0018\u00a7\u0001\u0000\u0000\u0000"+
		"\u001a\u00b4\u0001\u0000\u0000\u0000\u001c\u00bf\u0001\u0000\u0000\u0000"+
		"\u001e\u00c9\u0001\u0000\u0000\u0000 \u00d3\u0001\u0000\u0000\u0000\""+
		"\u00dd\u0001\u0000\u0000\u0000$\u00e7\u0001\u0000\u0000\u0000&\u00f1\u0001"+
		"\u0000\u0000\u0000(\u00fb\u0001\u0000\u0000\u0000*\u0105\u0001\u0000\u0000"+
		"\u0000,\u010f\u0001\u0000\u0000\u0000.\u0119\u0001\u0000\u0000\u00000"+
		"\u0123\u0001\u0000\u0000\u00002\u012d\u0001\u0000\u0000\u00004\u0137\u0001"+
		"\u0000\u0000\u00006\u0141\u0001\u0000\u0000\u00008\u014c\u0001\u0000\u0000"+
		"\u0000:\u0157\u0001\u0000\u0000\u0000<>\u0003\u0002\u0001\u0000=<\u0001"+
		"\u0000\u0000\u0000=>\u0001\u0000\u0000\u0000>?\u0001\u0000\u0000\u0000"+
		"?C\u0005\u0001\u0000\u0000@B\u0003\u0004\u0002\u0000A@\u0001\u0000\u0000"+
		"\u0000BE\u0001\u0000\u0000\u0000CA\u0001\u0000\u0000\u0000CD\u0001\u0000"+
		"\u0000\u0000DF\u0001\u0000\u0000\u0000EC\u0001\u0000\u0000\u0000FG\u0005"+
		"\u0000\u0000\u0001G\u0001\u0001\u0000\u0000\u0000HI\u0007\u0000\u0000"+
		"\u0000I\u0003\u0001\u0000\u0000\u0000JQ\u0003\u0006\u0003\u0000KQ\u0003"+
		"\u0012\t\u0000LQ\u0003\u0014\n\u0000MQ\u0003\u0016\u000b\u0000NQ\u0003"+
		"\b\u0004\u0000OQ\u0003\n\u0005\u0000PJ\u0001\u0000\u0000\u0000PK\u0001"+
		"\u0000\u0000\u0000PL\u0001\u0000\u0000\u0000PM\u0001\u0000\u0000\u0000"+
		"PN\u0001\u0000\u0000\u0000PO\u0001\u0000\u0000\u0000Q\u0005\u0001\u0000"+
		"\u0000\u0000RS\u0005\u0004\u0000\u0000SU\u0007\u0001\u0000\u0000TV\u0003"+
		"\u0014\n\u0000UT\u0001\u0000\u0000\u0000UV\u0001\u0000\u0000\u0000V\u0007"+
		"\u0001\u0000\u0000\u0000WX\u0005\u0005\u0000\u0000X\t\u0001\u0000\u0000"+
		"\u0000YZ\u0005\u0006\u0000\u0000Z\u000b\u0001\u0000\u0000\u0000[\\\u0005"+
		"\u0015\u0000\u0000\\]\u0005\u001d\u0000\u0000]a\u0005\u0016\u0000\u0000"+
		"^_\u0005\u0007\u0000\u0000_a\u0005\u001d\u0000\u0000`[\u0001\u0000\u0000"+
		"\u0000`^\u0001\u0000\u0000\u0000a\r\u0001\u0000\u0000\u0000bc\u0005\u0015"+
		"\u0000\u0000cf\u0005\u001d\u0000\u0000de\u0005\u0017\u0000\u0000eg\u0005"+
		"\u001d\u0000\u0000fd\u0001\u0000\u0000\u0000fg\u0001\u0000\u0000\u0000"+
		"gp\u0001\u0000\u0000\u0000hi\u0005\u0018\u0000\u0000il\u0005\u001d\u0000"+
		"\u0000jk\u0005\u0017\u0000\u0000km\u0005\u001d\u0000\u0000lj\u0001\u0000"+
		"\u0000\u0000lm\u0001\u0000\u0000\u0000mo\u0001\u0000\u0000\u0000nh\u0001"+
		"\u0000\u0000\u0000or\u0001\u0000\u0000\u0000pn\u0001\u0000\u0000\u0000"+
		"pq\u0001\u0000\u0000\u0000qs\u0001\u0000\u0000\u0000rp\u0001\u0000\u0000"+
		"\u0000st\u0005\u0016\u0000\u0000t\u000f\u0001\u0000\u0000\u0000uv\u0005"+
		"\b\u0000\u0000vw\u0003\u0018\f\u0000wx\u0005\t\u0000\u0000x\u0011\u0001"+
		"\u0000\u0000\u0000yz\u0005\u0007\u0000\u0000z|\u0007\u0001\u0000\u0000"+
		"{}\u0003\u0014\n\u0000|{\u0001\u0000\u0000\u0000|}\u0001\u0000\u0000\u0000"+
		"}\u0013\u0001\u0000\u0000\u0000~\u0082\u0003\f\u0006\u0000\u007f\u0082"+
		"\u0003\u000e\u0007\u0000\u0080\u0082\u0005\u0014\u0000\u0000\u0081~\u0001"+
		"\u0000\u0000\u0000\u0081\u007f\u0001\u0000\u0000\u0000\u0081\u0080\u0001"+
		"\u0000\u0000\u0000\u0082\u0084\u0001\u0000\u0000\u0000\u0083\u0085\u0003"+
		"\u0010\b\u0000\u0084\u0083\u0001\u0000\u0000\u0000\u0084\u0085\u0001\u0000"+
		"\u0000\u0000\u0085\u0015\u0001\u0000\u0000\u0000\u0086\u0087\u0005\u0015"+
		"\u0000\u0000\u0087\u008c\u0005\u001e\u0000\u0000\u0088\u0089\u0005\u0018"+
		"\u0000\u0000\u0089\u008b\u0005\u001e\u0000\u0000\u008a\u0088\u0001\u0000"+
		"\u0000\u0000\u008b\u008e\u0001\u0000\u0000\u0000\u008c\u008a\u0001\u0000"+
		"\u0000\u0000\u008c\u008d\u0001\u0000\u0000\u0000\u008d\u008f\u0001\u0000"+
		"\u0000\u0000\u008e\u008c\u0001\u0000\u0000\u0000\u008f\u0090\u0005\u0016"+
		"\u0000\u0000\u0090\u0017\u0001\u0000\u0000\u0000\u0091\u0092\u0006\f\uffff"+
		"\uffff\u0000\u0092\u0093\u0005\u001a\u0000\u0000\u0093\u0094\u0005\n\u0000"+
		"\u0000\u0094\u0095\u0003\u0018\f\u0000\u0095\u0096\u0005\t\u0000\u0000"+
		"\u0096\u00a8\u0001\u0000\u0000\u0000\u0097\u00a8\u0003$\u0012\u0000\u0098"+
		"\u00a8\u0003&\u0013\u0000\u0099\u00a8\u0003,\u0016\u0000\u009a\u00a8\u0003"+
		".\u0017\u0000\u009b\u00a8\u00034\u001a\u0000\u009c\u00a8\u0003(\u0014"+
		"\u0000\u009d\u00a8\u0003*\u0015\u0000\u009e\u00a8\u00030\u0018\u0000\u009f"+
		"\u00a8\u00032\u0019\u0000\u00a0\u00a8\u0003\u001c\u000e\u0000\u00a1\u00a8"+
		"\u0003\u001e\u000f\u0000\u00a2\u00a8\u0003 \u0010\u0000\u00a3\u00a8\u0003"+
		"\"\u0011\u0000\u00a4\u00a8\u0003\u001a\r\u0000\u00a5\u00a8\u00036\u001b"+
		"\u0000\u00a6\u00a8\u00038\u001c\u0000\u00a7\u0091\u0001\u0000\u0000\u0000"+
		"\u00a7\u0097\u0001\u0000\u0000\u0000\u00a7\u0098\u0001\u0000\u0000\u0000"+
		"\u00a7\u0099\u0001\u0000\u0000\u0000\u00a7\u009a\u0001\u0000\u0000\u0000"+
		"\u00a7\u009b\u0001\u0000\u0000\u0000\u00a7\u009c\u0001\u0000\u0000\u0000"+
		"\u00a7\u009d\u0001\u0000\u0000\u0000\u00a7\u009e\u0001\u0000\u0000\u0000"+
		"\u00a7\u009f\u0001\u0000\u0000\u0000\u00a7\u00a0\u0001\u0000\u0000\u0000"+
		"\u00a7\u00a1\u0001\u0000\u0000\u0000\u00a7\u00a2\u0001\u0000\u0000\u0000"+
		"\u00a7\u00a3\u0001\u0000\u0000\u0000\u00a7\u00a4\u0001\u0000\u0000\u0000"+
		"\u00a7\u00a5\u0001\u0000\u0000\u0000\u00a7\u00a6\u0001\u0000\u0000\u0000"+
		"\u00a8\u00b1\u0001\u0000\u0000\u0000\u00a9\u00aa\n\u0012\u0000\u0000\u00aa"+
		"\u00ab\u0005\u001b\u0000\u0000\u00ab\u00b0\u0003\u0018\f\u0013\u00ac\u00ad"+
		"\n\u0011\u0000\u0000\u00ad\u00ae\u0005\u001c\u0000\u0000\u00ae\u00b0\u0003"+
		"\u0018\f\u0012\u00af\u00a9\u0001\u0000\u0000\u0000\u00af\u00ac\u0001\u0000"+
		"\u0000\u0000\u00b0\u00b3\u0001\u0000\u0000\u0000\u00b1\u00af\u0001\u0000"+
		"\u0000\u0000\u00b1\u00b2\u0001\u0000\u0000\u0000\u00b2\u0019\u0001\u0000"+
		"\u0000\u0000\u00b3\u00b1\u0001\u0000\u0000\u0000\u00b4\u00b5\u0005\u000b"+
		"\u0000\u0000\u00b5\u00b6\u0005\n\u0000\u0000\u00b6\u00ba\u0005\f\u0000"+
		"\u0000\u00b7\u00b9\u0003\u0004\u0002\u0000\u00b8\u00b7\u0001\u0000\u0000"+
		"\u0000\u00b9\u00bc\u0001\u0000\u0000\u0000\u00ba\u00b8\u0001\u0000\u0000"+
		"\u0000\u00ba\u00bb\u0001\u0000\u0000\u0000\u00bb\u00bd\u0001\u0000\u0000"+
		"\u0000\u00bc\u00ba\u0001\u0000\u0000\u0000\u00bd\u00be\u0005\t\u0000\u0000"+
		"\u00be\u001b\u0001\u0000\u0000\u0000\u00bf\u00c3\u0005\f\u0000\u0000\u00c0"+
		"\u00c2\u0003\u0004\u0002\u0000\u00c1\u00c0\u0001\u0000\u0000\u0000\u00c2"+
		"\u00c5\u0001\u0000\u0000\u0000\u00c3\u00c1\u0001\u0000\u0000\u0000\u00c3"+
		"\u00c4\u0001\u0000\u0000\u0000\u00c4\u00c6\u0001\u0000\u0000\u0000\u00c5"+
		"\u00c3\u0001\u0000\u0000\u0000\u00c6\u00c7\u0005\r\u0000\u0000\u00c7\u00c8"+
		"\u0005\u001d\u0000\u0000\u00c8\u001d\u0001\u0000\u0000\u0000\u00c9\u00cd"+
		"\u0005\f\u0000\u0000\u00ca\u00cc\u0003\u0004\u0002\u0000\u00cb\u00ca\u0001"+
		"\u0000\u0000\u0000\u00cc\u00cf\u0001\u0000\u0000\u0000\u00cd\u00cb\u0001"+
		"\u0000\u0000\u0000\u00cd\u00ce\u0001\u0000\u0000\u0000\u00ce\u00d0\u0001"+
		"\u0000\u0000\u0000\u00cf\u00cd\u0001\u0000\u0000\u0000\u00d0\u00d1\u0005"+
		"\u000e\u0000\u0000\u00d1\u00d2\u0005\u001d\u0000\u0000\u00d2\u001f\u0001"+
		"\u0000\u0000\u0000\u00d3\u00d7\u0005\f\u0000\u0000\u00d4\u00d6\u0003\u0004"+
		"\u0002\u0000\u00d5\u00d4\u0001\u0000\u0000\u0000\u00d6\u00d9\u0001\u0000"+
		"\u0000\u0000\u00d7\u00d5\u0001\u0000\u0000\u0000\u00d7\u00d8\u0001\u0000"+
		"\u0000\u0000\u00d8\u00da\u0001\u0000\u0000\u0000\u00d9\u00d7\u0001\u0000"+
		"\u0000\u0000\u00da\u00db\u0005\u000f\u0000\u0000\u00db\u00dc\u0005\u001d"+
		"\u0000\u0000\u00dc!\u0001\u0000\u0000\u0000\u00dd\u00e1\u0005\f\u0000"+
		"\u0000\u00de\u00e0\u0003\u0004\u0002\u0000\u00df\u00de\u0001\u0000\u0000"+
		"\u0000\u00e0\u00e3\u0001\u0000\u0000\u0000\u00e1\u00df\u0001\u0000\u0000"+
		"\u0000\u00e1\u00e2\u0001\u0000\u0000\u0000\u00e2\u00e4\u0001\u0000\u0000"+
		"\u0000\u00e3\u00e1\u0001\u0000\u0000\u0000\u00e4\u00e5\u0005\u0010\u0000"+
		"\u0000\u00e5\u00e6\u0005\u001d\u0000\u0000\u00e6#\u0001\u0000\u0000\u0000"+
		"\u00e7\u00eb\u0005\f\u0000\u0000\u00e8\u00ea\u0003\u0004\u0002\u0000\u00e9"+
		"\u00e8\u0001\u0000\u0000\u0000\u00ea\u00ed\u0001\u0000\u0000\u0000\u00eb"+
		"\u00e9\u0001\u0000\u0000\u0000\u00eb\u00ec\u0001\u0000\u0000\u0000\u00ec"+
		"\u00ee\u0001\u0000\u0000\u0000\u00ed\u00eb\u0001\u0000\u0000\u0000\u00ee"+
		"\u00ef\u0005\u0011\u0000\u0000\u00ef\u00f0\u0005\u001d\u0000\u0000\u00f0"+
		"%\u0001\u0000\u0000\u0000\u00f1\u00f5\u0005\f\u0000\u0000\u00f2\u00f4"+
		"\u0003\u0004\u0002\u0000\u00f3\u00f2\u0001\u0000\u0000\u0000\u00f4\u00f7"+
		"\u0001\u0000\u0000\u0000\u00f5\u00f3\u0001\u0000\u0000\u0000\u00f5\u00f6"+
		"\u0001\u0000\u0000\u0000\u00f6\u00f8\u0001\u0000\u0000\u0000\u00f7\u00f5"+
		"\u0001\u0000\u0000\u0000\u00f8\u00f9\u0005!\u0000\u0000\u00f9\u00fa\u0005"+
		"\u001d\u0000\u0000\u00fa\'\u0001\u0000\u0000\u0000\u00fb\u00ff\u0005\f"+
		"\u0000\u0000\u00fc\u00fe\u0003\u0004\u0002\u0000\u00fd\u00fc\u0001\u0000"+
		"\u0000\u0000\u00fe\u0101\u0001\u0000\u0000\u0000\u00ff\u00fd\u0001\u0000"+
		"\u0000\u0000\u00ff\u0100\u0001\u0000\u0000\u0000\u0100\u0102\u0001\u0000"+
		"\u0000\u0000\u0101\u00ff\u0001\u0000\u0000\u0000\u0102\u0103\u0005\u0011"+
		"\u0000\u0000\u0103\u0104\u0005\u001f\u0000\u0000\u0104)\u0001\u0000\u0000"+
		"\u0000\u0105\u0109\u0005\f\u0000\u0000\u0106\u0108\u0003\u0004\u0002\u0000"+
		"\u0107\u0106\u0001\u0000\u0000\u0000\u0108\u010b\u0001\u0000\u0000\u0000"+
		"\u0109\u0107\u0001\u0000\u0000\u0000\u0109\u010a\u0001\u0000\u0000\u0000"+
		"\u010a\u010c\u0001\u0000\u0000\u0000\u010b\u0109\u0001\u0000\u0000\u0000"+
		"\u010c\u010d\u0005!\u0000\u0000\u010d\u010e\u0005\u001f\u0000\u0000\u010e"+
		"+\u0001\u0000\u0000\u0000\u010f\u0113\u0005\f\u0000\u0000\u0110\u0112"+
		"\u0003\u0004\u0002\u0000\u0111\u0110\u0001\u0000\u0000\u0000\u0112\u0115"+
		"\u0001\u0000\u0000\u0000\u0113\u0111\u0001\u0000\u0000\u0000\u0113\u0114"+
		"\u0001\u0000\u0000\u0000\u0114\u0116\u0001\u0000\u0000\u0000\u0115\u0113"+
		"\u0001\u0000\u0000\u0000\u0116\u0117\u0005\u0011\u0000\u0000\u0117\u0118"+
		"\u0005\u001e\u0000\u0000\u0118-\u0001\u0000\u0000\u0000\u0119\u011d\u0005"+
		"\f\u0000\u0000\u011a\u011c\u0003\u0004\u0002\u0000\u011b\u011a\u0001\u0000"+
		"\u0000\u0000\u011c\u011f\u0001\u0000\u0000\u0000\u011d\u011b\u0001\u0000"+
		"\u0000\u0000\u011d\u011e\u0001\u0000\u0000\u0000\u011e\u0120\u0001\u0000"+
		"\u0000\u0000\u011f\u011d\u0001\u0000\u0000\u0000\u0120\u0121\u0005!\u0000"+
		"\u0000\u0121\u0122\u0005\u001e\u0000\u0000\u0122/\u0001\u0000\u0000\u0000"+
		"\u0123\u0127\u0005\f\u0000\u0000\u0124\u0126\u0003\u0004\u0002\u0000\u0125"+
		"\u0124\u0001\u0000\u0000\u0000\u0126\u0129\u0001\u0000\u0000\u0000\u0127"+
		"\u0125\u0001\u0000\u0000\u0000\u0127\u0128\u0001\u0000\u0000\u0000\u0128"+
		"\u012a\u0001\u0000\u0000\u0000\u0129\u0127\u0001\u0000\u0000\u0000\u012a"+
		"\u012b\u0005\u0011\u0000\u0000\u012b\u012c\u0005 \u0000\u0000\u012c1\u0001"+
		"\u0000\u0000\u0000\u012d\u0131\u0005\f\u0000\u0000\u012e\u0130\u0003\u0004"+
		"\u0002\u0000\u012f\u012e\u0001\u0000\u0000\u0000\u0130\u0133\u0001\u0000"+
		"\u0000\u0000\u0131\u012f\u0001\u0000\u0000\u0000\u0131\u0132\u0001\u0000"+
		"\u0000\u0000\u0132\u0134\u0001\u0000\u0000\u0000\u0133\u0131\u0001\u0000"+
		"\u0000\u0000\u0134\u0135\u0005!\u0000\u0000\u0135\u0136\u0005 \u0000\u0000"+
		"\u01363\u0001\u0000\u0000\u0000\u0137\u013b\u0005\f\u0000\u0000\u0138"+
		"\u013a\u0003\u0004\u0002\u0000\u0139\u0138\u0001\u0000\u0000\u0000\u013a"+
		"\u013d\u0001\u0000\u0000\u0000\u013b\u0139\u0001\u0000\u0000\u0000\u013b"+
		"\u013c\u0001\u0000\u0000\u0000\u013c\u013e\u0001\u0000\u0000\u0000\u013d"+
		"\u013b\u0001\u0000\u0000\u0000\u013e\u013f\u0005\u0012\u0000\u0000\u013f"+
		"\u0140\u0005\u001e\u0000\u0000\u01405\u0001\u0000\u0000\u0000\u0141\u0145"+
		"\u0005\f\u0000\u0000\u0142\u0144\u0003\u0004\u0002\u0000\u0143\u0142\u0001"+
		"\u0000\u0000\u0000\u0144\u0147\u0001\u0000\u0000\u0000\u0145\u0143\u0001"+
		"\u0000\u0000\u0000\u0145\u0146\u0001\u0000\u0000\u0000\u0146\u0148\u0001"+
		"\u0000\u0000\u0000\u0147\u0145\u0001\u0000\u0000\u0000\u0148\u0149\u0003"+
		":\u001d\u0000\u0149\u014a\u0005\u0011\u0000\u0000\u014a\u014b\u0005\u001e"+
		"\u0000\u0000\u014b7\u0001\u0000\u0000\u0000\u014c\u0150\u0005\f\u0000"+
		"\u0000\u014d\u014f\u0003\u0004\u0002\u0000\u014e\u014d\u0001\u0000\u0000"+
		"\u0000\u014f\u0152\u0001\u0000\u0000\u0000\u0150\u014e\u0001\u0000\u0000"+
		"\u0000\u0150\u0151\u0001\u0000\u0000\u0000\u0151\u0153\u0001\u0000\u0000"+
		"\u0000\u0152\u0150\u0001\u0000\u0000\u0000\u0153\u0154\u0003:\u001d\u0000"+
		"\u0154\u0155\u0005!\u0000\u0000\u0155\u0156\u0005\u001e\u0000\u0000\u0156"+
		"9\u0001\u0000\u0000\u0000\u0157\u0158\u0005\u0007\u0000\u0000\u0158\u0159"+
		"\u0005\"\u0000\u0000\u0159\u015a\u0005\u0013\u0000\u0000\u015a;\u0001"+
		"\u0000\u0000\u0000\u001f=CPU`flp|\u0081\u0084\u008c\u00a7\u00af\u00b1"+
		"\u00ba\u00c3\u00cd\u00d7\u00e1\u00eb\u00f5\u00ff\u0109\u0113\u011d\u0127"+
		"\u0131\u013b\u0145\u0150";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}