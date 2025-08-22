package Classes.Visitor;

import Angular.AngularParser;
import Angular.AngularParserBaseVisitor;
import Classes.Errors.HtmlError;
import Classes.Errors.SemError;
import Classes.GenericStatements.IfStatements.LogicalStatement;
import Classes.SymbolTable.Row;
import Classes.SymbolTable.Scope;
import Classes.SymbolTable.Symbol;
import Classes.SymbolTable.SymbolTable;
import Classes.Values.Htmls.Tags.Attributes.*;

import java.util.ArrayList;
import java.util.Stack;

public class AttributeVisitor extends AngularParserBaseVisitor<Attribute> {

    Stack<Scope>currentScope = new Stack<>();
    public  int currId;
    ArrayList<SemError>semanticErrors = new ArrayList<>();
    @Override
    public NgFor visitNgFor(AngularParser.NgForContext ctx) {
        return this.visitNgForStatement(ctx.ngForStatement());
    }

    @Override
    public QuotedAttribute visitDoubleQuotedAttribute(AngularParser.DoubleQuotedAttributeContext ctx) {
        QuotedAttribute quotedAttribute = new QuotedAttribute();
        int line;
        int charPos;
        if(ctx.ID() != null){
            quotedAttribute.attributeName = ctx.ID().getText();
            line = ctx.ID().getSymbol().getLine();
            charPos = ctx.ID().getSymbol().getCharPositionInLine();
        }else {
            quotedAttribute.attributeName = ctx.Class().getText();
            line = ctx.Class().getSymbol().getLine();
            charPos = ctx.Class().getSymbol().getCharPositionInLine();
        }
        if(ctx.DoubleQuote()!=null) {
            quotedAttribute.attributeValue = ctx.DoubleQuote().getText();
        }
        else{
            quotedAttribute.attributeValue = ctx.SingleQuote().getText().replace("'","");
        }
        Scope scope = currentScope.peek();
        if(scope.exists(quotedAttribute.attributeName)!=null){
            semanticErrors.add(new HtmlError(line,charPos));

        }
        else {
            Symbol symbol = new Symbol();
            symbol.scope = scope;
            symbol.type = "HtmlAttribute";
            symbol.value = quotedAttribute.attributeValue;
            scope.addSymbol(quotedAttribute.attributeName, symbol);
        }
        return quotedAttribute;
    }

    @Override
    public PropertyBindAttribute visitOpenBracketAttribute(AngularParser.OpenBracketAttributeContext ctx) {
        PropertyBindAttribute quotedAttribute = new PropertyBindAttribute();
        int line;
        int charPos;
        if(ctx.ID() != null){
            quotedAttribute.attributeName = ctx.ID().getText();
             line = ctx.ID().getSymbol().getLine();
             charPos = ctx.ID().getSymbol().getCharPositionInLine();
        }else {
            quotedAttribute.attributeName = ctx.Class().getText();
            line = ctx.Class().getSymbol().getLine();
            charPos = ctx.Class().getSymbol().getCharPositionInLine();
        }
        if(ctx.DoubleQuote()!=null){
            quotedAttribute.attributeValue = ctx.DoubleQuote().getText();
        }
       else{
            quotedAttribute.attributeValue = ctx.TripleQuote().getText().replace("'","");
        }
        Scope scope = currentScope.peek();
        if(scope.exists(quotedAttribute.attributeName)!=null){
            semanticErrors.add(new HtmlError(line,charPos));
        }
        else {
            Symbol symbol = new Symbol();
            symbol.scope = scope;
            symbol.type = "HtmlAttribute";
            symbol.value = quotedAttribute.attributeValue;
            scope.addSymbol(quotedAttribute.attributeName, symbol);
        }
        return quotedAttribute;
    }

    @Override
    public EventBindingAttribute visitOpenParenAttribute(AngularParser.OpenParenAttributeContext ctx) {
        EventBindingAttribute quotedAttribute = new EventBindingAttribute();
        int line;
        int charPos;
        if(ctx.ID() != null){
            quotedAttribute.attributeName = ctx.ID().getText();
            line = ctx.ID().getSymbol().getLine();
            charPos = ctx.ID().getSymbol().getCharPositionInLine();
        }else {
            quotedAttribute.attributeName = ctx.Class().getText();
            line = ctx.Class().getSymbol().getLine();
            charPos = ctx.Class().getSymbol().getCharPositionInLine();
        }
        if(ctx.DoubleQuote()!=null) {
            quotedAttribute.attributeValue = ctx.DoubleQuote().getText();
        }
        else{
            quotedAttribute.attributeValue = ctx.SingleQuote().getText().replace("'","");
        }
        Scope scope = currentScope.peek();
        if(scope.exists(quotedAttribute.attributeName)!=null){
            semanticErrors.add(new HtmlError(line,charPos));
        }
        else {
            Symbol symbol = new Symbol();
            symbol.scope = scope;
            symbol.type = "HtmlAttribute";
            symbol.value = quotedAttribute.attributeValue;
            scope.addSymbol(quotedAttribute.attributeName, symbol);
        }
        return quotedAttribute;
    }

    @Override
    public NgIf visitNgIf(AngularParser.NgIfContext ctx) {
        return this.visitNgIfStatement(ctx.ngIfStatement());
    }

    @Override
    public NgFor visitNgForStatement(AngularParser.NgForStatementContext ctx) {
        NgFor ngFor = new NgFor();
        ngFor.singular = ctx.ID(0).getText();
        ngFor.plural = ctx.ID(1).getText();
        return ngFor;
    }

    @Override
    public NgIf visitNgIfStatement(AngularParser.NgIfStatementContext ctx) {
        NgIf ngIf = new NgIf();
        if(ctx.ID() != null){
            ngIf.conditionalVariable = ctx.ID().getText();
        }else{
            LogicalStatementVisitor logicalStatementVisitor=new LogicalStatementVisitor();
            ngIf.logicalStatement = logicalStatementVisitor.visitLogicalStatement(ctx.logicalStatement());
        }
        return ngIf;
    }
    @Override
    public NgModel visitNgModelAttribute(AngularParser.NgModelAttributeContext ctx) {
        return new NgModel(ctx.DoubleQuote().getText());
    }

}
