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
		RULE_filterMatchRegex = 26, RULE_filterEqualType = 27, RULE_filterNEqualType = 28, 
		RULE_itemMethod = 29;
	private static String[] makeRuleNames() {
		return new String[] {
			"path", "syntaxMode", "relativePath", "searchChild", "anyChild", "any", 
			"index", "indexes", "filter", "childNode", "array", "childrenNode", "filterExpr", 
			"filterExist", "filterGtNum", "filterGeNum", "filterLtNum", "filterLeNum", 
			"filterEqualNum", "filterNEqualNum", "filterEqualBool", "filterNEqualBool", 
			"filterEqualStr", "filterNEqualStr", "filterEqualNull", "filterNEqualNull", 
			"filterMatchRegex", "filterEqualType", "filterNEqualType", "itemMethod"
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
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << ANY_INDEX) | (1L << OPEN_SQ_BRACKET))) != 0)) {
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
		public FilterEqualTypeContext filterEqualType() {
			return getRuleContext(FilterEqualTypeContext.class,0);
		}
		public FilterNEqualTypeContext filterNEqualType() {
			return getRuleContext(FilterNEqualTypeContext.class,0);
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
				filterEqualType();
				}
				break;
			case 17:
				{
				setState(166);
				filterNEqualType();
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
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << ANY_INDEX) | (1L << OPEN_SQ_BRACKET))) != 0)) {
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
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << ANY_INDEX) | (1L << OPEN_SQ_BRACKET))) != 0)) {
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
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << ANY_INDEX) | (1L << OPEN_SQ_BRACKET))) != 0)) {
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
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << ANY_INDEX) | (1L << OPEN_SQ_BRACKET))) != 0)) {
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
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << ANY_INDEX) | (1L << OPEN_SQ_BRACKET))) != 0)) {
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
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << ANY_INDEX) | (1L << OPEN_SQ_BRACKET))) != 0)) {
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
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << ANY_INDEX) | (1L << OPEN_SQ_BRACKET))) != 0)) {
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
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << ANY_INDEX) | (1L << OPEN_SQ_BRACKET))) != 0)) {
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
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << ANY_INDEX) | (1L << OPEN_SQ_BRACKET))) != 0)) {
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
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << ANY_INDEX) | (1L << OPEN_SQ_BRACKET))) != 0)) {
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
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << ANY_INDEX) | (1L << OPEN_SQ_BRACKET))) != 0)) {
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
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << ANY_INDEX) | (1L << OPEN_SQ_BRACKET))) != 0)) {
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
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << ANY_INDEX) | (1L << OPEN_SQ_BRACKET))) != 0)) {
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
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << ANY_INDEX) | (1L << OPEN_SQ_BRACKET))) != 0)) {
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

	public static class FilterEqualTypeContext extends ParserRuleContext {
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
		public FilterEqualTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_filterEqualType; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JsonPathVisitor ) return ((JsonPathVisitor<? extends T>)visitor).visitFilterEqualType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FilterEqualTypeContext filterEqualType() throws RecognitionException {
		FilterEqualTypeContext _localctx = new FilterEqualTypeContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_filterEqualType);
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

	public static class FilterNEqualTypeContext extends ParserRuleContext {
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
		public FilterNEqualTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_filterNEqualType; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JsonPathVisitor ) return ((JsonPathVisitor<? extends T>)visitor).visitFilterNEqualType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FilterNEqualTypeContext filterNEqualType() throws RecognitionException {
		FilterNEqualTypeContext _localctx = new FilterNEqualTypeContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_filterNEqualType);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3%\u015e\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\3\2\5\2@"+
		"\n\2\3\2\3\2\7\2D\n\2\f\2\16\2G\13\2\3\2\3\2\3\3\3\3\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\5\4S\n\4\3\5\3\5\3\5\5\5X\n\5\3\6\3\6\3\7\3\7\3\b\3\b\3\b\3\b\3"+
		"\b\5\bc\n\b\3\t\3\t\3\t\3\t\5\ti\n\t\3\t\3\t\3\t\3\t\5\to\n\t\7\tq\n\t"+
		"\f\t\16\tt\13\t\3\t\3\t\3\n\3\n\3\n\3\n\3\13\3\13\3\13\5\13\177\n\13\3"+
		"\f\3\f\3\f\5\f\u0084\n\f\3\f\5\f\u0087\n\f\3\r\3\r\3\r\3\r\7\r\u008d\n"+
		"\r\f\r\16\r\u0090\13\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\5\16\u00aa\n\16\3\16\3\16\3\16\3\16\3\16\3\16\7\16\u00b2\n\16\f\16\16"+
		"\16\u00b5\13\16\3\17\3\17\3\17\3\17\7\17\u00bb\n\17\f\17\16\17\u00be\13"+
		"\17\3\17\3\17\3\20\3\20\7\20\u00c4\n\20\f\20\16\20\u00c7\13\20\3\20\3"+
		"\20\3\20\3\21\3\21\7\21\u00ce\n\21\f\21\16\21\u00d1\13\21\3\21\3\21\3"+
		"\21\3\22\3\22\7\22\u00d8\n\22\f\22\16\22\u00db\13\22\3\22\3\22\3\22\3"+
		"\23\3\23\7\23\u00e2\n\23\f\23\16\23\u00e5\13\23\3\23\3\23\3\23\3\24\3"+
		"\24\7\24\u00ec\n\24\f\24\16\24\u00ef\13\24\3\24\3\24\3\24\3\25\3\25\7"+
		"\25\u00f6\n\25\f\25\16\25\u00f9\13\25\3\25\3\25\3\25\3\26\3\26\7\26\u0100"+
		"\n\26\f\26\16\26\u0103\13\26\3\26\3\26\3\26\3\27\3\27\7\27\u010a\n\27"+
		"\f\27\16\27\u010d\13\27\3\27\3\27\3\27\3\30\3\30\7\30\u0114\n\30\f\30"+
		"\16\30\u0117\13\30\3\30\3\30\3\30\3\31\3\31\7\31\u011e\n\31\f\31\16\31"+
		"\u0121\13\31\3\31\3\31\3\31\3\32\3\32\7\32\u0128\n\32\f\32\16\32\u012b"+
		"\13\32\3\32\3\32\3\32\3\33\3\33\7\33\u0132\n\33\f\33\16\33\u0135\13\33"+
		"\3\33\3\33\3\33\3\34\3\34\7\34\u013c\n\34\f\34\16\34\u013f\13\34\3\34"+
		"\3\34\3\34\3\35\3\35\7\35\u0146\n\35\f\35\16\35\u0149\13\35\3\35\3\35"+
		"\3\35\3\35\3\36\3\36\7\36\u0151\n\36\f\36\16\36\u0154\13\36\3\36\3\36"+
		"\3\36\3\36\3\37\3\37\3\37\3\37\3\37\2\3\32 \2\4\6\b\n\f\16\20\22\24\26"+
		"\30\32\34\36 \"$&(*,.\60\62\64\668:<\2\4\3\2\4\5\4\2  $$\2\u0172\2?\3"+
		"\2\2\2\4J\3\2\2\2\6R\3\2\2\2\bT\3\2\2\2\nY\3\2\2\2\f[\3\2\2\2\16b\3\2"+
		"\2\2\20d\3\2\2\2\22w\3\2\2\2\24{\3\2\2\2\26\u0083\3\2\2\2\30\u0088\3\2"+
		"\2\2\32\u00a9\3\2\2\2\34\u00b6\3\2\2\2\36\u00c1\3\2\2\2 \u00cb\3\2\2\2"+
		"\"\u00d5\3\2\2\2$\u00df\3\2\2\2&\u00e9\3\2\2\2(\u00f3\3\2\2\2*\u00fd\3"+
		"\2\2\2,\u0107\3\2\2\2.\u0111\3\2\2\2\60\u011b\3\2\2\2\62\u0125\3\2\2\2"+
		"\64\u012f\3\2\2\2\66\u0139\3\2\2\28\u0143\3\2\2\2:\u014e\3\2\2\2<\u0159"+
		"\3\2\2\2>@\5\4\3\2?>\3\2\2\2?@\3\2\2\2@A\3\2\2\2AE\7\3\2\2BD\5\6\4\2C"+
		"B\3\2\2\2DG\3\2\2\2EC\3\2\2\2EF\3\2\2\2FH\3\2\2\2GE\3\2\2\2HI\7\2\2\3"+
		"I\3\3\2\2\2JK\t\2\2\2K\5\3\2\2\2LS\5\b\5\2MS\5\24\13\2NS\5\26\f\2OS\5"+
		"\30\r\2PS\5\n\6\2QS\5\f\7\2RL\3\2\2\2RM\3\2\2\2RN\3\2\2\2RO\3\2\2\2RP"+
		"\3\2\2\2RQ\3\2\2\2S\7\3\2\2\2TU\7\6\2\2UW\t\3\2\2VX\5\26\f\2WV\3\2\2\2"+
		"WX\3\2\2\2X\t\3\2\2\2YZ\7\7\2\2Z\13\3\2\2\2[\\\7\b\2\2\\\r\3\2\2\2]^\7"+
		"\27\2\2^_\7\37\2\2_c\7\30\2\2`a\7\t\2\2ac\7\37\2\2b]\3\2\2\2b`\3\2\2\2"+
		"c\17\3\2\2\2de\7\27\2\2eh\7\37\2\2fg\7\31\2\2gi\7\37\2\2hf\3\2\2\2hi\3"+
		"\2\2\2ir\3\2\2\2jk\7\32\2\2kn\7\37\2\2lm\7\31\2\2mo\7\37\2\2nl\3\2\2\2"+
		"no\3\2\2\2oq\3\2\2\2pj\3\2\2\2qt\3\2\2\2rp\3\2\2\2rs\3\2\2\2su\3\2\2\2"+
		"tr\3\2\2\2uv\7\30\2\2v\21\3\2\2\2wx\7\n\2\2xy\5\32\16\2yz\7\13\2\2z\23"+
		"\3\2\2\2{|\7\t\2\2|~\t\3\2\2}\177\5\26\f\2~}\3\2\2\2~\177\3\2\2\2\177"+
		"\25\3\2\2\2\u0080\u0084\5\16\b\2\u0081\u0084\5\20\t\2\u0082\u0084\7\26"+
		"\2\2\u0083\u0080\3\2\2\2\u0083\u0081\3\2\2\2\u0083\u0082\3\2\2\2\u0084"+
		"\u0086\3\2\2\2\u0085\u0087\5\22\n\2\u0086\u0085\3\2\2\2\u0086\u0087\3"+
		"\2\2\2\u0087\27\3\2\2\2\u0088\u0089\7\27\2\2\u0089\u008e\7 \2\2\u008a"+
		"\u008b\7\32\2\2\u008b\u008d\7 \2\2\u008c\u008a\3\2\2\2\u008d\u0090\3\2"+
		"\2\2\u008e\u008c\3\2\2\2\u008e\u008f\3\2\2\2\u008f\u0091\3\2\2\2\u0090"+
		"\u008e\3\2\2\2\u0091\u0092\7\30\2\2\u0092\31\3\2\2\2\u0093\u0094\b\16"+
		"\1\2\u0094\u0095\7\34\2\2\u0095\u0096\7\f\2\2\u0096\u0097\5\32\16\2\u0097"+
		"\u0098\7\13\2\2\u0098\u00aa\3\2\2\2\u0099\u00aa\5&\24\2\u009a\u00aa\5"+
		"(\25\2\u009b\u00aa\5.\30\2\u009c\u00aa\5\60\31\2\u009d\u00aa\5\66\34\2"+
		"\u009e\u00aa\5*\26\2\u009f\u00aa\5,\27\2\u00a0\u00aa\5\62\32\2\u00a1\u00aa"+
		"\5\64\33\2\u00a2\u00aa\5\36\20\2\u00a3\u00aa\5 \21\2\u00a4\u00aa\5\"\22"+
		"\2\u00a5\u00aa\5$\23\2\u00a6\u00aa\5\34\17\2\u00a7\u00aa\58\35\2\u00a8"+
		"\u00aa\5:\36\2\u00a9\u0093\3\2\2\2\u00a9\u0099\3\2\2\2\u00a9\u009a\3\2"+
		"\2\2\u00a9\u009b\3\2\2\2\u00a9\u009c\3\2\2\2\u00a9\u009d\3\2\2\2\u00a9"+
		"\u009e\3\2\2\2\u00a9\u009f\3\2\2\2\u00a9\u00a0\3\2\2\2\u00a9\u00a1\3\2"+
		"\2\2\u00a9\u00a2\3\2\2\2\u00a9\u00a3\3\2\2\2\u00a9\u00a4\3\2\2\2\u00a9"+
		"\u00a5\3\2\2\2\u00a9\u00a6\3\2\2\2\u00a9\u00a7\3\2\2\2\u00a9\u00a8\3\2"+
		"\2\2\u00aa\u00b3\3\2\2\2\u00ab\u00ac\f\24\2\2\u00ac\u00ad\7\35\2\2\u00ad"+
		"\u00b2\5\32\16\25\u00ae\u00af\f\23\2\2\u00af\u00b0\7\36\2\2\u00b0\u00b2"+
		"\5\32\16\24\u00b1\u00ab\3\2\2\2\u00b1\u00ae\3\2\2\2\u00b2\u00b5\3\2\2"+
		"\2\u00b3\u00b1\3\2\2\2\u00b3\u00b4\3\2\2\2\u00b4\33\3\2\2\2\u00b5\u00b3"+
		"\3\2\2\2\u00b6\u00b7\7\r\2\2\u00b7\u00b8\7\f\2\2\u00b8\u00bc\7\16\2\2"+
		"\u00b9\u00bb\5\6\4\2\u00ba\u00b9\3\2\2\2\u00bb\u00be\3\2\2\2\u00bc\u00ba"+
		"\3\2\2\2\u00bc\u00bd\3\2\2\2\u00bd\u00bf\3\2\2\2\u00be\u00bc\3\2\2\2\u00bf"+
		"\u00c0\7\13\2\2\u00c0\35\3\2\2\2\u00c1\u00c5\7\16\2\2\u00c2\u00c4\5\6"+
		"\4\2\u00c3\u00c2\3\2\2\2\u00c4\u00c7\3\2\2\2\u00c5\u00c3\3\2\2\2\u00c5"+
		"\u00c6\3\2\2\2\u00c6\u00c8\3\2\2\2\u00c7\u00c5\3\2\2\2\u00c8\u00c9\7\17"+
		"\2\2\u00c9\u00ca\7\37\2\2\u00ca\37\3\2\2\2\u00cb\u00cf\7\16\2\2\u00cc"+
		"\u00ce\5\6\4\2\u00cd\u00cc\3\2\2\2\u00ce\u00d1\3\2\2\2\u00cf\u00cd\3\2"+
		"\2\2\u00cf\u00d0\3\2\2\2\u00d0\u00d2\3\2\2\2\u00d1\u00cf\3\2\2\2\u00d2"+
		"\u00d3\7\20\2\2\u00d3\u00d4\7\37\2\2\u00d4!\3\2\2\2\u00d5\u00d9\7\16\2"+
		"\2\u00d6\u00d8\5\6\4\2\u00d7\u00d6\3\2\2\2\u00d8\u00db\3\2\2\2\u00d9\u00d7"+
		"\3\2\2\2\u00d9\u00da\3\2\2\2\u00da\u00dc\3\2\2\2\u00db\u00d9\3\2\2\2\u00dc"+
		"\u00dd\7\21\2\2\u00dd\u00de\7\37\2\2\u00de#\3\2\2\2\u00df\u00e3\7\16\2"+
		"\2\u00e0\u00e2\5\6\4\2\u00e1\u00e0\3\2\2\2\u00e2\u00e5\3\2\2\2\u00e3\u00e1"+
		"\3\2\2\2\u00e3\u00e4\3\2\2\2\u00e4\u00e6\3\2\2\2\u00e5\u00e3\3\2\2\2\u00e6"+
		"\u00e7\7\22\2\2\u00e7\u00e8\7\37\2\2\u00e8%\3\2\2\2\u00e9\u00ed\7\16\2"+
		"\2\u00ea\u00ec\5\6\4\2\u00eb\u00ea\3\2\2\2\u00ec\u00ef\3\2\2\2\u00ed\u00eb"+
		"\3\2\2\2\u00ed\u00ee\3\2\2\2\u00ee\u00f0\3\2\2\2\u00ef\u00ed\3\2\2\2\u00f0"+
		"\u00f1\7\23\2\2\u00f1\u00f2\7\37\2\2\u00f2\'\3\2\2\2\u00f3\u00f7\7\16"+
		"\2\2\u00f4\u00f6\5\6\4\2\u00f5\u00f4\3\2\2\2\u00f6\u00f9\3\2\2\2\u00f7"+
		"\u00f5\3\2\2\2\u00f7\u00f8\3\2\2\2\u00f8\u00fa\3\2\2\2\u00f9\u00f7\3\2"+
		"\2\2\u00fa\u00fb\7#\2\2\u00fb\u00fc\7\37\2\2\u00fc)\3\2\2\2\u00fd\u0101"+
		"\7\16\2\2\u00fe\u0100\5\6\4\2\u00ff\u00fe\3\2\2\2\u0100\u0103\3\2\2\2"+
		"\u0101\u00ff\3\2\2\2\u0101\u0102\3\2\2\2\u0102\u0104\3\2\2\2\u0103\u0101"+
		"\3\2\2\2\u0104\u0105\7\23\2\2\u0105\u0106\7!\2\2\u0106+\3\2\2\2\u0107"+
		"\u010b\7\16\2\2\u0108\u010a\5\6\4\2\u0109\u0108\3\2\2\2\u010a\u010d\3"+
		"\2\2\2\u010b\u0109\3\2\2\2\u010b\u010c\3\2\2\2\u010c\u010e\3\2\2\2\u010d"+
		"\u010b\3\2\2\2\u010e\u010f\7#\2\2\u010f\u0110\7!\2\2\u0110-\3\2\2\2\u0111"+
		"\u0115\7\16\2\2\u0112\u0114\5\6\4\2\u0113\u0112\3\2\2\2\u0114\u0117\3"+
		"\2\2\2\u0115\u0113\3\2\2\2\u0115\u0116\3\2\2\2\u0116\u0118\3\2\2\2\u0117"+
		"\u0115\3\2\2\2\u0118\u0119\7\23\2\2\u0119\u011a\7 \2\2\u011a/\3\2\2\2"+
		"\u011b\u011f\7\16\2\2\u011c\u011e\5\6\4\2\u011d\u011c\3\2\2\2\u011e\u0121"+
		"\3\2\2\2\u011f\u011d\3\2\2\2\u011f\u0120\3\2\2\2\u0120\u0122\3\2\2\2\u0121"+
		"\u011f\3\2\2\2\u0122\u0123\7#\2\2\u0123\u0124\7 \2\2\u0124\61\3\2\2\2"+
		"\u0125\u0129\7\16\2\2\u0126\u0128\5\6\4\2\u0127\u0126\3\2\2\2\u0128\u012b"+
		"\3\2\2\2\u0129\u0127\3\2\2\2\u0129\u012a\3\2\2\2\u012a\u012c\3\2\2\2\u012b"+
		"\u0129\3\2\2\2\u012c\u012d\7\23\2\2\u012d\u012e\7\"\2\2\u012e\63\3\2\2"+
		"\2\u012f\u0133\7\16\2\2\u0130\u0132\5\6\4\2\u0131\u0130\3\2\2\2\u0132"+
		"\u0135\3\2\2\2\u0133\u0131\3\2\2\2\u0133\u0134\3\2\2\2\u0134\u0136\3\2"+
		"\2\2\u0135\u0133\3\2\2\2\u0136\u0137\7#\2\2\u0137\u0138\7\"\2\2\u0138"+
		"\65\3\2\2\2\u0139\u013d\7\16\2\2\u013a\u013c\5\6\4\2\u013b\u013a\3\2\2"+
		"\2\u013c\u013f\3\2\2\2\u013d\u013b\3\2\2\2\u013d\u013e\3\2\2\2\u013e\u0140"+
		"\3\2\2\2\u013f\u013d\3\2\2\2\u0140\u0141\7\24\2\2\u0141\u0142\7 \2\2\u0142"+
		"\67\3\2\2\2\u0143\u0147\7\16\2\2\u0144\u0146\5\6\4\2\u0145\u0144\3\2\2"+
		"\2\u0146\u0149\3\2\2\2\u0147\u0145\3\2\2\2\u0147\u0148\3\2\2\2\u0148\u014a"+
		"\3\2\2\2\u0149\u0147\3\2\2\2\u014a\u014b\5<\37\2\u014b\u014c\7\23\2\2"+
		"\u014c\u014d\7 \2\2\u014d9\3\2\2\2\u014e\u0152\7\16\2\2\u014f\u0151\5"+
		"\6\4\2\u0150\u014f\3\2\2\2\u0151\u0154\3\2\2\2\u0152\u0150\3\2\2\2\u0152"+
		"\u0153\3\2\2\2\u0153\u0155\3\2\2\2\u0154\u0152\3\2\2\2\u0155\u0156\5<"+
		"\37\2\u0156\u0157\7#\2\2\u0157\u0158\7 \2\2\u0158;\3\2\2\2\u0159\u015a"+
		"\7\t\2\2\u015a\u015b\7$\2\2\u015b\u015c\7\25\2\2\u015c=\3\2\2\2!?ERWb"+
		"hnr~\u0083\u0086\u008e\u00a9\u00b1\u00b3\u00bc\u00c5\u00cf\u00d9\u00e3"+
		"\u00ed\u00f7\u0101\u010b\u0115\u011f\u0129\u0133\u013d\u0147\u0152";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}