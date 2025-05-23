package Classes.Visitor;

import Angular.AngularParser;
import Angular.AngularParserBaseVisitor;
import Classes.ComponenetInfos.*;
import Classes.ComponentInfo;
import Classes.SymbolTable.Scope;
import Classes.SymbolTable.Symbol;
import Classes.SymbolTable.SymbolTable;
import org.antlr.v4.runtime.tree.ParseTree;

import java.util.Stack;

public class ComponentInfoVisitor extends AngularParserBaseVisitor<ComponentInfo> {
    public Stack<Scope> currentScopeStack = new Stack<>();
    public SymbolTable symbolTable = new SymbolTable();

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
        var scope = currentScopeStack.peek();
        Select selector=new Select();
        if(ctx.SingleQuote()!=null){
            selector.name=ctx.SingleQuote().getText();
        }
        else{
            selector.name=ctx.BackTickQuote().getText();
        }
        Symbol selectSymbol = new Symbol();
        selectSymbol.scope = scope;
        selectSymbol.type = "Selector";
        selectSymbol.value = selector.name;
        scope.addSymbol(selector.name,selectSymbol);
        return selector;
    }

    @Override
    public Styles visitStyles(AngularParser.StylesContext ctx) {
        var scope = currentScopeStack.peek();
        Styles styleList=new Styles();
        for(int i = 0 ;i<ctx.SingleQuote().size()-1;i++){
            if(styleList.paths.contains(ctx.SingleQuote(i).getText())){
                //TODO THIS IS A SEMANTIC ERROR JUST ADD THE TEXT TO AN ERROR FILE
                continue;//don't add it to list
            }
            styleList.add(ctx.SingleQuote(i).getText());
        }
        for(int i = 0 ;i<ctx.BackTickQuote().size()-1;i++){
            if(styleList.paths.contains(ctx.BackTickQuote(i).getText())){
                //TODO THIS IS A SEMANTIC ERROR JUST ADD THE TEXT TO AN ERROR FILE
                continue;//don't add it to list
            }
            styleList.add(ctx.BackTickQuote(i).getText());
        }
        for(int i = 0; i<styleList.paths.size();i++){
            //TODO Check for file existing
            Symbol stylePathSymbol = new Symbol();
            stylePathSymbol.type = "Style File Path " + i;
            stylePathSymbol.value = styleList.paths.get(i);
            stylePathSymbol.scope = scope;
            scope.addSymbol(stylePathSymbol.type,stylePathSymbol);
        }
        return styleList;
    }

    @Override
    public ComponentInfo visitTempUrl(AngularParser.TempUrlContext ctx) {
        Scope scope = currentScopeStack.peek();
        TempUrl templateUrl=new TempUrl();
        if(ctx.SingleQuote()!=null){
            templateUrl.path=(ctx.SingleQuote().getText());
        }
        else{
            templateUrl.path=(ctx.BackTickQuote().getText());
        }
        //TODO CHECK THAT THE FILE EXISTS
        Symbol symbol = new Symbol();
        symbol.type = "Html File Url";
        symbol.value = templateUrl.path;
        symbol.scope = scope;
        scope.addSymbol("HTMLFILE",symbol);
        return templateUrl;
    }

    @Override
    public ComponentInfo visitStandaloneStatus(AngularParser.StandaloneStatusContext ctx) {
        return new StandaloneStatus(ctx.BooleanLiteral().getText());
    }

    @Override
    public ComponentInfo visitImportss(AngularParser.ImportssContext ctx) {
        Scope scope = currentScopeStack.peek();

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
        for(int i = 0 ; i<importList.imported.size();i++){
            Symbol symbol = new Symbol();
            symbol.type = "Import";
            symbol.value = importList.imported.get(i);
            symbol.scope = scope;
            scope.addSymbol("ImportModule" +i,symbol);
        }
        return importList;
    }
}
