// Generated from D:/Java intellj/compiler-project/src/Angular/AngularParser.g4 by ANTLR 4.13.2
package Angular;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link AngularParser}.
 */
public interface AngularParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by the {@code Program}
	 * labeled alternative in {@link AngularParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProgram(AngularParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Program}
	 * labeled alternative in {@link AngularParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProgram(AngularParser.ProgramContext ctx);
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
	 * Enter a parse tree produced by the {@code Component}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterComponent(AngularParser.ComponentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Component}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitComponent(AngularParser.ComponentContext ctx);
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
	 * Enter a parse tree produced by the {@code EventValue}
	 * labeled alternative in {@link AngularParser#value}.
	 * @param ctx the parse tree
	 */
	void enterEventValue(AngularParser.EventValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code EventValue}
	 * labeled alternative in {@link AngularParser#value}.
	 * @param ctx the parse tree
	 */
	void exitEventValue(AngularParser.EventValueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code HtmlTagValue}
	 * labeled alternative in {@link AngularParser#value}.
	 * @param ctx the parse tree
	 */
	void enterHtmlTagValue(AngularParser.HtmlTagValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code HtmlTagValue}
	 * labeled alternative in {@link AngularParser#value}.
	 * @param ctx the parse tree
	 */
	void exitHtmlTagValue(AngularParser.HtmlTagValueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code VariableValue}
	 * labeled alternative in {@link AngularParser#value}.
	 * @param ctx the parse tree
	 */
	void enterVariableValue(AngularParser.VariableValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code VariableValue}
	 * labeled alternative in {@link AngularParser#value}.
	 * @param ctx the parse tree
	 */
	void exitVariableValue(AngularParser.VariableValueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ValueDotValue}
	 * labeled alternative in {@link AngularParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValueDotValue(AngularParser.ValueDotValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ValueDotValue}
	 * labeled alternative in {@link AngularParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValueDotValue(AngularParser.ValueDotValueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FunctionSummoning}
	 * labeled alternative in {@link AngularParser#value}.
	 * @param ctx the parse tree
	 */
	void enterFunctionSummoning(AngularParser.FunctionSummoningContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FunctionSummoning}
	 * labeled alternative in {@link AngularParser#value}.
	 * @param ctx the parse tree
	 */
	void exitFunctionSummoning(AngularParser.FunctionSummoningContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NullableValue}
	 * labeled alternative in {@link AngularParser#value}.
	 * @param ctx the parse tree
	 */
	void enterNullableValue(AngularParser.NullableValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NullableValue}
	 * labeled alternative in {@link AngularParser#value}.
	 * @param ctx the parse tree
	 */
	void exitNullableValue(AngularParser.NullableValueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NullableDotValue}
	 * labeled alternative in {@link AngularParser#value}.
	 * @param ctx the parse tree
	 */
	void enterNullableDotValue(AngularParser.NullableDotValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NullableDotValue}
	 * labeled alternative in {@link AngularParser#value}.
	 * @param ctx the parse tree
	 */
	void exitNullableDotValue(AngularParser.NullableDotValueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Function}
	 * labeled alternative in {@link AngularParser#value}.
	 * @param ctx the parse tree
	 */
	void enterFunction(AngularParser.FunctionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Function}
	 * labeled alternative in {@link AngularParser#value}.
	 * @param ctx the parse tree
	 */
	void exitFunction(AngularParser.FunctionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FunctionStatement}
	 * labeled alternative in {@link AngularParser#value}.
	 * @param ctx the parse tree
	 */
	void enterFunctionStatement(AngularParser.FunctionStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FunctionStatement}
	 * labeled alternative in {@link AngularParser#value}.
	 * @param ctx the parse tree
	 */
	void exitFunctionStatement(AngularParser.FunctionStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ValueOrValue}
	 * labeled alternative in {@link AngularParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValueOrValue(AngularParser.ValueOrValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ValueOrValue}
	 * labeled alternative in {@link AngularParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValueOrValue(AngularParser.ValueOrValueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NullValue}
	 * labeled alternative in {@link AngularParser#value}.
	 * @param ctx the parse tree
	 */
	void enterNullValue(AngularParser.NullValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NullValue}
	 * labeled alternative in {@link AngularParser#value}.
	 * @param ctx the parse tree
	 */
	void exitNullValue(AngularParser.NullValueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DecimalNumberValue}
	 * labeled alternative in {@link AngularParser#value}.
	 * @param ctx the parse tree
	 */
	void enterDecimalNumberValue(AngularParser.DecimalNumberValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DecimalNumberValue}
	 * labeled alternative in {@link AngularParser#value}.
	 * @param ctx the parse tree
	 */
	void exitDecimalNumberValue(AngularParser.DecimalNumberValueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StringValue}
	 * labeled alternative in {@link AngularParser#value}.
	 * @param ctx the parse tree
	 */
	void enterStringValue(AngularParser.StringValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StringValue}
	 * labeled alternative in {@link AngularParser#value}.
	 * @param ctx the parse tree
	 */
	void exitStringValue(AngularParser.StringValueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ArrayInfoValue}
	 * labeled alternative in {@link AngularParser#value}.
	 * @param ctx the parse tree
	 */
	void enterArrayInfoValue(AngularParser.ArrayInfoValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ArrayInfoValue}
	 * labeled alternative in {@link AngularParser#value}.
	 * @param ctx the parse tree
	 */
	void exitArrayInfoValue(AngularParser.ArrayInfoValueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code JsonObjectValue}
	 * labeled alternative in {@link AngularParser#value}.
	 * @param ctx the parse tree
	 */
	void enterJsonObjectValue(AngularParser.JsonObjectValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code JsonObjectValue}
	 * labeled alternative in {@link AngularParser#value}.
	 * @param ctx the parse tree
	 */
	void exitJsonObjectValue(AngularParser.JsonObjectValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#componentDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterComponentDeclaration(AngularParser.ComponentDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#componentDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitComponentDeclaration(AngularParser.ComponentDeclarationContext ctx);
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
	 * Enter a parse tree produced by the {@code ValueType}
	 * labeled alternative in {@link AngularParser#genericStatement}.
	 * @param ctx the parse tree
	 */
	void enterValueType(AngularParser.ValueTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ValueType}
	 * labeled alternative in {@link AngularParser#genericStatement}.
	 * @param ctx the parse tree
	 */
	void exitValueType(AngularParser.ValueTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code VariableDecl}
	 * labeled alternative in {@link AngularParser#genericStatement}.
	 * @param ctx the parse tree
	 */
	void enterVariableDecl(AngularParser.VariableDeclContext ctx);
	/**
	 * Exit a parse tree produced by the {@code VariableDecl}
	 * labeled alternative in {@link AngularParser#genericStatement}.
	 * @param ctx the parse tree
	 */
	void exitVariableDecl(AngularParser.VariableDeclContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ArrayDecl}
	 * labeled alternative in {@link AngularParser#genericStatement}.
	 * @param ctx the parse tree
	 */
	void enterArrayDecl(AngularParser.ArrayDeclContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ArrayDecl}
	 * labeled alternative in {@link AngularParser#genericStatement}.
	 * @param ctx the parse tree
	 */
	void exitArrayDecl(AngularParser.ArrayDeclContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Assign}
	 * labeled alternative in {@link AngularParser#genericStatement}.
	 * @param ctx the parse tree
	 */
	void enterAssign(AngularParser.AssignContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Assign}
	 * labeled alternative in {@link AngularParser#genericStatement}.
	 * @param ctx the parse tree
	 */
	void exitAssign(AngularParser.AssignContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Return}
	 * labeled alternative in {@link AngularParser#genericStatement}.
	 * @param ctx the parse tree
	 */
	void enterReturn(AngularParser.ReturnContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Return}
	 * labeled alternative in {@link AngularParser#genericStatement}.
	 * @param ctx the parse tree
	 */
	void exitReturn(AngularParser.ReturnContext ctx);
	/**
	 * Enter a parse tree produced by the {@code If}
	 * labeled alternative in {@link AngularParser#genericStatement}.
	 * @param ctx the parse tree
	 */
	void enterIf(AngularParser.IfContext ctx);
	/**
	 * Exit a parse tree produced by the {@code If}
	 * labeled alternative in {@link AngularParser#genericStatement}.
	 * @param ctx the parse tree
	 */
	void exitIf(AngularParser.IfContext ctx);
	/**
	 * Enter a parse tree produced by the {@code For}
	 * labeled alternative in {@link AngularParser#genericStatement}.
	 * @param ctx the parse tree
	 */
	void enterFor(AngularParser.ForContext ctx);
	/**
	 * Exit a parse tree produced by the {@code For}
	 * labeled alternative in {@link AngularParser#genericStatement}.
	 * @param ctx the parse tree
	 */
	void exitFor(AngularParser.ForContext ctx);
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
	 * Enter a parse tree produced by {@link AngularParser#thisorId}.
	 * @param ctx the parse tree
	 */
	void enterThisorId(AngularParser.ThisorIdContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#thisorId}.
	 * @param ctx the parse tree
	 */
	void exitThisorId(AngularParser.ThisorIdContext ctx);
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
	 * Enter a parse tree produced by the {@code ConditionalStatement}
	 * labeled alternative in {@link AngularParser#conditionalState}.
	 * @param ctx the parse tree
	 */
	void enterConditionalStatement(AngularParser.ConditionalStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ConditionalStatement}
	 * labeled alternative in {@link AngularParser#conditionalState}.
	 * @param ctx the parse tree
	 */
	void exitConditionalStatement(AngularParser.ConditionalStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code VariableName}
	 * labeled alternative in {@link AngularParser#conditionalState}.
	 * @param ctx the parse tree
	 */
	void enterVariableName(AngularParser.VariableNameContext ctx);
	/**
	 * Exit a parse tree produced by the {@code VariableName}
	 * labeled alternative in {@link AngularParser#conditionalState}.
	 * @param ctx the parse tree
	 */
	void exitVariableName(AngularParser.VariableNameContext ctx);
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
	 * Enter a parse tree produced by the {@code SingleLineForLoop}
	 * labeled alternative in {@link AngularParser#forBody}.
	 * @param ctx the parse tree
	 */
	void enterSingleLineForLoop(AngularParser.SingleLineForLoopContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SingleLineForLoop}
	 * labeled alternative in {@link AngularParser#forBody}.
	 * @param ctx the parse tree
	 */
	void exitSingleLineForLoop(AngularParser.SingleLineForLoopContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MultipleLinesForLoop}
	 * labeled alternative in {@link AngularParser#forBody}.
	 * @param ctx the parse tree
	 */
	void enterMultipleLinesForLoop(AngularParser.MultipleLinesForLoopContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MultipleLinesForLoop}
	 * labeled alternative in {@link AngularParser#forBody}.
	 * @param ctx the parse tree
	 */
	void exitMultipleLinesForLoop(AngularParser.MultipleLinesForLoopContext ctx);
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
	 * Enter a parse tree produced by the {@code NgFor}
	 * labeled alternative in {@link AngularParser#attribute}.
	 * @param ctx the parse tree
	 */
	void enterNgFor(AngularParser.NgForContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NgFor}
	 * labeled alternative in {@link AngularParser#attribute}.
	 * @param ctx the parse tree
	 */
	void exitNgFor(AngularParser.NgForContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NgIf}
	 * labeled alternative in {@link AngularParser#attribute}.
	 * @param ctx the parse tree
	 */
	void enterNgIf(AngularParser.NgIfContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NgIf}
	 * labeled alternative in {@link AngularParser#attribute}.
	 * @param ctx the parse tree
	 */
	void exitNgIf(AngularParser.NgIfContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DoubleQuotedAttribute}
	 * labeled alternative in {@link AngularParser#attribute}.
	 * @param ctx the parse tree
	 */
	void enterDoubleQuotedAttribute(AngularParser.DoubleQuotedAttributeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DoubleQuotedAttribute}
	 * labeled alternative in {@link AngularParser#attribute}.
	 * @param ctx the parse tree
	 */
	void exitDoubleQuotedAttribute(AngularParser.DoubleQuotedAttributeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code OpenBracketAttribute}
	 * labeled alternative in {@link AngularParser#attribute}.
	 * @param ctx the parse tree
	 */
	void enterOpenBracketAttribute(AngularParser.OpenBracketAttributeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code OpenBracketAttribute}
	 * labeled alternative in {@link AngularParser#attribute}.
	 * @param ctx the parse tree
	 */
	void exitOpenBracketAttribute(AngularParser.OpenBracketAttributeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code OpenParenAttribute}
	 * labeled alternative in {@link AngularParser#attribute}.
	 * @param ctx the parse tree
	 */
	void enterOpenParenAttribute(AngularParser.OpenParenAttributeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code OpenParenAttribute}
	 * labeled alternative in {@link AngularParser#attribute}.
	 * @param ctx the parse tree
	 */
	void exitOpenParenAttribute(AngularParser.OpenParenAttributeContext ctx);
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
	 * Enter a parse tree produced by the {@code PairedTag}
	 * labeled alternative in {@link AngularParser#htmlTags}.
	 * @param ctx the parse tree
	 */
	void enterPairedTag(AngularParser.PairedTagContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PairedTag}
	 * labeled alternative in {@link AngularParser#htmlTags}.
	 * @param ctx the parse tree
	 */
	void exitPairedTag(AngularParser.PairedTagContext ctx);
	/**
	 * Enter a parse tree produced by the {@code UnpairedTag}
	 * labeled alternative in {@link AngularParser#htmlTags}.
	 * @param ctx the parse tree
	 */
	void enterUnpairedTag(AngularParser.UnpairedTagContext ctx);
	/**
	 * Exit a parse tree produced by the {@code UnpairedTag}
	 * labeled alternative in {@link AngularParser#htmlTags}.
	 * @param ctx the parse tree
	 */
	void exitUnpairedTag(AngularParser.UnpairedTagContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NormalHtmlText}
	 * labeled alternative in {@link AngularParser#htmlTags}.
	 * @param ctx the parse tree
	 */
	void enterNormalHtmlText(AngularParser.NormalHtmlTextContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NormalHtmlText}
	 * labeled alternative in {@link AngularParser#htmlTags}.
	 * @param ctx the parse tree
	 */
	void exitNormalHtmlText(AngularParser.NormalHtmlTextContext ctx);
	/**
	 * Enter a parse tree produced by the {@code HtmlInterpolation}
	 * labeled alternative in {@link AngularParser#htmlTags}.
	 * @param ctx the parse tree
	 */
	void enterHtmlInterpolation(AngularParser.HtmlInterpolationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code HtmlInterpolation}
	 * labeled alternative in {@link AngularParser#htmlTags}.
	 * @param ctx the parse tree
	 */
	void exitHtmlInterpolation(AngularParser.HtmlInterpolationContext ctx);
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