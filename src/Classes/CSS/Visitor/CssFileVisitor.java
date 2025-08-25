package Classes.CSS.Visitor;

import Angular.CssParser;
import Angular.CssParserBaseVisitor;
import Classes.CSS.CssFile;
import Classes.Program;
import Classes.Visitor.AntlrToExpression;

public class CssFileVisitor extends CssParserBaseVisitor<CssFile> {

    @Override
    public CssFile visitCssFile(CssParser.CssFileContext ctx) {
        CssFile cssFile = new CssFile();
        CssVisitor visitor = new CssVisitor();
        for(int i = 0; i < ctx.getChildCount(); i++) {
            if (i == ctx.getChildCount() - 1) {
                // the last child is EOF, we don't visit it
            } else {
                    cssFile.addCssElement(visitor.visit(ctx.cssElement(i)));
            }
        }
        return cssFile;
    }
}
