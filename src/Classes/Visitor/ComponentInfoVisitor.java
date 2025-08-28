package Classes.Visitor;

import Angular.AngularParser;
import Angular.AngularParserBaseVisitor;
import Classes.ComponenetInfos.*;
import Classes.ComponentInfo;
import Classes.Errors.*;
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

    @Override
    public Select visitSelect(AngularParser.SelectContext ctx) {
        var scope = currentScopeStack.peek();
        Select selector=new Select();
        if(ctx.SingleQuote()!=null){
            selector.name=ctx.SingleQuote().getText();
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
                semanticErrors.add(new DuplicateValueError(
                        ctx.SingleQuote(i).getText(),
                        ctx.SingleQuote(i).getSymbol().getLine(),
                        ctx.SingleQuote(i).getSymbol().getCharPositionInLine()));
                continue;
            }
            styleList.add(ctx.SingleQuote(i).getText());
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
            templateUrl.path=(ctx.SingleQuote().getText());
            newString = templateUrl.path.replace("'","");
            line = ctx.SingleQuote().getSymbol().getLine();
            charPlace = ctx.SingleQuote().getSymbol().getCharPositionInLine();

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
