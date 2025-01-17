package Classes.Visitor;

import Angular.AngularParser;
import Angular.AngularParserBaseVisitor;
import Classes.GenericStatements.IfStatements.LogicalStatement;

public class LogicalStatementVisitor extends AngularParserBaseVisitor<LogicalStatement> {
    @Override
    public LogicalStatement visitLogicalStatement(AngularParser.LogicalStatementContext ctx) {
        LogicalStatement logicalStatement=new LogicalStatement();
        ValueVisitor valueVisitor=new ValueVisitor();
        logicalStatement.leftValue=valueVisitor.visitValue(ctx.value(0));
        logicalStatement.rightValue=valueVisitor.visitValue(ctx.value(1));
        return logicalStatement;
    }
}
