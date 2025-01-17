package Classes.Visitor;

import Angular.AngularParser;
import Angular.AngularParserBaseVisitor;
import Classes.Values.ArrayInfoValue;

public class ArrayInfoVisitor extends AngularParserBaseVisitor<ArrayInfoValue> {
    public ArrayInfoValue visitArrayInfo(AngularParser.ArrayInfoContext ctx) {
        ValueVisitor valueVisitor=new ValueVisitor();
        ArrayInfoValue arrayInfoValue=new ArrayInfoValue();
        for(int i=0;i<ctx.value().size();i++){
            arrayInfoValue.addArrayValue(valueVisitor.visitValue(ctx.value(i)));
        }
        return arrayInfoValue;
    }
}
