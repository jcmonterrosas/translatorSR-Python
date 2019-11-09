// Generated from c:\translatorSR-Python\grammar\SLLanguage.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SLLanguageLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, ID=7, ESP=8, LINE_COMMENT=9, 
		GLOBAL=10, END=11, IMPORT=12, RESOURCE=13, INT=14, VAR=15, IF=16, FI=17, 
		ELSE=18, EXTEND=19, BODY=20, IN=21, NI=22, CALL=23, FA=24, AF=25, LBRACKET=26, 
		RBRACKET=27, INITIAL=28, CONST=29, RETURNS=30, RETURN=31, TO=32, DOWNTO=33, 
		FINAL=34, OP=35, DO=36, OD=37, PROC=38, CO=39, OC=40, CAP=41, SEND=42, 
		DESTROY=43, BEGIN=44, RECEIVE=45, CREATE=46, OPTYPE=47, BY=48, SUCHTHAT=49, 
		TYPE=50, NULL=51, BOOL=52, VAL=53, RES=54, REF=55, EXIT=56, NEXT=57, FILE=58, 
		PRIVATE=59, OR=60, INDEX=61, WRITE=62, READ=63, MOD=64, STOP=65, PROCEDURE=66, 
		AND=67, REAL=68, ON=69, ROW=70, TRUE=71, SENDER=72, LEFT=73, UP=74, ABORT=75, 
		REPLY=76, PROCESS=77, CHAR=78, STRING=79, FALSE=80, LOW=81, HIGH=82, NEW=83, 
		ENUM=84, ANY=85, REC=86, UNION=87, VM=88, XOR=89, SKP=90, FORWARD=91, 
		V=92, P=93, EJECUTA=94, NUM=95, SEPARA=96, LBRACE=97, RBRACE=98, ASIGNACION=99, 
		EQUAL=100, SWAP=101, INCREMENTO=102, DECREMENTO=103, DESPLAZAR_IZQ=104, 
		DESPLAZAR_DER=105, AUG=106, OPERADOR_ARITMETICO=107, OPERADOR_COMPARACION=108, 
		CADENA=109;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "ID", "ESP", "LINE_COMMENT", 
		"GLOBAL", "END", "IMPORT", "RESOURCE", "INT", "VAR", "IF", "FI", "ELSE", 
		"EXTEND", "BODY", "IN", "NI", "CALL", "FA", "AF", "LBRACKET", "RBRACKET", 
		"INITIAL", "CONST", "RETURNS", "RETURN", "TO", "DOWNTO", "FINAL", "OP", 
		"DO", "OD", "PROC", "CO", "OC", "CAP", "SEND", "DESTROY", "BEGIN", "RECEIVE", 
		"CREATE", "OPTYPE", "BY", "SUCHTHAT", "TYPE", "NULL", "BOOL", "VAL", "RES", 
		"REF", "EXIT", "NEXT", "FILE", "PRIVATE", "OR", "INDEX", "WRITE", "READ", 
		"MOD", "STOP", "PROCEDURE", "AND", "REAL", "ON", "ROW", "TRUE", "SENDER", 
		"LEFT", "UP", "ABORT", "REPLY", "PROCESS", "CHAR", "STRING", "FALSE", 
		"LOW", "HIGH", "NEW", "ENUM", "ANY", "REC", "UNION", "VM", "XOR", "SKP", 
		"FORWARD", "V", "P", "EJECUTA", "NUM", "SEPARA", "LBRACE", "RBRACE", "ASIGNACION", 
		"EQUAL", "SWAP", "INCREMENTO", "DECREMENTO", "DESPLAZAR_IZQ", "DESPLAZAR_DER", 
		"AUG", "OPERADOR_ARITMETICO", "OPERADOR_COMPARACION", "CADENA"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "':'", "'&'", "';'", "','", "'!'", "'|'", null, null, null, "'global'", 
		"'end'", "'import'", "'resource'", "'int'", "'var'", "'if'", "'fi'", "'else'", 
		"'extend'", "'body'", "'in'", "'ni'", "'call'", "'fa'", "'af'", "'('", 
		"')'", "'inital'", "'const'", "'returns'", "'return'", "'to'", "'downto'", 
		"'final'", "'op'", "'do'", "'od'", "'proc'", "'co'", "'oc'", "'cap'", 
		"'send'", "'destroy'", "'begin'", "'receive'", "'create'", "'optype'", 
		"'by'", "'st'", "'type'", "'null'", "'bool'", "'val'", "'res'", "'ref'", 
		"'exit'", "'next'", "'file'", "'private'", "'or'", "'index'", "'write'", 
		"'read'", "'mod'", "'stop'", "'procedure'", "'and'", "'real'", "'on'", 
		"'row'", "'true'", "'sender'", "'left'", "'up'", "'abort'", "'reply'", 
		"'process'", "'char'", "'string'", "'false'", "'low'", "'high'", "'new'", 
		"'enum'", "'any'", "'rec'", "'union'", "'vm'", "'xor'", "'skip'", "'forward'", 
		"'V'", "'P'", "'->'", null, "'[]'", "'{'", "'}'", "':='", "'='", "':=:'", 
		"'++'", "'--'", "'<<'", "'>>'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, "ID", "ESP", "LINE_COMMENT", 
		"GLOBAL", "END", "IMPORT", "RESOURCE", "INT", "VAR", "IF", "FI", "ELSE", 
		"EXTEND", "BODY", "IN", "NI", "CALL", "FA", "AF", "LBRACKET", "RBRACKET", 
		"INITIAL", "CONST", "RETURNS", "RETURN", "TO", "DOWNTO", "FINAL", "OP", 
		"DO", "OD", "PROC", "CO", "OC", "CAP", "SEND", "DESTROY", "BEGIN", "RECEIVE", 
		"CREATE", "OPTYPE", "BY", "SUCHTHAT", "TYPE", "NULL", "BOOL", "VAL", "RES", 
		"REF", "EXIT", "NEXT", "FILE", "PRIVATE", "OR", "INDEX", "WRITE", "READ", 
		"MOD", "STOP", "PROCEDURE", "AND", "REAL", "ON", "ROW", "TRUE", "SENDER", 
		"LEFT", "UP", "ABORT", "REPLY", "PROCESS", "CHAR", "STRING", "FALSE", 
		"LOW", "HIGH", "NEW", "ENUM", "ANY", "REC", "UNION", "VM", "XOR", "SKP", 
		"FORWARD", "V", "P", "EJECUTA", "NUM", "SEPARA", "LBRACE", "RBRACE", "ASIGNACION", 
		"EQUAL", "SWAP", "INCREMENTO", "DECREMENTO", "DESPLAZAR_IZQ", "DESPLAZAR_DER", 
		"AUG", "OPERADOR_ARITMETICO", "OPERADOR_COMPARACION", "CADENA"
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


	public SLLanguageLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "SLLanguage.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2o\u031c\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]\t]\4^\t^\4_\t_\4"+
		"`\t`\4a\ta\4b\tb\4c\tc\4d\td\4e\te\4f\tf\4g\tg\4h\th\4i\ti\4j\tj\4k\t"+
		"k\4l\tl\4m\tm\4n\tn\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3"+
		"\b\3\b\7\b\u00ec\n\b\f\b\16\b\u00ef\13\b\3\t\6\t\u00f2\n\t\r\t\16\t\u00f3"+
		"\3\t\3\t\3\n\3\n\7\n\u00fa\n\n\f\n\16\n\u00fd\13\n\3\n\3\n\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\20\3"+
		"\20\3\20\3\20\3\21\3\21\3\21\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3"+
		"\24\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3"+
		"\26\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\32\3\32\3"+
		"\32\3\33\3\33\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3"+
		"\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3"+
		" \3 \3 \3 \3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3#\3$\3"+
		"$\3$\3%\3%\3%\3&\3&\3&\3\'\3\'\3\'\3\'\3\'\3(\3(\3(\3)\3)\3)\3*\3*\3*"+
		"\3*\3+\3+\3+\3+\3+\3,\3,\3,\3,\3,\3,\3,\3,\3-\3-\3-\3-\3-\3-\3.\3.\3."+
		"\3.\3.\3.\3.\3.\3/\3/\3/\3/\3/\3/\3/\3\60\3\60\3\60\3\60\3\60\3\60\3\60"+
		"\3\61\3\61\3\61\3\62\3\62\3\62\3\63\3\63\3\63\3\63\3\63\3\64\3\64\3\64"+
		"\3\64\3\64\3\65\3\65\3\65\3\65\3\65\3\66\3\66\3\66\3\66\3\67\3\67\3\67"+
		"\3\67\38\38\38\38\39\39\39\39\39\3:\3:\3:\3:\3:\3;\3;\3;\3;\3;\3<\3<\3"+
		"<\3<\3<\3<\3<\3<\3=\3=\3=\3>\3>\3>\3>\3>\3>\3?\3?\3?\3?\3?\3?\3@\3@\3"+
		"@\3@\3@\3A\3A\3A\3A\3B\3B\3B\3B\3B\3C\3C\3C\3C\3C\3C\3C\3C\3C\3C\3D\3"+
		"D\3D\3D\3E\3E\3E\3E\3E\3F\3F\3F\3G\3G\3G\3G\3H\3H\3H\3H\3H\3I\3I\3I\3"+
		"I\3I\3I\3I\3J\3J\3J\3J\3J\3K\3K\3K\3L\3L\3L\3L\3L\3L\3M\3M\3M\3M\3M\3"+
		"M\3N\3N\3N\3N\3N\3N\3N\3N\3O\3O\3O\3O\3O\3P\3P\3P\3P\3P\3P\3P\3Q\3Q\3"+
		"Q\3Q\3Q\3Q\3R\3R\3R\3R\3S\3S\3S\3S\3S\3T\3T\3T\3T\3U\3U\3U\3U\3U\3V\3"+
		"V\3V\3V\3W\3W\3W\3W\3X\3X\3X\3X\3X\3X\3Y\3Y\3Y\3Z\3Z\3Z\3Z\3[\3[\3[\3"+
		"[\3[\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3]\3]\3^\3^\3_\3_\3_\3`\5`\u02a2"+
		"\n`\3`\6`\u02a5\n`\r`\16`\u02a6\3`\5`\u02aa\n`\3`\6`\u02ad\n`\r`\16`\u02ae"+
		"\3`\3`\3`\6`\u02b4\n`\r`\16`\u02b5\5`\u02b8\n`\5`\u02ba\n`\3a\3a\3a\3"+
		"b\3b\3c\3c\3d\3d\3d\3e\3e\3f\3f\3f\3f\3g\3g\3g\3h\3h\3h\3i\3i\3i\3j\3"+
		"j\3j\3k\3k\3k\3k\3k\3k\3k\3k\3k\3k\3k\3k\3k\3k\3k\3k\3k\3k\3k\3k\3k\3"+
		"k\5k\u02ee\nk\3l\3l\3l\5l\u02f3\nl\3m\3m\3m\3m\3m\3m\3m\5m\u02fc\nm\3"+
		"n\3n\7n\u0300\nn\fn\16n\u0303\13n\3n\3n\3n\3n\3n\3n\7n\u030b\nn\fn\16"+
		"n\u030e\13n\3n\3n\3n\3n\3n\7n\u0315\nn\fn\16n\u0318\13n\3n\5n\u031b\n"+
		"n\5\u0301\u030c\u0316\2o\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f"+
		"\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63"+
		"\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62"+
		"c\63e\64g\65i\66k\67m8o9q:s;u<w=y>{?}@\177A\u0081B\u0083C\u0085D\u0087"+
		"E\u0089F\u008bG\u008dH\u008fI\u0091J\u0093K\u0095L\u0097M\u0099N\u009b"+
		"O\u009dP\u009fQ\u00a1R\u00a3S\u00a5T\u00a7U\u00a9V\u00abW\u00adX\u00af"+
		"Y\u00b1Z\u00b3[\u00b5\\\u00b7]\u00b9^\u00bb_\u00bd`\u00bfa\u00c1b\u00c3"+
		"c\u00c5d\u00c7e\u00c9f\u00cbg\u00cdh\u00cfi\u00d1j\u00d3k\u00d5l\u00d7"+
		"m\u00d9n\u00dbo\3\2\t\4\2C\\c|\6\2\62;C\\aac|\5\2\13\f\17\17\"\"\4\2\f"+
		"\f\17\17\3\2\62;\3\2\60\60\6\2\'\',-//\61\61\2\u0334\2\3\3\2\2\2\2\5\3"+
		"\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2"+
		"\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3"+
		"\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'"+
		"\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63"+
		"\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2"+
		"?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3"+
		"\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2"+
		"\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2"+
		"e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3"+
		"\2\2\2\2s\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\2{\3\2\2\2\2}\3\2\2"+
		"\2\2\177\3\2\2\2\2\u0081\3\2\2\2\2\u0083\3\2\2\2\2\u0085\3\2\2\2\2\u0087"+
		"\3\2\2\2\2\u0089\3\2\2\2\2\u008b\3\2\2\2\2\u008d\3\2\2\2\2\u008f\3\2\2"+
		"\2\2\u0091\3\2\2\2\2\u0093\3\2\2\2\2\u0095\3\2\2\2\2\u0097\3\2\2\2\2\u0099"+
		"\3\2\2\2\2\u009b\3\2\2\2\2\u009d\3\2\2\2\2\u009f\3\2\2\2\2\u00a1\3\2\2"+
		"\2\2\u00a3\3\2\2\2\2\u00a5\3\2\2\2\2\u00a7\3\2\2\2\2\u00a9\3\2\2\2\2\u00ab"+
		"\3\2\2\2\2\u00ad\3\2\2\2\2\u00af\3\2\2\2\2\u00b1\3\2\2\2\2\u00b3\3\2\2"+
		"\2\2\u00b5\3\2\2\2\2\u00b7\3\2\2\2\2\u00b9\3\2\2\2\2\u00bb\3\2\2\2\2\u00bd"+
		"\3\2\2\2\2\u00bf\3\2\2\2\2\u00c1\3\2\2\2\2\u00c3\3\2\2\2\2\u00c5\3\2\2"+
		"\2\2\u00c7\3\2\2\2\2\u00c9\3\2\2\2\2\u00cb\3\2\2\2\2\u00cd\3\2\2\2\2\u00cf"+
		"\3\2\2\2\2\u00d1\3\2\2\2\2\u00d3\3\2\2\2\2\u00d5\3\2\2\2\2\u00d7\3\2\2"+
		"\2\2\u00d9\3\2\2\2\2\u00db\3\2\2\2\3\u00dd\3\2\2\2\5\u00df\3\2\2\2\7\u00e1"+
		"\3\2\2\2\t\u00e3\3\2\2\2\13\u00e5\3\2\2\2\r\u00e7\3\2\2\2\17\u00e9\3\2"+
		"\2\2\21\u00f1\3\2\2\2\23\u00f7\3\2\2\2\25\u0100\3\2\2\2\27\u0107\3\2\2"+
		"\2\31\u010b\3\2\2\2\33\u0112\3\2\2\2\35\u011b\3\2\2\2\37\u011f\3\2\2\2"+
		"!\u0123\3\2\2\2#\u0126\3\2\2\2%\u0129\3\2\2\2\'\u012e\3\2\2\2)\u0135\3"+
		"\2\2\2+\u013a\3\2\2\2-\u013d\3\2\2\2/\u0140\3\2\2\2\61\u0145\3\2\2\2\63"+
		"\u0148\3\2\2\2\65\u014b\3\2\2\2\67\u014d\3\2\2\29\u014f\3\2\2\2;\u0156"+
		"\3\2\2\2=\u015c\3\2\2\2?\u0164\3\2\2\2A\u016b\3\2\2\2C\u016e\3\2\2\2E"+
		"\u0175\3\2\2\2G\u017b\3\2\2\2I\u017e\3\2\2\2K\u0181\3\2\2\2M\u0184\3\2"+
		"\2\2O\u0189\3\2\2\2Q\u018c\3\2\2\2S\u018f\3\2\2\2U\u0193\3\2\2\2W\u0198"+
		"\3\2\2\2Y\u01a0\3\2\2\2[\u01a6\3\2\2\2]\u01ae\3\2\2\2_\u01b5\3\2\2\2a"+
		"\u01bc\3\2\2\2c\u01bf\3\2\2\2e\u01c2\3\2\2\2g\u01c7\3\2\2\2i\u01cc\3\2"+
		"\2\2k\u01d1\3\2\2\2m\u01d5\3\2\2\2o\u01d9\3\2\2\2q\u01dd\3\2\2\2s\u01e2"+
		"\3\2\2\2u\u01e7\3\2\2\2w\u01ec\3\2\2\2y\u01f4\3\2\2\2{\u01f7\3\2\2\2}"+
		"\u01fd\3\2\2\2\177\u0203\3\2\2\2\u0081\u0208\3\2\2\2\u0083\u020c\3\2\2"+
		"\2\u0085\u0211\3\2\2\2\u0087\u021b\3\2\2\2\u0089\u021f\3\2\2\2\u008b\u0224"+
		"\3\2\2\2\u008d\u0227\3\2\2\2\u008f\u022b\3\2\2\2\u0091\u0230\3\2\2\2\u0093"+
		"\u0237\3\2\2\2\u0095\u023c\3\2\2\2\u0097\u023f\3\2\2\2\u0099\u0245\3\2"+
		"\2\2\u009b\u024b\3\2\2\2\u009d\u0253\3\2\2\2\u009f\u0258\3\2\2\2\u00a1"+
		"\u025f\3\2\2\2\u00a3\u0265\3\2\2\2\u00a5\u0269\3\2\2\2\u00a7\u026e\3\2"+
		"\2\2\u00a9\u0272\3\2\2\2\u00ab\u0277\3\2\2\2\u00ad\u027b\3\2\2\2\u00af"+
		"\u027f\3\2\2\2\u00b1\u0285\3\2\2\2\u00b3\u0288\3\2\2\2\u00b5\u028c\3\2"+
		"\2\2\u00b7\u0291\3\2\2\2\u00b9\u0299\3\2\2\2\u00bb\u029b\3\2\2\2\u00bd"+
		"\u029d\3\2\2\2\u00bf\u02b9\3\2\2\2\u00c1\u02bb\3\2\2\2\u00c3\u02be\3\2"+
		"\2\2\u00c5\u02c0\3\2\2\2\u00c7\u02c2\3\2\2\2\u00c9\u02c5\3\2\2\2\u00cb"+
		"\u02c7\3\2\2\2\u00cd\u02cb\3\2\2\2\u00cf\u02ce\3\2\2\2\u00d1\u02d1\3\2"+
		"\2\2\u00d3\u02d4\3\2\2\2\u00d5\u02ed\3\2\2\2\u00d7\u02f2\3\2\2\2\u00d9"+
		"\u02fb\3\2\2\2\u00db\u031a\3\2\2\2\u00dd\u00de\7<\2\2\u00de\4\3\2\2\2"+
		"\u00df\u00e0\7(\2\2\u00e0\6\3\2\2\2\u00e1\u00e2\7=\2\2\u00e2\b\3\2\2\2"+
		"\u00e3\u00e4\7.\2\2\u00e4\n\3\2\2\2\u00e5\u00e6\7#\2\2\u00e6\f\3\2\2\2"+
		"\u00e7\u00e8\7~\2\2\u00e8\16\3\2\2\2\u00e9\u00ed\t\2\2\2\u00ea\u00ec\t"+
		"\3\2\2\u00eb\u00ea\3\2\2\2\u00ec\u00ef\3\2\2\2\u00ed\u00eb\3\2\2\2\u00ed"+
		"\u00ee\3\2\2\2\u00ee\20\3\2\2\2\u00ef\u00ed\3\2\2\2\u00f0\u00f2\t\4\2"+
		"\2\u00f1\u00f0\3\2\2\2\u00f2\u00f3\3\2\2\2\u00f3\u00f1\3\2\2\2\u00f3\u00f4"+
		"\3\2\2\2\u00f4\u00f5\3\2\2\2\u00f5\u00f6\b\t\2\2\u00f6\22\3\2\2\2\u00f7"+
		"\u00fb\7%\2\2\u00f8\u00fa\n\5\2\2\u00f9\u00f8\3\2\2\2\u00fa\u00fd\3\2"+
		"\2\2\u00fb\u00f9\3\2\2\2\u00fb\u00fc\3\2\2\2\u00fc\u00fe\3\2\2\2\u00fd"+
		"\u00fb\3\2\2\2\u00fe\u00ff\b\n\2\2\u00ff\24\3\2\2\2\u0100\u0101\7i\2\2"+
		"\u0101\u0102\7n\2\2\u0102\u0103\7q\2\2\u0103\u0104\7d\2\2\u0104\u0105"+
		"\7c\2\2\u0105\u0106\7n\2\2\u0106\26\3\2\2\2\u0107\u0108\7g\2\2\u0108\u0109"+
		"\7p\2\2\u0109\u010a\7f\2\2\u010a\30\3\2\2\2\u010b\u010c\7k\2\2\u010c\u010d"+
		"\7o\2\2\u010d\u010e\7r\2\2\u010e\u010f\7q\2\2\u010f\u0110\7t\2\2\u0110"+
		"\u0111\7v\2\2\u0111\32\3\2\2\2\u0112\u0113\7t\2\2\u0113\u0114\7g\2\2\u0114"+
		"\u0115\7u\2\2\u0115\u0116\7q\2\2\u0116\u0117\7w\2\2\u0117\u0118\7t\2\2"+
		"\u0118\u0119\7e\2\2\u0119\u011a\7g\2\2\u011a\34\3\2\2\2\u011b\u011c\7"+
		"k\2\2\u011c\u011d\7p\2\2\u011d\u011e\7v\2\2\u011e\36\3\2\2\2\u011f\u0120"+
		"\7x\2\2\u0120\u0121\7c\2\2\u0121\u0122\7t\2\2\u0122 \3\2\2\2\u0123\u0124"+
		"\7k\2\2\u0124\u0125\7h\2\2\u0125\"\3\2\2\2\u0126\u0127\7h\2\2\u0127\u0128"+
		"\7k\2\2\u0128$\3\2\2\2\u0129\u012a\7g\2\2\u012a\u012b\7n\2\2\u012b\u012c"+
		"\7u\2\2\u012c\u012d\7g\2\2\u012d&\3\2\2\2\u012e\u012f\7g\2\2\u012f\u0130"+
		"\7z\2\2\u0130\u0131\7v\2\2\u0131\u0132\7g\2\2\u0132\u0133\7p\2\2\u0133"+
		"\u0134\7f\2\2\u0134(\3\2\2\2\u0135\u0136\7d\2\2\u0136\u0137\7q\2\2\u0137"+
		"\u0138\7f\2\2\u0138\u0139\7{\2\2\u0139*\3\2\2\2\u013a\u013b\7k\2\2\u013b"+
		"\u013c\7p\2\2\u013c,\3\2\2\2\u013d\u013e\7p\2\2\u013e\u013f\7k\2\2\u013f"+
		".\3\2\2\2\u0140\u0141\7e\2\2\u0141\u0142\7c\2\2\u0142\u0143\7n\2\2\u0143"+
		"\u0144\7n\2\2\u0144\60\3\2\2\2\u0145\u0146\7h\2\2\u0146\u0147\7c\2\2\u0147"+
		"\62\3\2\2\2\u0148\u0149\7c\2\2\u0149\u014a\7h\2\2\u014a\64\3\2\2\2\u014b"+
		"\u014c\7*\2\2\u014c\66\3\2\2\2\u014d\u014e\7+\2\2\u014e8\3\2\2\2\u014f"+
		"\u0150\7k\2\2\u0150\u0151\7p\2\2\u0151\u0152\7k\2\2\u0152\u0153\7v\2\2"+
		"\u0153\u0154\7c\2\2\u0154\u0155\7n\2\2\u0155:\3\2\2\2\u0156\u0157\7e\2"+
		"\2\u0157\u0158\7q\2\2\u0158\u0159\7p\2\2\u0159\u015a\7u\2\2\u015a\u015b"+
		"\7v\2\2\u015b<\3\2\2\2\u015c\u015d\7t\2\2\u015d\u015e\7g\2\2\u015e\u015f"+
		"\7v\2\2\u015f\u0160\7w\2\2\u0160\u0161\7t\2\2\u0161\u0162\7p\2\2\u0162"+
		"\u0163\7u\2\2\u0163>\3\2\2\2\u0164\u0165\7t\2\2\u0165\u0166\7g\2\2\u0166"+
		"\u0167\7v\2\2\u0167\u0168\7w\2\2\u0168\u0169\7t\2\2\u0169\u016a\7p\2\2"+
		"\u016a@\3\2\2\2\u016b\u016c\7v\2\2\u016c\u016d\7q\2\2\u016dB\3\2\2\2\u016e"+
		"\u016f\7f\2\2\u016f\u0170\7q\2\2\u0170\u0171\7y\2\2\u0171\u0172\7p\2\2"+
		"\u0172\u0173\7v\2\2\u0173\u0174\7q\2\2\u0174D\3\2\2\2\u0175\u0176\7h\2"+
		"\2\u0176\u0177\7k\2\2\u0177\u0178\7p\2\2\u0178\u0179\7c\2\2\u0179\u017a"+
		"\7n\2\2\u017aF\3\2\2\2\u017b\u017c\7q\2\2\u017c\u017d\7r\2\2\u017dH\3"+
		"\2\2\2\u017e\u017f\7f\2\2\u017f\u0180\7q\2\2\u0180J\3\2\2\2\u0181\u0182"+
		"\7q\2\2\u0182\u0183\7f\2\2\u0183L\3\2\2\2\u0184\u0185\7r\2\2\u0185\u0186"+
		"\7t\2\2\u0186\u0187\7q\2\2\u0187\u0188\7e\2\2\u0188N\3\2\2\2\u0189\u018a"+
		"\7e\2\2\u018a\u018b\7q\2\2\u018bP\3\2\2\2\u018c\u018d\7q\2\2\u018d\u018e"+
		"\7e\2\2\u018eR\3\2\2\2\u018f\u0190\7e\2\2\u0190\u0191\7c\2\2\u0191\u0192"+
		"\7r\2\2\u0192T\3\2\2\2\u0193\u0194\7u\2\2\u0194\u0195\7g\2\2\u0195\u0196"+
		"\7p\2\2\u0196\u0197\7f\2\2\u0197V\3\2\2\2\u0198\u0199\7f\2\2\u0199\u019a"+
		"\7g\2\2\u019a\u019b\7u\2\2\u019b\u019c\7v\2\2\u019c\u019d\7t\2\2\u019d"+
		"\u019e\7q\2\2\u019e\u019f\7{\2\2\u019fX\3\2\2\2\u01a0\u01a1\7d\2\2\u01a1"+
		"\u01a2\7g\2\2\u01a2\u01a3\7i\2\2\u01a3\u01a4\7k\2\2\u01a4\u01a5\7p\2\2"+
		"\u01a5Z\3\2\2\2\u01a6\u01a7\7t\2\2\u01a7\u01a8\7g\2\2\u01a8\u01a9\7e\2"+
		"\2\u01a9\u01aa\7g\2\2\u01aa\u01ab\7k\2\2\u01ab\u01ac\7x\2\2\u01ac\u01ad"+
		"\7g\2\2\u01ad\\\3\2\2\2\u01ae\u01af\7e\2\2\u01af\u01b0\7t\2\2\u01b0\u01b1"+
		"\7g\2\2\u01b1\u01b2\7c\2\2\u01b2\u01b3\7v\2\2\u01b3\u01b4\7g\2\2\u01b4"+
		"^\3\2\2\2\u01b5\u01b6\7q\2\2\u01b6\u01b7\7r\2\2\u01b7\u01b8\7v\2\2\u01b8"+
		"\u01b9\7{\2\2\u01b9\u01ba\7r\2\2\u01ba\u01bb\7g\2\2\u01bb`\3\2\2\2\u01bc"+
		"\u01bd\7d\2\2\u01bd\u01be\7{\2\2\u01beb\3\2\2\2\u01bf\u01c0\7u\2\2\u01c0"+
		"\u01c1\7v\2\2\u01c1d\3\2\2\2\u01c2\u01c3\7v\2\2\u01c3\u01c4\7{\2\2\u01c4"+
		"\u01c5\7r\2\2\u01c5\u01c6\7g\2\2\u01c6f\3\2\2\2\u01c7\u01c8\7p\2\2\u01c8"+
		"\u01c9\7w\2\2\u01c9\u01ca\7n\2\2\u01ca\u01cb\7n\2\2\u01cbh\3\2\2\2\u01cc"+
		"\u01cd\7d\2\2\u01cd\u01ce\7q\2\2\u01ce\u01cf\7q\2\2\u01cf\u01d0\7n\2\2"+
		"\u01d0j\3\2\2\2\u01d1\u01d2\7x\2\2\u01d2\u01d3\7c\2\2\u01d3\u01d4\7n\2"+
		"\2\u01d4l\3\2\2\2\u01d5\u01d6\7t\2\2\u01d6\u01d7\7g\2\2\u01d7\u01d8\7"+
		"u\2\2\u01d8n\3\2\2\2\u01d9\u01da\7t\2\2\u01da\u01db\7g\2\2\u01db\u01dc"+
		"\7h\2\2\u01dcp\3\2\2\2\u01dd\u01de\7g\2\2\u01de\u01df\7z\2\2\u01df\u01e0"+
		"\7k\2\2\u01e0\u01e1\7v\2\2\u01e1r\3\2\2\2\u01e2\u01e3\7p\2\2\u01e3\u01e4"+
		"\7g\2\2\u01e4\u01e5\7z\2\2\u01e5\u01e6\7v\2\2\u01e6t\3\2\2\2\u01e7\u01e8"+
		"\7h\2\2\u01e8\u01e9\7k\2\2\u01e9\u01ea\7n\2\2\u01ea\u01eb\7g\2\2\u01eb"+
		"v\3\2\2\2\u01ec\u01ed\7r\2\2\u01ed\u01ee\7t\2\2\u01ee\u01ef\7k\2\2\u01ef"+
		"\u01f0\7x\2\2\u01f0\u01f1\7c\2\2\u01f1\u01f2\7v\2\2\u01f2\u01f3\7g\2\2"+
		"\u01f3x\3\2\2\2\u01f4\u01f5\7q\2\2\u01f5\u01f6\7t\2\2\u01f6z\3\2\2\2\u01f7"+
		"\u01f8\7k\2\2\u01f8\u01f9\7p\2\2\u01f9\u01fa\7f\2\2\u01fa\u01fb\7g\2\2"+
		"\u01fb\u01fc\7z\2\2\u01fc|\3\2\2\2\u01fd\u01fe\7y\2\2\u01fe\u01ff\7t\2"+
		"\2\u01ff\u0200\7k\2\2\u0200\u0201\7v\2\2\u0201\u0202\7g\2\2\u0202~\3\2"+
		"\2\2\u0203\u0204\7t\2\2\u0204\u0205\7g\2\2\u0205\u0206\7c\2\2\u0206\u0207"+
		"\7f\2\2\u0207\u0080\3\2\2\2\u0208\u0209\7o\2\2\u0209\u020a\7q\2\2\u020a"+
		"\u020b\7f\2\2\u020b\u0082\3\2\2\2\u020c\u020d\7u\2\2\u020d\u020e\7v\2"+
		"\2\u020e\u020f\7q\2\2\u020f\u0210\7r\2\2\u0210\u0084\3\2\2\2\u0211\u0212"+
		"\7r\2\2\u0212\u0213\7t\2\2\u0213\u0214\7q\2\2\u0214\u0215\7e\2\2\u0215"+
		"\u0216\7g\2\2\u0216\u0217\7f\2\2\u0217\u0218\7w\2\2\u0218\u0219\7t\2\2"+
		"\u0219\u021a\7g\2\2\u021a\u0086\3\2\2\2\u021b\u021c\7c\2\2\u021c\u021d"+
		"\7p\2\2\u021d\u021e\7f\2\2\u021e\u0088\3\2\2\2\u021f\u0220\7t\2\2\u0220"+
		"\u0221\7g\2\2\u0221\u0222\7c\2\2\u0222\u0223\7n\2\2\u0223\u008a\3\2\2"+
		"\2\u0224\u0225\7q\2\2\u0225\u0226\7p\2\2\u0226\u008c\3\2\2\2\u0227\u0228"+
		"\7t\2\2\u0228\u0229\7q\2\2\u0229\u022a\7y\2\2\u022a\u008e\3\2\2\2\u022b"+
		"\u022c\7v\2\2\u022c\u022d\7t\2\2\u022d\u022e\7w\2\2\u022e\u022f\7g\2\2"+
		"\u022f\u0090\3\2\2\2\u0230\u0231\7u\2\2\u0231\u0232\7g\2\2\u0232\u0233"+
		"\7p\2\2\u0233\u0234\7f\2\2\u0234\u0235\7g\2\2\u0235\u0236\7t\2\2\u0236"+
		"\u0092\3\2\2\2\u0237\u0238\7n\2\2\u0238\u0239\7g\2\2\u0239\u023a\7h\2"+
		"\2\u023a\u023b\7v\2\2\u023b\u0094\3\2\2\2\u023c\u023d\7w\2\2\u023d\u023e"+
		"\7r\2\2\u023e\u0096\3\2\2\2\u023f\u0240\7c\2\2\u0240\u0241\7d\2\2\u0241"+
		"\u0242\7q\2\2\u0242\u0243\7t\2\2\u0243\u0244\7v\2\2\u0244\u0098\3\2\2"+
		"\2\u0245\u0246\7t\2\2\u0246\u0247\7g\2\2\u0247\u0248\7r\2\2\u0248\u0249"+
		"\7n\2\2\u0249\u024a\7{\2\2\u024a\u009a\3\2\2\2\u024b\u024c\7r\2\2\u024c"+
		"\u024d\7t\2\2\u024d\u024e\7q\2\2\u024e\u024f\7e\2\2\u024f\u0250\7g\2\2"+
		"\u0250\u0251\7u\2\2\u0251\u0252\7u\2\2\u0252\u009c\3\2\2\2\u0253\u0254"+
		"\7e\2\2\u0254\u0255\7j\2\2\u0255\u0256\7c\2\2\u0256\u0257\7t\2\2\u0257"+
		"\u009e\3\2\2\2\u0258\u0259\7u\2\2\u0259\u025a\7v\2\2\u025a\u025b\7t\2"+
		"\2\u025b\u025c\7k\2\2\u025c\u025d\7p\2\2\u025d\u025e\7i\2\2\u025e\u00a0"+
		"\3\2\2\2\u025f\u0260\7h\2\2\u0260\u0261\7c\2\2\u0261\u0262\7n\2\2\u0262"+
		"\u0263\7u\2\2\u0263\u0264\7g\2\2\u0264\u00a2\3\2\2\2\u0265\u0266\7n\2"+
		"\2\u0266\u0267\7q\2\2\u0267\u0268\7y\2\2\u0268\u00a4\3\2\2\2\u0269\u026a"+
		"\7j\2\2\u026a\u026b\7k\2\2\u026b\u026c\7i\2\2\u026c\u026d\7j\2\2\u026d"+
		"\u00a6\3\2\2\2\u026e\u026f\7p\2\2\u026f\u0270\7g\2\2\u0270\u0271\7y\2"+
		"\2\u0271\u00a8\3\2\2\2\u0272\u0273\7g\2\2\u0273\u0274\7p\2\2\u0274\u0275"+
		"\7w\2\2\u0275\u0276\7o\2\2\u0276\u00aa\3\2\2\2\u0277\u0278\7c\2\2\u0278"+
		"\u0279\7p\2\2\u0279\u027a\7{\2\2\u027a\u00ac\3\2\2\2\u027b\u027c\7t\2"+
		"\2\u027c\u027d\7g\2\2\u027d\u027e\7e\2\2\u027e\u00ae\3\2\2\2\u027f\u0280"+
		"\7w\2\2\u0280\u0281\7p\2\2\u0281\u0282\7k\2\2\u0282\u0283\7q\2\2\u0283"+
		"\u0284\7p\2\2\u0284\u00b0\3\2\2\2\u0285\u0286\7x\2\2\u0286\u0287\7o\2"+
		"\2\u0287\u00b2\3\2\2\2\u0288\u0289\7z\2\2\u0289\u028a\7q\2\2\u028a\u028b"+
		"\7t\2\2\u028b\u00b4\3\2\2\2\u028c\u028d\7u\2\2\u028d\u028e\7m\2\2\u028e"+
		"\u028f\7k\2\2\u028f\u0290\7r\2\2\u0290\u00b6\3\2\2\2\u0291\u0292\7h\2"+
		"\2\u0292\u0293\7q\2\2\u0293\u0294\7t\2\2\u0294\u0295\7y\2\2\u0295\u0296"+
		"\7c\2\2\u0296\u0297\7t\2\2\u0297\u0298\7f\2\2\u0298\u00b8\3\2\2\2\u0299"+
		"\u029a\7X\2\2\u029a\u00ba\3\2\2\2\u029b\u029c\7R\2\2\u029c\u00bc\3\2\2"+
		"\2\u029d\u029e\7/\2\2\u029e\u029f\7@\2\2\u029f\u00be\3\2\2\2\u02a0\u02a2"+
		"\7/\2\2\u02a1\u02a0\3\2\2\2\u02a1\u02a2\3\2\2\2\u02a2\u02a4\3\2\2\2\u02a3"+
		"\u02a5\t\6\2\2\u02a4\u02a3\3\2\2\2\u02a5\u02a6\3\2\2\2\u02a6\u02a4\3\2"+
		"\2\2\u02a6\u02a7\3\2\2\2\u02a7\u02ba\3\2\2\2\u02a8\u02aa\7/\2\2\u02a9"+
		"\u02a8\3\2\2\2\u02a9\u02aa\3\2\2\2\u02aa\u02ac\3\2\2\2\u02ab\u02ad\t\6"+
		"\2\2\u02ac\u02ab\3\2\2\2\u02ad\u02ae\3\2\2\2\u02ae\u02ac\3\2\2\2\u02ae"+
		"\u02af\3\2\2\2\u02af\u02b7\3\2\2\2\u02b0\u02b8\3\2\2\2\u02b1\u02b3\t\7"+
		"\2\2\u02b2\u02b4\t\6\2\2\u02b3\u02b2\3\2\2\2\u02b4\u02b5\3\2\2\2\u02b5"+
		"\u02b3\3\2\2\2\u02b5\u02b6\3\2\2\2\u02b6\u02b8\3\2\2\2\u02b7\u02b0\3\2"+
		"\2\2\u02b7\u02b1\3\2\2\2\u02b8\u02ba\3\2\2\2\u02b9\u02a1\3\2\2\2\u02b9"+
		"\u02a9\3\2\2\2\u02ba\u00c0\3\2\2\2\u02bb\u02bc\7]\2\2\u02bc\u02bd\7_\2"+
		"\2\u02bd\u00c2\3\2\2\2\u02be\u02bf\7}\2\2\u02bf\u00c4\3\2\2\2\u02c0\u02c1"+
		"\7\177\2\2\u02c1\u00c6\3\2\2\2\u02c2\u02c3\7<\2\2\u02c3\u02c4\7?\2\2\u02c4"+
		"\u00c8\3\2\2\2\u02c5\u02c6\7?\2\2\u02c6\u00ca\3\2\2\2\u02c7\u02c8\7<\2"+
		"\2\u02c8\u02c9\7?\2\2\u02c9\u02ca\7<\2\2\u02ca\u00cc\3\2\2\2\u02cb\u02cc"+
		"\7-\2\2\u02cc\u02cd\7-\2\2\u02cd\u00ce\3\2\2\2\u02ce\u02cf\7/\2\2\u02cf"+
		"\u02d0\7/\2\2\u02d0\u00d0\3\2\2\2\u02d1\u02d2\7>\2\2\u02d2\u02d3\7>\2"+
		"\2\u02d3\u00d2\3\2\2\2\u02d4\u02d5\7@\2\2\u02d5\u02d6\7@\2\2\u02d6\u00d4"+
		"\3\2\2\2\u02d7\u02d8\7-\2\2\u02d8\u02d9\7<\2\2\u02d9\u02ee\7?\2\2\u02da"+
		"\u02db\7/\2\2\u02db\u02dc\7<\2\2\u02dc\u02ee\7?\2\2\u02dd\u02de\7,\2\2"+
		"\u02de\u02df\7<\2\2\u02df\u02ee\7?\2\2\u02e0\u02e1\7\61\2\2\u02e1\u02e2"+
		"\7<\2\2\u02e2\u02ee\7?\2\2\u02e3\u02e4\7\'\2\2\u02e4\u02e5\7<\2\2\u02e5"+
		"\u02ee\7?\2\2\u02e6\u02e7\7-\2\2\u02e7\u02e8\7<\2\2\u02e8\u02ee\7?\2\2"+
		"\u02e9\u02ea\7,\2\2\u02ea\u02eb\7,\2\2\u02eb\u02ec\7<\2\2\u02ec\u02ee"+
		"\7?\2\2\u02ed\u02d7\3\2\2\2\u02ed\u02da\3\2\2\2\u02ed\u02dd\3\2\2\2\u02ed"+
		"\u02e0\3\2\2\2\u02ed\u02e3\3\2\2\2\u02ed\u02e6\3\2\2\2\u02ed\u02e9\3\2"+
		"\2\2\u02ee\u00d6\3\2\2\2\u02ef\u02f3\t\b\2\2\u02f0\u02f1\7,\2\2\u02f1"+
		"\u02f3\7,\2\2\u02f2\u02ef\3\2\2\2\u02f2\u02f0\3\2\2\2\u02f3\u00d8\3\2"+
		"\2\2\u02f4\u02fc\4>@\2\u02f5\u02f6\7>\2\2\u02f6\u02fc\7?\2\2\u02f7\u02f8"+
		"\7@\2\2\u02f8\u02fc\7?\2\2\u02f9\u02fa\7#\2\2\u02fa\u02fc\7?\2\2\u02fb"+
		"\u02f4\3\2\2\2\u02fb\u02f5\3\2\2\2\u02fb\u02f7\3\2\2\2\u02fb\u02f9\3\2"+
		"\2\2\u02fc\u00da\3\2\2\2\u02fd\u0301\7$\2\2\u02fe\u0300\13\2\2\2\u02ff"+
		"\u02fe\3\2\2\2\u0300\u0303\3\2\2\2\u0301\u0302\3\2\2\2\u0301\u02ff\3\2"+
		"\2\2\u0302\u0304\3\2\2\2\u0303\u0301\3\2\2\2\u0304\u031b\7$\2\2\u0305"+
		"\u0306\7\u00e4\2\2\u0306\u0307\7\u20ae\2\2\u0307\u0308\7\u0155\2\2\u0308"+
		"\u030c\3\2\2\2\u0309\u030b\13\2\2\2\u030a\u0309\3\2\2\2\u030b\u030e\3"+
		"\2\2\2\u030c\u030d\3\2\2\2\u030c\u030a\3\2\2\2\u030d\u030f\3\2\2\2\u030e"+
		"\u030c\3\2\2\2\u030f\u0310\7\u00e4\2\2\u0310\u0311\7\u20ae\2\2\u0311\u031b"+
		"\7\uffff\2\2\u0312\u0316\7)\2\2\u0313\u0315\13\2\2\2\u0314\u0313\3\2\2"+
		"\2\u0315\u0318\3\2\2\2\u0316\u0317\3\2\2\2\u0316\u0314\3\2\2\2\u0317\u0319"+
		"\3\2\2\2\u0318\u0316\3\2\2\2\u0319\u031b\7)\2\2\u031a\u02fd\3\2\2\2\u031a"+
		"\u0305\3\2\2\2\u031a\u0312\3\2\2\2\u031b\u00dc\3\2\2\2\24\2\u00ed\u00f3"+
		"\u00fb\u02a1\u02a6\u02a9\u02ae\u02b5\u02b7\u02b9\u02ed\u02f2\u02fb\u0301"+
		"\u030c\u0316\u031a\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}