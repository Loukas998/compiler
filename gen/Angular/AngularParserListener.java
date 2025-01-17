// Generated from C:/Users/ASUS/Documents/GitHub3/angular-compiler/src/Angular/AngularParser.g4 by ANTLR 4.13.2
package Angular;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link AngularParser}.
 */
public interface AngularParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link AngularParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(AngularParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(AngularParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Import}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterImport(AngularParser.ImportContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Import}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitImport(AngularParser.ImportContext ctx);
	/**
	 * Enter a parse tree produced by the {@code InterfaceDecl}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceDecl(AngularParser.InterfaceDeclContext ctx);
	/**
	 * Exit a parse tree produced by the {@code InterfaceDecl}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceDecl(AngularParser.InterfaceDeclContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ComponentDeclaration}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterComponentDeclaration(AngularParser.ComponentDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ComponentDeclaration}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitComponentDeclaration(AngularParser.ComponentDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Class}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterClass(AngularParser.ClassContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Class}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitClass(AngularParser.ClassContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Function}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterFunction(AngularParser.FunctionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Function}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitFunction(AngularParser.FunctionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FunctionStatements}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterFunctionStatements(AngularParser.FunctionStatementsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FunctionStatements}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitFunctionStatements(AngularParser.FunctionStatementsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FunctionSummoning}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterFunctionSummoning(AngularParser.FunctionSummoningContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FunctionSummoning}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitFunctionSummoning(AngularParser.FunctionSummoningContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Generic}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterGeneric(AngularParser.GenericContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Generic}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitGeneric(AngularParser.GenericContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#importStatement}.
	 * @param ctx the parse tree
	 */
	void enterImportStatement(AngularParser.ImportStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#importStatement}.
	 * @param ctx the parse tree
	 */
	void exitImportStatement(AngularParser.ImportStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#interface}.
	 * @param ctx the parse tree
	 */
	void enterInterface(AngularParser.InterfaceContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#interface}.
	 * @param ctx the parse tree
	 */
	void exitInterface(AngularParser.InterfaceContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#interfaceBody}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceBody(AngularParser.InterfaceBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#interfaceBody}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceBody(AngularParser.InterfaceBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#variableNaming}.
	 * @param ctx the parse tree
	 */
	void enterVariableNaming(AngularParser.VariableNamingContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#variableNaming}.
	 * @param ctx the parse tree
	 */
	void exitVariableNaming(AngularParser.VariableNamingContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#varType}.
	 * @param ctx the parse tree
	 */
	void enterVarType(AngularParser.VarTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#varType}.
	 * @param ctx the parse tree
	 */
	void exitVarType(AngularParser.VarTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#string}.
	 * @param ctx the parse tree
	 */
	void enterString(AngularParser.StringContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#string}.
	 * @param ctx the parse tree
	 */
	void exitString(AngularParser.StringContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(AngularParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(AngularParser.ValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#componenetDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterComponenetDeclaration(AngularParser.ComponenetDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#componenetDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitComponenetDeclaration(AngularParser.ComponenetDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Select}
	 * labeled alternative in {@link AngularParser#componentInfo}.
	 * @param ctx the parse tree
	 */
	void enterSelect(AngularParser.SelectContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Select}
	 * labeled alternative in {@link AngularParser#componentInfo}.
	 * @param ctx the parse tree
	 */
	void exitSelect(AngularParser.SelectContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TempUrl}
	 * labeled alternative in {@link AngularParser#componentInfo}.
	 * @param ctx the parse tree
	 */
	void enterTempUrl(AngularParser.TempUrlContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TempUrl}
	 * labeled alternative in {@link AngularParser#componentInfo}.
	 * @param ctx the parse tree
	 */
	void exitTempUrl(AngularParser.TempUrlContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Styles}
	 * labeled alternative in {@link AngularParser#componentInfo}.
	 * @param ctx the parse tree
	 */
	void enterStyles(AngularParser.StylesContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Styles}
	 * labeled alternative in {@link AngularParser#componentInfo}.
	 * @param ctx the parse tree
	 */
	void exitStyles(AngularParser.StylesContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StandaloneStatus}
	 * labeled alternative in {@link AngularParser#componentInfo}.
	 * @param ctx the parse tree
	 */
	void enterStandaloneStatus(AngularParser.StandaloneStatusContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StandaloneStatus}
	 * labeled alternative in {@link AngularParser#componentInfo}.
	 * @param ctx the parse tree
	 */
	void exitStandaloneStatus(AngularParser.StandaloneStatusContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Importss}
	 * labeled alternative in {@link AngularParser#componentInfo}.
	 * @param ctx the parse tree
	 */
	void enterImportss(AngularParser.ImportssContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Importss}
	 * labeled alternative in {@link AngularParser#componentInfo}.
	 * @param ctx the parse tree
	 */
	void exitImportss(AngularParser.ImportssContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#genericStatement}.
	 * @param ctx the parse tree
	 */
	void enterGenericStatement(AngularParser.GenericStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#genericStatement}.
	 * @param ctx the parse tree
	 */
	void exitGenericStatement(AngularParser.GenericStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#classStructure}.
	 * @param ctx the parse tree
	 */
	void enterClassStructure(AngularParser.ClassStructureContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#classStructure}.
	 * @param ctx the parse tree
	 */
	void exitClassStructure(AngularParser.ClassStructureContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclaration(AngularParser.VariableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclaration(AngularParser.VariableDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#arrayDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterArrayDeclaration(AngularParser.ArrayDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#arrayDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitArrayDeclaration(AngularParser.ArrayDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#arrayInfo}.
	 * @param ctx the parse tree
	 */
	void enterArrayInfo(AngularParser.ArrayInfoContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#arrayInfo}.
	 * @param ctx the parse tree
	 */
	void exitArrayInfo(AngularParser.ArrayInfoContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#variableMaking}.
	 * @param ctx the parse tree
	 */
	void enterVariableMaking(AngularParser.VariableMakingContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#variableMaking}.
	 * @param ctx the parse tree
	 */
	void exitVariableMaking(AngularParser.VariableMakingContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#functionDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDeclaration(AngularParser.FunctionDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#functionDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDeclaration(AngularParser.FunctionDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#functionBody}.
	 * @param ctx the parse tree
	 */
	void enterFunctionBody(AngularParser.FunctionBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#functionBody}.
	 * @param ctx the parse tree
	 */
	void exitFunctionBody(AngularParser.FunctionBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCall(AngularParser.FunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCall(AngularParser.FunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#assignStatement}.
	 * @param ctx the parse tree
	 */
	void enterAssignStatement(AngularParser.AssignStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#assignStatement}.
	 * @param ctx the parse tree
	 */
	void exitAssignStatement(AngularParser.AssignStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void enterReturnStatement(AngularParser.ReturnStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void exitReturnStatement(AngularParser.ReturnStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(AngularParser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(AngularParser.IfStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#conditionalStatement}.
	 * @param ctx the parse tree
	 */
	void enterConditionalStatement(AngularParser.ConditionalStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#conditionalStatement}.
	 * @param ctx the parse tree
	 */
	void exitConditionalStatement(AngularParser.ConditionalStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#logicalOp}.
	 * @param ctx the parse tree
	 */
	void enterLogicalOp(AngularParser.LogicalOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#logicalOp}.
	 * @param ctx the parse tree
	 */
	void exitLogicalOp(AngularParser.LogicalOpContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#logicalStatement}.
	 * @param ctx the parse tree
	 */
	void enterLogicalStatement(AngularParser.LogicalStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#logicalStatement}.
	 * @param ctx the parse tree
	 */
	void exitLogicalStatement(AngularParser.LogicalStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#forLoop}.
	 * @param ctx the parse tree
	 */
	void enterForLoop(AngularParser.ForLoopContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#forLoop}.
	 * @param ctx the parse tree
	 */
	void exitForLoop(AngularParser.ForLoopContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#forBody}.
	 * @param ctx the parse tree
	 */
	void enterForBody(AngularParser.ForBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#forBody}.
	 * @param ctx the parse tree
	 */
	void exitForBody(AngularParser.ForBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#jsonObject}.
	 * @param ctx the parse tree
	 */
	void enterJsonObject(AngularParser.JsonObjectContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#jsonObject}.
	 * @param ctx the parse tree
	 */
	void exitJsonObject(AngularParser.JsonObjectContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#attribute}.
	 * @param ctx the parse tree
	 */
	void enterAttribute(AngularParser.AttributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#attribute}.
	 * @param ctx the parse tree
	 */
	void exitAttribute(AngularParser.AttributeContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#ngForStatement}.
	 * @param ctx the parse tree
	 */
	void enterNgForStatement(AngularParser.NgForStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#ngForStatement}.
	 * @param ctx the parse tree
	 */
	void exitNgForStatement(AngularParser.NgForStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#ngIfStatement}.
	 * @param ctx the parse tree
	 */
	void enterNgIfStatement(AngularParser.NgIfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#ngIfStatement}.
	 * @param ctx the parse tree
	 */
	void exitNgIfStatement(AngularParser.NgIfStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#htmlTags}.
	 * @param ctx the parse tree
	 */
	void enterHtmlTags(AngularParser.HtmlTagsContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#htmlTags}.
	 * @param ctx the parse tree
	 */
	void exitHtmlTags(AngularParser.HtmlTagsContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#interpolation}.
	 * @param ctx the parse tree
	 */
	void enterInterpolation(AngularParser.InterpolationContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#interpolation}.
	 * @param ctx the parse tree
	 */
	void exitInterpolation(AngularParser.InterpolationContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#openTag}.
	 * @param ctx the parse tree
	 */
	void enterOpenTag(AngularParser.OpenTagContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#openTag}.
	 * @param ctx the parse tree
	 */
	void exitOpenTag(AngularParser.OpenTagContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#closeTag}.
	 * @param ctx the parse tree
	 */
	void enterCloseTag(AngularParser.CloseTagContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#closeTag}.
	 * @param ctx the parse tree
	 */
	void exitCloseTag(AngularParser.CloseTagContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#selfClosingTag}.
	 * @param ctx the parse tree
	 */
	void enterSelfClosingTag(AngularParser.SelfClosingTagContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#selfClosingTag}.
	 * @param ctx the parse tree
	 */
	void exitSelfClosingTag(AngularParser.SelfClosingTagContext ctx);
}