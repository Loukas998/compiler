// Generated from C:/Users/ASUS/Documents/GitHub3/angular-compiler/src/Angular/AngularParser.g4 by ANTLR 4.13.2
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
	 * Visit a parse tree produced by {@link AngularParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(AngularParser.ProgContext ctx);
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
	 * Visit a parse tree produced by the {@code ComponentDeclaration}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComponentDeclaration(AngularParser.ComponentDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Class}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClass(AngularParser.ClassContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Function}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction(AngularParser.FunctionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FunctionStatements}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionStatements(AngularParser.FunctionStatementsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FunctionSummoning}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionSummoning(AngularParser.FunctionSummoningContext ctx);
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
	 * Visit a parse tree produced by {@link AngularParser#interfaceBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceBody(AngularParser.InterfaceBodyContext ctx);
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
	 * Visit a parse tree produced by {@link AngularParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue(AngularParser.ValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#componenetDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComponenetDeclaration(AngularParser.ComponenetDeclarationContext ctx);
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
	 * Visit a parse tree produced by {@link AngularParser#genericStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGenericStatement(AngularParser.GenericStatementContext ctx);
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
	 * Visit a parse tree produced by {@link AngularParser#variableMaking}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableMaking(AngularParser.VariableMakingContext ctx);
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
	 * Visit a parse tree produced by {@link AngularParser#conditionalStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionalStatement(AngularParser.ConditionalStatementContext ctx);
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
	 * Visit a parse tree produced by {@link AngularParser#forBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForBody(AngularParser.ForBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#jsonObject}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJsonObject(AngularParser.JsonObjectContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#attribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttribute(AngularParser.AttributeContext ctx);
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
	 * Visit a parse tree produced by {@link AngularParser#htmlTags}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlTags(AngularParser.HtmlTagsContext ctx);
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