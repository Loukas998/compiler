package Classes.Visitor;

import Angular.AngularParser;
import Angular.AngularParserBaseVisitor;
import Classes.Errors.DuplicateValueError;
import Classes.Errors.SemError;
import Classes.GenericStatements.Assign;
import Classes.GenericStatements.GenericStatement;
import Classes.GenericStatements.IfStatements.ConditionalStatement;
import Classes.GenericStatements.Return;
import Classes.GenericStatements.Variables.ArrayDecl;
import Classes.GenericStatements.Variables.VariableDecl;
import Classes.SymbolTable.Scope;
import Classes.SymbolTable.Symbol;
import Classes.GenericStatements.Functions.Function;
import Classes.GenericStatements.Functions.FunctionStatement;
import Classes.GenericStatements.Functions.FunctionSummoning;
import Classes.Values.ValueType;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Stack;

public class GenericStatementVisitor extends AngularParserBaseVisitor<GenericStatement> {
    public Stack<Scope> currentScope = new Stack<>();
    public int currId;
    public ArrayList<SemError>semanticErrors = new ArrayList<>();
    // public SymbolTable symbolTable = new SymbolTable();

    /*public GenericStatement visitGenericStatement(AngularParser.GenericStatementContext ctx){
        if(ctx instanceof AngularParser.VariableDeclContext){

            return this.visitVariableDecl((AngularParser.VariableDeclContext) ctx);

        }else if(ctx instanceof AngularParser.ArrayDeclContext){

            return this.visitArrayDecl((AngularParser.ArrayDeclContext) ctx);

        }else if(ctx instanceof AngularParser.AssignContext) {

            return this.visitAssign((AngularParser.AssignContext) ctx);

        }else if(ctx instanceof AngularParser.ReturnContext){

            return this.visitReturn((AngularParser.ReturnContext) ctx);

        }else if(ctx instanceof AngularParser.IfContext){

            return this.visitIf((AngularParser.IfContext) ctx);

        }else if(ctx instanceof AngularParser.ForContext){

            return this.visitFor((AngularParser.ForContext) ctx);

        }
        return this.visitValueType((AngularParser.ValueTypeContext) ctx);
    }*/

    @Override
    public VariableDecl visitVariableDecl(AngularParser.VariableDeclContext ctx) {
        return this.visitVariableDeclaration(ctx.variableDeclaration());
    }

    @Override
    public VariableDecl visitVariableDeclaration(AngularParser.VariableDeclarationContext ctx) {
        Scope scope = currentScope.peek();
        VariableDecl variableDecl = new VariableDecl();
        VariableNamingVisitor variableNamingVisitor=new VariableNamingVisitor();
        variableNamingVisitor.currScopeStack = currentScope;
        variableDecl.variableNaming=variableNamingVisitor.visitVariableNaming(ctx.variableNaming());
        ValueVisitor valueVisitor=new ValueVisitor();
        valueVisitor.currId = this.currId;
        valueVisitor.currentScope = currentScope;
        valueVisitor.semanticErrors = this.semanticErrors;
        if(ctx.value()!=null) {
            variableDecl.value = valueVisitor.visit(ctx.value());
        }
        Symbol symbol = new Symbol();
        symbol.type = variableDecl.variableNaming.type.type;
        symbol.value = variableDecl.value!=null?variableDecl.value: "Null";
        Symbol existingSymbol = scope.exists(variableDecl.variableNaming.name);
        if(existingSymbol==null){
            scope.addSymbol(variableDecl.variableNaming.name,symbol);
        }
        else{
            semanticErrors.add(new DuplicateValueError( variableDecl.variableNaming.name,ctx.variableNaming().ID(ctx.variableNaming().ID().size()-1).getSymbol().getLine(),
                    ctx.variableNaming().ID(ctx.variableNaming().ID().size()-1).getSymbol().getCharPositionInLine()-1));
        }
        return variableDecl;
    }

