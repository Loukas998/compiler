package Classes.Visitor;

import Angular.AngularParser;
import Angular.AngularParserBaseVisitor;
import Classes.Program;
import Classes.SymbolTable.SymbolTable;


public class AntlrToProgram extends AngularParserBaseVisitor<Program> {

    public SymbolTable symbolTable = new SymbolTable();
    public void setSymbolTable(SymbolTable symbolTable){
        this.symbolTable = symbolTable;
    }

    @Override
    public Program visitProgram(AngularParser.ProgramContext ctx) {
        Program program = new Program();
        AntlrToExpression exprVisitor = new AntlrToExpression();
        for(int i = 0; i < ctx.getChildCount(); i++){
            if(i == ctx.getChildCount() - 1){
                // the last child is EOF, we don't visit it
            }else{
                program.addExpression(exprVisitor.visitExpression(ctx.expression(i)));
            }
        }
        this.symbolTable = exprVisitor.symbolTable;
        return program;
    }
}
