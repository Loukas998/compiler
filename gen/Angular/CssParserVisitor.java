// Generated from C:/Users/LOQ/Documents/Github/compiler/src/Angular/CssParser.g4 by ANTLR 4.13.2
package Angular;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link CssParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface CssParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link CssParser#cssElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCssElement(CssParser.CssElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link CssParser#selector}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelector(CssParser.SelectorContext ctx);
	/**
	 * Visit a parse tree produced by {@link CssParser#simpleSelector}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleSelector(CssParser.SimpleSelectorContext ctx);
	/**
	 * Visit a parse tree produced by {@link CssParser#cssProperty}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCssProperty(CssParser.CssPropertyContext ctx);
	/**
	 * Visit a parse tree produced by {@link CssParser#css}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCss(CssParser.CssContext ctx);
	/**
	 * Visit a parse tree produced by {@link CssParser#cssValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCssValue(CssParser.CssValueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code UnitNumberList}
	 * labeled alternative in {@link CssParser#decimalLiteral_UNIT}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnitNumberList(CssParser.UnitNumberListContext ctx);
	/**
	 * Visit a parse tree produced by the {@code UnitSolidColor}
	 * labeled alternative in {@link CssParser#decimalLiteral_UNIT}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnitSolidColor(CssParser.UnitSolidColorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BackgroundColorUnit}
	 * labeled alternative in {@link CssParser#decimalLiteral_UNIT}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBackgroundColorUnit(CssParser.BackgroundColorUnitContext ctx);
	/**
	 * Visit a parse tree produced by the {@code GeneralUnit}
	 * labeled alternative in {@link CssParser#decimalLiteral_UNIT}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGeneralUnit(CssParser.GeneralUnitContext ctx);
	/**
	 * Visit a parse tree produced by {@link CssParser#decimalLiteralUnit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecimalLiteralUnit(CssParser.DecimalLiteralUnitContext ctx);
	/**
	 * Visit a parse tree produced by {@link CssParser#decimalLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecimalLiteral(CssParser.DecimalLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link CssParser#tagName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTagName(CssParser.TagNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link CssParser#eos}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEos(CssParser.EosContext ctx);
	/**
	 * Visit a parse tree produced by {@link CssParser#unit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnit(CssParser.UnitContext ctx);
}