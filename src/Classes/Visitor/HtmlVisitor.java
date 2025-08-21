package Classes.Visitor;

import Angular.AngularParser;
import Angular.AngularParserBaseVisitor;
import Classes.Errors.SemError;
import Classes.SymbolTable.Row;
import Classes.SymbolTable.Scope;
import Classes.SymbolTable.SymbolTable;
import Classes.Values.Htmls.*;
import Classes.Values.Htmls.Tags.Attributes.Attribute;
import Classes.Values.Htmls.Tags.CloseTag;
import Classes.Values.Htmls.Tags.OpenTag;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Stack;

public class HtmlVisitor extends AngularParserBaseVisitor<HtmlTagValue> {
    public int currId;
    Stack<Scope> currentScope = new Stack<Scope>();
    Stack<Scope> openedHtmlTags = new Stack<>();
    ArrayList<SemError>semanticErrors = new ArrayList<>();

    @Override
    public PairedTag visitPairedTag(AngularParser.PairedTagContext ctx) {
        PairedTag pairedTag = new PairedTag();
        pairedTag.openTag = this.visitOpenTag(ctx.openTag());
        pairedTag.closeTag = this.visitCloseTag(ctx.closeTag());
        for(int i = 0; i < ctx.htmlTags().size(); i++){
            pairedTag.htmlTags.add(visit(ctx.htmlTags(i)));
        }
        return pairedTag;
    }

    @Override
    public HtmlInterpolation visitHtmlInterpolation(AngularParser.HtmlInterpolationContext ctx) {
        return this.visitInterpolation(ctx.interpolation());
    }

    @Override
    public CloseTag visitCloseTag(AngularParser.CloseTagContext ctx) {
        int line,charPos;
        if(!Objects.equals(ctx.getChild(2).getText(), openedHtmlTags.peek().name)){
            if(ctx.knownHtmlTags()!=null){
                line = ctx.knownHtmlTags().getStart().getLine();
                charPos = ctx.knownHtmlTags().getStart().getCharPositionInLine();
            }
            else{
                line = ctx.ID().getSymbol().getLine();
                charPos = ctx.ID().getSymbol().getCharPositionInLine();
            }
            semanticErrors.add(new SemError("Html Tags not Closed in Order",line,charPos));
        }
        currentScope.pop();
        return new CloseTag(ctx.getChild(2).getText());
    }

    @Override
    public UnpairedTag visitSelfClosingTag(AngularParser.SelfClosingTagContext ctx) {
        UnpairedTag unpairedTag = new UnpairedTag();
        unpairedTag.tagName = ctx.getChild(1).getText();
        Scope scope;
        if(currentScope.isEmpty()){
            scope = new Scope(unpairedTag.tagName + currId,currId+1);
        }
        else{
            scope = new Scope(unpairedTag.tagName + currId,currId+1,currentScope.peek());
        }
        currId++;
        currentScope.push(scope);
        openedHtmlTags.push(scope);
        AttributeVisitor attributeVisitor = new AttributeVisitor();
        attributeVisitor.currentScope = this.currentScope;
        attributeVisitor.semanticErrors = semanticErrors;
        attributeVisitor.currId = this.currId;
        for (int i = 0 ; i < ctx.attribute().size(); i++){
            unpairedTag.attributes.add(attributeVisitor.visit(ctx.attribute(i)));
        }
        currentScope.pop();
        openedHtmlTags.pop();
        return unpairedTag;
    }

    @Override
    public OpenTag visitOpenTag(AngularParser.OpenTagContext ctx) {
        OpenTag openTag = new OpenTag();
        openTag.tagName = ctx.getChild(1).getText();
        Scope scope;
        if(currentScope.isEmpty()){
            scope = new Scope(openTag.tagName,currId+1);
        }
        else{
            scope = new Scope(openTag.tagName,currId+1,currentScope.peek());
        }
        currId++;
        currentScope.push(scope);
        openedHtmlTags.push(scope);
        AttributeVisitor attributeVisitor = new AttributeVisitor();
      attributeVisitor.currentScope = currentScope;
      attributeVisitor.semanticErrors = semanticErrors;
        for (int i = 0 ; i < ctx.attribute().size(); i++){
            openTag.attributes.add(attributeVisitor.visit(ctx.attribute(i)));
        }
        return openTag;
    }

    @Override
    public HtmlInterpolation visitInterpolation(AngularParser.InterpolationContext ctx) {
        HtmlInterpolation htmlInterpolation = new HtmlInterpolation();
        ValueVisitor valueVisitor = new ValueVisitor();
        for(int i = 0; i < ctx.value().size(); i++){
            htmlInterpolation.valueTypes.add(valueVisitor.visit(ctx.value(i)));
        }
        return htmlInterpolation;
    }

    @Override
    public UnpairedTag visitUnpairedTag(AngularParser.UnpairedTagContext ctx) {
        UnpairedTag selfClosing = this.visitSelfClosingTag(ctx.selfClosingTag());
        return selfClosing;
    }

    @Override
    public HtmlTagValue visitNormalHtmlText(AngularParser.NormalHtmlTextContext ctx) {
        return new NormalHtmlText(ctx.TEXT().getText());
    }
}
