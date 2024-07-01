// Generated from Language.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class LanguageParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, NOTA=4, PAUSA=5, SECUENCIA=6, REPRODUCIR=7, BUCLE=8, 
		IGUAL=9, PARENTESIS_IZQ=10, PARENTESIS_DER=11, CORCHETE_IZQ=12, CORCHETE_DER=13, 
		COMA=14, PUNTO_Y_COMA=15, PUNTO=16, TONO=17, ID=18, NUMERO=19, OCTAVA=20, 
		DURACION=21, COMENTARIO=22, BLOQUE_COMENTARIO=23, WS=24;
	public static final int
		RULE_programa = 0, RULE_bloque = 1, RULE_declaracion = 2, RULE_declaracion_de_nota = 3, 
		RULE_declaracion_de_pausa = 4, RULE_declaracion_de_secuencia = 5, RULE_elemento_secuencia = 6, 
		RULE_declaracion_de_reproduccion = 7, RULE_declaracion_de_bucle = 8, RULE_tono = 9, 
		RULE_duracion = 10, RULE_octava = 11;
	private static String[] makeRuleNames() {
		return new String[] {
			"programa", "bloque", "declaracion", "declaracion_de_nota", "declaracion_de_pausa", 
			"declaracion_de_secuencia", "elemento_secuencia", "declaracion_de_reproduccion", 
			"declaracion_de_bucle", "tono", "duracion", "octava"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'programa'", "'finprog'", "'finbucle'", "'nota'", "'pausa'", "'secuencia'", 
			"'reproducir'", "'bucle'", "'='", "'('", "')'", "'['", "']'", "','", 
			"';'", "'.'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, "NOTA", "PAUSA", "SECUENCIA", "REPRODUCIR", "BUCLE", 
			"IGUAL", "PARENTESIS_IZQ", "PARENTESIS_DER", "CORCHETE_IZQ", "CORCHETE_DER", 
			"COMA", "PUNTO_Y_COMA", "PUNTO", "TONO", "ID", "NUMERO", "OCTAVA", "DURACION", 
			"COMENTARIO", "BLOQUE_COMENTARIO", "WS"
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
	public String getGrammarFileName() { return "Language.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public LanguageParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramaContext extends ParserRuleContext {
		public BloqueContext bloque() {
			return getRuleContext(BloqueContext.class,0);
		}
		public ProgramaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programa; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).enterPrograma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).exitPrograma(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LanguageVisitor ) return ((LanguageVisitor<? extends T>)visitor).visitPrograma(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramaContext programa() throws RecognitionException {
		ProgramaContext _localctx = new ProgramaContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_programa);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(24);
			match(T__0);
			setState(25);
			bloque();
			setState(26);
			match(T__1);
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
	public static class BloqueContext extends ParserRuleContext {
		public List<DeclaracionContext> declaracion() {
			return getRuleContexts(DeclaracionContext.class);
		}
		public DeclaracionContext declaracion(int i) {
			return getRuleContext(DeclaracionContext.class,i);
		}
		public BloqueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bloque; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).enterBloque(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).exitBloque(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LanguageVisitor ) return ((LanguageVisitor<? extends T>)visitor).visitBloque(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BloqueContext bloque() throws RecognitionException {
		BloqueContext _localctx = new BloqueContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_bloque);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(31);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 496L) != 0)) {
				{
				{
				setState(28);
				declaracion();
				}
				}
				setState(33);
				_errHandler.sync(this);
				_la = _input.LA(1);
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
	public static class DeclaracionContext extends ParserRuleContext {
		public Declaracion_de_notaContext declaracion_de_nota() {
			return getRuleContext(Declaracion_de_notaContext.class,0);
		}
		public Declaracion_de_pausaContext declaracion_de_pausa() {
			return getRuleContext(Declaracion_de_pausaContext.class,0);
		}
		public Declaracion_de_secuenciaContext declaracion_de_secuencia() {
			return getRuleContext(Declaracion_de_secuenciaContext.class,0);
		}
		public Declaracion_de_reproduccionContext declaracion_de_reproduccion() {
			return getRuleContext(Declaracion_de_reproduccionContext.class,0);
		}
		public Declaracion_de_bucleContext declaracion_de_bucle() {
			return getRuleContext(Declaracion_de_bucleContext.class,0);
		}
		public DeclaracionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).enterDeclaracion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).exitDeclaracion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LanguageVisitor ) return ((LanguageVisitor<? extends T>)visitor).visitDeclaracion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclaracionContext declaracion() throws RecognitionException {
		DeclaracionContext _localctx = new DeclaracionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_declaracion);
		try {
			setState(49);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NOTA:
				enterOuterAlt(_localctx, 1);
				{
				setState(34);
				declaracion_de_nota();
				System.out.println("¡Reconocí una declaración de nota!"); 
				}
				break;
			case PAUSA:
				enterOuterAlt(_localctx, 2);
				{
				setState(37);
				declaracion_de_pausa();
				System.out.println("¡Reconocí una declaración de pausa!"); 
				}
				break;
			case SECUENCIA:
				enterOuterAlt(_localctx, 3);
				{
				setState(40);
				declaracion_de_secuencia();
				System.out.println("¡Reconocí una declaración de secuencia!"); 
				}
				break;
			case REPRODUCIR:
				enterOuterAlt(_localctx, 4);
				{
				setState(43);
				declaracion_de_reproduccion();
				System.out.println("¡Reconocí una declaración de reproduccion!"); 
				}
				break;
			case BUCLE:
				enterOuterAlt(_localctx, 5);
				{
				setState(46);
				declaracion_de_bucle();
				System.out.println("¡Reconocí una declaración de bucle!"); 
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
	public static class Declaracion_de_notaContext extends ParserRuleContext {
		public List<TerminalNode> NOTA() { return getTokens(LanguageParser.NOTA); }
		public TerminalNode NOTA(int i) {
			return getToken(LanguageParser.NOTA, i);
		}
		public TerminalNode ID() { return getToken(LanguageParser.ID, 0); }
		public TerminalNode IGUAL() { return getToken(LanguageParser.IGUAL, 0); }
		public TerminalNode PARENTESIS_IZQ() { return getToken(LanguageParser.PARENTESIS_IZQ, 0); }
		public TonoContext tono() {
			return getRuleContext(TonoContext.class,0);
		}
		public List<TerminalNode> COMA() { return getTokens(LanguageParser.COMA); }
		public TerminalNode COMA(int i) {
			return getToken(LanguageParser.COMA, i);
		}
		public DuracionContext duracion() {
			return getRuleContext(DuracionContext.class,0);
		}
		public OctavaContext octava() {
			return getRuleContext(OctavaContext.class,0);
		}
		public TerminalNode PARENTESIS_DER() { return getToken(LanguageParser.PARENTESIS_DER, 0); }
		public TerminalNode PUNTO_Y_COMA() { return getToken(LanguageParser.PUNTO_Y_COMA, 0); }
		public Declaracion_de_notaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracion_de_nota; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).enterDeclaracion_de_nota(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).exitDeclaracion_de_nota(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LanguageVisitor ) return ((LanguageVisitor<? extends T>)visitor).visitDeclaracion_de_nota(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Declaracion_de_notaContext declaracion_de_nota() throws RecognitionException {
		Declaracion_de_notaContext _localctx = new Declaracion_de_notaContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_declaracion_de_nota);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(51);
			match(NOTA);
			setState(52);
			match(ID);
			setState(53);
			match(IGUAL);
			setState(54);
			match(NOTA);
			setState(55);
			match(PARENTESIS_IZQ);
			setState(56);
			tono();
			setState(57);
			match(COMA);
			setState(58);
			duracion();
			setState(59);
			match(COMA);
			setState(60);
			octava();
			setState(61);
			match(PARENTESIS_DER);
			setState(62);
			match(PUNTO_Y_COMA);
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
	public static class Declaracion_de_pausaContext extends ParserRuleContext {
		public List<TerminalNode> PAUSA() { return getTokens(LanguageParser.PAUSA); }
		public TerminalNode PAUSA(int i) {
			return getToken(LanguageParser.PAUSA, i);
		}
		public TerminalNode ID() { return getToken(LanguageParser.ID, 0); }
		public TerminalNode IGUAL() { return getToken(LanguageParser.IGUAL, 0); }
		public TerminalNode PARENTESIS_IZQ() { return getToken(LanguageParser.PARENTESIS_IZQ, 0); }
		public DuracionContext duracion() {
			return getRuleContext(DuracionContext.class,0);
		}
		public TerminalNode PARENTESIS_DER() { return getToken(LanguageParser.PARENTESIS_DER, 0); }
		public TerminalNode PUNTO_Y_COMA() { return getToken(LanguageParser.PUNTO_Y_COMA, 0); }
		public Declaracion_de_pausaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracion_de_pausa; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).enterDeclaracion_de_pausa(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).exitDeclaracion_de_pausa(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LanguageVisitor ) return ((LanguageVisitor<? extends T>)visitor).visitDeclaracion_de_pausa(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Declaracion_de_pausaContext declaracion_de_pausa() throws RecognitionException {
		Declaracion_de_pausaContext _localctx = new Declaracion_de_pausaContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_declaracion_de_pausa);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(64);
			match(PAUSA);
			setState(65);
			match(ID);
			setState(66);
			match(IGUAL);
			setState(67);
			match(PAUSA);
			setState(68);
			match(PARENTESIS_IZQ);
			setState(69);
			duracion();
			setState(70);
			match(PARENTESIS_DER);
			setState(71);
			match(PUNTO_Y_COMA);
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
	public static class Declaracion_de_secuenciaContext extends ParserRuleContext {
		public TerminalNode SECUENCIA() { return getToken(LanguageParser.SECUENCIA, 0); }
		public TerminalNode ID() { return getToken(LanguageParser.ID, 0); }
		public TerminalNode IGUAL() { return getToken(LanguageParser.IGUAL, 0); }
		public TerminalNode CORCHETE_IZQ() { return getToken(LanguageParser.CORCHETE_IZQ, 0); }
		public TerminalNode CORCHETE_DER() { return getToken(LanguageParser.CORCHETE_DER, 0); }
		public TerminalNode PUNTO_Y_COMA() { return getToken(LanguageParser.PUNTO_Y_COMA, 0); }
		public List<Elemento_secuenciaContext> elemento_secuencia() {
			return getRuleContexts(Elemento_secuenciaContext.class);
		}
		public Elemento_secuenciaContext elemento_secuencia(int i) {
			return getRuleContext(Elemento_secuenciaContext.class,i);
		}
		public Declaracion_de_secuenciaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracion_de_secuencia; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).enterDeclaracion_de_secuencia(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).exitDeclaracion_de_secuencia(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LanguageVisitor ) return ((LanguageVisitor<? extends T>)visitor).visitDeclaracion_de_secuencia(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Declaracion_de_secuenciaContext declaracion_de_secuencia() throws RecognitionException {
		Declaracion_de_secuenciaContext _localctx = new Declaracion_de_secuenciaContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_declaracion_de_secuencia);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(73);
			match(SECUENCIA);
			setState(74);
			match(ID);
			setState(75);
			match(IGUAL);
			setState(76);
			match(CORCHETE_IZQ);
			setState(80);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID) {
				{
				{
				setState(77);
				elemento_secuencia();
				}
				}
				setState(82);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(83);
			match(CORCHETE_DER);
			setState(84);
			match(PUNTO_Y_COMA);
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
	public static class Elemento_secuenciaContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(LanguageParser.ID, 0); }
		public TerminalNode COMA() { return getToken(LanguageParser.COMA, 0); }
		public Elemento_secuenciaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elemento_secuencia; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).enterElemento_secuencia(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).exitElemento_secuencia(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LanguageVisitor ) return ((LanguageVisitor<? extends T>)visitor).visitElemento_secuencia(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Elemento_secuenciaContext elemento_secuencia() throws RecognitionException {
		Elemento_secuenciaContext _localctx = new Elemento_secuenciaContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_elemento_secuencia);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(86);
			match(ID);
			setState(88);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMA) {
				{
				setState(87);
				match(COMA);
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
	public static class Declaracion_de_reproduccionContext extends ParserRuleContext {
		public TerminalNode REPRODUCIR() { return getToken(LanguageParser.REPRODUCIR, 0); }
		public TerminalNode PARENTESIS_IZQ() { return getToken(LanguageParser.PARENTESIS_IZQ, 0); }
		public TerminalNode ID() { return getToken(LanguageParser.ID, 0); }
		public TerminalNode PARENTESIS_DER() { return getToken(LanguageParser.PARENTESIS_DER, 0); }
		public TerminalNode PUNTO_Y_COMA() { return getToken(LanguageParser.PUNTO_Y_COMA, 0); }
		public Declaracion_de_reproduccionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracion_de_reproduccion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).enterDeclaracion_de_reproduccion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).exitDeclaracion_de_reproduccion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LanguageVisitor ) return ((LanguageVisitor<? extends T>)visitor).visitDeclaracion_de_reproduccion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Declaracion_de_reproduccionContext declaracion_de_reproduccion() throws RecognitionException {
		Declaracion_de_reproduccionContext _localctx = new Declaracion_de_reproduccionContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_declaracion_de_reproduccion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(90);
			match(REPRODUCIR);
			setState(91);
			match(PARENTESIS_IZQ);
			setState(92);
			match(ID);
			setState(93);
			match(PARENTESIS_DER);
			setState(94);
			match(PUNTO_Y_COMA);
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
	public static class Declaracion_de_bucleContext extends ParserRuleContext {
		public TerminalNode BUCLE() { return getToken(LanguageParser.BUCLE, 0); }
		public TerminalNode PARENTESIS_IZQ() { return getToken(LanguageParser.PARENTESIS_IZQ, 0); }
		public TerminalNode NUMERO() { return getToken(LanguageParser.NUMERO, 0); }
		public TerminalNode PARENTESIS_DER() { return getToken(LanguageParser.PARENTESIS_DER, 0); }
		public BloqueContext bloque() {
			return getRuleContext(BloqueContext.class,0);
		}
		public Declaracion_de_bucleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracion_de_bucle; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).enterDeclaracion_de_bucle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).exitDeclaracion_de_bucle(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LanguageVisitor ) return ((LanguageVisitor<? extends T>)visitor).visitDeclaracion_de_bucle(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Declaracion_de_bucleContext declaracion_de_bucle() throws RecognitionException {
		Declaracion_de_bucleContext _localctx = new Declaracion_de_bucleContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_declaracion_de_bucle);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(96);
			match(BUCLE);
			setState(97);
			match(PARENTESIS_IZQ);
			setState(98);
			match(NUMERO);
			setState(99);
			match(PARENTESIS_DER);
			setState(100);
			bloque();
			setState(101);
			match(T__2);
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
	public static class TonoContext extends ParserRuleContext {
		public TerminalNode TONO() { return getToken(LanguageParser.TONO, 0); }
		public TonoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tono; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).enterTono(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).exitTono(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LanguageVisitor ) return ((LanguageVisitor<? extends T>)visitor).visitTono(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TonoContext tono() throws RecognitionException {
		TonoContext _localctx = new TonoContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_tono);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(103);
			match(TONO);
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
	public static class DuracionContext extends ParserRuleContext {
		public TerminalNode DURACION() { return getToken(LanguageParser.DURACION, 0); }
		public DuracionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_duracion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).enterDuracion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).exitDuracion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LanguageVisitor ) return ((LanguageVisitor<? extends T>)visitor).visitDuracion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DuracionContext duracion() throws RecognitionException {
		DuracionContext _localctx = new DuracionContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_duracion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(105);
			match(DURACION);
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
	public static class OctavaContext extends ParserRuleContext {
		public TerminalNode OCTAVA() { return getToken(LanguageParser.OCTAVA, 0); }
		public OctavaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_octava; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).enterOctava(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).exitOctava(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LanguageVisitor ) return ((LanguageVisitor<? extends T>)visitor).visitOctava(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OctavaContext octava() throws RecognitionException {
		OctavaContext _localctx = new OctavaContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_octava);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(107);
			match(OCTAVA);
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

	public static final String _serializedATN =
		"\u0004\u0001\u0018n\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0005\u0001\u001e"+
		"\b\u0001\n\u0001\f\u0001!\t\u0001\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0003\u00022\b\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0005\u0005"+
		"O\b\u0005\n\u0005\f\u0005R\t\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0006\u0001\u0006\u0003\u0006Y\b\u0006\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\n\u0001\n\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0000\u0000\f\u0000\u0002\u0004\u0006\b"+
		"\n\f\u000e\u0010\u0012\u0014\u0016\u0000\u0000h\u0000\u0018\u0001\u0000"+
		"\u0000\u0000\u0002\u001f\u0001\u0000\u0000\u0000\u00041\u0001\u0000\u0000"+
		"\u0000\u00063\u0001\u0000\u0000\u0000\b@\u0001\u0000\u0000\u0000\nI\u0001"+
		"\u0000\u0000\u0000\fV\u0001\u0000\u0000\u0000\u000eZ\u0001\u0000\u0000"+
		"\u0000\u0010`\u0001\u0000\u0000\u0000\u0012g\u0001\u0000\u0000\u0000\u0014"+
		"i\u0001\u0000\u0000\u0000\u0016k\u0001\u0000\u0000\u0000\u0018\u0019\u0005"+
		"\u0001\u0000\u0000\u0019\u001a\u0003\u0002\u0001\u0000\u001a\u001b\u0005"+
		"\u0002\u0000\u0000\u001b\u0001\u0001\u0000\u0000\u0000\u001c\u001e\u0003"+
		"\u0004\u0002\u0000\u001d\u001c\u0001\u0000\u0000\u0000\u001e!\u0001\u0000"+
		"\u0000\u0000\u001f\u001d\u0001\u0000\u0000\u0000\u001f \u0001\u0000\u0000"+
		"\u0000 \u0003\u0001\u0000\u0000\u0000!\u001f\u0001\u0000\u0000\u0000\""+
		"#\u0003\u0006\u0003\u0000#$\u0006\u0002\uffff\uffff\u0000$2\u0001\u0000"+
		"\u0000\u0000%&\u0003\b\u0004\u0000&\'\u0006\u0002\uffff\uffff\u0000\'"+
		"2\u0001\u0000\u0000\u0000()\u0003\n\u0005\u0000)*\u0006\u0002\uffff\uffff"+
		"\u0000*2\u0001\u0000\u0000\u0000+,\u0003\u000e\u0007\u0000,-\u0006\u0002"+
		"\uffff\uffff\u0000-2\u0001\u0000\u0000\u0000./\u0003\u0010\b\u0000/0\u0006"+
		"\u0002\uffff\uffff\u000002\u0001\u0000\u0000\u00001\"\u0001\u0000\u0000"+
		"\u00001%\u0001\u0000\u0000\u00001(\u0001\u0000\u0000\u00001+\u0001\u0000"+
		"\u0000\u00001.\u0001\u0000\u0000\u00002\u0005\u0001\u0000\u0000\u0000"+
		"34\u0005\u0004\u0000\u000045\u0005\u0012\u0000\u000056\u0005\t\u0000\u0000"+
		"67\u0005\u0004\u0000\u000078\u0005\n\u0000\u000089\u0003\u0012\t\u0000"+
		"9:\u0005\u000e\u0000\u0000:;\u0003\u0014\n\u0000;<\u0005\u000e\u0000\u0000"+
		"<=\u0003\u0016\u000b\u0000=>\u0005\u000b\u0000\u0000>?\u0005\u000f\u0000"+
		"\u0000?\u0007\u0001\u0000\u0000\u0000@A\u0005\u0005\u0000\u0000AB\u0005"+
		"\u0012\u0000\u0000BC\u0005\t\u0000\u0000CD\u0005\u0005\u0000\u0000DE\u0005"+
		"\n\u0000\u0000EF\u0003\u0014\n\u0000FG\u0005\u000b\u0000\u0000GH\u0005"+
		"\u000f\u0000\u0000H\t\u0001\u0000\u0000\u0000IJ\u0005\u0006\u0000\u0000"+
		"JK\u0005\u0012\u0000\u0000KL\u0005\t\u0000\u0000LP\u0005\f\u0000\u0000"+
		"MO\u0003\f\u0006\u0000NM\u0001\u0000\u0000\u0000OR\u0001\u0000\u0000\u0000"+
		"PN\u0001\u0000\u0000\u0000PQ\u0001\u0000\u0000\u0000QS\u0001\u0000\u0000"+
		"\u0000RP\u0001\u0000\u0000\u0000ST\u0005\r\u0000\u0000TU\u0005\u000f\u0000"+
		"\u0000U\u000b\u0001\u0000\u0000\u0000VX\u0005\u0012\u0000\u0000WY\u0005"+
		"\u000e\u0000\u0000XW\u0001\u0000\u0000\u0000XY\u0001\u0000\u0000\u0000"+
		"Y\r\u0001\u0000\u0000\u0000Z[\u0005\u0007\u0000\u0000[\\\u0005\n\u0000"+
		"\u0000\\]\u0005\u0012\u0000\u0000]^\u0005\u000b\u0000\u0000^_\u0005\u000f"+
		"\u0000\u0000_\u000f\u0001\u0000\u0000\u0000`a\u0005\b\u0000\u0000ab\u0005"+
		"\n\u0000\u0000bc\u0005\u0013\u0000\u0000cd\u0005\u000b\u0000\u0000de\u0003"+
		"\u0002\u0001\u0000ef\u0005\u0003\u0000\u0000f\u0011\u0001\u0000\u0000"+
		"\u0000gh\u0005\u0011\u0000\u0000h\u0013\u0001\u0000\u0000\u0000ij\u0005"+
		"\u0015\u0000\u0000j\u0015\u0001\u0000\u0000\u0000kl\u0005\u0014\u0000"+
		"\u0000l\u0017\u0001\u0000\u0000\u0000\u0004\u001f1PX";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}