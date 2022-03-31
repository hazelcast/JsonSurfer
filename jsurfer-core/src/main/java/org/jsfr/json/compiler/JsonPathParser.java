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
		T__17=18, T__18=19, T__19=20, ANY_INDEX=21, OPEN_SQ_BRACKET=22, CLOSE_SQ_BRACKET=23, 
		TO=24, COMMA=25, COLON=26, NegationOperator=27, AndOperator=28, OrOperator=29, 
		NUM=30, LAST=31, QUOTED_STRING=32, BOOL=33, NULL=34, NE=35, KEY=36, WS=37;
	public static final int
		RULE_path = 0, RULE_syntaxMode = 1, RULE_relativePath = 2, RULE_searchChild = 3, 
		RULE_anyChild = 4, RULE_any = 5, RULE_index = 6, RULE_reversedIndex = 7, 
		RULE_indexes = 8, RULE_filter = 9, RULE_childNode = 10, RULE_array = 11, 
		RULE_childrenNode = 12, RULE_filterExpr = 13, RULE_filterExist = 14, RULE_filterGtNum = 15, 
		RULE_filterGeNum = 16, RULE_filterLtNum = 17, RULE_filterLeNum = 18, RULE_filterEqualNum = 19, 
		RULE_filterNEqualNum = 20, RULE_filterEqualBool = 21, RULE_filterNEqualBool = 22, 
		RULE_filterEqualStr = 23, RULE_filterNEqualStr = 24, RULE_filterEqualNull = 25, 
		RULE_filterNEqualNull = 26, RULE_filterMatchRegex = 27, RULE_filterItemMethodEqual = 28, 
		RULE_filterItemMethodNEqual = 29, RULE_itemMethod = 30;
	private static String[] makeRuleNames() {
		return new String[] {
			"path", "syntaxMode", "relativePath", "searchChild", "anyChild", "any", 
			"index", "reversedIndex", "indexes", "filter", "childNode", "array", 
			"childrenNode", "filterExpr", "filterExist", "filterGtNum", "filterGeNum", 
			"filterLtNum", "filterLeNum", "filterEqualNum", "filterNEqualNum", "filterEqualBool", 
			"filterNEqualBool", "filterEqualStr", "filterNEqualStr", "filterEqualNull", 
			"filterNEqualNull", "filterMatchRegex", "filterItemMethodEqual", "filterItemMethodNEqual", 
			"itemMethod"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'$'", "'lax'", "'strict'", "'..'", "'.*'", "'*'", "'.'", "'-'", 
			"'?('", "')'", "'('", "'exists'", "'@'", "'>'", "'>='", "'<'", "'<='", 
			"'=='", "'like_regex'", "'()'", "'[*]'", "'['", "']'", "'to'", "','", 
			"':'", "'!'", "'&&'", "'||'", null, "'last'", null, null, "'null'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, "ANY_INDEX", "OPEN_SQ_BRACKET", 
			"CLOSE_SQ_BRACKET", "TO", "COMMA", "COLON", "NegationOperator", "AndOperator", 
			"OrOperator", "NUM", "LAST", "QUOTED_STRING", "BOOL", "NULL", "NE", "KEY", 
			"WS"
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
			setState(63);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__1 || _la==T__2) {
				{
				setState(62);
				syntaxMode();
				}
			}

			setState(65);
			match(T__0);
			setState(69);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << ANY_INDEX) | (1L << OPEN_SQ_BRACKET))) != 0)) {
				{
				{
				setState(66);
				relativePath();
				}
				}
				setState(71);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(72);
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
			setState(74);
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
			setState(82);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(76);
				searchChild();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(77);
				childNode();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(78);
				array();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(79);
				childrenNode();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(80);
				anyChild();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(81);
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
			setState(84);
			match(T__3);
			setState(85);
			_la = _input.LA(1);
			if ( !(_la==QUOTED_STRING || _la==KEY) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(87);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				{
				setState(86);
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
			setState(89);
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
			setState(91);
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
			setState(98);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPEN_SQ_BRACKET:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(93);
				match(OPEN_SQ_BRACKET);
				setState(94);
				match(NUM);
				setState(95);
				match(CLOSE_SQ_BRACKET);
				}
				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(96);
				match(T__6);
				setState(97);
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

	public static class ReversedIndexContext extends ParserRuleContext {
		public TerminalNode OPEN_SQ_BRACKET() { return getToken(JsonPathParser.OPEN_SQ_BRACKET, 0); }
		public TerminalNode LAST() { return getToken(JsonPathParser.LAST, 0); }
		public TerminalNode CLOSE_SQ_BRACKET() { return getToken(JsonPathParser.CLOSE_SQ_BRACKET, 0); }
		public TerminalNode NUM() { return getToken(JsonPathParser.NUM, 0); }
		public ReversedIndexContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_reversedIndex; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JsonPathVisitor ) return ((JsonPathVisitor<? extends T>)visitor).visitReversedIndex(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReversedIndexContext reversedIndex() throws RecognitionException {
		ReversedIndexContext _localctx = new ReversedIndexContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_reversedIndex);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(100);
			match(OPEN_SQ_BRACKET);
			setState(101);
			match(LAST);
			setState(104);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__7) {
				{
				setState(102);
				match(T__7);
				setState(103);
				match(NUM);
				}
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
		enterRule(_localctx, 16, RULE_indexes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(108);
			match(OPEN_SQ_BRACKET);
			setState(109);
			match(NUM);
			setState(112);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TO) {
				{
				setState(110);
				match(TO);
				setState(111);
				match(NUM);
				}
			}

			setState(122);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(114);
				match(COMMA);
				setState(115);
				match(NUM);
				setState(118);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TO) {
					{
					setState(116);
					match(TO);
					setState(117);
					match(NUM);
					}
				}

				}
				}
				setState(124);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(125);
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
		enterRule(_localctx, 18, RULE_filter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(127);
			match(T__8);
			setState(128);
			filterExpr(0);
			setState(129);
			match(T__9);
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
		enterRule(_localctx, 20, RULE_childNode);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(131);
			match(T__6);
			setState(132);
			_la = _input.LA(1);
			if ( !(_la==QUOTED_STRING || _la==KEY) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(134);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				setState(133);
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
		public ReversedIndexContext reversedIndex() {
			return getRuleContext(ReversedIndexContext.class,0);
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
		enterRule(_localctx, 22, RULE_array);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(140);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				setState(136);
				index();
				}
				break;
			case 2:
				{
				setState(137);
				indexes();
				}
				break;
			case 3:
				{
				setState(138);
				reversedIndex();
				}
				break;
			case 4:
				{
				setState(139);
				match(ANY_INDEX);
				}
				break;
			}
			setState(143);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__8) {
				{
				setState(142);
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
		enterRule(_localctx, 24, RULE_childrenNode);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(145);
			match(OPEN_SQ_BRACKET);
			setState(146);
			match(QUOTED_STRING);
			setState(151);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(147);
				match(COMMA);
				setState(148);
				match(QUOTED_STRING);
				}
				}
				setState(153);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(154);
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
		int _startState = 26;
		enterRecursionRule(_localctx, 26, RULE_filterExpr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(178);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				{
				setState(157);
				match(NegationOperator);
				setState(158);
				match(T__10);
				setState(159);
				filterExpr(0);
				setState(160);
				match(T__9);
				}
				break;
			case 2:
				{
				setState(162);
				filterEqualNum();
				}
				break;
			case 3:
				{
				setState(163);
				filterNEqualNum();
				}
				break;
			case 4:
				{
				setState(164);
				filterEqualStr();
				}
				break;
			case 5:
				{
				setState(165);
				filterNEqualStr();
				}
				break;
			case 6:
				{
				setState(166);
				filterMatchRegex();
				}
				break;
			case 7:
				{
				setState(167);
				filterEqualBool();
				}
				break;
			case 8:
				{
				setState(168);
				filterNEqualBool();
				}
				break;
			case 9:
				{
				setState(169);
				filterEqualNull();
				}
				break;
			case 10:
				{
				setState(170);
				filterNEqualNull();
				}
				break;
			case 11:
				{
				setState(171);
				filterGtNum();
				}
				break;
			case 12:
				{
				setState(172);
				filterGeNum();
				}
				break;
			case 13:
				{
				setState(173);
				filterLtNum();
				}
				break;
			case 14:
				{
				setState(174);
				filterLeNum();
				}
				break;
			case 15:
				{
				setState(175);
				filterExist();
				}
				break;
			case 16:
				{
				setState(176);
				filterItemMethodEqual();
				}
				break;
			case 17:
				{
				setState(177);
				filterItemMethodNEqual();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(188);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(186);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
					case 1:
						{
						_localctx = new FilterExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_filterExpr);
						setState(180);
						if (!(precpred(_ctx, 18))) throw new FailedPredicateException(this, "precpred(_ctx, 18)");
						setState(181);
						match(AndOperator);
						setState(182);
						filterExpr(19);
						}
						break;
					case 2:
						{
						_localctx = new FilterExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_filterExpr);
						setState(183);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(184);
						match(OrOperator);
						setState(185);
						filterExpr(18);
						}
						break;
					}
					} 
				}
				setState(190);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
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
		enterRule(_localctx, 28, RULE_filterExist);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(191);
			match(T__11);
			setState(192);
			match(T__10);
			setState(193);
			match(T__12);
			setState(197);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << ANY_INDEX) | (1L << OPEN_SQ_BRACKET))) != 0)) {
				{
				{
				setState(194);
				relativePath();
				}
				}
				setState(199);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(200);
			match(T__9);
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
		enterRule(_localctx, 30, RULE_filterGtNum);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(202);
			match(T__12);
			setState(206);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << ANY_INDEX) | (1L << OPEN_SQ_BRACKET))) != 0)) {
				{
				{
				setState(203);
				relativePath();
				}
				}
				setState(208);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(209);
			match(T__13);
			setState(210);
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
		enterRule(_localctx, 32, RULE_filterGeNum);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(212);
			match(T__12);
			setState(216);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << ANY_INDEX) | (1L << OPEN_SQ_BRACKET))) != 0)) {
				{
				{
				setState(213);
				relativePath();
				}
				}
				setState(218);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(219);
			match(T__14);
			setState(220);
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
		enterRule(_localctx, 34, RULE_filterLtNum);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(222);
			match(T__12);
			setState(226);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << ANY_INDEX) | (1L << OPEN_SQ_BRACKET))) != 0)) {
				{
				{
				setState(223);
				relativePath();
				}
				}
				setState(228);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(229);
			match(T__15);
			setState(230);
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
		enterRule(_localctx, 36, RULE_filterLeNum);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(232);
			match(T__12);
			setState(236);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << ANY_INDEX) | (1L << OPEN_SQ_BRACKET))) != 0)) {
				{
				{
				setState(233);
				relativePath();
				}
				}
				setState(238);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(239);
			match(T__16);
			setState(240);
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
		enterRule(_localctx, 38, RULE_filterEqualNum);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(242);
			match(T__12);
			setState(246);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << ANY_INDEX) | (1L << OPEN_SQ_BRACKET))) != 0)) {
				{
				{
				setState(243);
				relativePath();
				}
				}
				setState(248);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(249);
			match(T__17);
			setState(250);
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
		enterRule(_localctx, 40, RULE_filterNEqualNum);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(252);
			match(T__12);
			setState(256);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << ANY_INDEX) | (1L << OPEN_SQ_BRACKET))) != 0)) {
				{
				{
				setState(253);
				relativePath();
				}
				}
				setState(258);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(259);
			match(NE);
			setState(260);
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
		enterRule(_localctx, 42, RULE_filterEqualBool);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(262);
			match(T__12);
			setState(266);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << ANY_INDEX) | (1L << OPEN_SQ_BRACKET))) != 0)) {
				{
				{
				setState(263);
				relativePath();
				}
				}
				setState(268);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(269);
			match(T__17);
			setState(270);
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
		enterRule(_localctx, 44, RULE_filterNEqualBool);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(272);
			match(T__12);
			setState(276);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << ANY_INDEX) | (1L << OPEN_SQ_BRACKET))) != 0)) {
				{
				{
				setState(273);
				relativePath();
				}
				}
				setState(278);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(279);
			match(NE);
			setState(280);
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
		enterRule(_localctx, 46, RULE_filterEqualStr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(282);
			match(T__12);
			setState(286);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << ANY_INDEX) | (1L << OPEN_SQ_BRACKET))) != 0)) {
				{
				{
				setState(283);
				relativePath();
				}
				}
				setState(288);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(289);
			match(T__17);
			setState(290);
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
		enterRule(_localctx, 48, RULE_filterNEqualStr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(292);
			match(T__12);
			setState(296);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << ANY_INDEX) | (1L << OPEN_SQ_BRACKET))) != 0)) {
				{
				{
				setState(293);
				relativePath();
				}
				}
				setState(298);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(299);
			match(NE);
			setState(300);
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
		enterRule(_localctx, 50, RULE_filterEqualNull);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(302);
			match(T__12);
			setState(306);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << ANY_INDEX) | (1L << OPEN_SQ_BRACKET))) != 0)) {
				{
				{
				setState(303);
				relativePath();
				}
				}
				setState(308);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(309);
			match(T__17);
			setState(310);
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
		enterRule(_localctx, 52, RULE_filterNEqualNull);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(312);
			match(T__12);
			setState(316);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << ANY_INDEX) | (1L << OPEN_SQ_BRACKET))) != 0)) {
				{
				{
				setState(313);
				relativePath();
				}
				}
				setState(318);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(319);
			match(NE);
			setState(320);
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
		enterRule(_localctx, 54, RULE_filterMatchRegex);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(322);
			match(T__12);
			setState(326);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << ANY_INDEX) | (1L << OPEN_SQ_BRACKET))) != 0)) {
				{
				{
				setState(323);
				relativePath();
				}
				}
				setState(328);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(329);
			match(T__18);
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
		enterRule(_localctx, 56, RULE_filterItemMethodEqual);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(332);
			match(T__12);
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
			match(T__17);
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
		enterRule(_localctx, 58, RULE_filterItemMethodNEqual);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(343);
			match(T__12);
			setState(347);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(344);
					relativePath();
					}
					} 
				}
				setState(349);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
			}
			setState(350);
			itemMethod();
			setState(351);
			match(NE);
			setState(352);
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
		enterRule(_localctx, 60, RULE_itemMethod);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(354);
			match(T__6);
			setState(355);
			match(KEY);
			setState(356);
			match(T__19);
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
		case 13:
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\'\u0169\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \3\2"+
		"\5\2B\n\2\3\2\3\2\7\2F\n\2\f\2\16\2I\13\2\3\2\3\2\3\3\3\3\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\5\4U\n\4\3\5\3\5\3\5\5\5Z\n\5\3\6\3\6\3\7\3\7\3\b\3\b\3\b"+
		"\3\b\3\b\5\be\n\b\3\t\3\t\3\t\3\t\5\tk\n\t\3\t\3\t\3\n\3\n\3\n\3\n\5\n"+
		"s\n\n\3\n\3\n\3\n\3\n\5\ny\n\n\7\n{\n\n\f\n\16\n~\13\n\3\n\3\n\3\13\3"+
		"\13\3\13\3\13\3\f\3\f\3\f\5\f\u0089\n\f\3\r\3\r\3\r\3\r\5\r\u008f\n\r"+
		"\3\r\5\r\u0092\n\r\3\16\3\16\3\16\3\16\7\16\u0098\n\16\f\16\16\16\u009b"+
		"\13\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u00b5\n\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\7\17\u00bd\n\17\f\17\16\17\u00c0\13\17"+
		"\3\20\3\20\3\20\3\20\7\20\u00c6\n\20\f\20\16\20\u00c9\13\20\3\20\3\20"+
		"\3\21\3\21\7\21\u00cf\n\21\f\21\16\21\u00d2\13\21\3\21\3\21\3\21\3\22"+
		"\3\22\7\22\u00d9\n\22\f\22\16\22\u00dc\13\22\3\22\3\22\3\22\3\23\3\23"+
		"\7\23\u00e3\n\23\f\23\16\23\u00e6\13\23\3\23\3\23\3\23\3\24\3\24\7\24"+
		"\u00ed\n\24\f\24\16\24\u00f0\13\24\3\24\3\24\3\24\3\25\3\25\7\25\u00f7"+
		"\n\25\f\25\16\25\u00fa\13\25\3\25\3\25\3\25\3\26\3\26\7\26\u0101\n\26"+
		"\f\26\16\26\u0104\13\26\3\26\3\26\3\26\3\27\3\27\7\27\u010b\n\27\f\27"+
		"\16\27\u010e\13\27\3\27\3\27\3\27\3\30\3\30\7\30\u0115\n\30\f\30\16\30"+
		"\u0118\13\30\3\30\3\30\3\30\3\31\3\31\7\31\u011f\n\31\f\31\16\31\u0122"+
		"\13\31\3\31\3\31\3\31\3\32\3\32\7\32\u0129\n\32\f\32\16\32\u012c\13\32"+
		"\3\32\3\32\3\32\3\33\3\33\7\33\u0133\n\33\f\33\16\33\u0136\13\33\3\33"+
		"\3\33\3\33\3\34\3\34\7\34\u013d\n\34\f\34\16\34\u0140\13\34\3\34\3\34"+
		"\3\34\3\35\3\35\7\35\u0147\n\35\f\35\16\35\u014a\13\35\3\35\3\35\3\35"+
		"\3\36\3\36\7\36\u0151\n\36\f\36\16\36\u0154\13\36\3\36\3\36\3\36\3\36"+
		"\3\37\3\37\7\37\u015c\n\37\f\37\16\37\u015f\13\37\3\37\3\37\3\37\3\37"+
		"\3 \3 \3 \3 \3 \2\3\34!\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*"+
		",.\60\62\64\668:<>\2\4\3\2\4\5\4\2\"\"&&\2\u017e\2A\3\2\2\2\4L\3\2\2\2"+
		"\6T\3\2\2\2\bV\3\2\2\2\n[\3\2\2\2\f]\3\2\2\2\16d\3\2\2\2\20f\3\2\2\2\22"+
		"n\3\2\2\2\24\u0081\3\2\2\2\26\u0085\3\2\2\2\30\u008e\3\2\2\2\32\u0093"+
		"\3\2\2\2\34\u00b4\3\2\2\2\36\u00c1\3\2\2\2 \u00cc\3\2\2\2\"\u00d6\3\2"+
		"\2\2$\u00e0\3\2\2\2&\u00ea\3\2\2\2(\u00f4\3\2\2\2*\u00fe\3\2\2\2,\u0108"+
		"\3\2\2\2.\u0112\3\2\2\2\60\u011c\3\2\2\2\62\u0126\3\2\2\2\64\u0130\3\2"+
		"\2\2\66\u013a\3\2\2\28\u0144\3\2\2\2:\u014e\3\2\2\2<\u0159\3\2\2\2>\u0164"+
		"\3\2\2\2@B\5\4\3\2A@\3\2\2\2AB\3\2\2\2BC\3\2\2\2CG\7\3\2\2DF\5\6\4\2E"+
		"D\3\2\2\2FI\3\2\2\2GE\3\2\2\2GH\3\2\2\2HJ\3\2\2\2IG\3\2\2\2JK\7\2\2\3"+
		"K\3\3\2\2\2LM\t\2\2\2M\5\3\2\2\2NU\5\b\5\2OU\5\26\f\2PU\5\30\r\2QU\5\32"+
		"\16\2RU\5\n\6\2SU\5\f\7\2TN\3\2\2\2TO\3\2\2\2TP\3\2\2\2TQ\3\2\2\2TR\3"+
		"\2\2\2TS\3\2\2\2U\7\3\2\2\2VW\7\6\2\2WY\t\3\2\2XZ\5\30\r\2YX\3\2\2\2Y"+
		"Z\3\2\2\2Z\t\3\2\2\2[\\\7\7\2\2\\\13\3\2\2\2]^\7\b\2\2^\r\3\2\2\2_`\7"+
		"\30\2\2`a\7 \2\2ae\7\31\2\2bc\7\t\2\2ce\7 \2\2d_\3\2\2\2db\3\2\2\2e\17"+
		"\3\2\2\2fg\7\30\2\2gj\7!\2\2hi\7\n\2\2ik\7 \2\2jh\3\2\2\2jk\3\2\2\2kl"+
		"\3\2\2\2lm\7\31\2\2m\21\3\2\2\2no\7\30\2\2or\7 \2\2pq\7\32\2\2qs\7 \2"+
		"\2rp\3\2\2\2rs\3\2\2\2s|\3\2\2\2tu\7\33\2\2ux\7 \2\2vw\7\32\2\2wy\7 \2"+
		"\2xv\3\2\2\2xy\3\2\2\2y{\3\2\2\2zt\3\2\2\2{~\3\2\2\2|z\3\2\2\2|}\3\2\2"+
		"\2}\177\3\2\2\2~|\3\2\2\2\177\u0080\7\31\2\2\u0080\23\3\2\2\2\u0081\u0082"+
		"\7\13\2\2\u0082\u0083\5\34\17\2\u0083\u0084\7\f\2\2\u0084\25\3\2\2\2\u0085"+
		"\u0086\7\t\2\2\u0086\u0088\t\3\2\2\u0087\u0089\5\30\r\2\u0088\u0087\3"+
		"\2\2\2\u0088\u0089\3\2\2\2\u0089\27\3\2\2\2\u008a\u008f\5\16\b\2\u008b"+
		"\u008f\5\22\n\2\u008c\u008f\5\20\t\2\u008d\u008f\7\27\2\2\u008e\u008a"+
		"\3\2\2\2\u008e\u008b\3\2\2\2\u008e\u008c\3\2\2\2\u008e\u008d\3\2\2\2\u008f"+
		"\u0091\3\2\2\2\u0090\u0092\5\24\13\2\u0091\u0090\3\2\2\2\u0091\u0092\3"+
		"\2\2\2\u0092\31\3\2\2\2\u0093\u0094\7\30\2\2\u0094\u0099\7\"\2\2\u0095"+
		"\u0096\7\33\2\2\u0096\u0098\7\"\2\2\u0097\u0095\3\2\2\2\u0098\u009b\3"+
		"\2\2\2\u0099\u0097\3\2\2\2\u0099\u009a\3\2\2\2\u009a\u009c\3\2\2\2\u009b"+
		"\u0099\3\2\2\2\u009c\u009d\7\31\2\2\u009d\33\3\2\2\2\u009e\u009f\b\17"+
		"\1\2\u009f\u00a0\7\35\2\2\u00a0\u00a1\7\r\2\2\u00a1\u00a2\5\34\17\2\u00a2"+
		"\u00a3\7\f\2\2\u00a3\u00b5\3\2\2\2\u00a4\u00b5\5(\25\2\u00a5\u00b5\5*"+
		"\26\2\u00a6\u00b5\5\60\31\2\u00a7\u00b5\5\62\32\2\u00a8\u00b5\58\35\2"+
		"\u00a9\u00b5\5,\27\2\u00aa\u00b5\5.\30\2\u00ab\u00b5\5\64\33\2\u00ac\u00b5"+
		"\5\66\34\2\u00ad\u00b5\5 \21\2\u00ae\u00b5\5\"\22\2\u00af\u00b5\5$\23"+
		"\2\u00b0\u00b5\5&\24\2\u00b1\u00b5\5\36\20\2\u00b2\u00b5\5:\36\2\u00b3"+
		"\u00b5\5<\37\2\u00b4\u009e\3\2\2\2\u00b4\u00a4\3\2\2\2\u00b4\u00a5\3\2"+
		"\2\2\u00b4\u00a6\3\2\2\2\u00b4\u00a7\3\2\2\2\u00b4\u00a8\3\2\2\2\u00b4"+
		"\u00a9\3\2\2\2\u00b4\u00aa\3\2\2\2\u00b4\u00ab\3\2\2\2\u00b4\u00ac\3\2"+
		"\2\2\u00b4\u00ad\3\2\2\2\u00b4\u00ae\3\2\2\2\u00b4\u00af\3\2\2\2\u00b4"+
		"\u00b0\3\2\2\2\u00b4\u00b1\3\2\2\2\u00b4\u00b2\3\2\2\2\u00b4\u00b3\3\2"+
		"\2\2\u00b5\u00be\3\2\2\2\u00b6\u00b7\f\24\2\2\u00b7\u00b8\7\36\2\2\u00b8"+
		"\u00bd\5\34\17\25\u00b9\u00ba\f\23\2\2\u00ba\u00bb\7\37\2\2\u00bb\u00bd"+
		"\5\34\17\24\u00bc\u00b6\3\2\2\2\u00bc\u00b9\3\2\2\2\u00bd\u00c0\3\2\2"+
		"\2\u00be\u00bc\3\2\2\2\u00be\u00bf\3\2\2\2\u00bf\35\3\2\2\2\u00c0\u00be"+
		"\3\2\2\2\u00c1\u00c2\7\16\2\2\u00c2\u00c3\7\r\2\2\u00c3\u00c7\7\17\2\2"+
		"\u00c4\u00c6\5\6\4\2\u00c5\u00c4\3\2\2\2\u00c6\u00c9\3\2\2\2\u00c7\u00c5"+
		"\3\2\2\2\u00c7\u00c8\3\2\2\2\u00c8\u00ca\3\2\2\2\u00c9\u00c7\3\2\2\2\u00ca"+
		"\u00cb\7\f\2\2\u00cb\37\3\2\2\2\u00cc\u00d0\7\17\2\2\u00cd\u00cf\5\6\4"+
		"\2\u00ce\u00cd\3\2\2\2\u00cf\u00d2\3\2\2\2\u00d0\u00ce\3\2\2\2\u00d0\u00d1"+
		"\3\2\2\2\u00d1\u00d3\3\2\2\2\u00d2\u00d0\3\2\2\2\u00d3\u00d4\7\20\2\2"+
		"\u00d4\u00d5\7 \2\2\u00d5!\3\2\2\2\u00d6\u00da\7\17\2\2\u00d7\u00d9\5"+
		"\6\4\2\u00d8\u00d7\3\2\2\2\u00d9\u00dc\3\2\2\2\u00da\u00d8\3\2\2\2\u00da"+
		"\u00db\3\2\2\2\u00db\u00dd\3\2\2\2\u00dc\u00da\3\2\2\2\u00dd\u00de\7\21"+
		"\2\2\u00de\u00df\7 \2\2\u00df#\3\2\2\2\u00e0\u00e4\7\17\2\2\u00e1\u00e3"+
		"\5\6\4\2\u00e2\u00e1\3\2\2\2\u00e3\u00e6\3\2\2\2\u00e4\u00e2\3\2\2\2\u00e4"+
		"\u00e5\3\2\2\2\u00e5\u00e7\3\2\2\2\u00e6\u00e4\3\2\2\2\u00e7\u00e8\7\22"+
		"\2\2\u00e8\u00e9\7 \2\2\u00e9%\3\2\2\2\u00ea\u00ee\7\17\2\2\u00eb\u00ed"+
		"\5\6\4\2\u00ec\u00eb\3\2\2\2\u00ed\u00f0\3\2\2\2\u00ee\u00ec\3\2\2\2\u00ee"+
		"\u00ef\3\2\2\2\u00ef\u00f1\3\2\2\2\u00f0\u00ee\3\2\2\2\u00f1\u00f2\7\23"+
		"\2\2\u00f2\u00f3\7 \2\2\u00f3\'\3\2\2\2\u00f4\u00f8\7\17\2\2\u00f5\u00f7"+
		"\5\6\4\2\u00f6\u00f5\3\2\2\2\u00f7\u00fa\3\2\2\2\u00f8\u00f6\3\2\2\2\u00f8"+
		"\u00f9\3\2\2\2\u00f9\u00fb\3\2\2\2\u00fa\u00f8\3\2\2\2\u00fb\u00fc\7\24"+
		"\2\2\u00fc\u00fd\7 \2\2\u00fd)\3\2\2\2\u00fe\u0102\7\17\2\2\u00ff\u0101"+
		"\5\6\4\2\u0100\u00ff\3\2\2\2\u0101\u0104\3\2\2\2\u0102\u0100\3\2\2\2\u0102"+
		"\u0103\3\2\2\2\u0103\u0105\3\2\2\2\u0104\u0102\3\2\2\2\u0105\u0106\7%"+
		"\2\2\u0106\u0107\7 \2\2\u0107+\3\2\2\2\u0108\u010c\7\17\2\2\u0109\u010b"+
		"\5\6\4\2\u010a\u0109\3\2\2\2\u010b\u010e\3\2\2\2\u010c\u010a\3\2\2\2\u010c"+
		"\u010d\3\2\2\2\u010d\u010f\3\2\2\2\u010e\u010c\3\2\2\2\u010f\u0110\7\24"+
		"\2\2\u0110\u0111\7#\2\2\u0111-\3\2\2\2\u0112\u0116\7\17\2\2\u0113\u0115"+
		"\5\6\4\2\u0114\u0113\3\2\2\2\u0115\u0118\3\2\2\2\u0116\u0114\3\2\2\2\u0116"+
		"\u0117\3\2\2\2\u0117\u0119\3\2\2\2\u0118\u0116\3\2\2\2\u0119\u011a\7%"+
		"\2\2\u011a\u011b\7#\2\2\u011b/\3\2\2\2\u011c\u0120\7\17\2\2\u011d\u011f"+
		"\5\6\4\2\u011e\u011d\3\2\2\2\u011f\u0122\3\2\2\2\u0120\u011e\3\2\2\2\u0120"+
		"\u0121\3\2\2\2\u0121\u0123\3\2\2\2\u0122\u0120\3\2\2\2\u0123\u0124\7\24"+
		"\2\2\u0124\u0125\7\"\2\2\u0125\61\3\2\2\2\u0126\u012a\7\17\2\2\u0127\u0129"+
		"\5\6\4\2\u0128\u0127\3\2\2\2\u0129\u012c\3\2\2\2\u012a\u0128\3\2\2\2\u012a"+
		"\u012b\3\2\2\2\u012b\u012d\3\2\2\2\u012c\u012a\3\2\2\2\u012d\u012e\7%"+
		"\2\2\u012e\u012f\7\"\2\2\u012f\63\3\2\2\2\u0130\u0134\7\17\2\2\u0131\u0133"+
		"\5\6\4\2\u0132\u0131\3\2\2\2\u0133\u0136\3\2\2\2\u0134\u0132\3\2\2\2\u0134"+
		"\u0135\3\2\2\2\u0135\u0137\3\2\2\2\u0136\u0134\3\2\2\2\u0137\u0138\7\24"+
		"\2\2\u0138\u0139\7$\2\2\u0139\65\3\2\2\2\u013a\u013e\7\17\2\2\u013b\u013d"+
		"\5\6\4\2\u013c\u013b\3\2\2\2\u013d\u0140\3\2\2\2\u013e\u013c\3\2\2\2\u013e"+
		"\u013f\3\2\2\2\u013f\u0141\3\2\2\2\u0140\u013e\3\2\2\2\u0141\u0142\7%"+
		"\2\2\u0142\u0143\7$\2\2\u0143\67\3\2\2\2\u0144\u0148\7\17\2\2\u0145\u0147"+
		"\5\6\4\2\u0146\u0145\3\2\2\2\u0147\u014a\3\2\2\2\u0148\u0146\3\2\2\2\u0148"+
		"\u0149\3\2\2\2\u0149\u014b\3\2\2\2\u014a\u0148\3\2\2\2\u014b\u014c\7\25"+
		"\2\2\u014c\u014d\7\"\2\2\u014d9\3\2\2\2\u014e\u0152\7\17\2\2\u014f\u0151"+
		"\5\6\4\2\u0150\u014f\3\2\2\2\u0151\u0154\3\2\2\2\u0152\u0150\3\2\2\2\u0152"+
		"\u0153\3\2\2\2\u0153\u0155\3\2\2\2\u0154\u0152\3\2\2\2\u0155\u0156\5>"+
		" \2\u0156\u0157\7\24\2\2\u0157\u0158\7\"\2\2\u0158;\3\2\2\2\u0159\u015d"+
		"\7\17\2\2\u015a\u015c\5\6\4\2\u015b\u015a\3\2\2\2\u015c\u015f\3\2\2\2"+
		"\u015d\u015b\3\2\2\2\u015d\u015e\3\2\2\2\u015e\u0160\3\2\2\2\u015f\u015d"+
		"\3\2\2\2\u0160\u0161\5> \2\u0161\u0162\7%\2\2\u0162\u0163\7\"\2\2\u0163"+
		"=\3\2\2\2\u0164\u0165\7\t\2\2\u0165\u0166\7&\2\2\u0166\u0167\7\26\2\2"+
		"\u0167?\3\2\2\2\"AGTYdjrx|\u0088\u008e\u0091\u0099\u00b4\u00bc\u00be\u00c7"+
		"\u00d0\u00da\u00e4\u00ee\u00f8\u0102\u010c\u0116\u0120\u012a\u0134\u013e"+
		"\u0148\u0152\u015d";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}