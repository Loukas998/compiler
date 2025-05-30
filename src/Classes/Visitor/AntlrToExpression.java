package Classes.Visitor;

import Angular.AngularParser;
import Angular.AngularParserBaseVisitor;
import Classes.*;
import Classes.Class;
import Classes.Errors.SemError;
import Classes.GenericStatements.GenericStatement;
import Classes.SymbolTable.Row;
import Classes.SymbolTable.Scope;
import Classes.SymbolTable.Symbol;
import Classes.SymbolTable.SymbolTable;
import Classes.Visitor.ComponentInfoVisitor;
import Classes.Visitor.GenericStatementVisitor;
import Classes.Visitor.VariableNamingVisitor;

import java.util.ArrayList;
import java.util.Stack;

public class AntlrToExpression extends AngularParserBaseVisitor<Expression> {
    public int currId;
    ArrayList<SemError> semanticErrors = new ArrayList<>();
    //public Scope scope;
    public Stack<Scope> currentScope;
    public SymbolTable symbolTable = new SymbolTable();
    public AntlrToExpression(){

    }
    public AntlrToExpression(int id ,Stack<Scope>currentScope){
        this.currId = id;
        this.currentScope = currentScope;
    }
    public Expression visitExpression(AngularParser.ExpressionContext ctx){
        if(ctx instanceof AngularParser.ImportContext){
            return this.visitImport((AngularParser.ImportContext) ctx);
        }
        else if(ctx instanceof AngularParser.InterfaceDeclContext){
            return this.visitInterfaceDecl((AngularParser.InterfaceDeclContext) ctx);
        }
        else if(ctx instanceof AngularParser.ComponentContext){
            return this.visitComponent((AngularParser.ComponentContext) ctx);
        }
        else if(ctx instanceof AngularParser.ClassContext){
            return this.visitClass((AngularParser.ClassContext) ctx);
        }

        return this.visitGeneric((AngularParser.GenericContext) ctx);
    }

    @Override
    public GenericStatement visitGeneric(AngularParser.GenericContext ctx) {
        GenericStatementVisitor genericStatementVisitor = new GenericStatementVisitor();
        genericStatementVisitor.currentScope = currentScope;
        genericStatementVisitor.semanticErrors = semanticErrors;
      //  genericStatementVisitor.symbolTable = this.symbolTable;
        GenericStatement generics = genericStatementVisitor.visitGenericStatement(ctx.genericStatement());
        // this.symbolTable = genericStatementVisitor.symbolTable;
        return generics;
    }

    @Override
    public Import visitImport(AngularParser.ImportContext ctx) {
        return this.visitImportStatement(ctx.importStatement());
    }

    @Override
    public Import visitImportStatement(AngularParser.ImportStatementContext ctx) {
        Import imp = new Import(ctx.getChild(2).getText());
        imp.fromPath = ctx.getChild(ctx.getChildCount()-2).getText();
        Scope scope = currentScope.peek();
        Symbol symbol = new Symbol();
        symbol.type = "Imported";
        symbol.value = imp.fromPath;
        scope.addSymbol(imp.type,symbol);
        if(!ctx.ID().isEmpty()){
            imp.altName = ctx.ID(ctx.ID().size()-1).getText();
            Symbol altNameSymbol = new Symbol();
            altNameSymbol.type = "Alt Name for Import";
            altNameSymbol.value = imp.altName;
            scope.addSymbol(imp.altName,altNameSymbol);
        }

        return imp;
    }

    @Override
    public InterfaceDecl visitInterfaceDecl(AngularParser.InterfaceDeclContext ctx) {
        InterfaceDecl interfaceDecl = this.visitInterface(ctx.interface_());
        //Row row = new Row();
       /* row.type = "InterfaceDeclaration";
        row.value = interfaceDecl.name;
        this.symbolTable.addRow(row);*/
        return interfaceDecl;
    }

