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
import java.util.Stack;

public class HtmlVisitor extends AngularParserBaseVisitor<HtmlTagValue> {
    public int currId;
    Stack<Scope> currentScope = new Stack<Scope>();
    ArrayList<SemError>semanticErrors = new ArrayList<>();
    public HtmlTagValue visitHtmlTags(AngularParser.HtmlTagsContext ctx){
        if(ctx instanceof AngularParser.PairedTagContext){
            return this.visitPairedTag((AngularParser.PairedTagContext) ctx);
        }else if(ctx instanceof AngularParser.UnpairedTagContext){
            return this.visitUnpairedTag((AngularParser.UnpairedTagContext) ctx);
        }else if(ctx instanceof AngularParser.NormalHtmlTextContext){
            return this.visitNormalHtmlText((AngularParser.NormalHtmlTextContext) ctx);
        }
        return this.visitHtmlInterpolation((AngularParser.HtmlInterpolationContext) ctx);
    }


    @Override
    public PairedTag visitPairedTag(AngularParser.PairedTagContext ctx) {
        PairedTag pairedTag = new PairedTag();
        pairedTag.openTag = this.visitOpenTag(ctx.openTag());
        pairedTag.closeTag = this.visitCloseTag(ctx.closeTag());
        for(int i = 0; i < ctx.htmlTags().size(); i++){
            pairedTag.htmlTags.add(visitHtmlTags(ctx.htmlTags(i)));
        }
        return pairedTag;
    }

    @Override
    public HtmlInterpolation visitHtmlInterpolation(AngularParser.HtmlInterpolationContext ctx) {
        return this.visitInterpolation(ctx.interpolation());
    }

    @Override
    public CloseTag visitCloseTag(AngularParser.CloseTagContext ctx) {
        currentScope.pop();
        return new CloseTag(ctx.ID().getText());
    }

    @Override
    public UnpairedTag visitSelfClosingTag(AngularParser.SelfClosingTagContext ctx) {
        UnpairedTag unpairedTag = new UnpairedTag();
        unpairedTag.tagName = ctx.ID().getText();
        Scope scope;
        if(currentScope.isEmpty()){
            scope = new Scope(unpairedTag.tagName + currId,currId+1);
        }
        else{
            scope = new Scope(unpairedTag.tagName + currId,currId+1,currentScope.peek());
        }
        currId++;
        currentScope.push(scope);
        AttributeVisitor attributeVisitor = new AttributeVisitor();
        attributeVisitor.currentScope = this.currentScope;
        attributeVisitor.semanticErrors = semanticErrors;
        for (int i = 0 ; i < ctx.attribute().size(); i++){
            unpairedTag.attributes.add(attributeVisitor.visitAttribute(ctx.attribute(i)));
        }
        currentScope.pop();
        return unpairedTag;
    }

    @Override
    public OpenTag visitOpenTag(AngularParser.OpenTagContext ctx) {
        OpenTag openTag = new OpenTag();
        openTag.tagName = ctx.ID().getText();
        Scope scope;
        if(currentScope.isEmpty()){
            scope = new Scope(openTag.tagName + currId,currId+1);
        }
        else{
            scope = new Scope(openTag.tagName + currId,currId+1,currentScope.peek());
        }
        currId++;
        currentScope.push(scope);
        AttributeVisitor attributeVisitor = new AttributeVisitor();
      attributeVisitor.currentScope = currentScope;
      attributeVisitor.semanticErrors = semanticErrors;
        for (int i = 0 ; i < ctx.attribute().size(); i++){
            openTag.attributes.add(attributeVisitor.visitAttribute(ctx.attribute(i)));
        }
        return openTag;
    }

    @Override
    public HtmlInterpolation visitInterpolation(AngularParser.InterpolationContext ctx) {
        HtmlInterpolation htmlInterpolation = new HtmlInterpolation();
        ValueVisitor valueVisitor = new ValueVisitor();
        for(int i = 0; i < ctx.value().size(); i++){
            htmlInterpolation.valueTypes.add(valueVisitor.visitValue(ctx.value(i)));
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
