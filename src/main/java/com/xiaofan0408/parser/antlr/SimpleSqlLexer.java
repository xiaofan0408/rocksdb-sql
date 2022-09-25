// Generated from E:/code/java4/rocksdb-sql/g4\SqlBase.g4 by ANTLR 4.10.1
package com.xiaofan0408.parser.antlr;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SimpleSqlLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.10.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, SELECT=6, FROM=7, WHERE=8, INSERT=9, 
		INTO=10, VALUES=11, DELETE=12, CREATE=13, COPY=14, DELIMITER=15, CSV=16, 
		HEADER=17, TABLE=18, TABLES=19, SHOW=20, SCHEMA=21, INDEX=22, ON=23, AS=24, 
		OR=25, AND=26, NOT=27, TRUE_=28, FALSE_=29, EQ=30, NEQ=31, NEQJ=32, LT=33, 
		LTE=34, GT=35, GTE=36, PLUS=37, MINUS=38, ASTERISK=39, SLASH=40, PERCENT=41, 
		STRING=42, FLOAT_LITERAL=43, INTEGER_LITERAL=44, IDENTIFIER=45, WS=46;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "SELECT", "FROM", "WHERE", "INSERT", 
			"INTO", "VALUES", "DELETE", "CREATE", "COPY", "DELIMITER", "CSV", "HEADER", 
			"TABLE", "TABLES", "SHOW", "SCHEMA", "INDEX", "ON", "AS", "OR", "AND", 
			"NOT", "TRUE_", "FALSE_", "EQ", "NEQ", "NEQJ", "LT", "LTE", "GT", "GTE", 
			"PLUS", "MINUS", "ASTERISK", "SLASH", "PERCENT", "STRING", "FLOAT_LITERAL", 
			"INTEGER_LITERAL", "IDENTIFIER", "DIGIT", "LETTER", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "'('", "','", "')'", "'.'", "'SELECT'", "'FROM'", "'WHERE'", 
			"'INSERT'", "'INTO'", "'VALUES'", "'DELETE'", "'CREATE'", "'COPY'", "'DELIMITER'", 
			"'CSV'", "'HEADER'", "'TABLE'", "'TABLES'", "'SHOW'", "'SCHEMA'", "'INDEX'", 
			"'ON'", "'AS'", "'OR'", "'AND'", "'NOT'", "'TRUE'", "'FALSE'", null, 
			"'<>'", "'!='", "'<'", null, "'>'", null, "'+'", "'-'", "'*'", "'/'", 
			"'%'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, "SELECT", "FROM", "WHERE", "INSERT", 
			"INTO", "VALUES", "DELETE", "CREATE", "COPY", "DELIMITER", "CSV", "HEADER", 
			"TABLE", "TABLES", "SHOW", "SCHEMA", "INDEX", "ON", "AS", "OR", "AND", 
			"NOT", "TRUE_", "FALSE_", "EQ", "NEQ", "NEQJ", "LT", "LTE", "GT", "GTE", 
			"PLUS", "MINUS", "ASTERISK", "SLASH", "PERCENT", "STRING", "FLOAT_LITERAL", 
			"INTEGER_LITERAL", "IDENTIFIER", "WS"
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


	public SimpleSqlLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "SqlBase.g4"; }

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
		"\u0004\u0000.\u0150\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002"+
		"\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002"+
		"\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002"+
		"\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002"+
		"\u0018\u0007\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002"+
		"\u001b\u0007\u001b\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002"+
		"\u001e\u0007\u001e\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007"+
		"!\u0002\"\u0007\"\u0002#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007"+
		"&\u0002\'\u0007\'\u0002(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007"+
		"+\u0002,\u0007,\u0002-\u0007-\u0002.\u0007.\u0002/\u0007/\u0001\u0000"+
		"\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0003"+
		"\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f"+
		"\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0016"+
		"\u0001\u0016\u0001\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0018"+
		"\u0001\u0018\u0001\u0018\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019"+
		"\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001b\u0001\u001b"+
		"\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001c\u0001\u001c\u0001\u001c"+
		"\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001d\u0001\u001d\u0001\u001d"+
		"\u0003\u001d\u00f7\b\u001d\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001f"+
		"\u0001\u001f\u0001\u001f\u0001 \u0001 \u0001!\u0001!\u0001!\u0001!\u0003"+
		"!\u0105\b!\u0001\"\u0001\"\u0001#\u0001#\u0001#\u0001#\u0003#\u010d\b"+
		"#\u0001$\u0001$\u0001%\u0001%\u0001&\u0001&\u0001\'\u0001\'\u0001(\u0001"+
		"(\u0001)\u0001)\u0001)\u0001)\u0005)\u011d\b)\n)\f)\u0120\t)\u0001)\u0001"+
		")\u0001)\u0001)\u0001)\u0005)\u0127\b)\n)\f)\u012a\t)\u0001)\u0003)\u012d"+
		"\b)\u0001*\u0004*\u0130\b*\u000b*\f*\u0131\u0001*\u0001*\u0004*\u0136"+
		"\b*\u000b*\f*\u0137\u0001+\u0004+\u013b\b+\u000b+\f+\u013c\u0001,\u0001"+
		",\u0001,\u0004,\u0142\b,\u000b,\f,\u0143\u0001-\u0001-\u0001.\u0001.\u0001"+
		"/\u0004/\u014b\b/\u000b/\f/\u014c\u0001/\u0001/\u0000\u00000\u0001\u0001"+
		"\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u000f"+
		"\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u001b\u000e\u001d\u000f"+
		"\u001f\u0010!\u0011#\u0012%\u0013\'\u0014)\u0015+\u0016-\u0017/\u0018"+
		"1\u00193\u001a5\u001b7\u001c9\u001d;\u001e=\u001f? A!C\"E#G$I%K&M\'O("+
		"Q)S*U+W,Y-[\u0000]\u0000_.\u0001\u0000\u0005\u0002\u0000\'\'\\\\\u0002"+
		"\u0000\"\"\\\\\u0001\u000009\u0001\u0000AZ\u0003\u0000\t\n\r\r  \u015c"+
		"\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000"+
		"\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000"+
		"\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000"+
		"\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011"+
		"\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015"+
		"\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000\u0000\u0000\u0000\u0019"+
		"\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000\u0000\u0000\u0000\u001d"+
		"\u0001\u0000\u0000\u0000\u0000\u001f\u0001\u0000\u0000\u0000\u0000!\u0001"+
		"\u0000\u0000\u0000\u0000#\u0001\u0000\u0000\u0000\u0000%\u0001\u0000\u0000"+
		"\u0000\u0000\'\u0001\u0000\u0000\u0000\u0000)\u0001\u0000\u0000\u0000"+
		"\u0000+\u0001\u0000\u0000\u0000\u0000-\u0001\u0000\u0000\u0000\u0000/"+
		"\u0001\u0000\u0000\u0000\u00001\u0001\u0000\u0000\u0000\u00003\u0001\u0000"+
		"\u0000\u0000\u00005\u0001\u0000\u0000\u0000\u00007\u0001\u0000\u0000\u0000"+
		"\u00009\u0001\u0000\u0000\u0000\u0000;\u0001\u0000\u0000\u0000\u0000="+
		"\u0001\u0000\u0000\u0000\u0000?\u0001\u0000\u0000\u0000\u0000A\u0001\u0000"+
		"\u0000\u0000\u0000C\u0001\u0000\u0000\u0000\u0000E\u0001\u0000\u0000\u0000"+
		"\u0000G\u0001\u0000\u0000\u0000\u0000I\u0001\u0000\u0000\u0000\u0000K"+
		"\u0001\u0000\u0000\u0000\u0000M\u0001\u0000\u0000\u0000\u0000O\u0001\u0000"+
		"\u0000\u0000\u0000Q\u0001\u0000\u0000\u0000\u0000S\u0001\u0000\u0000\u0000"+
		"\u0000U\u0001\u0000\u0000\u0000\u0000W\u0001\u0000\u0000\u0000\u0000Y"+
		"\u0001\u0000\u0000\u0000\u0000_\u0001\u0000\u0000\u0000\u0001a\u0001\u0000"+
		"\u0000\u0000\u0003c\u0001\u0000\u0000\u0000\u0005e\u0001\u0000\u0000\u0000"+
		"\u0007g\u0001\u0000\u0000\u0000\ti\u0001\u0000\u0000\u0000\u000bk\u0001"+
		"\u0000\u0000\u0000\rr\u0001\u0000\u0000\u0000\u000fw\u0001\u0000\u0000"+
		"\u0000\u0011}\u0001\u0000\u0000\u0000\u0013\u0084\u0001\u0000\u0000\u0000"+
		"\u0015\u0089\u0001\u0000\u0000\u0000\u0017\u0090\u0001\u0000\u0000\u0000"+
		"\u0019\u0097\u0001\u0000\u0000\u0000\u001b\u009e\u0001\u0000\u0000\u0000"+
		"\u001d\u00a3\u0001\u0000\u0000\u0000\u001f\u00ad\u0001\u0000\u0000\u0000"+
		"!\u00b1\u0001\u0000\u0000\u0000#\u00b8\u0001\u0000\u0000\u0000%\u00be"+
		"\u0001\u0000\u0000\u0000\'\u00c5\u0001\u0000\u0000\u0000)\u00ca\u0001"+
		"\u0000\u0000\u0000+\u00d1\u0001\u0000\u0000\u0000-\u00d7\u0001\u0000\u0000"+
		"\u0000/\u00da\u0001\u0000\u0000\u00001\u00dd\u0001\u0000\u0000\u00003"+
		"\u00e0\u0001\u0000\u0000\u00005\u00e4\u0001\u0000\u0000\u00007\u00e8\u0001"+
		"\u0000\u0000\u00009\u00ed\u0001\u0000\u0000\u0000;\u00f6\u0001\u0000\u0000"+
		"\u0000=\u00f8\u0001\u0000\u0000\u0000?\u00fb\u0001\u0000\u0000\u0000A"+
		"\u00fe\u0001\u0000\u0000\u0000C\u0104\u0001\u0000\u0000\u0000E\u0106\u0001"+
		"\u0000\u0000\u0000G\u010c\u0001\u0000\u0000\u0000I\u010e\u0001\u0000\u0000"+
		"\u0000K\u0110\u0001\u0000\u0000\u0000M\u0112\u0001\u0000\u0000\u0000O"+
		"\u0114\u0001\u0000\u0000\u0000Q\u0116\u0001\u0000\u0000\u0000S\u012c\u0001"+
		"\u0000\u0000\u0000U\u012f\u0001\u0000\u0000\u0000W\u013a\u0001\u0000\u0000"+
		"\u0000Y\u0141\u0001\u0000\u0000\u0000[\u0145\u0001\u0000\u0000\u0000]"+
		"\u0147\u0001\u0000\u0000\u0000_\u014a\u0001\u0000\u0000\u0000ab\u0005"+
		";\u0000\u0000b\u0002\u0001\u0000\u0000\u0000cd\u0005(\u0000\u0000d\u0004"+
		"\u0001\u0000\u0000\u0000ef\u0005,\u0000\u0000f\u0006\u0001\u0000\u0000"+
		"\u0000gh\u0005)\u0000\u0000h\b\u0001\u0000\u0000\u0000ij\u0005.\u0000"+
		"\u0000j\n\u0001\u0000\u0000\u0000kl\u0005S\u0000\u0000lm\u0005E\u0000"+
		"\u0000mn\u0005L\u0000\u0000no\u0005E\u0000\u0000op\u0005C\u0000\u0000"+
		"pq\u0005T\u0000\u0000q\f\u0001\u0000\u0000\u0000rs\u0005F\u0000\u0000"+
		"st\u0005R\u0000\u0000tu\u0005O\u0000\u0000uv\u0005M\u0000\u0000v\u000e"+
		"\u0001\u0000\u0000\u0000wx\u0005W\u0000\u0000xy\u0005H\u0000\u0000yz\u0005"+
		"E\u0000\u0000z{\u0005R\u0000\u0000{|\u0005E\u0000\u0000|\u0010\u0001\u0000"+
		"\u0000\u0000}~\u0005I\u0000\u0000~\u007f\u0005N\u0000\u0000\u007f\u0080"+
		"\u0005S\u0000\u0000\u0080\u0081\u0005E\u0000\u0000\u0081\u0082\u0005R"+
		"\u0000\u0000\u0082\u0083\u0005T\u0000\u0000\u0083\u0012\u0001\u0000\u0000"+
		"\u0000\u0084\u0085\u0005I\u0000\u0000\u0085\u0086\u0005N\u0000\u0000\u0086"+
		"\u0087\u0005T\u0000\u0000\u0087\u0088\u0005O\u0000\u0000\u0088\u0014\u0001"+
		"\u0000\u0000\u0000\u0089\u008a\u0005V\u0000\u0000\u008a\u008b\u0005A\u0000"+
		"\u0000\u008b\u008c\u0005L\u0000\u0000\u008c\u008d\u0005U\u0000\u0000\u008d"+
		"\u008e\u0005E\u0000\u0000\u008e\u008f\u0005S\u0000\u0000\u008f\u0016\u0001"+
		"\u0000\u0000\u0000\u0090\u0091\u0005D\u0000\u0000\u0091\u0092\u0005E\u0000"+
		"\u0000\u0092\u0093\u0005L\u0000\u0000\u0093\u0094\u0005E\u0000\u0000\u0094"+
		"\u0095\u0005T\u0000\u0000\u0095\u0096\u0005E\u0000\u0000\u0096\u0018\u0001"+
		"\u0000\u0000\u0000\u0097\u0098\u0005C\u0000\u0000\u0098\u0099\u0005R\u0000"+
		"\u0000\u0099\u009a\u0005E\u0000\u0000\u009a\u009b\u0005A\u0000\u0000\u009b"+
		"\u009c\u0005T\u0000\u0000\u009c\u009d\u0005E\u0000\u0000\u009d\u001a\u0001"+
		"\u0000\u0000\u0000\u009e\u009f\u0005C\u0000\u0000\u009f\u00a0\u0005O\u0000"+
		"\u0000\u00a0\u00a1\u0005P\u0000\u0000\u00a1\u00a2\u0005Y\u0000\u0000\u00a2"+
		"\u001c\u0001\u0000\u0000\u0000\u00a3\u00a4\u0005D\u0000\u0000\u00a4\u00a5"+
		"\u0005E\u0000\u0000\u00a5\u00a6\u0005L\u0000\u0000\u00a6\u00a7\u0005I"+
		"\u0000\u0000\u00a7\u00a8\u0005M\u0000\u0000\u00a8\u00a9\u0005I\u0000\u0000"+
		"\u00a9\u00aa\u0005T\u0000\u0000\u00aa\u00ab\u0005E\u0000\u0000\u00ab\u00ac"+
		"\u0005R\u0000\u0000\u00ac\u001e\u0001\u0000\u0000\u0000\u00ad\u00ae\u0005"+
		"C\u0000\u0000\u00ae\u00af\u0005S\u0000\u0000\u00af\u00b0\u0005V\u0000"+
		"\u0000\u00b0 \u0001\u0000\u0000\u0000\u00b1\u00b2\u0005H\u0000\u0000\u00b2"+
		"\u00b3\u0005E\u0000\u0000\u00b3\u00b4\u0005A\u0000\u0000\u00b4\u00b5\u0005"+
		"D\u0000\u0000\u00b5\u00b6\u0005E\u0000\u0000\u00b6\u00b7\u0005R\u0000"+
		"\u0000\u00b7\"\u0001\u0000\u0000\u0000\u00b8\u00b9\u0005T\u0000\u0000"+
		"\u00b9\u00ba\u0005A\u0000\u0000\u00ba\u00bb\u0005B\u0000\u0000\u00bb\u00bc"+
		"\u0005L\u0000\u0000\u00bc\u00bd\u0005E\u0000\u0000\u00bd$\u0001\u0000"+
		"\u0000\u0000\u00be\u00bf\u0005T\u0000\u0000\u00bf\u00c0\u0005A\u0000\u0000"+
		"\u00c0\u00c1\u0005B\u0000\u0000\u00c1\u00c2\u0005L\u0000\u0000\u00c2\u00c3"+
		"\u0005E\u0000\u0000\u00c3\u00c4\u0005S\u0000\u0000\u00c4&\u0001\u0000"+
		"\u0000\u0000\u00c5\u00c6\u0005S\u0000\u0000\u00c6\u00c7\u0005H\u0000\u0000"+
		"\u00c7\u00c8\u0005O\u0000\u0000\u00c8\u00c9\u0005W\u0000\u0000\u00c9("+
		"\u0001\u0000\u0000\u0000\u00ca\u00cb\u0005S\u0000\u0000\u00cb\u00cc\u0005"+
		"C\u0000\u0000\u00cc\u00cd\u0005H\u0000\u0000\u00cd\u00ce\u0005E\u0000"+
		"\u0000\u00ce\u00cf\u0005M\u0000\u0000\u00cf\u00d0\u0005A\u0000\u0000\u00d0"+
		"*\u0001\u0000\u0000\u0000\u00d1\u00d2\u0005I\u0000\u0000\u00d2\u00d3\u0005"+
		"N\u0000\u0000\u00d3\u00d4\u0005D\u0000\u0000\u00d4\u00d5\u0005E\u0000"+
		"\u0000\u00d5\u00d6\u0005X\u0000\u0000\u00d6,\u0001\u0000\u0000\u0000\u00d7"+
		"\u00d8\u0005O\u0000\u0000\u00d8\u00d9\u0005N\u0000\u0000\u00d9.\u0001"+
		"\u0000\u0000\u0000\u00da\u00db\u0005A\u0000\u0000\u00db\u00dc\u0005S\u0000"+
		"\u0000\u00dc0\u0001\u0000\u0000\u0000\u00dd\u00de\u0005O\u0000\u0000\u00de"+
		"\u00df\u0005R\u0000\u0000\u00df2\u0001\u0000\u0000\u0000\u00e0\u00e1\u0005"+
		"A\u0000\u0000\u00e1\u00e2\u0005N\u0000\u0000\u00e2\u00e3\u0005D\u0000"+
		"\u0000\u00e34\u0001\u0000\u0000\u0000\u00e4\u00e5\u0005N\u0000\u0000\u00e5"+
		"\u00e6\u0005O\u0000\u0000\u00e6\u00e7\u0005T\u0000\u0000\u00e76\u0001"+
		"\u0000\u0000\u0000\u00e8\u00e9\u0005T\u0000\u0000\u00e9\u00ea\u0005R\u0000"+
		"\u0000\u00ea\u00eb\u0005U\u0000\u0000\u00eb\u00ec\u0005E\u0000\u0000\u00ec"+
		"8\u0001\u0000\u0000\u0000\u00ed\u00ee\u0005F\u0000\u0000\u00ee\u00ef\u0005"+
		"A\u0000\u0000\u00ef\u00f0\u0005L\u0000\u0000\u00f0\u00f1\u0005S\u0000"+
		"\u0000\u00f1\u00f2\u0005E\u0000\u0000\u00f2:\u0001\u0000\u0000\u0000\u00f3"+
		"\u00f7\u0005=\u0000\u0000\u00f4\u00f5\u0005=\u0000\u0000\u00f5\u00f7\u0005"+
		"=\u0000\u0000\u00f6\u00f3\u0001\u0000\u0000\u0000\u00f6\u00f4\u0001\u0000"+
		"\u0000\u0000\u00f7<\u0001\u0000\u0000\u0000\u00f8\u00f9\u0005<\u0000\u0000"+
		"\u00f9\u00fa\u0005>\u0000\u0000\u00fa>\u0001\u0000\u0000\u0000\u00fb\u00fc"+
		"\u0005!\u0000\u0000\u00fc\u00fd\u0005=\u0000\u0000\u00fd@\u0001\u0000"+
		"\u0000\u0000\u00fe\u00ff\u0005<\u0000\u0000\u00ffB\u0001\u0000\u0000\u0000"+
		"\u0100\u0101\u0005<\u0000\u0000\u0101\u0105\u0005=\u0000\u0000\u0102\u0103"+
		"\u0005!\u0000\u0000\u0103\u0105\u0005>\u0000\u0000\u0104\u0100\u0001\u0000"+
		"\u0000\u0000\u0104\u0102\u0001\u0000\u0000\u0000\u0105D\u0001\u0000\u0000"+
		"\u0000\u0106\u0107\u0005>\u0000\u0000\u0107F\u0001\u0000\u0000\u0000\u0108"+
		"\u0109\u0005>\u0000\u0000\u0109\u010d\u0005=\u0000\u0000\u010a\u010b\u0005"+
		"!\u0000\u0000\u010b\u010d\u0005<\u0000\u0000\u010c\u0108\u0001\u0000\u0000"+
		"\u0000\u010c\u010a\u0001\u0000\u0000\u0000\u010dH\u0001\u0000\u0000\u0000"+
		"\u010e\u010f\u0005+\u0000\u0000\u010fJ\u0001\u0000\u0000\u0000\u0110\u0111"+
		"\u0005-\u0000\u0000\u0111L\u0001\u0000\u0000\u0000\u0112\u0113\u0005*"+
		"\u0000\u0000\u0113N\u0001\u0000\u0000\u0000\u0114\u0115\u0005/\u0000\u0000"+
		"\u0115P\u0001\u0000\u0000\u0000\u0116\u0117\u0005%\u0000\u0000\u0117R"+
		"\u0001\u0000\u0000\u0000\u0118\u011e\u0005\'\u0000\u0000\u0119\u011d\b"+
		"\u0000\u0000\u0000\u011a\u011b\u0005\\\u0000\u0000\u011b\u011d\t\u0000"+
		"\u0000\u0000\u011c\u0119\u0001\u0000\u0000\u0000\u011c\u011a\u0001\u0000"+
		"\u0000\u0000\u011d\u0120\u0001\u0000\u0000\u0000\u011e\u011c\u0001\u0000"+
		"\u0000\u0000\u011e\u011f\u0001\u0000\u0000\u0000\u011f\u0121\u0001\u0000"+
		"\u0000\u0000\u0120\u011e\u0001\u0000\u0000\u0000\u0121\u012d\u0005\'\u0000"+
		"\u0000\u0122\u0128\u0005\"\u0000\u0000\u0123\u0127\b\u0001\u0000\u0000"+
		"\u0124\u0125\u0005\\\u0000\u0000\u0125\u0127\t\u0000\u0000\u0000\u0126"+
		"\u0123\u0001\u0000\u0000\u0000\u0126\u0124\u0001\u0000\u0000\u0000\u0127"+
		"\u012a\u0001\u0000\u0000\u0000\u0128\u0126\u0001\u0000\u0000\u0000\u0128"+
		"\u0129\u0001\u0000\u0000\u0000\u0129\u012b\u0001\u0000\u0000\u0000\u012a"+
		"\u0128\u0001\u0000\u0000\u0000\u012b\u012d\u0005\"\u0000\u0000\u012c\u0118"+
		"\u0001\u0000\u0000\u0000\u012c\u0122\u0001\u0000\u0000\u0000\u012dT\u0001"+
		"\u0000\u0000\u0000\u012e\u0130\u0003[-\u0000\u012f\u012e\u0001\u0000\u0000"+
		"\u0000\u0130\u0131\u0001\u0000\u0000\u0000\u0131\u012f\u0001\u0000\u0000"+
		"\u0000\u0131\u0132\u0001\u0000\u0000\u0000\u0132\u0133\u0001\u0000\u0000"+
		"\u0000\u0133\u0135\u0005.\u0000\u0000\u0134\u0136\u0003[-\u0000\u0135"+
		"\u0134\u0001\u0000\u0000\u0000\u0136\u0137\u0001\u0000\u0000\u0000\u0137"+
		"\u0135\u0001\u0000\u0000\u0000\u0137\u0138\u0001\u0000\u0000\u0000\u0138"+
		"V\u0001\u0000\u0000\u0000\u0139\u013b\u0003[-\u0000\u013a\u0139\u0001"+
		"\u0000\u0000\u0000\u013b\u013c\u0001\u0000\u0000\u0000\u013c\u013a\u0001"+
		"\u0000\u0000\u0000\u013c\u013d\u0001\u0000\u0000\u0000\u013dX\u0001\u0000"+
		"\u0000\u0000\u013e\u0142\u0003].\u0000\u013f\u0142\u0003[-\u0000\u0140"+
		"\u0142\u0005_\u0000\u0000\u0141\u013e\u0001\u0000\u0000\u0000\u0141\u013f"+
		"\u0001\u0000\u0000\u0000\u0141\u0140\u0001\u0000\u0000\u0000\u0142\u0143"+
		"\u0001\u0000\u0000\u0000\u0143\u0141\u0001\u0000\u0000\u0000\u0143\u0144"+
		"\u0001\u0000\u0000\u0000\u0144Z\u0001\u0000\u0000\u0000\u0145\u0146\u0007"+
		"\u0002\u0000\u0000\u0146\\\u0001\u0000\u0000\u0000\u0147\u0148\u0007\u0003"+
		"\u0000\u0000\u0148^\u0001\u0000\u0000\u0000\u0149\u014b\u0007\u0004\u0000"+
		"\u0000\u014a\u0149\u0001\u0000\u0000\u0000\u014b\u014c\u0001\u0000\u0000"+
		"\u0000\u014c\u014a\u0001\u0000\u0000\u0000\u014c\u014d\u0001\u0000\u0000"+
		"\u0000\u014d\u014e\u0001\u0000\u0000\u0000\u014e\u014f\u0006/\u0000\u0000"+
		"\u014f`\u0001\u0000\u0000\u0000\u000f\u0000\u00f6\u0104\u010c\u011c\u011e"+
		"\u0126\u0128\u012c\u0131\u0137\u013c\u0141\u0143\u014c\u0001\u0000\u0001"+
		"\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}