package Classes.Visitor;

import Angular.AngularParser;
import Angular.AngularParserBaseVisitor;
import Classes.ComponenetInfos.*;
import Classes.ComponentInfo;
import org.antlr.v4.runtime.tree.ParseTree;

public class ComponentInfoVisitor extends AngularParserBaseVisitor<ComponentInfo> {

    public ComponentInfo visitComponentInfo(AngularParser.ComponentInfoContext ctx){
        if(ctx instanceof AngularParser.SelectContext){
            return visitSelect((AngularParser.SelectContext) ctx);
        }
        else if( ctx instanceof AngularParser.StylesContext){
            return visitStyles((AngularParser.StylesContext) ctx);
        }
        else if( ctx instanceof AngularParser.TempUrlContext){
            return visitTempUrl((AngularParser.TempUrlContext) ctx);
        }
        else if( ctx instanceof AngularParser.ImportssContext){
            return visitImportss((AngularParser.ImportssContext) ctx);
        }
       return visitStandaloneStatus((AngularParser.StandaloneStatusContext) ctx);
    }
    @Override
    public Select visitSelect(AngularParser.SelectContext ctx) {
        Select selector=new Select();
        if(ctx.SingleQuote()!=null){
            selector.name=ctx.SingleQuote().getText();
        }
        else{
            selector.name=ctx.BackTickQuote().getText();
        }
        return selector;
    }

    @Override
    public Styles visitStyles(AngularParser.StylesContext ctx) {
        Styles styleList=new Styles();
        if(ctx.SingleQuote()!=null){
            styleList.add(ctx.SingleQuote().getText());
        }
        else{
            styleList.add(ctx.BackTickQuote().getText());
        }
        return styleList;
    }

    @Override
    public ComponentInfo visitTempUrl(AngularParser.TempUrlContext ctx) {
        TempUrl templateUrl=new TempUrl();
        if(ctx.SingleQuote()!=null){
            templateUrl.path=(ctx.SingleQuote().getText());
        }
        else{
            templateUrl.path=(ctx.BackTickQuote().getText());
        }
        return templateUrl;
    }

    @Override
    public ComponentInfo visitStandaloneStatus(AngularParser.StandaloneStatusContext ctx) {
        return new StandaloneStatus(ctx.BooleanLiteral().getText());
    }

    @Override
    public ComponentInfo visitImportss(AngularParser.ImportssContext ctx) {
        Importss importList=new Importss();
        if(ctx.NgFor()!=null){
            for(int i=0;i<ctx.NgFor().size();i++){
                importList.add(ctx.NgFor(i).getText());
            }
        }
        if(ctx.NgIf()!=null){
            for(int i=0;i<ctx.NgIf().size();i++){
                importList.add(ctx.NgIf(i).getText());
            }
        }
        if(ctx.ID()!=null){
            for(int i=0;i<ctx.ID().size();i++){
                importList.add(ctx.ID(i).getText());
            }
        }
        return importList;
    }
}
