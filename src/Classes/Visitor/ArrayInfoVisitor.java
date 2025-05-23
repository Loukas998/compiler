package Classes.Visitor;

import Angular.AngularParser;
import Angular.AngularParserBaseVisitor;
import Classes.SymbolTable.Row;
import Classes.SymbolTable.Scope;
import Classes.SymbolTable.Symbol;
import Classes.SymbolTable.SymbolTable;
import Classes.Values.ArrayInfoValue;

import java.util.Stack;

public class ArrayInfoVisitor extends AngularParserBaseVisitor<ArrayInfoValue> {
    Stack<Scope>currentScope = new Stack<>();
   // public SymbolTable symbolTable = new SymbolTable();
    public ArrayInfoValue visitArrayInfo(AngularParser.ArrayInfoContext ctx) {
        Scope scope = currentScope.peek();
        ValueVisitor valueVisitor=new ValueVisitor();
        valueVisitor.currentScope = currentScope;
        ArrayInfoValue arrayInfoValue=new ArrayInfoValue();
        for(int i=0;i<ctx.value().size();i++){
            arrayInfoValue.addArrayValue(valueVisitor.visitValue(ctx.value(i)));
        }
        Symbol symbol = new Symbol();
        symbol.type = "Array";
        symbol.value = arrayInfoValue.arrayValues.toString();
        scope.addSymbol("ArrayValues",symbol);
        return arrayInfoValue;
    }
}















