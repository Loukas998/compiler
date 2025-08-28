package Classes.CSS.Visitor;

import Angular.AngularParser;
import Angular.AngularParserBaseVisitor;
import Angular.CssParser;
import Angular.CssParserBaseVisitor;
import Classes.CSS.*;

public class CssVisitor extends AngularParserBaseVisitor<CssGeneric> {
    @Override
    public CssGeneric visitBackgroundColorUnit(AngularParser.BackgroundColorUnitContext ctx) {
        BackgroundColorUnit bgColorUnit = new BackgroundColorUnit();
        bgColorUnit.setCss((Css) this.visit(ctx.css()));
        bgColorUnit.setDecimalLiteralUnit((DecimalLiteralUnit) this.visit(ctx.decimalLiteralUnit()));
        return bgColorUnit;
    }

    @Override
    public CssGeneric visitCss(AngularParser.CssContext ctx) {
        Css css = new Css();
        css.cssPropertyName = ctx.getChild(0).getText();
        return css;

    }

    @Override
    public CssGeneric visitCssElement(AngularParser.CssElementContext ctx) {
       CssElement cssElement = new CssElement();
       for(int i =0;i<ctx.tagName().size();i++){
           cssElement.tagName.add((TagName) this.visit(ctx.tagName(i)));
       }
       for(int i=0;i<ctx.selector().size();i++){
           cssElement.selector.add((Selector) this.visitSelector(ctx.selector(i)));
       }
       for(int i=0;i<ctx.cssProperty().size();i++){
           cssElement.cssProperty.add((CssProperty) this.visit(ctx.cssProperty(i)));
       }
       return cssElement;
    }

    @Override
    public CssGeneric visitCssProperty(AngularParser.CssPropertyContext ctx) {
        CssProperty cssProperty = new CssProperty();
        cssProperty.setCss((Css)this.visit(ctx.css()));
        for(int i=0;i<ctx.cssValue().size();i++){
            cssProperty.cssValue.add((CssValue) this.visit(ctx.cssValue(i)));
        }
        return cssProperty;
    }

    @Override
    public CssGeneric visitCssValue(AngularParser.CssValueContext ctx) {
        CssValue value = new CssValue();
        if(ctx.decimalLiteral_UNIT()!=null){
            value.setDecimalLiteral_UNIT((DecimalLiteral_UNIT) this.visit(ctx.decimalLiteral_UNIT()));
        }
        else{
            value.valueName = ctx.getChild(0).getText();
        }
        return value;
    }

    @Override
    public CssGeneric visitDecimalLiteralUnit(AngularParser.DecimalLiteralUnitContext ctx) {
        DecimalLiteralUnit decimalLiteralUnit = new DecimalLiteralUnit();
        decimalLiteralUnit.setDecimalLiteral_UNIT(ctx.getChild(0).getText());
        if(ctx.unit()!=null){
            decimalLiteralUnit.DecimalLiteral_UNIT+=" "+ctx.unit().getChild(0).getText();
        }
        return decimalLiteralUnit;
    }

//    @Override
//    public CssGeneric visitEos(CssParser.EosContext ctx) {
//        return super.visitEos(ctx);
//    }

    @Override
    public CssGeneric visitSelector(AngularParser.SelectorContext ctx) {
        Selector selector = new Selector();
        if(ctx.Textarea()!=null){
            selector.setTextarea(ctx.Textarea().getText());
        }
        else{
            selector.STRING+="."+ctx.ID().getText();
            if(ctx.tagName()!=null){
                selector.STRING+=" "+ctx.tagName().getText();
            }
            for(int i=0;i<ctx.simpleSelector().size();i++){
                selector.selectorInternal.add((SelectorInternal) this.visitSimpleSelector(ctx.simpleSelector(i)));
            }
        }
        return selector;
    }

    @Override
    public CssGeneric visitSimpleSelector(AngularParser.SimpleSelectorContext ctx) {
        SelectorInternal selectorInternal = new SelectorInternal();
        if(ctx.Colon()!=null){
            selectorInternal.setSTRING(":"+ctx.ID().getText());
        }
        else{
            selectorInternal.setSTRING(ctx.ID().getText());
        }
        return selectorInternal;
    }

    @Override
    public CssGeneric visitTagName(AngularParser.TagNameContext ctx) {
        return new TagName(ctx.getChild(0).getText());
    }

//    @Override
//    public CssGeneric visitUnit(CssParser.UnitContext ctx) {
//        return super.visitUnit(ctx);
//    }

    @Override
    public CssGeneric visitUnitNumberList(AngularParser.UnitNumberListContext ctx) {
      UnitNumberList unitNumberList = new UnitNumberList();
      unitNumberList.decimalLiteralUnit = (DecimalLiteralUnit) this.visitDecimalLiteralUnit(ctx.decimalLiteralUnit());
      for(int i=0;i<ctx.DecimalLiteral().size();i++){
          unitNumberList.decimalLiteral.add(Double.parseDouble(ctx.DecimalLiteral(i).getText()));
      }
      return unitNumberList;
    }

    @Override
    public CssGeneric visitUnitSolidColor(AngularParser.UnitSolidColorContext ctx) {
        UnitSolidColor unitSolidColor =new UnitSolidColor();
        unitSolidColor.Solid = ctx.Solid().getText();
        unitSolidColor.setHEXCHAR(ctx.HEXCHAR().getText());
        unitSolidColor.decimalLiteralUnit = (DecimalLiteralUnit) this.visit(ctx.decimalLiteralUnit());
        return unitSolidColor;
    }

}
