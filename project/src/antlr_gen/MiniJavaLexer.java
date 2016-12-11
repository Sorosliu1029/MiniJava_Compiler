// Generated from MiniJava.g4 by ANTLR 4.5.3
package antlr_gen;

import recognition_exceptions.*;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MiniJavaLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, K_INT_ARRAY=37, K_INT=38, 
		K_BOOLEAN=39, ID=40, INT=41, LINECOMMENT=42, BLOCKCOMMENT=43, WS=44;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
		"T__17", "T__18", "T__19", "T__20", "T__21", "T__22", "T__23", "T__24", 
		"T__25", "T__26", "T__27", "T__28", "T__29", "T__30", "T__31", "T__32", 
		"T__33", "T__34", "T__35", "K_INT_ARRAY", "K_INT", "K_BOOLEAN", "ID", 
		"LETTER", "DIGIT", "INT", "LINECOMMENT", "BLOCKCOMMENT", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'package'", "';'", "'import'", "'.'", "'*'", "'class'", "'{'", 
		"'public'", "'static'", "'void'", "'main'", "'('", "'String'", "'['", 
		"']'", "')'", "'}'", "'extends'", "'return'", "','", "'int[]'", "'if'", 
		"'else'", "'while'", "'System.out.println'", "'='", "'&&'", "'<'", "'+'", 
		"'-'", "'length'", "'true'", "'false'", "'this'", "'new'", "'!'", null, 
		"'int'", "'boolean'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, "K_INT_ARRAY", "K_INT", "K_BOOLEAN", "ID", "INT", "LINECOMMENT", 
		"BLOCKCOMMENT", "WS"
	};
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


	public MiniJavaLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "MiniJava.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 39:
			ID_action((RuleContext)_localctx, actionIndex);
			break;
		}
	}
	private void ID_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0:
			System.err.println("[Lexical Error]:\tIdentifier cannot start with number: " + getText());
			break;
		}
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2.\u0177\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13"+
		"\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3"+
		"\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3"+
		"\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\26\3\26\3"+
		"\26\3\26\3\26\3\26\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3"+
		"\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3"+
		"\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\34\3\34\3\34\3"+
		"\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3 \3 \3 \3 \3 \3!\3!\3!\3!\3!\3\"\3"+
		"\"\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3$\3$\3$\3$\3%\3%\3&\3&\3&\3&\3&\3&"+
		"\3&\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3(\3(\3(\3(\3)\3)\3)\3)\7)\u011d\n)\f"+
		")\16)\u0120\13)\3)\3)\3)\3)\7)\u0126\n)\f)\16)\u0129\13)\3)\3)\6)\u012d"+
		"\n)\r)\16)\u012e\3)\3)\5)\u0133\n)\3*\3*\3+\3+\3,\5,\u013a\n,\3,\6,\u013d"+
		"\n,\r,\16,\u013e\3-\3-\3-\3-\7-\u0145\n-\f-\16-\u0148\13-\3-\5-\u014b"+
		"\n-\3-\3-\3-\3-\3.\3.\3.\3.\3.\5.\u0156\n.\3.\3.\3.\3.\3.\7.\u015d\n."+
		"\f.\16.\u0160\13.\3.\5.\u0163\n.\3.\7.\u0166\n.\f.\16.\u0169\13.\3.\3"+
		".\3.\3.\3.\3.\3/\6/\u0172\n/\r/\16/\u0173\3/\3/\5\u0146\u015e\u0167\2"+
		"\60\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35"+
		"\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36"+
		";\37= ?!A\"C#E$G%I&K\'M(O)Q*S\2U\2W+Y,[-].\3\2\5\4\2C\\c|\3\2\62;\5\2"+
		"\13\f\17\17\"\"\u0186\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2"+
		"\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25"+
		"\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2"+
		"\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2"+
		"\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3"+
		"\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2"+
		"\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2"+
		"Q\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\3_\3\2\2\2\5g\3"+
		"\2\2\2\7i\3\2\2\2\tp\3\2\2\2\13r\3\2\2\2\rt\3\2\2\2\17z\3\2\2\2\21|\3"+
		"\2\2\2\23\u0083\3\2\2\2\25\u008a\3\2\2\2\27\u008f\3\2\2\2\31\u0094\3\2"+
		"\2\2\33\u0096\3\2\2\2\35\u009d\3\2\2\2\37\u009f\3\2\2\2!\u00a1\3\2\2\2"+
		"#\u00a3\3\2\2\2%\u00a5\3\2\2\2\'\u00ad\3\2\2\2)\u00b4\3\2\2\2+\u00b6\3"+
		"\2\2\2-\u00bc\3\2\2\2/\u00bf\3\2\2\2\61\u00c4\3\2\2\2\63\u00ca\3\2\2\2"+
		"\65\u00dd\3\2\2\2\67\u00df\3\2\2\29\u00e2\3\2\2\2;\u00e4\3\2\2\2=\u00e6"+
		"\3\2\2\2?\u00e8\3\2\2\2A\u00ef\3\2\2\2C\u00f4\3\2\2\2E\u00fa\3\2\2\2G"+
		"\u00ff\3\2\2\2I\u0103\3\2\2\2K\u0105\3\2\2\2M\u010c\3\2\2\2O\u0110\3\2"+
		"\2\2Q\u0132\3\2\2\2S\u0134\3\2\2\2U\u0136\3\2\2\2W\u0139\3\2\2\2Y\u0140"+
		"\3\2\2\2[\u0150\3\2\2\2]\u0171\3\2\2\2_`\7r\2\2`a\7c\2\2ab\7e\2\2bc\7"+
		"m\2\2cd\7c\2\2de\7i\2\2ef\7g\2\2f\4\3\2\2\2gh\7=\2\2h\6\3\2\2\2ij\7k\2"+
		"\2jk\7o\2\2kl\7r\2\2lm\7q\2\2mn\7t\2\2no\7v\2\2o\b\3\2\2\2pq\7\60\2\2"+
		"q\n\3\2\2\2rs\7,\2\2s\f\3\2\2\2tu\7e\2\2uv\7n\2\2vw\7c\2\2wx\7u\2\2xy"+
		"\7u\2\2y\16\3\2\2\2z{\7}\2\2{\20\3\2\2\2|}\7r\2\2}~\7w\2\2~\177\7d\2\2"+
		"\177\u0080\7n\2\2\u0080\u0081\7k\2\2\u0081\u0082\7e\2\2\u0082\22\3\2\2"+
		"\2\u0083\u0084\7u\2\2\u0084\u0085\7v\2\2\u0085\u0086\7c\2\2\u0086\u0087"+
		"\7v\2\2\u0087\u0088\7k\2\2\u0088\u0089\7e\2\2\u0089\24\3\2\2\2\u008a\u008b"+
		"\7x\2\2\u008b\u008c\7q\2\2\u008c\u008d\7k\2\2\u008d\u008e\7f\2\2\u008e"+
		"\26\3\2\2\2\u008f\u0090\7o\2\2\u0090\u0091\7c\2\2\u0091\u0092\7k\2\2\u0092"+
		"\u0093\7p\2\2\u0093\30\3\2\2\2\u0094\u0095\7*\2\2\u0095\32\3\2\2\2\u0096"+
		"\u0097\7U\2\2\u0097\u0098\7v\2\2\u0098\u0099\7t\2\2\u0099\u009a\7k\2\2"+
		"\u009a\u009b\7p\2\2\u009b\u009c\7i\2\2\u009c\34\3\2\2\2\u009d\u009e\7"+
		"]\2\2\u009e\36\3\2\2\2\u009f\u00a0\7_\2\2\u00a0 \3\2\2\2\u00a1\u00a2\7"+
		"+\2\2\u00a2\"\3\2\2\2\u00a3\u00a4\7\177\2\2\u00a4$\3\2\2\2\u00a5\u00a6"+
		"\7g\2\2\u00a6\u00a7\7z\2\2\u00a7\u00a8\7v\2\2\u00a8\u00a9\7g\2\2\u00a9"+
		"\u00aa\7p\2\2\u00aa\u00ab\7f\2\2\u00ab\u00ac\7u\2\2\u00ac&\3\2\2\2\u00ad"+
		"\u00ae\7t\2\2\u00ae\u00af\7g\2\2\u00af\u00b0\7v\2\2\u00b0\u00b1\7w\2\2"+
		"\u00b1\u00b2\7t\2\2\u00b2\u00b3\7p\2\2\u00b3(\3\2\2\2\u00b4\u00b5\7.\2"+
		"\2\u00b5*\3\2\2\2\u00b6\u00b7\7k\2\2\u00b7\u00b8\7p\2\2\u00b8\u00b9\7"+
		"v\2\2\u00b9\u00ba\7]\2\2\u00ba\u00bb\7_\2\2\u00bb,\3\2\2\2\u00bc\u00bd"+
		"\7k\2\2\u00bd\u00be\7h\2\2\u00be.\3\2\2\2\u00bf\u00c0\7g\2\2\u00c0\u00c1"+
		"\7n\2\2\u00c1\u00c2\7u\2\2\u00c2\u00c3\7g\2\2\u00c3\60\3\2\2\2\u00c4\u00c5"+
		"\7y\2\2\u00c5\u00c6\7j\2\2\u00c6\u00c7\7k\2\2\u00c7\u00c8\7n\2\2\u00c8"+
		"\u00c9\7g\2\2\u00c9\62\3\2\2\2\u00ca\u00cb\7U\2\2\u00cb\u00cc\7{\2\2\u00cc"+
		"\u00cd\7u\2\2\u00cd\u00ce\7v\2\2\u00ce\u00cf\7g\2\2\u00cf\u00d0\7o\2\2"+
		"\u00d0\u00d1\7\60\2\2\u00d1\u00d2\7q\2\2\u00d2\u00d3\7w\2\2\u00d3\u00d4"+
		"\7v\2\2\u00d4\u00d5\7\60\2\2\u00d5\u00d6\7r\2\2\u00d6\u00d7\7t\2\2\u00d7"+
		"\u00d8\7k\2\2\u00d8\u00d9\7p\2\2\u00d9\u00da\7v\2\2\u00da\u00db\7n\2\2"+
		"\u00db\u00dc\7p\2\2\u00dc\64\3\2\2\2\u00dd\u00de\7?\2\2\u00de\66\3\2\2"+
		"\2\u00df\u00e0\7(\2\2\u00e0\u00e1\7(\2\2\u00e18\3\2\2\2\u00e2\u00e3\7"+
		">\2\2\u00e3:\3\2\2\2\u00e4\u00e5\7-\2\2\u00e5<\3\2\2\2\u00e6\u00e7\7/"+
		"\2\2\u00e7>\3\2\2\2\u00e8\u00e9\7n\2\2\u00e9\u00ea\7g\2\2\u00ea\u00eb"+
		"\7p\2\2\u00eb\u00ec\7i\2\2\u00ec\u00ed\7v\2\2\u00ed\u00ee\7j\2\2\u00ee"+
		"@\3\2\2\2\u00ef\u00f0\7v\2\2\u00f0\u00f1\7t\2\2\u00f1\u00f2\7w\2\2\u00f2"+
		"\u00f3\7g\2\2\u00f3B\3\2\2\2\u00f4\u00f5\7h\2\2\u00f5\u00f6\7c\2\2\u00f6"+
		"\u00f7\7n\2\2\u00f7\u00f8\7u\2\2\u00f8\u00f9\7g\2\2\u00f9D\3\2\2\2\u00fa"+
		"\u00fb\7v\2\2\u00fb\u00fc\7j\2\2\u00fc\u00fd\7k\2\2\u00fd\u00fe\7u\2\2"+
		"\u00feF\3\2\2\2\u00ff\u0100\7p\2\2\u0100\u0101\7g\2\2\u0101\u0102\7y\2"+
		"\2\u0102H\3\2\2\2\u0103\u0104\7#\2\2\u0104J\3\2\2\2\u0105\u0106\7k\2\2"+
		"\u0106\u0107\7p\2\2\u0107\u0108\7v\2\2\u0108\u0109\3\2\2\2\u0109\u010a"+
		"\7]\2\2\u010a\u010b\7_\2\2\u010bL\3\2\2\2\u010c\u010d\7k\2\2\u010d\u010e"+
		"\7p\2\2\u010e\u010f\7v\2\2\u010fN\3\2\2\2\u0110\u0111\7d\2\2\u0111\u0112"+
		"\7q\2\2\u0112\u0113\7q\2\2\u0113\u0114\7n\2\2\u0114\u0115\7g\2\2\u0115"+
		"\u0116\7c\2\2\u0116\u0117\7p\2\2\u0117P\3\2\2\2\u0118\u011e\5S*\2\u0119"+
		"\u011d\5S*\2\u011a\u011d\5U+\2\u011b\u011d\7a\2\2\u011c\u0119\3\2\2\2"+
		"\u011c\u011a\3\2\2\2\u011c\u011b\3\2\2\2\u011d\u0120\3\2\2\2\u011e\u011c"+
		"\3\2\2\2\u011e\u011f\3\2\2\2\u011f\u0133\3\2\2\2\u0120\u011e\3\2\2\2\u0121"+
		"\u0127\5U+\2\u0122\u0126\5S*\2\u0123\u0126\5U+\2\u0124\u0126\7a\2\2\u0125"+
		"\u0122\3\2\2\2\u0125\u0123\3\2\2\2\u0125\u0124\3\2\2\2\u0126\u0129\3\2"+
		"\2\2\u0127\u0125\3\2\2\2\u0127\u0128\3\2\2\2\u0128\u012c\3\2\2\2\u0129"+
		"\u0127\3\2\2\2\u012a\u012d\5S*\2\u012b\u012d\7a\2\2\u012c\u012a\3\2\2"+
		"\2\u012c\u012b\3\2\2\2\u012d\u012e\3\2\2\2\u012e\u012c\3\2\2\2\u012e\u012f"+
		"\3\2\2\2\u012f\u0130\3\2\2\2\u0130\u0131\b)\2\2\u0131\u0133\3\2\2\2\u0132"+
		"\u0118\3\2\2\2\u0132\u0121\3\2\2\2\u0133R\3\2\2\2\u0134\u0135\t\2\2\2"+
		"\u0135T\3\2\2\2\u0136\u0137\t\3\2\2\u0137V\3\2\2\2\u0138\u013a\7/\2\2"+
		"\u0139\u0138\3\2\2\2\u0139\u013a\3\2\2\2\u013a\u013c\3\2\2\2\u013b\u013d"+
		"\t\3\2\2\u013c\u013b\3\2\2\2\u013d\u013e\3\2\2\2\u013e\u013c\3\2\2\2\u013e"+
		"\u013f\3\2\2\2\u013fX\3\2\2\2\u0140\u0141\7\61\2\2\u0141\u0142\7\61\2"+
		"\2\u0142\u0146\3\2\2\2\u0143\u0145\13\2\2\2\u0144\u0143\3\2\2\2\u0145"+
		"\u0148\3\2\2\2\u0146\u0147\3\2\2\2\u0146\u0144\3\2\2\2\u0147\u014a\3\2"+
		"\2\2\u0148\u0146\3\2\2\2\u0149\u014b\7\17\2\2\u014a\u0149\3\2\2\2\u014a"+
		"\u014b\3\2\2\2\u014b\u014c\3\2\2\2\u014c\u014d\7\f\2\2\u014d\u014e\3\2"+
		"\2\2\u014e\u014f\b-\3\2\u014fZ\3\2\2\2\u0150\u0151\7\61\2\2\u0151\u0152"+
		"\7,\2\2\u0152\u0153\7,\2\2\u0153\u0155\3\2\2\2\u0154\u0156\7\17\2\2\u0155"+
		"\u0154\3\2\2\2\u0155\u0156\3\2\2\2\u0156\u0157\3\2\2\2\u0157\u0167\7\f"+
		"\2\2\u0158\u0159\7\"\2\2\u0159\u015a\7,\2\2\u015a\u015e\3\2\2\2\u015b"+
		"\u015d\13\2\2\2\u015c\u015b\3\2\2\2\u015d\u0160\3\2\2\2\u015e\u015f\3"+
		"\2\2\2\u015e\u015c\3\2\2\2\u015f\u0162\3\2\2\2\u0160\u015e\3\2\2\2\u0161"+
		"\u0163\7\17\2\2\u0162\u0161\3\2\2\2\u0162\u0163\3\2\2\2\u0163\u0164\3"+
		"\2\2\2\u0164\u0166\7\f\2\2\u0165\u0158\3\2\2\2\u0166\u0169\3\2\2\2\u0167"+
		"\u0168\3\2\2\2\u0167\u0165\3\2\2\2\u0168\u016a\3\2\2\2\u0169\u0167\3\2"+
		"\2\2\u016a\u016b\7\"\2\2\u016b\u016c\7,\2\2\u016c\u016d\7\61\2\2\u016d"+
		"\u016e\3\2\2\2\u016e\u016f\b.\3\2\u016f\\\3\2\2\2\u0170\u0172\t\4\2\2"+
		"\u0171\u0170\3\2\2\2\u0172\u0173\3\2\2\2\u0173\u0171\3\2\2\2\u0173\u0174"+
		"\3\2\2\2\u0174\u0175\3\2\2\2\u0175\u0176\b/\3\2\u0176^\3\2\2\2\23\2\u011c"+
		"\u011e\u0125\u0127\u012c\u012e\u0132\u0139\u013e\u0146\u014a\u0155\u015e"+
		"\u0162\u0167\u0173\4\3)\2\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}