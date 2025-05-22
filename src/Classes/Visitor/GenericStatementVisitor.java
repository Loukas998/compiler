package Classes.Visitor;

import Angular.AngularParser;
import Angular.AngularParserBaseVisitor;
import Classes.GenericStatements.Assign;
import Classes.GenericStatements.GenericStatement;
import Classes.GenericStatements.Variables.ArrayDecl;
import Classes.GenericStatements.Variables.VariableDecl;
import Classes.SymbolTable.SymbolTable;
import Classes.Values.ArrayInfoValue;
import Classes.Values.ValueType;

public class GenericStatementVisitor extends AngularParserBaseVisitor<GenericStatement> {

    // public SymbolTable symbolTable = new SymbolTable();

    public GenericStatement visitGenericStatement(AngularParser.GenericStatementContext ctx){
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
    }

    @Override
    public VariableDecl visitVariableDecl(AngularParser.VariableDeclContext ctx) {
        return this.visitVariableDeclaration(ctx.variableDeclaration());
    }

    @Override
    public VariableDecl visitVariableDeclaration(AngularParser.VariableDeclarationContext ctx) {
        VariableDecl variableDecl = new VariableDecl();
        VariableNamingVisitor variableNamingVisitor=new VariableNamingVisitor();
       // variableNamingVisitor.symbolTable = this.symbolTable;
        ValueVisitor valueVisitor=new ValueVisitor();
        variableDecl.variableNaming=variableNamingVisitor.visitVariableNaming(ctx.variableNaming());
       // this.symbolTable = variableNamingVisitor.symbolTable;
        if(ctx.value()!=null){
            variableDecl.value=valueVisitor.visit(ctx.value());
        }
        return variableDecl;
    }

    @Override
    public ArrayDecl visitArrayDeclaration(AngularParser.ArrayDeclarationContext ctx) {
        VariableNamingVisitor variableNamingVisitor=new VariableNamingVisitor();
      //  variableNamingVisitor.symbolTable = this.symbolTable;
        ArrayDecl arrayDecl = new ArrayDecl();
        ArrayInfoVisitor arrayInfoVisitor = new ArrayInfoVisitor();
       // arrayInfoVisitor.symbolTable = this.symbolTable;
        arrayDecl.variableNaming = variableNamingVisitor.visitVariableNaming(ctx.variableNaming());
       // this.symbolTable = variableNamingVisitor.symbolTable;
        for(int i=0;i<ctx.arrayInfo().size();i++){
            arrayDecl.addArrayInfo(arrayInfoVisitor.visitArrayInfo(ctx.arrayInfo(i)));
           // this.symbolTable = arrayInfoVisitor.symbolTable;
        }

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
        Assign assign=new Assign();
        if(ctx.thisorId()!=null){
            assign.firstId=ctx.thisorId().getChild(0).getText();
        }
        assign.secondId=ctx.ID().getText();
        ValueVisitor valueVisitor=new ValueVisitor();
        assign.valueType=valueVisitor.visitValue(ctx.value());
        return assign;
    }

    @Override
    public GenericStatement visitReturn(AngularParser.ReturnContext ctx) {
        return super.visitReturn(ctx);
    }

    @Override
    public GenericStatement visitIf(AngularParser.IfContext ctx) {
        return super.visitIf(ctx);
    }

    @Override
    public GenericStatement visitFor(AngularParser.ForContext ctx) {
        return super.visitFor(ctx);
    }

    @Override
    public ValueType visitValueType(AngularParser.ValueTypeContext ctx) {
        ValueVisitor valueVisitor=new ValueVisitor();
       // valueVisitor.symbolTable = this.symbolTable;
        ValueType valueType = valueVisitor.visitValue(ctx.value());
        //this.symbolTable = valueVisitor.symbolTable;
        return valueType;
    }
    public ValueType visitValue(AngularParser.ValueContext ctx){
    ValueVisitor valueVisitor = new ValueVisitor();
    //valueVisitor.symbolTable = this.symbolTable;
    ValueType valueType = valueVisitor.visitValue(ctx);
   // this.symbolTable = valueVisitor.symbolTable;
    return valueType;
    }
}
