package Classes.Visitor;

import Angular.AngularParser;
import Angular.AngularParserBaseVisitor;
import Classes.Class;
import Classes.ComponentDeclaration;
import Classes.Expression;
import Classes.GenericStatements.GenericStatement;
import Classes.Import;
import Classes.InterfaceDecl;
import Classes.Visitor.ComponentInfoVisitor;
import Classes.Visitor.GenericStatementVisitor;
import Classes.Visitor.VariableNamingVisitor;

public class AntlrToExpression extends AngularParserBaseVisitor<Expression> {

    @Override
    public GenericStatement visitGeneric(AngularParser.GenericContext ctx) {
        GenericStatementVisitor genericStatementVisitor=new GenericStatementVisitor();
        return genericStatementVisitor.visitGenericStatement(ctx.genericStatement());
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
    public Import visitImport(AngularParser.ImportContext ctx) {
        return this.visitImportStatement(ctx.importStatement());
    }

    @Override
    public Import visitImportStatement(AngularParser.ImportStatementContext ctx) {
        return new Import(ctx.getChild(2).getText());
    }

    @Override
    public InterfaceDecl visitInterface(AngularParser.InterfaceContext ctx) {
        VariableNamingVisitor variableNamingVisitor=new VariableNamingVisitor();
        InterfaceDecl interfaceDecl=new InterfaceDecl();
        interfaceDecl.name=ctx.ID().getText();
        for(int i=0;i<ctx.variableNaming().size();i++){
            interfaceDecl.addVariableNaming(variableNamingVisitor.visitVariableNaming(ctx.variableNaming(i)));

        }
        return interfaceDecl;
    }

    @Override
    public ComponentDeclaration visitComponent(AngularParser.ComponentContext ctx) {
        return this.visitComponentDeclaration(ctx.componentDeclaration());
    }

    @Override
    public ComponentDeclaration visitComponentDeclaration(AngularParser.ComponentDeclarationContext ctx) {
        ComponentDeclaration componentDeclaration=new ComponentDeclaration();
        ComponentInfoVisitor componentInfoVisitor=new ComponentInfoVisitor();
        for(int i=0;i<ctx.componentInfo().size();i++){
            componentDeclaration.addComponentInfo(componentInfoVisitor.visitComponentInfo(ctx.componentInfo(i)));
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
            cl.addGenericStatement(genericStatementVisitor.visit(ctx.genericStatement(i)));
        }
        return cl;
    }
}
