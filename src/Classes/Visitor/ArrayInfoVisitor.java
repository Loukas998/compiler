package Classes.Visitor;

import Angular.AngularParser;
import Angular.AngularParserBaseVisitor;
import Classes.SymbolTable.Row;
import Classes.SymbolTable.SymbolTable;
import Classes.Values.ArrayInfoValue;

public class ArrayInfoVisitor extends AngularParserBaseVisitor<ArrayInfoValue> {

    public SymbolTable symbolTable = new SymbolTable();
    public ArrayInfoValue visitArrayInfo(AngularParser.ArrayInfoContext ctx) {
        ValueVisitor valueVisitor=new ValueVisitor();
        ArrayInfoValue arrayInfoValue=new ArrayInfoValue();

        for(int i=0;i<ctx.value().size();i++){
            arrayInfoValue.addArrayValue(valueVisitor.visitValue(ctx.value(i)));
        }
        Row row = new Row();
        row.type = "ArrayValues";
        row.value = arrayInfoValue.arrayValues.toString();
        return arrayInfoValue;
    }
}
