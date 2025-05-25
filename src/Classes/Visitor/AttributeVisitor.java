package Classes.Visitor;

import Angular.AngularParser;
import Angular.AngularParserBaseVisitor;
import Classes.GenericStatements.IfStatements.LogicalStatement;
import Classes.SymbolTable.Row;
import Classes.SymbolTable.Scope;
import Classes.SymbolTable.Symbol;
import Classes.SymbolTable.SymbolTable;
import Classes.Values.Htmls.Tags.Attributes.Attribute;
import Classes.Values.Htmls.Tags.Attributes.NgFor;
import Classes.Values.Htmls.Tags.Attributes.NgIf;
import Classes.Values.Htmls.Tags.Attributes.QuotedAttribute;

import java.util.Stack;

public class AttributeVisitor extends AngularParserBaseVisitor<Attribute> {

    Stack<Scope>currentScope = new Stack<>();
    public Attribute visitAttribute(AngularParser.AttributeContext ctx){
        if(ctx instanceof AngularParser.NgForContext){
            return this.visitNgFor((AngularParser.NgForContext) ctx);
        }else if(ctx instanceof AngularParser.NgIfContext){
            return this.visitNgIf((AngularParser.NgIfContext) ctx);
        }else if(ctx instanceof AngularParser.DoubleQuotedAttributeContext){
            return this.visitDoubleQuotedAttribute((AngularParser.DoubleQuotedAttributeContext) ctx);
        }else if(ctx instanceof AngularParser.OpenBracketAttributeContext){
            return this.visitOpenBracketAttribute((AngularParser.OpenBracketAttributeContext) ctx);
        }
        return this.visitOpenParenAttribute((AngularParser.OpenParenAttributeContext) ctx);
    }

    @Override
    public NgFor visitNgFor(AngularParser.NgForContext ctx) {
        return this.visitNgForStatement(ctx.ngForStatement());
    }

    @Override
    public QuotedAttribute visitDoubleQuotedAttribute(AngularParser.DoubleQuotedAttributeContext ctx) {

        QuotedAttribute quotedAttribute = new QuotedAttribute();
        if(ctx.ID() != null){
            quotedAttribute.attributeName = ctx.ID().getText();
        }else {
            quotedAttribute.attributeName = ctx.Class().getText();
        }
        quotedAttribute.attributeValue = ctx.DoubleQuote().getText();
        Scope scope = currentScope.peek();
        Symbol symbol = new Symbol();
        symbol.scope = scope;
        symbol.type = "HtmlAttribute";
        symbol.value = quotedAttribute.attributeValue;
        scope.addSymbol(quotedAttribute.attributeName,symbol);
        return quotedAttribute;
    }

    @Override
    public QuotedAttribute visitOpenBracketAttribute(AngularParser.OpenBracketAttributeContext ctx) {
        QuotedAttribute quotedAttribute = new QuotedAttribute();
        if(ctx.ID() != null){
            quotedAttribute.attributeName = ctx.ID().getText();
        }else {
            quotedAttribute.attributeName = ctx.Class().getText();
        }
        quotedAttribute.attributeValue = ctx.DoubleQuote().getText();
        Scope scope = currentScope.peek();
        Symbol symbol = new Symbol();
        symbol.scope = scope;
        symbol.type = "HtmlAttribute";
        symbol.value = quotedAttribute.attributeValue;
        scope.addSymbol(quotedAttribute.attributeName,symbol);
        return quotedAttribute;
    }

    @Override
    public QuotedAttribute visitOpenParenAttribute(AngularParser.OpenParenAttributeContext ctx) {
        QuotedAttribute quotedAttribute = new QuotedAttribute();
        if(ctx.ID() != null){
            quotedAttribute.attributeName = ctx.ID().getText();
        }else {
            quotedAttribute.attributeName = ctx.Class().getText();
        }
        quotedAttribute.attributeValue = ctx.DoubleQuote().getText();
        Scope scope = currentScope.peek();
        Symbol symbol = new Symbol();
        symbol.scope = scope;
        symbol.type = "HtmlAttribute";
        symbol.value = quotedAttribute.attributeValue;
        scope.addSymbol(quotedAttribute.attributeName,symbol);
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
}
