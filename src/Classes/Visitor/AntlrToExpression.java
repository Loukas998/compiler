package Classes.Visitor;

import Angular.AngularParser;
import Angular.AngularParserBaseVisitor;
import Classes.Class;
import Classes.ComponentDeclaration;
import Classes.Expression;
import Classes.GenericStatements.GenericStatement;
import Classes.Import;
import Classes.InterfaceDecl;
import Classes.SymbolTable.Row;
import Classes.SymbolTable.Scope;
import Classes.SymbolTable.SymbolTable;
import Classes.Visitor.ComponentInfoVisitor;
import Classes.Visitor.GenericStatementVisitor;
import Classes.Visitor.VariableNamingVisitor;

import java.util.Stack;

public class AntlrToExpression extends AngularParserBaseVisitor<Expression> {
    public Scope scope;
    public Stack<Scope> currentScope;
    public SymbolTable symbolTable = new SymbolTable();

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
        genericStatementVisitor.symbolTable = this.symbolTable;
        GenericStatement generics = genericStatementVisitor.visitGenericStatement(ctx.genericStatement());
        this.symbolTable = genericStatementVisitor.symbolTable;
        return generics;
    }

    @Override
    public Import visitImport(AngularParser.ImportContext ctx) {
        return this.visitImportStatement(ctx.importStatement());
    }

    @Override
    public Import visitImportStatement(AngularParser.ImportStatementContext ctx) {
        Import imp = new Import(ctx.getChild(2).getText());
        Row row = new Row();
        row.type = "Imported";
        row.value = imp.type;
        this.symbolTable.addRow(row);
        return imp;
    }

    @Override
    public InterfaceDecl visitInterfaceDecl(AngularParser.InterfaceDeclContext ctx) {
        InterfaceDecl interfaceDecl = this.visitInterface(ctx.interface_());
        Row row = new Row();
        row.type = "InterfaceDeclaration";
        row.value = interfaceDecl.name;
        this.symbolTable.addRow(row);
        return interfaceDecl;
    }

    @Override
    public InterfaceDecl visitInterface(AngularParser.InterfaceContext ctx) {
        VariableNamingVisitor variableNamingVisitor=new VariableNamingVisitor();
        InterfaceDecl interfaceDecl=new InterfaceDecl();
        interfaceDecl.name=ctx.ID().getText();
        for(int i=0;i<ctx.variableNaming().size();i++){
            variableNamingVisitor.symbolTable = this.symbolTable;
            interfaceDecl.addVariableNaming(variableNamingVisitor.visitVariableNaming(ctx.variableNaming(i)));
            this.symbolTable = variableNamingVisitor.symbolTable;
        }
        Row row = new Row();
        row.type = interfaceDecl.name + " variables";
        row.value = interfaceDecl.variableNamingList.toString();
        this.symbolTable.addRow(row);
        return interfaceDecl;
    }

    @Override
    public ComponentDeclaration visitComponent(AngularParser.ComponentContext ctx) {
        return this.visitComponentDeclaration(ctx.componentDeclaration());
    }

    @Override
    public ComponentDeclaration visitComponentDeclaration(AngularParser.ComponentDeclarationContext ctx) {
        ComponentDeclaration componentDeclaration = new ComponentDeclaration();
        ComponentInfoVisitor componentInfoVisitor = new ComponentInfoVisitor();
        for(int i=0;i<ctx.componentInfo().size();i++){
            componentInfoVisitor.symbolTable = this.symbolTable;
            componentDeclaration.addComponentInfo(componentInfoVisitor.visitComponentInfo(ctx.componentInfo(i)));
            this.symbolTable = componentInfoVisitor.symbolTable;
        }
        return componentDeclaration;
    }

    @Override
    public Classes.Class visitClass(AngularParser.ClassContext ctx) {
        return this.visitClassStructure(ctx.classStructure());
    }

    @Override
    public Classes.Class visitClassStructure(AngularParser.ClassStructureContext ctx) {
        Classes.Class cl=new Class();
        GenericStatementVisitor genericStatementVisitor=new GenericStatementVisitor();
        for(int i=0;i<ctx.genericStatement().size();i++){
            genericStatementVisitor.symbolTable = this.symbolTable;
            cl.addGenericStatement(genericStatementVisitor.visitGenericStatement(ctx.genericStatement(i)));
            this.symbolTable = genericStatementVisitor.symbolTable;
        }
        return cl;
    }
}
