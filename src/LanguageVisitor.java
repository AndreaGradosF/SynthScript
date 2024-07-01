// Generated from Language.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link LanguageParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface LanguageVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link LanguageParser#programa}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrograma(LanguageParser.ProgramaContext ctx);
	/**
	 * Visit a parse tree produced by {@link LanguageParser#bloque}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBloque(LanguageParser.BloqueContext ctx);
	/**
	 * Visit a parse tree produced by {@link LanguageParser#declaracion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracion(LanguageParser.DeclaracionContext ctx);
	/**
	 * Visit a parse tree produced by {@link LanguageParser#declaracion_de_nota}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracion_de_nota(LanguageParser.Declaracion_de_notaContext ctx);
	/**
	 * Visit a parse tree produced by {@link LanguageParser#declaracion_de_pausa}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracion_de_pausa(LanguageParser.Declaracion_de_pausaContext ctx);
	/**
	 * Visit a parse tree produced by {@link LanguageParser#declaracion_de_secuencia}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracion_de_secuencia(LanguageParser.Declaracion_de_secuenciaContext ctx);
	/**
	 * Visit a parse tree produced by {@link LanguageParser#elemento_secuencia}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElemento_secuencia(LanguageParser.Elemento_secuenciaContext ctx);
	/**
	 * Visit a parse tree produced by {@link LanguageParser#declaracion_de_reproduccion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracion_de_reproduccion(LanguageParser.Declaracion_de_reproduccionContext ctx);
	/**
	 * Visit a parse tree produced by {@link LanguageParser#declaracion_de_bucle}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracion_de_bucle(LanguageParser.Declaracion_de_bucleContext ctx);
	/**
	 * Visit a parse tree produced by {@link LanguageParser#tono}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTono(LanguageParser.TonoContext ctx);
	/**
	 * Visit a parse tree produced by {@link LanguageParser#duracion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDuracion(LanguageParser.DuracionContext ctx);
	/**
	 * Visit a parse tree produced by {@link LanguageParser#octava}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOctava(LanguageParser.OctavaContext ctx);
}