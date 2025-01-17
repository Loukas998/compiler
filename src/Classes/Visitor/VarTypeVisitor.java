package Classes.Visitor;

import Angular.AngularParser;
import Angular.AngularParserBaseVisitor;
import Classes.VarType;

public class VarTypeVisitor extends AngularParserBaseVisitor<VarType> {
    @Override
    public VarType visitVarType(AngularParser.VarTypeContext ctx) {
        return new VarType(ctx.getChild(0).getText());
    }
}