    @Override
    public ArrayDecl visitArrayDeclaration(AngularParser.ArrayDeclarationContext ctx) {
        Scope scope = currentScope.peek();
        VariableNamingVisitor variableNamingVisitor=new VariableNamingVisitor();
        variableNamingVisitor.currScopeStack = currentScope;
      //  variableNamingVisitor.symbolTable = this.symbolTable;
        ArrayDecl arrayDecl = new ArrayDecl();
        ArrayInfoVisitor arrayInfoVisitor = new ArrayInfoVisitor();
        arrayInfoVisitor.currentScope = currentScope;
       // arrayInfoVisitor.symbolTable = this.symbolTable;
        arrayDecl.variableNaming = variableNamingVisitor.visitVariableNaming(ctx.variableNaming());
       // this.symbolTable = variableNamingVisitor.symbolTable;
        for(int i=0;i<ctx.arrayInfo().size();i++){
            arrayDecl.addArrayInfo(arrayInfoVisitor.visitArrayInfo(ctx.arrayInfo(i)));
           // this.symbolTable = arrayInfoVisitor.symbolTable;
        }
        Symbol symbol = new Symbol();
        symbol.type = "Array";
        symbol.value = arrayDecl.arrayInfoValues;
        symbol.scope = scope;
        scope.addSymbol(arrayDecl.variableNaming.name,symbol);
        return arrayDecl;
    }

    @Override
    public GenericStatement visitArrayDecl(AngularParser.ArrayDeclContext ctx) {
        return this.visitArrayDeclaration(ctx.arrayDeclaration());
    }

    @Override
    public Assign visitAssign(AngularParser.AssignContext ctx) {
        return this.visitAssignStatement(ctx.assignStatement());
    }

    @Override
    public Assign visitAssignStatement(AngularParser.AssignStatementContext ctx) {
        Scope scope = currentScope.peek();
        Assign assign=new Assign();
        if(ctx.thisorId()!=null){
            assign.firstId=ctx.thisorId().getChild(0).getText();
        }
        assign.secondId=ctx.ID().getText();
        ValueVisitor valueVisitor=new ValueVisitor();
        valueVisitor.currentScope = currentScope;
        valueVisitor.currId = this.currId;
        assign.valueType=valueVisitor.visit(ctx.value());
        Symbol symbol = new Symbol();
        Symbol findSym = new Symbol();
        if(!Objects.equals(assign.firstId, "this")){
          findSym = scope.getSymbol(assign.firstId);
        }
        else{
            findSym = scope.getSymbol(assign.secondId);
        }
        symbol.type = findSym.type;
        symbol.value = assign.secondId;
        symbol.scope = scope;
        scope.addSymbol(assign.firstId + "New Value",symbol);
        return assign;
    }

    @Override
    public GenericStatement visitReturn(AngularParser.ReturnContext ctx) {
        return this.visitReturnStatement(ctx.returnStatement());
    }

    @Override
    public GenericStatement visitReturnStatement(AngularParser.ReturnStatementContext ctx) {
        Return ret = new Return();
        if(ctx.thisorId()!=null){
            ret.id = ctx.thisorId().getText();
        }
        ValueVisitor valueVisitor = new ValueVisitor();
        valueVisitor.currentScope = currentScope;
        valueVisitor.semanticErrors = this.semanticErrors;
        ret.valueType = valueVisitor.visit(ctx.value());
        return ret;
    }
    @Override
    public GenericStatement visitIf(AngularParser.IfContext ctx) {
        return this.visitIfStatement(ctx.ifStatement());
    }
    @Override
    public GenericStatement visitIfStatement(AngularParser.IfStatementContext ctx) {
        ConditionalStatement ifState = new ConditionalStatement();
        LogicalStatementVisitor logicalStatementVisitor = new LogicalStatementVisitor();
        logicalStatementVisitor.currentScope = this.currentScope;
        logicalStatementVisitor.semanticErrors = this.semanticErrors;
        for(int i =0;i<ctx.logicalStatement().size();i++){
            ifState.addLogicalStatements(logicalStatementVisitor.visit(ctx.logicalStatement(i)));
        }
        for(int i =0;i<ctx.genericStatement().size();i++){
            ifState.addGenericStatement(this.visit(ctx.genericStatement(i)));
        }
        return ifState;

    }
    @Override
    public GenericStatement visitFor(AngularParser.ForContext ctx) {
        return super.visitFor(ctx);
    }

