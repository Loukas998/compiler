package Classes.Visitor;

import Angular.AngularParser;
import Angular.AngularParserBaseVisitor;
import Classes.Program;
import Classes.SymbolTable.Scope;
import Classes.SymbolTable.SymbolTable;

import java.util.Stack;


public class AntlrToProgram extends AngularParserBaseVisitor<Program> {

    public Scope globalScope = new Scope("global", 0);
    public void setScopeTable(Scope scope){
        this.globalScope = scope;
    }
    public Stack<Scope>scopeOrderStack = new Stack<>();

    public SymbolTable symbolTable = new SymbolTable();
    @Override
    public Program visitProgram(AngularParser.ProgramContext ctx) {
        int currId = 0;
        scopeOrderStack.push(globalScope);
        Program program = new Program();
        AntlrToExpression exprVisitor = new AntlrToExpression();
        exprVisitor.currentScope = scopeOrderStack;
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
