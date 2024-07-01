// Generated from Language.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link LanguageParser}.
 */
public interface LanguageListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link LanguageParser#programa}.
	 * @param ctx the parse tree
	 */
	void enterPrograma(LanguageParser.ProgramaContext ctx);
	/**
	 * Exit a parse tree produced by {@link LanguageParser#programa}.
	 * @param ctx the parse tree
	 */
	void exitPrograma(LanguageParser.ProgramaContext ctx);
	/**
	 * Enter a parse tree produced by {@link LanguageParser#bloque}.
	 * @param ctx the parse tree
	 */
	void enterBloque(LanguageParser.BloqueContext ctx);
	/**
	 * Exit a parse tree produced by {@link LanguageParser#bloque}.
	 * @param ctx the parse tree
	 */
	void exitBloque(LanguageParser.BloqueContext ctx);
	/**
	 * Enter a parse tree produced by {@link LanguageParser#declaracion}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracion(LanguageParser.DeclaracionContext ctx);
	/**
	 * Exit a parse tree produced by {@link LanguageParser#declaracion}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracion(LanguageParser.DeclaracionContext ctx);
	/**
	 * Enter a parse tree produced by {@link LanguageParser#declaracion_de_nota}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracion_de_nota(LanguageParser.Declaracion_de_notaContext ctx);
	/**
	 * Exit a parse tree produced by {@link LanguageParser#declaracion_de_nota}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracion_de_nota(LanguageParser.Declaracion_de_notaContext ctx);
	/**
	 * Enter a parse tree produced by {@link LanguageParser#declaracion_de_pausa}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracion_de_pausa(LanguageParser.Declaracion_de_pausaContext ctx);
	/**
	 * Exit a parse tree produced by {@link LanguageParser#declaracion_de_pausa}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracion_de_pausa(LanguageParser.Declaracion_de_pausaContext ctx);
	/**
	 * Enter a parse tree produced by {@link LanguageParser#declaracion_de_secuencia}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracion_de_secuencia(LanguageParser.Declaracion_de_secuenciaContext ctx);
	/**
	 * Exit a parse tree produced by {@link LanguageParser#declaracion_de_secuencia}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracion_de_secuencia(LanguageParser.Declaracion_de_secuenciaContext ctx);
	/**
	 * Enter a parse tree produced by {@link LanguageParser#elemento_secuencia}.
	 * @param ctx the parse tree
	 */
	void enterElemento_secuencia(LanguageParser.Elemento_secuenciaContext ctx);
	/**
	 * Exit a parse tree produced by {@link LanguageParser#elemento_secuencia}.
	 * @param ctx the parse tree
	 */
	void exitElemento_secuencia(LanguageParser.Elemento_secuenciaContext ctx);
	/**
	 * Enter a parse tree produced by {@link LanguageParser#declaracion_de_reproduccion}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracion_de_reproduccion(LanguageParser.Declaracion_de_reproduccionContext ctx);
	/**
	 * Exit a parse tree produced by {@link LanguageParser#declaracion_de_reproduccion}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracion_de_reproduccion(LanguageParser.Declaracion_de_reproduccionContext ctx);
	/**
	 * Enter a parse tree produced by {@link LanguageParser#declaracion_de_bucle}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracion_de_bucle(LanguageParser.Declaracion_de_bucleContext ctx);
	/**
	 * Exit a parse tree produced by {@link LanguageParser#declaracion_de_bucle}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracion_de_bucle(LanguageParser.Declaracion_de_bucleContext ctx);
	/**
	 * Enter a parse tree produced by {@link LanguageParser#tono}.
	 * @param ctx the parse tree
	 */
	void enterTono(LanguageParser.TonoContext ctx);
	/**
	 * Exit a parse tree produced by {@link LanguageParser#tono}.
	 * @param ctx the parse tree
	 */
	void exitTono(LanguageParser.TonoContext ctx);
	/**
	 * Enter a parse tree produced by {@link LanguageParser#duracion}.
	 * @param ctx the parse tree
	 */
	void enterDuracion(LanguageParser.DuracionContext ctx);
	/**
	 * Exit a parse tree produced by {@link LanguageParser#duracion}.
	 * @param ctx the parse tree
	 */
	void exitDuracion(LanguageParser.DuracionContext ctx);
	/**
	 * Enter a parse tree produced by {@link LanguageParser#octava}.
	 * @param ctx the parse tree
	 */
	void enterOctava(LanguageParser.OctavaContext ctx);
	/**
	 * Exit a parse tree produced by {@link LanguageParser#octava}.
	 * @param ctx the parse tree
	 */
	void exitOctava(LanguageParser.OctavaContext ctx);
}