    @Override
    public ValueType visitValueType(AngularParser.ValueTypeContext ctx) {
        ValueVisitor valueVisitor=new ValueVisitor();
        valueVisitor.semanticErrors = semanticErrors;
        valueVisitor.currentScope = currentScope;
        valueVisitor.currId = this.currId;
       // valueVisitor.symbolTable = this.symbolTable;
        ValueType valueType = valueVisitor.visit(ctx.value());
        //this.symbolTable = valueVisitor.symbolTable;
        return valueType;
    }
    public ValueType visitValue(AngularParser.ValueContext ctx){
    ValueVisitor valueVisitor = new ValueVisitor();
    valueVisitor.currentScope = currentScope;
    valueVisitor.semanticErrors = semanticErrors;
    valueVisitor.currId = this.currId;
    //valueVisitor.symbolTable = this.symbolTable;
    ValueType valueType = valueVisitor.visit(ctx);
   // this.symbolTable = valueVisitor.symbolTable;
    return valueType;
    }
    public Function visitFunction(AngularParser.FunctionContext ctx) {
        return this.visitFunctionDeclaration(ctx.functionDeclaration());
    }

    @Override
    public FunctionSummoning visitFunctionSummoning(AngularParser.FunctionSummoningContext ctx) {
        return this.visitFunctionCall(ctx.functionCall());
    }

    @Override
    public FunctionStatement visitFunctionStatement(AngularParser.FunctionStatementContext ctx) {
        return this.visitFunctionBody(ctx.functionBody());
    }

    @Override
    public Function visitFunctionDeclaration(AngularParser.FunctionDeclarationContext ctx) {

        Function function=new Function();
        function.functionName=ctx.ID().getText();
        function.functionStatement=this.visitFunctionBody(ctx.functionBody());
        return function;
    }

    @Override
    public FunctionStatement visitFunctionBody(AngularParser.FunctionBodyContext ctx) {
        Scope scope = new Scope("Function" + currId+1, currId+1,currentScope.peek());
        currId++;
        currentScope.push(scope);
        ValueVisitor valueVisitor = new ValueVisitor();
        valueVisitor.currentScope = currentScope;
        VariableNamingVisitor variableNamingVisitor = new VariableNamingVisitor();
        variableNamingVisitor.currScopeStack = currentScope;
        GenericStatementVisitor genericStatementVisitor=new GenericStatementVisitor();
        genericStatementVisitor.currentScope = currentScope;
        FunctionStatement functionStatement=new FunctionStatement();
        for(int i=0;i<ctx.value().size();i++){
            functionStatement.addValueType(valueVisitor.visit(ctx.value(i)));
        }
        for(int i=0;i<ctx.variableNaming().size();i++){
            functionStatement.addVariableNamings (variableNamingVisitor.visit(ctx.variableNaming(i)));
        }
        if(ctx.genericStatement()!=null) {
            for (int i = 0; i < ctx.genericStatement().size(); i++) {
                functionStatement.addFunctionBodyLine(
                        genericStatementVisitor.visit(ctx.genericStatement(i)));
            }
        }

        for(int i = 0 ; i < functionStatement.params.size();i++){
            Symbol paramSymbol = new Symbol();
            paramSymbol.type = "Function Parameter  " + functionStatement.params.get(i);
            paramSymbol.value = functionStatement.params.get(i);
            scope.addSymbol(functionStatement.params.get(i).toString(),paramSymbol);
        }

        currentScope.pop();
        return functionStatement;
    }

    @Override
    public FunctionSummoning visitFunctionCall(AngularParser.FunctionCallContext ctx) {
        FunctionSummoning funCall=new FunctionSummoning();
        funCall.functionName = ctx.ID().getText();
        //Row row = new Row();
        // row.type = "FunctionCall";
        for(int i=0;i<ctx.value().size();i++){
            funCall.addArgument(this.visitValue(ctx.value(i)));
        }
        //row.value = funCall.functionName;
        //this.symbolTable.addRow(row);
        return funCall;
    }

}
