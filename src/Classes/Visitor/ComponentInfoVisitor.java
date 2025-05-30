package Classes.Visitor;

import Angular.AngularParser;
import Angular.AngularParserBaseVisitor;
import Classes.ComponenetInfos.*;
import Classes.ComponentInfo;
import Classes.Errors.DuplicateCssError;
import Classes.Errors.FileError;
import Classes.Errors.ImportError;
import Classes.Errors.SemError;
import Classes.SymbolTable.Scope;
import Classes.SymbolTable.Symbol;
import Classes.SymbolTable.SymbolTable;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.File;
import java.util.ArrayList;
import java.util.Stack;

public class ComponentInfoVisitor extends AngularParserBaseVisitor<ComponentInfo> {
    public Stack<Scope> currentScopeStack = new Stack<>();
    ArrayList<SemError> semanticErrors = new ArrayList<>();

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
        for(int i = 0 ;i<ctx.SingleQuote().size();i++){
            if(styleList.paths.contains(ctx.SingleQuote(i).getText())){
                semanticErrors.add(new DuplicateCssError(
                        ctx.BackTickQuote(i).getSymbol().getLine(),
                        ctx.BackTickQuote(i).getSymbol().getCharPositionInLine()));
                continue;
            }
            styleList.add(ctx.SingleQuote(i).getText());
        }
        for(int i = 0 ;i<ctx.BackTickQuote().size();i++){
            if(styleList.paths.contains(ctx.BackTickQuote(i).getText())){
                semanticErrors.add(new DuplicateCssError(
                        ctx.SingleQuote(i).getSymbol().getLine(),
                        ctx.SingleQuote(i).getSymbol().getCharPositionInLine()));
                continue;
            }
            styleList.add(ctx.BackTickQuote(i).getText());
        }
        for(int i = 0; i<styleList.paths.size();i++){
            Symbol stylePathSymbol = new Symbol();
            stylePathSymbol.type = "Style File Path " + i;
            stylePathSymbol.value = styleList.paths.get(i);
            stylePathSymbol.scope = scope;
            scope.addSymbol(stylePathSymbol.value.toString(),stylePathSymbol);
        }
        return styleList;
    }

    @Override
    public ComponentInfo visitTempUrl(AngularParser.TempUrlContext ctx) {
        Scope scope = currentScopeStack.peek();
        TempUrl templateUrl=new TempUrl();
        String newString;
        int line;
        int charPlace;
        if(ctx.SingleQuote()!=null){
            templateUrl.path=(ctx.SingleQuote().getText());
            newString = templateUrl.path.replace("'","");
            line = ctx.SingleQuote().getSymbol().getLine();
            charPlace = ctx.SingleQuote().getSymbol().getCharPositionInLine();
        }
        else{
            templateUrl.path=(ctx.BackTickQuote().getText());
            newString = templateUrl.path.replace("`","");
             line = ctx.BackTickQuote().getSymbol().getLine();
            charPlace = ctx.BackTickQuote().getSymbol().getCharPositionInLine();
        }
        File file = new File(newString);
        if(!file.exists()){
            semanticErrors.add(new FileError(line,charPlace));
        }
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
                if(scope.getSymbol((ctx.NgFor(i).getText()))==null){
                    var sym =ctx.NgFor(i).getSymbol();
                    int line = sym.getLine();
                    int charPos = sym.getCharPositionInLine()-1;
                    semanticErrors.add(new ImportError("NgFor",line,charPos));
                }
                importList.add(ctx.NgFor(i).getText());
            }
        }
        if(ctx.NgIf()!=null){

            for(int i=0;i<ctx.NgIf().size();i++) {
                if(scope.getSymbol((ctx.NgIf(i).getText()))==null){
                var sym = ctx.NgIf(i).getSymbol();
                int line = sym.getLine();
                int charPos = sym.getCharPositionInLine() - 1;
                    semanticErrors.add(new ImportError("NgIf", line, charPos));
            }
                importList.add(ctx.NgIf(i).getText());
            }
        }
        if(ctx.ID()!=null){
            for(int i=0;i<ctx.ID().size();i++){
                if(scope.getSymbol((ctx.ID(i).getText()))==null) {
                    var sym = ctx.ID(i).getSymbol();
                    int line = sym.getLine();
                    int charPos = sym.getCharPositionInLine() - 1;
                    semanticErrors.add(new ImportError(ctx.ID(i).getText() , line, charPos));
                }
                importList.add(ctx.ID(i).getText());
            }
        }
        if(semanticErrors.isEmpty()) {
            for (int i = 0; i < importList.imported.size(); i++) {
                Symbol symbol = new Symbol();
                symbol.type = "Import";
                symbol.value = importList.imported.get(i);
                symbol.scope = scope;
                scope.addSymbol("ImportModule" + i, symbol);
            }
        }
        return importList;
    }
}
