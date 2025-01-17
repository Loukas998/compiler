package Classes.Visitor;

import Angular.AngularParser;
import Angular.AngularParserBaseVisitor;
import Classes.Class;

public class ClassStructureVisitor extends AngularParserBaseVisitor<Class> {
    @Override
    public Class visitClassStructure(AngularParser.ClassStructureContext ctx) {
        return super.visitClassStructure(ctx);
    }
}
