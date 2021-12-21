// Generated from /home/viliam/work/hazelcast/JsonSurfer/jsurfer-core/src/main/resources/JsonPath.g4 by ANTLR 4.9.2

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
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, ANY_INDEX=19, OPEN_SQ_BRACKET=20, CLOSE_SQ_BRACKET=21, TO=22, 
		COMMA=23, COLON=24, NegationOperator=25, AndOperator=26, OrOperator=27, 
		NUM=28, QUOTED_STRING=29, REGEX=30, BOOL=31, NE=32, KEY=33, WS=34;
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
			"T__17", "ANY_INDEX", "OPEN_SQ_BRACKET", "CLOSE_SQ_BRACKET", "TO", "COMMA", 
			"COLON", "NegationOperator", "AndOperator", "OrOperator", "NUM", "QUOTED_STRING", 
			"REGEX", "BOOL", "NE", "KEY", "INT", "EXP", "ESC", "UNICODE", "HEX", 
			"WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'$'", "'lax'", "'strict'", "'..'", "'.*'", "'*'", "'.'", "'[?('", 
			"')]'", "'('", "')'", "'@'", "'>'", "'>='", "'<'", "'<='", "'=='", "'=~'", 
			"'[*]'", "'['", "']'", "'to'", "','", "':'", "'!'", "'&&'", "'||'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, "ANY_INDEX", "OPEN_SQ_BRACKET", 
			"CLOSE_SQ_BRACKET", "TO", "COMMA", "COLON", "NegationOperator", "AndOperator", 
			"OrOperator", "NUM", "QUOTED_STRING", "REGEX", "BOOL", "NE", "KEY", "WS"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2$\u010b\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\3\2\3\2\3\3\3\3\3\3"+
		"\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3\b\3"+
		"\b\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17"+
		"\3\17\3\17\3\20\3\20\3\21\3\21\3\21\3\22\3\22\3\22\3\23\3\23\3\23\3\24"+
		"\3\24\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\27\3\30\3\30\3\31\3\31"+
		"\3\32\3\32\3\33\3\33\3\33\3\34\3\34\3\34\3\35\5\35\u009e\n\35\3\35\3\35"+
		"\3\35\6\35\u00a3\n\35\r\35\16\35\u00a4\3\35\5\35\u00a8\n\35\3\35\5\35"+
		"\u00ab\n\35\3\35\3\35\3\35\3\35\5\35\u00b1\n\35\3\35\5\35\u00b4\n\35\3"+
		"\36\3\36\3\36\3\36\7\36\u00ba\n\36\f\36\16\36\u00bd\13\36\3\36\3\36\3"+
		"\37\3\37\3\37\3\37\7\37\u00c5\n\37\f\37\16\37\u00c8\13\37\3\37\3\37\7"+
		"\37\u00cc\n\37\f\37\16\37\u00cf\13\37\3 \3 \3 \3 \3 \3 \3 \3 \3 \5 \u00da"+
		"\n \3!\3!\3!\3!\5!\u00e0\n!\3\"\3\"\6\"\u00e4\n\"\r\"\16\"\u00e5\3#\3"+
		"#\3#\7#\u00eb\n#\f#\16#\u00ee\13#\5#\u00f0\n#\3$\3$\5$\u00f4\n$\3$\3$"+
		"\3%\3%\3%\5%\u00fb\n%\3&\3&\3&\3&\3&\3&\3\'\3\'\3(\6(\u0106\n(\r(\16("+
		"\u0107\3(\3(\2\2)\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31"+
		"\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65"+
		"\34\67\359\36;\37= ?!A\"C#E\2G\2I\2K\2M\2O$\3\2\r\3\2\62;\4\2$$^^\4\2"+
		"\61\61^^\t\2WWffkkoouuwwzz\f\2\13\f\17\17\"$(,..\60\60<<>B]_~~\3\2\63"+
		";\4\2GGgg\4\2--//\n\2$$\61\61^^ddhhppttvv\5\2\62;CHch\5\2\13\f\17\17\""+
		"\"\2\u011a\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2"+
		"\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27"+
		"\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2"+
		"\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2"+
		"\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2"+
		"\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2O\3\2\2\2"+
		"\3Q\3\2\2\2\5S\3\2\2\2\7W\3\2\2\2\t^\3\2\2\2\13a\3\2\2\2\rd\3\2\2\2\17"+
		"f\3\2\2\2\21h\3\2\2\2\23l\3\2\2\2\25o\3\2\2\2\27q\3\2\2\2\31s\3\2\2\2"+
		"\33u\3\2\2\2\35w\3\2\2\2\37z\3\2\2\2!|\3\2\2\2#\177\3\2\2\2%\u0082\3\2"+
		"\2\2\'\u0085\3\2\2\2)\u0089\3\2\2\2+\u008b\3\2\2\2-\u008d\3\2\2\2/\u0090"+
		"\3\2\2\2\61\u0092\3\2\2\2\63\u0094\3\2\2\2\65\u0096\3\2\2\2\67\u0099\3"+
		"\2\2\29\u00b3\3\2\2\2;\u00b5\3\2\2\2=\u00c0\3\2\2\2?\u00d9\3\2\2\2A\u00df"+
		"\3\2\2\2C\u00e3\3\2\2\2E\u00ef\3\2\2\2G\u00f1\3\2\2\2I\u00f7\3\2\2\2K"+
		"\u00fc\3\2\2\2M\u0102\3\2\2\2O\u0105\3\2\2\2QR\7&\2\2R\4\3\2\2\2ST\7n"+
		"\2\2TU\7c\2\2UV\7z\2\2V\6\3\2\2\2WX\7u\2\2XY\7v\2\2YZ\7t\2\2Z[\7k\2\2"+
		"[\\\7e\2\2\\]\7v\2\2]\b\3\2\2\2^_\7\60\2\2_`\7\60\2\2`\n\3\2\2\2ab\7\60"+
		"\2\2bc\7,\2\2c\f\3\2\2\2de\7,\2\2e\16\3\2\2\2fg\7\60\2\2g\20\3\2\2\2h"+
		"i\7]\2\2ij\7A\2\2jk\7*\2\2k\22\3\2\2\2lm\7+\2\2mn\7_\2\2n\24\3\2\2\2o"+
		"p\7*\2\2p\26\3\2\2\2qr\7+\2\2r\30\3\2\2\2st\7B\2\2t\32\3\2\2\2uv\7@\2"+
		"\2v\34\3\2\2\2wx\7@\2\2xy\7?\2\2y\36\3\2\2\2z{\7>\2\2{ \3\2\2\2|}\7>\2"+
		"\2}~\7?\2\2~\"\3\2\2\2\177\u0080\7?\2\2\u0080\u0081\7?\2\2\u0081$\3\2"+
		"\2\2\u0082\u0083\7?\2\2\u0083\u0084\7\u0080\2\2\u0084&\3\2\2\2\u0085\u0086"+
		"\7]\2\2\u0086\u0087\7,\2\2\u0087\u0088\7_\2\2\u0088(\3\2\2\2\u0089\u008a"+
		"\7]\2\2\u008a*\3\2\2\2\u008b\u008c\7_\2\2\u008c,\3\2\2\2\u008d\u008e\7"+
		"v\2\2\u008e\u008f\7q\2\2\u008f.\3\2\2\2\u0090\u0091\7.\2\2\u0091\60\3"+
		"\2\2\2\u0092\u0093\7<\2\2\u0093\62\3\2\2\2\u0094\u0095\7#\2\2\u0095\64"+
		"\3\2\2\2\u0096\u0097\7(\2\2\u0097\u0098\7(\2\2\u0098\66\3\2\2\2\u0099"+
		"\u009a\7~\2\2\u009a\u009b\7~\2\2\u009b8\3\2\2\2\u009c\u009e\7/\2\2\u009d"+
		"\u009c\3\2\2\2\u009d\u009e\3\2\2\2\u009e\u009f\3\2\2\2\u009f\u00a0\5E"+
		"#\2\u00a0\u00a2\7\60\2\2\u00a1\u00a3\t\2\2\2\u00a2\u00a1\3\2\2\2\u00a3"+
		"\u00a4\3\2\2\2\u00a4\u00a2\3\2\2\2\u00a4\u00a5\3\2\2\2\u00a5\u00a7\3\2"+
		"\2\2\u00a6\u00a8\5G$\2\u00a7\u00a6\3\2\2\2\u00a7\u00a8\3\2\2\2\u00a8\u00b4"+
		"\3\2\2\2\u00a9\u00ab\7/\2\2\u00aa\u00a9\3\2\2\2\u00aa\u00ab\3\2\2\2\u00ab"+
		"\u00ac\3\2\2\2\u00ac\u00ad\5E#\2\u00ad\u00ae\5G$\2\u00ae\u00b4\3\2\2\2"+
		"\u00af\u00b1\7/\2\2\u00b0\u00af\3\2\2\2\u00b0\u00b1\3\2\2\2\u00b1\u00b2"+
		"\3\2\2\2\u00b2\u00b4\5E#\2\u00b3\u009d\3\2\2\2\u00b3\u00aa\3\2\2\2\u00b3"+
		"\u00b0\3\2\2\2\u00b4:\3\2\2\2\u00b5\u00bb\7$\2\2\u00b6\u00ba\n\3\2\2\u00b7"+
		"\u00b8\7^\2\2\u00b8\u00ba\13\2\2\2\u00b9\u00b6\3\2\2\2\u00b9\u00b7\3\2"+
		"\2\2\u00ba\u00bd\3\2\2\2\u00bb\u00b9\3\2\2\2\u00bb\u00bc\3\2\2\2\u00bc"+
		"\u00be\3\2\2\2\u00bd\u00bb\3\2\2\2\u00be\u00bf\7$\2\2\u00bf<\3\2\2\2\u00c0"+
		"\u00c6\7\61\2\2\u00c1\u00c5\n\4\2\2\u00c2\u00c3\7^\2\2\u00c3\u00c5\13"+
		"\2\2\2\u00c4\u00c1\3\2\2\2\u00c4\u00c2\3\2\2\2\u00c5\u00c8\3\2\2\2\u00c6"+
		"\u00c4\3\2\2\2\u00c6\u00c7\3\2\2\2\u00c7\u00c9\3\2\2\2\u00c8\u00c6\3\2"+
		"\2\2\u00c9\u00cd\7\61\2\2\u00ca\u00cc\t\5\2\2\u00cb\u00ca\3\2\2\2\u00cc"+
		"\u00cf\3\2\2\2\u00cd\u00cb\3\2\2\2\u00cd\u00ce\3\2\2\2\u00ce>\3\2\2\2"+
		"\u00cf\u00cd\3\2\2\2\u00d0\u00d1\7v\2\2\u00d1\u00d2\7t\2\2\u00d2\u00d3"+
		"\7w\2\2\u00d3\u00da\7g\2\2\u00d4\u00d5\7h\2\2\u00d5\u00d6\7c\2\2\u00d6"+
		"\u00d7\7n\2\2\u00d7\u00d8\7u\2\2\u00d8\u00da\7g\2\2\u00d9\u00d0\3\2\2"+
		"\2\u00d9\u00d4\3\2\2\2\u00da@\3\2\2\2\u00db\u00dc\7>\2\2\u00dc\u00e0\7"+
		"@\2\2\u00dd\u00de\7#\2\2\u00de\u00e0\7?\2\2\u00df\u00db\3\2\2\2\u00df"+
		"\u00dd\3\2\2\2\u00e0B\3\2\2\2\u00e1\u00e4\5I%\2\u00e2\u00e4\n\6\2\2\u00e3"+
		"\u00e1\3\2\2\2\u00e3\u00e2\3\2\2\2\u00e4\u00e5\3\2\2\2\u00e5\u00e3\3\2"+
		"\2\2\u00e5\u00e6\3\2\2\2\u00e6D\3\2\2\2\u00e7\u00f0\7\62\2\2\u00e8\u00ec"+
		"\t\7\2\2\u00e9\u00eb\t\2\2\2\u00ea\u00e9\3\2\2\2\u00eb\u00ee\3\2\2\2\u00ec"+
		"\u00ea\3\2\2\2\u00ec\u00ed\3\2\2\2\u00ed\u00f0\3\2\2\2\u00ee\u00ec\3\2"+
		"\2\2\u00ef\u00e7\3\2\2\2\u00ef\u00e8\3\2\2\2\u00f0F\3\2\2\2\u00f1\u00f3"+
		"\t\b\2\2\u00f2\u00f4\t\t\2\2\u00f3\u00f2\3\2\2\2\u00f3\u00f4\3\2\2\2\u00f4"+
		"\u00f5\3\2\2\2\u00f5\u00f6\5E#\2\u00f6H\3\2\2\2\u00f7\u00fa\7^\2\2\u00f8"+
		"\u00fb\t\n\2\2\u00f9\u00fb\5K&\2\u00fa\u00f8\3\2\2\2\u00fa\u00f9\3\2\2"+
		"\2\u00fbJ\3\2\2\2\u00fc\u00fd\7w\2\2\u00fd\u00fe\5M\'\2\u00fe\u00ff\5"+
		"M\'\2\u00ff\u0100\5M\'\2\u0100\u0101\5M\'\2\u0101L\3\2\2\2\u0102\u0103"+
		"\t\13\2\2\u0103N\3\2\2\2\u0104\u0106\t\f\2\2\u0105\u0104\3\2\2\2\u0106"+
		"\u0107\3\2\2\2\u0107\u0105\3\2\2\2\u0107\u0108\3\2\2\2\u0108\u0109\3\2"+
		"\2\2\u0109\u010a\b(\2\2\u010aP\3\2\2\2\27\2\u009d\u00a4\u00a7\u00aa\u00b0"+
		"\u00b3\u00b9\u00bb\u00c4\u00c6\u00cd\u00d9\u00df\u00e3\u00e5\u00ec\u00ef"+
		"\u00f3\u00fa\u0107\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}