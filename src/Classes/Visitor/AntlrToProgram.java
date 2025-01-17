package Classes.Visitor;

import Angular.AngularParser;
import Angular.AngularParserBaseVisitor;
import Classes.Program;


public class AntlrToProgram extends AngularParserBaseVisitor<Program> {

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
        return program;
    }
}
