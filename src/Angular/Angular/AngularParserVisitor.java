// Generated from C:/Users/LOQ/Documents/Github/compiler/src/Angular/AngularParser.g4 by ANTLR 4.13.2
package Angular;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link AngularParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface AngularParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by the {@code Program}
	 * labeled alternative in {@link AngularParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(AngularParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Import}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImport(AngularParser.ImportContext ctx);
	/**
	 * Visit a parse tree produced by the {@code InterfaceDecl}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceDecl(AngularParser.InterfaceDeclContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Component}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComponent(AngularParser.ComponentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Class}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClass(AngularParser.ClassContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Generic}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGeneric(AngularParser.GenericContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#importStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportStatement(AngularParser.ImportStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#interface}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterface(AngularParser.InterfaceContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#variableNaming}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableNaming(AngularParser.VariableNamingContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#varType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarType(AngularParser.VarTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#string}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString(AngularParser.StringContext ctx);
	/**
	 * Visit a parse tree produced by the {@code EventValue}
	 * labeled alternative in {@link AngularParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEventValue(AngularParser.EventValueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code HtmlTagValue}
	 * labeled alternative in {@link AngularParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlTagValue(AngularParser.HtmlTagValueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code VariableValue}
	 * labeled alternative in {@link AngularParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableValue(AngularParser.VariableValueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ValueDotValue}
	 * labeled alternative in {@link AngularParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValueDotValue(AngularParser.ValueDotValueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FunctionSummoning}
	 * labeled alternative in {@link AngularParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionSummoning(AngularParser.FunctionSummoningContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NullableValue}
	 * labeled alternative in {@link AngularParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNullableValue(AngularParser.NullableValueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NullableDotValue}
	 * labeled alternative in {@link AngularParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNullableDotValue(AngularParser.NullableDotValueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Function}
	 * labeled alternative in {@link AngularParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction(AngularParser.FunctionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FunctionStatement}
	 * labeled alternative in {@link AngularParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionStatement(AngularParser.FunctionStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ValueOrValue}
	 * labeled alternative in {@link AngularParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValueOrValue(AngularParser.ValueOrValueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NullValue}
	 * labeled alternative in {@link AngularParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNullValue(AngularParser.NullValueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DecimalNumberValue}
	 * labeled alternative in {@link AngularParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecimalNumberValue(AngularParser.DecimalNumberValueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StringValue}
	 * labeled alternative in {@link AngularParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringValue(AngularParser.StringValueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ArrayInfoValue}
	 * labeled alternative in {@link AngularParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayInfoValue(AngularParser.ArrayInfoValueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code JsonObjectValue}
	 * labeled alternative in {@link AngularParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJsonObjectValue(AngularParser.JsonObjectValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#componentDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComponentDeclaration(AngularParser.ComponentDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Select}
	 * labeled alternative in {@link AngularParser#componentInfo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelect(AngularParser.SelectContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TempUrl}
	 * labeled alternative in {@link AngularParser#componentInfo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTempUrl(AngularParser.TempUrlContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Styles}
	 * labeled alternative in {@link AngularParser#componentInfo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStyles(AngularParser.StylesContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StandaloneStatus}
	 * labeled alternative in {@link AngularParser#componentInfo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStandaloneStatus(AngularParser.StandaloneStatusContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Importss}
	 * labeled alternative in {@link AngularParser#componentInfo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportss(AngularParser.ImportssContext ctx);
	/**
	 * Visit a parse tree produced by the {@code VariableDecl}
	 * labeled alternative in {@link AngularParser#genericStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDecl(AngularParser.VariableDeclContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ArrayDecl}
	 * labeled alternative in {@link AngularParser#genericStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayDecl(AngularParser.ArrayDeclContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Assign}
	 * labeled alternative in {@link AngularParser#genericStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign(AngularParser.AssignContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Return}
	 * labeled alternative in {@link AngularParser#genericStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturn(AngularParser.ReturnContext ctx);
	/**
	 * Visit a parse tree produced by the {@code If}
	 * labeled alternative in {@link AngularParser#genericStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf(AngularParser.IfContext ctx);
	/**
	 * Visit a parse tree produced by the {@code For}
	 * labeled alternative in {@link AngularParser#genericStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor(AngularParser.ForContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ValueType}
	 * labeled alternative in {@link AngularParser#genericStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValueType(AngularParser.ValueTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#classStructure}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassStructure(AngularParser.ClassStructureContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#variableDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclaration(AngularParser.VariableDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#arrayDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayDeclaration(AngularParser.ArrayDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#arrayInfo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayInfo(AngularParser.ArrayInfoContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#functionDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDeclaration(AngularParser.FunctionDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#functionBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionBody(AngularParser.FunctionBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#functionCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCall(AngularParser.FunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#assignStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignStatement(AngularParser.AssignStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#thisorId}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitThisorId(AngularParser.ThisorIdContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#returnStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnStatement(AngularParser.ReturnStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#ifStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStatement(AngularParser.IfStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ConditionalStatement}
	 * labeled alternative in {@link AngularParser#conditionalState}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionalStatement(AngularParser.ConditionalStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code VariableName}
	 * labeled alternative in {@link AngularParser#conditionalState}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableName(AngularParser.VariableNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#logicalOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalOp(AngularParser.LogicalOpContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#logicalStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalStatement(AngularParser.LogicalStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#forLoop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForLoop(AngularParser.ForLoopContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SingleLineForLoop}
	 * labeled alternative in {@link AngularParser#forBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingleLineForLoop(AngularParser.SingleLineForLoopContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MultipleLinesForLoop}
	 * labeled alternative in {@link AngularParser#forBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultipleLinesForLoop(AngularParser.MultipleLinesForLoopContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#jsonObject}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJsonObject(AngularParser.JsonObjectContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NgFor}
	 * labeled alternative in {@link AngularParser#attribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNgFor(AngularParser.NgForContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NgIf}
	 * labeled alternative in {@link AngularParser#attribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNgIf(AngularParser.NgIfContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DoubleQuotedAttribute}
	 * labeled alternative in {@link AngularParser#attribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDoubleQuotedAttribute(AngularParser.DoubleQuotedAttributeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code OpenBracketAttribute}
	 * labeled alternative in {@link AngularParser#attribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpenBracketAttribute(AngularParser.OpenBracketAttributeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code OpenParenAttribute}
	 * labeled alternative in {@link AngularParser#attribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpenParenAttribute(AngularParser.OpenParenAttributeContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#ngForStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNgForStatement(AngularParser.NgForStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#ngIfStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNgIfStatement(AngularParser.NgIfStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PairedTag}
	 * labeled alternative in {@link AngularParser#htmlTags}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPairedTag(AngularParser.PairedTagContext ctx);
	/**
	 * Visit a parse tree produced by the {@code UnpairedTag}
	 * labeled alternative in {@link AngularParser#htmlTags}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnpairedTag(AngularParser.UnpairedTagContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NormalHtmlText}
	 * labeled alternative in {@link AngularParser#htmlTags}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNormalHtmlText(AngularParser.NormalHtmlTextContext ctx);
	/**
	 * Visit a parse tree produced by the {@code HtmlInterpolation}
	 * labeled alternative in {@link AngularParser#htmlTags}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlInterpolation(AngularParser.HtmlInterpolationContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#interpolation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterpolation(AngularParser.InterpolationContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#openTag}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpenTag(AngularParser.OpenTagContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#closeTag}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCloseTag(AngularParser.CloseTagContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#selfClosingTag}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelfClosingTag(AngularParser.SelfClosingTagContext ctx);
}