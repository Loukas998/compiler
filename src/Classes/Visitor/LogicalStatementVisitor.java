package Classes.Visitor;

import Angular.AngularParser;
import Angular.AngularParserBaseVisitor;
import Classes.Errors.SemError;
import Classes.GenericStatements.IfStatements.LogicalStatement;
import Classes.SymbolTable.Scope;

import java.util.ArrayList;
import java.util.Stack;

public class LogicalStatementVisitor extends AngularParserBaseVisitor<LogicalStatement> {
    public Stack<Scope> currentScope = new Stack<>();
    public int currId;
    public ArrayList<SemError> semanticErrors = new ArrayList<>();
    @Override
    public LogicalStatement visitLogicalStatement(AngularParser.LogicalStatementContext ctx) {

        LogicalStatement logicalStatement=new LogicalStatement();
        ValueVisitor valueVisitor=new ValueVisitor();
        valueVisitor.currentScope = this.currentScope;
        valueVisitor.semanticErrors = this.semanticErrors;
        logicalStatement.leftValue=valueVisitor.visit(ctx.value(0));
        logicalStatement.logicalOp = ctx.logicalOp().getText();
        logicalStatement.rightValue=valueVisitor.visit(ctx.value(1));
        return logicalStatement;
    }
}
