// Generated from JsonPath.g4 by ANTLR 4.9.1

package org.jsfr.json.compiler;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class JsonPathLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		OPEN_SQ_BRACKET=18, CLOSE_SQ_BRACKET=19, TO=20, COMMA=21, COLON=22, NegationOperator=23, 
		AndOperator=24, OrOperator=25, NUM=26, QUOTED_STRING=27, REGEX=28, BOOL=29, 
		NE=30, KEY=31, WS=32;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
			"OPEN_SQ_BRACKET", "CLOSE_SQ_BRACKET", "TO", "COMMA", "COLON", "NegationOperator", 
			"AndOperator", "OrOperator", "NUM", "QUOTED_STRING", "REGEX", "BOOL", 
			"NE", "KEY", "INT", "EXP", "ESC", "UNICODE", "HEX", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'$'", "'..'", "'.*'", "'[*]'", "'*'", "'.'", "'[?('", "')]'", 
			"'('", "')'", "'@'", "'>'", "'>='", "'<'", "'<='", "'=='", "'=~'", "'['", 
			"']'", "'to'", "','", "':'", "'!'", "'&&'", "'||'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, "OPEN_SQ_BRACKET", "CLOSE_SQ_BRACKET", 
			"TO", "COMMA", "COLON", "NegationOperator", "AndOperator", "OrOperator", 
			"NUM", "QUOTED_STRING", "REGEX", "BOOL", "NE", "KEY", "WS"
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


	public JsonPathLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "JsonPath.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\"\u0107\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\3\2\3\2\3\3\3\3\3\3\3\4\3\4\3\4\3"+
		"\5\3\5\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3\13"+
		"\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\16\3\17\3\17\3\20\3\20\3\20\3\21\3\21"+
		"\3\21\3\22\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\25\3\26\3\26\3\27"+
		"\3\27\3\30\3\30\3\31\3\31\3\31\3\32\3\32\3\32\3\33\5\33\u008f\n\33\3\33"+
		"\3\33\3\33\6\33\u0094\n\33\r\33\16\33\u0095\3\33\5\33\u0099\n\33\3\33"+
		"\5\33\u009c\n\33\3\33\3\33\3\33\3\33\5\33\u00a2\n\33\3\33\5\33\u00a5\n"+
		"\33\3\34\3\34\3\34\3\34\7\34\u00ab\n\34\f\34\16\34\u00ae\13\34\3\34\3"+
		"\34\3\34\3\34\3\34\7\34\u00b5\n\34\f\34\16\34\u00b8\13\34\3\34\5\34\u00bb"+
		"\n\34\3\35\3\35\3\35\3\35\7\35\u00c1\n\35\f\35\16\35\u00c4\13\35\3\35"+
		"\3\35\7\35\u00c8\n\35\f\35\16\35\u00cb\13\35\3\36\3\36\3\36\3\36\3\36"+
		"\3\36\3\36\3\36\3\36\5\36\u00d6\n\36\3\37\3\37\3\37\3\37\5\37\u00dc\n"+
		"\37\3 \3 \6 \u00e0\n \r \16 \u00e1\3!\3!\3!\7!\u00e7\n!\f!\16!\u00ea\13"+
		"!\5!\u00ec\n!\3\"\3\"\5\"\u00f0\n\"\3\"\3\"\3#\3#\3#\5#\u00f7\n#\3$\3"+
		"$\3$\3$\3$\3$\3%\3%\3&\6&\u0102\n&\r&\16&\u0103\3&\3&\2\2\'\3\3\5\4\7"+
		"\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22"+
		"#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\2C"+
		"\2E\2G\2I\2K\"\3\2\16\3\2\62;\4\2))^^\4\2$$^^\4\2\61\61^^\t\2WWffkkoo"+
		"uuwwzz\f\2\13\f\17\17\"$(,..\60\60<<>B]_~~\3\2\63;\4\2GGgg\4\2--//\n\2"+
		"$$\61\61^^ddhhppttvv\5\2\62;CHch\5\2\13\f\17\17\"\"\2\u0119\2\3\3\2\2"+
		"\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3"+
		"\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2"+
		"\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2"+
		"\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2"+
		"\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3"+
		"\2\2\2\2?\3\2\2\2\2K\3\2\2\2\3M\3\2\2\2\5O\3\2\2\2\7R\3\2\2\2\tU\3\2\2"+
		"\2\13Y\3\2\2\2\r[\3\2\2\2\17]\3\2\2\2\21a\3\2\2\2\23d\3\2\2\2\25f\3\2"+
		"\2\2\27h\3\2\2\2\31j\3\2\2\2\33l\3\2\2\2\35o\3\2\2\2\37q\3\2\2\2!t\3\2"+
		"\2\2#w\3\2\2\2%z\3\2\2\2\'|\3\2\2\2)~\3\2\2\2+\u0081\3\2\2\2-\u0083\3"+
		"\2\2\2/\u0085\3\2\2\2\61\u0087\3\2\2\2\63\u008a\3\2\2\2\65\u00a4\3\2\2"+
		"\2\67\u00ba\3\2\2\29\u00bc\3\2\2\2;\u00d5\3\2\2\2=\u00db\3\2\2\2?\u00df"+
		"\3\2\2\2A\u00eb\3\2\2\2C\u00ed\3\2\2\2E\u00f3\3\2\2\2G\u00f8\3\2\2\2I"+
		"\u00fe\3\2\2\2K\u0101\3\2\2\2MN\7&\2\2N\4\3\2\2\2OP\7\60\2\2PQ\7\60\2"+
		"\2Q\6\3\2\2\2RS\7\60\2\2ST\7,\2\2T\b\3\2\2\2UV\7]\2\2VW\7,\2\2WX\7_\2"+
		"\2X\n\3\2\2\2YZ\7,\2\2Z\f\3\2\2\2[\\\7\60\2\2\\\16\3\2\2\2]^\7]\2\2^_"+
		"\7A\2\2_`\7*\2\2`\20\3\2\2\2ab\7+\2\2bc\7_\2\2c\22\3\2\2\2de\7*\2\2e\24"+
		"\3\2\2\2fg\7+\2\2g\26\3\2\2\2hi\7B\2\2i\30\3\2\2\2jk\7@\2\2k\32\3\2\2"+
		"\2lm\7@\2\2mn\7?\2\2n\34\3\2\2\2op\7>\2\2p\36\3\2\2\2qr\7>\2\2rs\7?\2"+
		"\2s \3\2\2\2tu\7?\2\2uv\7?\2\2v\"\3\2\2\2wx\7?\2\2xy\7\u0080\2\2y$\3\2"+
		"\2\2z{\7]\2\2{&\3\2\2\2|}\7_\2\2}(\3\2\2\2~\177\7v\2\2\177\u0080\7q\2"+
		"\2\u0080*\3\2\2\2\u0081\u0082\7.\2\2\u0082,\3\2\2\2\u0083\u0084\7<\2\2"+
		"\u0084.\3\2\2\2\u0085\u0086\7#\2\2\u0086\60\3\2\2\2\u0087\u0088\7(\2\2"+
		"\u0088\u0089\7(\2\2\u0089\62\3\2\2\2\u008a\u008b\7~\2\2\u008b\u008c\7"+
		"~\2\2\u008c\64\3\2\2\2\u008d\u008f\7/\2\2\u008e\u008d\3\2\2\2\u008e\u008f"+
		"\3\2\2\2\u008f\u0090\3\2\2\2\u0090\u0091\5A!\2\u0091\u0093\7\60\2\2\u0092"+
		"\u0094\t\2\2\2\u0093\u0092\3\2\2\2\u0094\u0095\3\2\2\2\u0095\u0093\3\2"+
		"\2\2\u0095\u0096\3\2\2\2\u0096\u0098\3\2\2\2\u0097\u0099\5C\"\2\u0098"+
		"\u0097\3\2\2\2\u0098\u0099\3\2\2\2\u0099\u00a5\3\2\2\2\u009a\u009c\7/"+
		"\2\2\u009b\u009a\3\2\2\2\u009b\u009c\3\2\2\2\u009c\u009d\3\2\2\2\u009d"+
		"\u009e\5A!\2\u009e\u009f\5C\"\2\u009f\u00a5\3\2\2\2\u00a0\u00a2\7/\2\2"+
		"\u00a1\u00a0\3\2\2\2\u00a1\u00a2\3\2\2\2\u00a2\u00a3\3\2\2\2\u00a3\u00a5"+
		"\5A!\2\u00a4\u008e\3\2\2\2\u00a4\u009b\3\2\2\2\u00a4\u00a1\3\2\2\2\u00a5"+
		"\66\3\2\2\2\u00a6\u00ac\7)\2\2\u00a7\u00ab\n\3\2\2\u00a8\u00a9\7^\2\2"+
		"\u00a9\u00ab\13\2\2\2\u00aa\u00a7\3\2\2\2\u00aa\u00a8\3\2\2\2\u00ab\u00ae"+
		"\3\2\2\2\u00ac\u00aa\3\2\2\2\u00ac\u00ad\3\2\2\2\u00ad\u00af\3\2\2\2\u00ae"+
		"\u00ac\3\2\2\2\u00af\u00bb\7)\2\2\u00b0\u00b6\7$\2\2\u00b1\u00b5\n\4\2"+
		"\2\u00b2\u00b3\7^\2\2\u00b3\u00b5\13\2\2\2\u00b4\u00b1\3\2\2\2\u00b4\u00b2"+
		"\3\2\2\2\u00b5\u00b8\3\2\2\2\u00b6\u00b4\3\2\2\2\u00b6\u00b7\3\2\2\2\u00b7"+
		"\u00b9\3\2\2\2\u00b8\u00b6\3\2\2\2\u00b9\u00bb\7$\2\2\u00ba\u00a6\3\2"+
		"\2\2\u00ba\u00b0\3\2\2\2\u00bb8\3\2\2\2\u00bc\u00c2\7\61\2\2\u00bd\u00c1"+
		"\n\5\2\2\u00be\u00bf\7^\2\2\u00bf\u00c1\13\2\2\2\u00c0\u00bd\3\2\2\2\u00c0"+
		"\u00be\3\2\2\2\u00c1\u00c4\3\2\2\2\u00c2\u00c0\3\2\2\2\u00c2\u00c3\3\2"+
		"\2\2\u00c3\u00c5\3\2\2\2\u00c4\u00c2\3\2\2\2\u00c5\u00c9\7\61\2\2\u00c6"+
		"\u00c8\t\6\2\2\u00c7\u00c6\3\2\2\2\u00c8\u00cb\3\2\2\2\u00c9\u00c7\3\2"+
		"\2\2\u00c9\u00ca\3\2\2\2\u00ca:\3\2\2\2\u00cb\u00c9\3\2\2\2\u00cc\u00cd"+
		"\7v\2\2\u00cd\u00ce\7t\2\2\u00ce\u00cf\7w\2\2\u00cf\u00d6\7g\2\2\u00d0"+
		"\u00d1\7h\2\2\u00d1\u00d2\7c\2\2\u00d2\u00d3\7n\2\2\u00d3\u00d4\7u\2\2"+
		"\u00d4\u00d6\7g\2\2\u00d5\u00cc\3\2\2\2\u00d5\u00d0\3\2\2\2\u00d6<\3\2"+
		"\2\2\u00d7\u00d8\7>\2\2\u00d8\u00dc\7@\2\2\u00d9\u00da\7#\2\2\u00da\u00dc"+
		"\7?\2\2\u00db\u00d7\3\2\2\2\u00db\u00d9\3\2\2\2\u00dc>\3\2\2\2\u00dd\u00e0"+
		"\5E#\2\u00de\u00e0\n\7\2\2\u00df\u00dd\3\2\2\2\u00df\u00de\3\2\2\2\u00e0"+
		"\u00e1\3\2\2\2\u00e1\u00df\3\2\2\2\u00e1\u00e2\3\2\2\2\u00e2@\3\2\2\2"+
		"\u00e3\u00ec\7\62\2\2\u00e4\u00e8\t\b\2\2\u00e5\u00e7\t\2\2\2\u00e6\u00e5"+
		"\3\2\2\2\u00e7\u00ea\3\2\2\2\u00e8\u00e6\3\2\2\2\u00e8\u00e9\3\2\2\2\u00e9"+
		"\u00ec\3\2\2\2\u00ea\u00e8\3\2\2\2\u00eb\u00e3\3\2\2\2\u00eb\u00e4\3\2"+
		"\2\2\u00ecB\3\2\2\2\u00ed\u00ef\t\t\2\2\u00ee\u00f0\t\n\2\2\u00ef\u00ee"+
		"\3\2\2\2\u00ef\u00f0\3\2\2\2\u00f0\u00f1\3\2\2\2\u00f1\u00f2\5A!\2\u00f2"+
		"D\3\2\2\2\u00f3\u00f6\7^\2\2\u00f4\u00f7\t\13\2\2\u00f5\u00f7\5G$\2\u00f6"+
		"\u00f4\3\2\2\2\u00f6\u00f5\3\2\2\2\u00f7F\3\2\2\2\u00f8\u00f9\7w\2\2\u00f9"+
		"\u00fa\5I%\2\u00fa\u00fb\5I%\2\u00fb\u00fc\5I%\2\u00fc\u00fd\5I%\2\u00fd"+
		"H\3\2\2\2\u00fe\u00ff\t\f\2\2\u00ffJ\3\2\2\2\u0100\u0102\t\r\2\2\u0101"+
		"\u0100\3\2\2\2\u0102\u0103\3\2\2\2\u0103\u0101\3\2\2\2\u0103\u0104\3\2"+
		"\2\2\u0104\u0105\3\2\2\2\u0105\u0106\b&\2\2\u0106L\3\2\2\2\32\2\u008e"+
		"\u0095\u0098\u009b\u00a1\u00a4\u00aa\u00ac\u00b4\u00b6\u00ba\u00c0\u00c2"+
		"\u00c9\u00d5\u00db\u00df\u00e1\u00e8\u00eb\u00ef\u00f6\u0103\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}