    @Override
    public InterfaceDecl visitInterface(AngularParser.InterfaceContext ctx) {
        Scope scope = new Scope("InterfaceDeclaration",this.currId+1,currentScope.peek());
        currentScope.push(scope);
        currId++;
        InterfaceDecl interfaceDecl=new InterfaceDecl();
        interfaceDecl.name=ctx.ID().getText();
        Symbol symbol = new Symbol();
        symbol.scope = scope;
        symbol.type = "Interface";
        symbol.value = interfaceDecl.name;
        scope.addSymbol(interfaceDecl.name,symbol);
        VariableNamingVisitor variableNamingVisitor=new VariableNamingVisitor();
        variableNamingVisitor.currScopeStack = this.currentScope;
        for(int i=0;i<ctx.variableNaming().size();i++) {
            //variableNamingVisitor.symbolTable = this.symbolTable;
            VariableNaming varName = variableNamingVisitor.visitVariableNaming(ctx.variableNaming(i));
            interfaceDecl.addVariableNaming(varName);
            Symbol varSymbol = new Symbol();
            symbol.type = varName.type.type;
            symbol.value = varName.name;
            var existingSymbol = scope.exists(varName.name);
            int line;
            int charPos;
            if(existingSymbol == null)
            {
                scope.addSymbol(varName.name, symbol);
            } else {
                line = ctx.ID().getSymbol().getLine();
                charPos = ctx.variableNaming(i).ID(ctx.variableNaming(i).ID().size() - 1).getSymbol().getCharPositionInLine();
                semanticErrors.add(new SemError("The key already exists", line, charPos));
            }

            // this.symbolTable = variableNamingVisitor.symbolTable;
        }
        scope = currentScope.pop();
        /*Row row = new Row();
        row.type = interfaceDecl.name + " variables";
        row.value = interfaceDecl.variableNamingList.toString();
        this.symbolTable.addRow(row);*/
        return interfaceDecl;
    }

    @Override
    public ComponentDeclaration visitComponent(AngularParser.ComponentContext ctx) {
        return this.visitComponentDeclaration(ctx.componentDeclaration());
    }

    @Override
    public ComponentDeclaration visitComponentDeclaration(AngularParser.ComponentDeclarationContext ctx) {
        //Scope scope = currentScope.peek();
        Scope scope = new Scope("ComponentDeclaration",currId+1,currentScope.peek());
        currId++;
        currentScope.push(scope);
        ComponentDeclaration componentDeclaration = new ComponentDeclaration();
        ComponentInfoVisitor componentInfoVisitor = new ComponentInfoVisitor();
        componentInfoVisitor.semanticErrors = this.semanticErrors;
        componentInfoVisitor.currentScopeStack = currentScope;
        for(int i=0;i<ctx.componentInfo().size();i++){
            //componentInfoVisitor.symbolTable = this.symbolTable;
            componentDeclaration.addComponentInfo(componentInfoVisitor.visitComponentInfo(ctx.componentInfo(i)));
           // this.symbolTable = componentInfoVisitor.symbolTable;
        }
        currentScope.pop();
        return componentDeclaration;
    }

    @Override
    public Classes.Class visitClass(AngularParser.ClassContext ctx) {
        return this.visitClassStructure(ctx.classStructure());
    }

    @Override
    public Classes.Class visitClassStructure(AngularParser.ClassStructureContext ctx) {
        Classes.Class cl=new Class();
        cl.name = ctx.ID().getText();
        Scope scope = new Scope("Class" + cl.name,currId+1,currentScope.peek());
        currentScope.push(scope);
        GenericStatementVisitor genericStatementVisitor=new GenericStatementVisitor();
        genericStatementVisitor.semanticErrors = semanticErrors;
        genericStatementVisitor.currentScope = currentScope;
        for(int i=0;i<ctx.genericStatement().size();i++){
           // genericStatementVisitor.symbolTable = this.symbolTable;
            cl.addGenericStatement(genericStatementVisitor.visitGenericStatement(ctx.genericStatement(i)));
          //  this.symbolTable = genericStatementVisitor.symbolTable;
        }
        return cl;
    }
}
