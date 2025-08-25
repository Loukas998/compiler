// Generated from C:/Users/LOQ/Documents/Github/compiler/src/Angular/CssParser.g4 by ANTLR 4.13.2
package Angular;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CssParser}.
 */
public interface CssParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CssParser#cssElement}.
	 * @param ctx the parse tree
	 */
	void enterCssElement(CssParser.CssElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CssParser#cssElement}.
	 * @param ctx the parse tree
	 */
	void exitCssElement(CssParser.CssElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CssParser#selector}.
	 * @param ctx the parse tree
	 */
	void enterSelector(CssParser.SelectorContext ctx);
	/**
	 * Exit a parse tree produced by {@link CssParser#selector}.
	 * @param ctx the parse tree
	 */
	void exitSelector(CssParser.SelectorContext ctx);
	/**
	 * Enter a parse tree produced by {@link CssParser#simpleSelector}.
	 * @param ctx the parse tree
	 */
	void enterSimpleSelector(CssParser.SimpleSelectorContext ctx);
	/**
	 * Exit a parse tree produced by {@link CssParser#simpleSelector}.
	 * @param ctx the parse tree
	 */
	void exitSimpleSelector(CssParser.SimpleSelectorContext ctx);
	/**
	 * Enter a parse tree produced by {@link CssParser#cssProperty}.
	 * @param ctx the parse tree
	 */
	void enterCssProperty(CssParser.CssPropertyContext ctx);
	/**
	 * Exit a parse tree produced by {@link CssParser#cssProperty}.
	 * @param ctx the parse tree
	 */
	void exitCssProperty(CssParser.CssPropertyContext ctx);
	/**
	 * Enter a parse tree produced by {@link CssParser#css}.
	 * @param ctx the parse tree
	 */
	void enterCss(CssParser.CssContext ctx);
	/**
	 * Exit a parse tree produced by {@link CssParser#css}.
	 * @param ctx the parse tree
	 */
	void exitCss(CssParser.CssContext ctx);
	/**
	 * Enter a parse tree produced by {@link CssParser#cssValue}.
	 * @param ctx the parse tree
	 */
	void enterCssValue(CssParser.CssValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link CssParser#cssValue}.
	 * @param ctx the parse tree
	 */
	void exitCssValue(CssParser.CssValueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code UnitNumberList}
	 * labeled alternative in {@link CssParser#decimalLiteral_UNIT}.
	 * @param ctx the parse tree
	 */
	void enterUnitNumberList(CssParser.UnitNumberListContext ctx);
	/**
	 * Exit a parse tree produced by the {@code UnitNumberList}
	 * labeled alternative in {@link CssParser#decimalLiteral_UNIT}.
	 * @param ctx the parse tree
	 */
	void exitUnitNumberList(CssParser.UnitNumberListContext ctx);
	/**
	 * Enter a parse tree produced by the {@code UnitSolidColor}
	 * labeled alternative in {@link CssParser#decimalLiteral_UNIT}.
	 * @param ctx the parse tree
	 */
	void enterUnitSolidColor(CssParser.UnitSolidColorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code UnitSolidColor}
	 * labeled alternative in {@link CssParser#decimalLiteral_UNIT}.
	 * @param ctx the parse tree
	 */
	void exitUnitSolidColor(CssParser.UnitSolidColorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BackgroundColorUnit}
	 * labeled alternative in {@link CssParser#decimalLiteral_UNIT}.
	 * @param ctx the parse tree
	 */
	void enterBackgroundColorUnit(CssParser.BackgroundColorUnitContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BackgroundColorUnit}
	 * labeled alternative in {@link CssParser#decimalLiteral_UNIT}.
	 * @param ctx the parse tree
	 */
	void exitBackgroundColorUnit(CssParser.BackgroundColorUnitContext ctx);
	/**
	 * Enter a parse tree produced by the {@code GeneralUnit}
	 * labeled alternative in {@link CssParser#decimalLiteral_UNIT}.
	 * @param ctx the parse tree
	 */
	void enterGeneralUnit(CssParser.GeneralUnitContext ctx);
	/**
	 * Exit a parse tree produced by the {@code GeneralUnit}
	 * labeled alternative in {@link CssParser#decimalLiteral_UNIT}.
	 * @param ctx the parse tree
	 */
	void exitGeneralUnit(CssParser.GeneralUnitContext ctx);
	/**
	 * Enter a parse tree produced by {@link CssParser#decimalLiteralUnit}.
	 * @param ctx the parse tree
	 */
	void enterDecimalLiteralUnit(CssParser.DecimalLiteralUnitContext ctx);
	/**
	 * Exit a parse tree produced by {@link CssParser#decimalLiteralUnit}.
	 * @param ctx the parse tree
	 */
	void exitDecimalLiteralUnit(CssParser.DecimalLiteralUnitContext ctx);
	/**
	 * Enter a parse tree produced by {@link CssParser#decimalLiteral}.
	 * @param ctx the parse tree
	 */
	void enterDecimalLiteral(CssParser.DecimalLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link CssParser#decimalLiteral}.
	 * @param ctx the parse tree
	 */
	void exitDecimalLiteral(CssParser.DecimalLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link CssParser#tagName}.
	 * @param ctx the parse tree
	 */
	void enterTagName(CssParser.TagNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link CssParser#tagName}.
	 * @param ctx the parse tree
	 */
	void exitTagName(CssParser.TagNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link CssParser#eos}.
	 * @param ctx the parse tree
	 */
	void enterEos(CssParser.EosContext ctx);
	/**
	 * Exit a parse tree produced by {@link CssParser#eos}.
	 * @param ctx the parse tree
	 */
	void exitEos(CssParser.EosContext ctx);
	/**
	 * Enter a parse tree produced by {@link CssParser#unit}.
	 * @param ctx the parse tree
	 */
	void enterUnit(CssParser.UnitContext ctx);
	/**
	 * Exit a parse tree produced by {@link CssParser#unit}.
	 * @param ctx the parse tree
	 */
	void exitUnit(CssParser.UnitContext ctx);
}