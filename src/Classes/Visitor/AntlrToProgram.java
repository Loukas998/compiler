package Classes.Visitor;

import Angular.AngularParser;
import Angular.AngularParserBaseVisitor;
import Classes.Program;
import Classes.SymbolTable.Scope;
import Classes.SymbolTable.SymbolTable;


public class AntlrToProgram extends AngularParserBaseVisitor<Program> {

    public Scope globalScope = new Scope("global", 0);
    public void setScopeTable(Scope scope){
        this.globalScope = scope;
    }

    public SymbolTable symbolTable = new SymbolTable();
    @Override
    public Program visitProgram(AngularParser.ProgramContext ctx) {
        Program program = new Program();
        AntlrToExpression exprVisitor = new AntlrToExpression();
        exprVisitor.scope = new Scope();
        exprVisitor.scope.parent = this.globalScope;
        exprVisitor.currentScope.push(this.globalScope);
        for(int i = 0; i < ctx.getChildCount(); i++) {
            if (i == ctx.getChildCount() - 1) {
                // the last child is EOF, we don't visit it
            } else {
                program.addExpression(exprVisitor.visitExpression(ctx.expression(i)));
            }
        }
        return program;
    }
}
