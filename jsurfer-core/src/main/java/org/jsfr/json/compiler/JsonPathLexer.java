// Generated from JsonPath.g4 by ANTLR 4.9.3

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
	static { RuntimeMetaData.checkVersion("4.9.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, ANY_INDEX=19, OPEN_SQ_BRACKET=20, CLOSE_SQ_BRACKET=21, TO=22, 
		COMMA=23, COLON=24, NegationOperator=25, AndOperator=26, OrOperator=27, 
		NUM=28, QUOTED_STRING=29, BOOL=30, NE=31, KEY=32, WS=33;
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
			"BOOL", "NE", "KEY", "INT", "EXP", "ESC", "UNICODE", "HEX", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'$'", "'lax'", "'strict'", "'..'", "'.*'", "'*'", "'.'", "'[?('", 
			"')]'", "'('", "')'", "'@'", "'>'", "'>='", "'<'", "'<='", "'=='", "'like_regex'", 
			"'[*]'", "'['", "']'", "'to'", "','", "':'", "'!'", "'&&'", "'||'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, "ANY_INDEX", "OPEN_SQ_BRACKET", 
			"CLOSE_SQ_BRACKET", "TO", "COMMA", "COLON", "NegationOperator", "AndOperator", 
			"OrOperator", "NUM", "QUOTED_STRING", "BOOL", "NE", "KEY", "WS"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2#\u0101\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\3\2\3\2\3\3\3\3\3\3\3\3\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3\b\3\b\3\t"+
		"\3\t\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17"+
		"\3\17\3\20\3\20\3\21\3\21\3\21\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\25\3\25\3\26\3\26"+
		"\3\27\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\33\3\34\3\34"+
		"\3\34\3\35\5\35\u00a4\n\35\3\35\3\35\3\35\6\35\u00a9\n\35\r\35\16\35\u00aa"+
		"\3\35\5\35\u00ae\n\35\3\35\5\35\u00b1\n\35\3\35\3\35\3\35\3\35\5\35\u00b7"+
		"\n\35\3\35\5\35\u00ba\n\35\3\36\3\36\3\36\3\36\7\36\u00c0\n\36\f\36\16"+
		"\36\u00c3\13\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37"+
		"\5\37\u00d0\n\37\3 \3 \3 \3 \5 \u00d6\n \3!\3!\6!\u00da\n!\r!\16!\u00db"+
		"\3\"\3\"\3\"\7\"\u00e1\n\"\f\"\16\"\u00e4\13\"\5\"\u00e6\n\"\3#\3#\5#"+
		"\u00ea\n#\3#\3#\3$\3$\3$\5$\u00f1\n$\3%\3%\3%\3%\3%\3%\3&\3&\3\'\6\'\u00fc"+
		"\n\'\r\'\16\'\u00fd\3\'\3\'\2\2(\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23"+
		"\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31"+
		"\61\32\63\33\65\34\67\359\36;\37= ?!A\"C\2E\2G\2I\2K\2M#\3\2\13\3\2\62"+
		";\4\2$$^^\f\2\13\f\17\17\"$(,..\60\60<<>B]_~~\3\2\63;\4\2GGgg\4\2--//"+
		"\n\2$$\61\61^^ddhhppttvv\5\2\62;CHch\5\2\13\f\17\17\"\"\2\u010d\2\3\3"+
		"\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2"+
		"\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3"+
		"\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2"+
		"%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61"+
		"\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2"+
		"\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2M\3\2\2\2\3O\3\2\2\2\5Q\3\2\2\2\7U"+
		"\3\2\2\2\t\\\3\2\2\2\13_\3\2\2\2\rb\3\2\2\2\17d\3\2\2\2\21f\3\2\2\2\23"+
		"j\3\2\2\2\25m\3\2\2\2\27o\3\2\2\2\31q\3\2\2\2\33s\3\2\2\2\35u\3\2\2\2"+
		"\37x\3\2\2\2!z\3\2\2\2#}\3\2\2\2%\u0080\3\2\2\2\'\u008b\3\2\2\2)\u008f"+
		"\3\2\2\2+\u0091\3\2\2\2-\u0093\3\2\2\2/\u0096\3\2\2\2\61\u0098\3\2\2\2"+
		"\63\u009a\3\2\2\2\65\u009c\3\2\2\2\67\u009f\3\2\2\29\u00b9\3\2\2\2;\u00bb"+
		"\3\2\2\2=\u00cf\3\2\2\2?\u00d5\3\2\2\2A\u00d9\3\2\2\2C\u00e5\3\2\2\2E"+
		"\u00e7\3\2\2\2G\u00ed\3\2\2\2I\u00f2\3\2\2\2K\u00f8\3\2\2\2M\u00fb\3\2"+
		"\2\2OP\7&\2\2P\4\3\2\2\2QR\7n\2\2RS\7c\2\2ST\7z\2\2T\6\3\2\2\2UV\7u\2"+
		"\2VW\7v\2\2WX\7t\2\2XY\7k\2\2YZ\7e\2\2Z[\7v\2\2[\b\3\2\2\2\\]\7\60\2\2"+
		"]^\7\60\2\2^\n\3\2\2\2_`\7\60\2\2`a\7,\2\2a\f\3\2\2\2bc\7,\2\2c\16\3\2"+
		"\2\2de\7\60\2\2e\20\3\2\2\2fg\7]\2\2gh\7A\2\2hi\7*\2\2i\22\3\2\2\2jk\7"+
		"+\2\2kl\7_\2\2l\24\3\2\2\2mn\7*\2\2n\26\3\2\2\2op\7+\2\2p\30\3\2\2\2q"+
		"r\7B\2\2r\32\3\2\2\2st\7@\2\2t\34\3\2\2\2uv\7@\2\2vw\7?\2\2w\36\3\2\2"+
		"\2xy\7>\2\2y \3\2\2\2z{\7>\2\2{|\7?\2\2|\"\3\2\2\2}~\7?\2\2~\177\7?\2"+
		"\2\177$\3\2\2\2\u0080\u0081\7n\2\2\u0081\u0082\7k\2\2\u0082\u0083\7m\2"+
		"\2\u0083\u0084\7g\2\2\u0084\u0085\7a\2\2\u0085\u0086\7t\2\2\u0086\u0087"+
		"\7g\2\2\u0087\u0088\7i\2\2\u0088\u0089\7g\2\2\u0089\u008a\7z\2\2\u008a"+
		"&\3\2\2\2\u008b\u008c\7]\2\2\u008c\u008d\7,\2\2\u008d\u008e\7_\2\2\u008e"+
		"(\3\2\2\2\u008f\u0090\7]\2\2\u0090*\3\2\2\2\u0091\u0092\7_\2\2\u0092,"+
		"\3\2\2\2\u0093\u0094\7v\2\2\u0094\u0095\7q\2\2\u0095.\3\2\2\2\u0096\u0097"+
		"\7.\2\2\u0097\60\3\2\2\2\u0098\u0099\7<\2\2\u0099\62\3\2\2\2\u009a\u009b"+
		"\7#\2\2\u009b\64\3\2\2\2\u009c\u009d\7(\2\2\u009d\u009e\7(\2\2\u009e\66"+
		"\3\2\2\2\u009f\u00a0\7~\2\2\u00a0\u00a1\7~\2\2\u00a18\3\2\2\2\u00a2\u00a4"+
		"\7/\2\2\u00a3\u00a2\3\2\2\2\u00a3\u00a4\3\2\2\2\u00a4\u00a5\3\2\2\2\u00a5"+
		"\u00a6\5C\"\2\u00a6\u00a8\7\60\2\2\u00a7\u00a9\t\2\2\2\u00a8\u00a7\3\2"+
		"\2\2\u00a9\u00aa\3\2\2\2\u00aa\u00a8\3\2\2\2\u00aa\u00ab\3\2\2\2\u00ab"+
		"\u00ad\3\2\2\2\u00ac\u00ae\5E#\2\u00ad\u00ac\3\2\2\2\u00ad\u00ae\3\2\2"+
		"\2\u00ae\u00ba\3\2\2\2\u00af\u00b1\7/\2\2\u00b0\u00af\3\2\2\2\u00b0\u00b1"+
		"\3\2\2\2\u00b1\u00b2\3\2\2\2\u00b2\u00b3\5C\"\2\u00b3\u00b4\5E#\2\u00b4"+
		"\u00ba\3\2\2\2\u00b5\u00b7\7/\2\2\u00b6\u00b5\3\2\2\2\u00b6\u00b7\3\2"+
		"\2\2\u00b7\u00b8\3\2\2\2\u00b8\u00ba\5C\"\2\u00b9\u00a3\3\2\2\2\u00b9"+
		"\u00b0\3\2\2\2\u00b9\u00b6\3\2\2\2\u00ba:\3\2\2\2\u00bb\u00c1\7$\2\2\u00bc"+
		"\u00c0\n\3\2\2\u00bd\u00be\7^\2\2\u00be\u00c0\13\2\2\2\u00bf\u00bc\3\2"+
		"\2\2\u00bf\u00bd\3\2\2\2\u00c0\u00c3\3\2\2\2\u00c1\u00bf\3\2\2\2\u00c1"+
		"\u00c2\3\2\2\2\u00c2\u00c4\3\2\2\2\u00c3\u00c1\3\2\2\2\u00c4\u00c5\7$"+
		"\2\2\u00c5<\3\2\2\2\u00c6\u00c7\7v\2\2\u00c7\u00c8\7t\2\2\u00c8\u00c9"+
		"\7w\2\2\u00c9\u00d0\7g\2\2\u00ca\u00cb\7h\2\2\u00cb\u00cc\7c\2\2\u00cc"+
		"\u00cd\7n\2\2\u00cd\u00ce\7u\2\2\u00ce\u00d0\7g\2\2\u00cf\u00c6\3\2\2"+
		"\2\u00cf\u00ca\3\2\2\2\u00d0>\3\2\2\2\u00d1\u00d2\7>\2\2\u00d2\u00d6\7"+
		"@\2\2\u00d3\u00d4\7#\2\2\u00d4\u00d6\7?\2\2\u00d5\u00d1\3\2\2\2\u00d5"+
		"\u00d3\3\2\2\2\u00d6@\3\2\2\2\u00d7\u00da\5G$\2\u00d8\u00da\n\4\2\2\u00d9"+
		"\u00d7\3\2\2\2\u00d9\u00d8\3\2\2\2\u00da\u00db\3\2\2\2\u00db\u00d9\3\2"+
		"\2\2\u00db\u00dc\3\2\2\2\u00dcB\3\2\2\2\u00dd\u00e6\7\62\2\2\u00de\u00e2"+
		"\t\5\2\2\u00df\u00e1\t\2\2\2\u00e0\u00df\3\2\2\2\u00e1\u00e4\3\2\2\2\u00e2"+
		"\u00e0\3\2\2\2\u00e2\u00e3\3\2\2\2\u00e3\u00e6\3\2\2\2\u00e4\u00e2\3\2"+
		"\2\2\u00e5\u00dd\3\2\2\2\u00e5\u00de\3\2\2\2\u00e6D\3\2\2\2\u00e7\u00e9"+
		"\t\6\2\2\u00e8\u00ea\t\7\2\2\u00e9\u00e8\3\2\2\2\u00e9\u00ea\3\2\2\2\u00ea"+
		"\u00eb\3\2\2\2\u00eb\u00ec\5C\"\2\u00ecF\3\2\2\2\u00ed\u00f0\7^\2\2\u00ee"+
		"\u00f1\t\b\2\2\u00ef\u00f1\5I%\2\u00f0\u00ee\3\2\2\2\u00f0\u00ef\3\2\2"+
		"\2\u00f1H\3\2\2\2\u00f2\u00f3\7w\2\2\u00f3\u00f4\5K&\2\u00f4\u00f5\5K"+
		"&\2\u00f5\u00f6\5K&\2\u00f6\u00f7\5K&\2\u00f7J\3\2\2\2\u00f8\u00f9\t\t"+
		"\2\2\u00f9L\3\2\2\2\u00fa\u00fc\t\n\2\2\u00fb\u00fa\3\2\2\2\u00fc\u00fd"+
		"\3\2\2\2\u00fd\u00fb\3\2\2\2\u00fd\u00fe\3\2\2\2\u00fe\u00ff\3\2\2\2\u00ff"+
		"\u0100\b\'\2\2\u0100N\3\2\2\2\24\2\u00a3\u00aa\u00ad\u00b0\u00b6\u00b9"+
		"\u00bf\u00c1\u00cf\u00d5\u00d9\u00db\u00e2\u00e5\u00e9\u00f0\u00fd\3\b"+
		"\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}