package Classes.Visitor;

import Angular.AngularParser;
import Angular.AngularParserBaseVisitor;
import Classes.ComponentInfo;
import Classes.Errors.SemError;
import Classes.GenericStatements.IfStatements.ElseStatement;
import Classes.SymbolTable.Scope;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class ElseStatementVisitor extends AngularParserBaseVisitor<ElseStatement> {
    public Stack<Scope> currentScope = new Stack<>();
    public ArrayList<SemError> semanticErrors = new ArrayList<>();

    @Override
    public ElseStatement visitMultipleLineElse(AngularParser.MultipleLineElseContext ctx) {
        ElseStatement elseStatement = new ElseStatement();
        GenericStatementVisitor genericStatementVisitor = new GenericStatementVisitor();
        genericStatementVisitor.currentScope = this.currentScope;
        genericStatementVisitor.semanticErrors = this.semanticErrors;
        for(int i = 0;i<ctx.genericStatement().size();i++){
            elseStatement.genericStatementList.add(genericStatementVisitor.visit(ctx.genericStatement(i)));
        }
        return elseStatement;
    }

    @Override
    public ElseStatement visitSingleLineElse(AngularParser.SingleLineElseContext ctx) {
        ElseStatement elseStatement = new ElseStatement();
        GenericStatementVisitor genericStatementVisitor = new GenericStatementVisitor();
        genericStatementVisitor.currentScope = this.currentScope;
        genericStatementVisitor.semanticErrors = this.semanticErrors;
        elseStatement.genericStatementList.add(genericStatementVisitor.visit(ctx.genericStatement()));

        return elseStatement;
    }
}
