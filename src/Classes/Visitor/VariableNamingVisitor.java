package Classes.Visitor;

import Angular.AngularParser;
import Angular.AngularParserBaseVisitor;
import Classes.SymbolTable.Row;
import Classes.SymbolTable.Scope;
import Classes.SymbolTable.Symbol;
import Classes.SymbolTable.SymbolTable;
import Classes.VariableNaming;

import java.util.Stack;

public class VariableNamingVisitor extends AngularParserBaseVisitor<VariableNaming> {

   // public SymbolTable symbolTable = new SymbolTable();
    public Stack<Scope>currScopeStack = new Stack<>();

    @Override
    public VariableNaming visitVariableNaming(AngularParser.VariableNamingContext ctx) {
        Scope scope = currScopeStack.peek();
        VarTypeVisitor varTypeVisitor=new VarTypeVisitor();
        VariableNaming variableNaming=new VariableNaming();
        variableNaming.name=(ctx.ID().getText());

       // Row row = new Row();
      //  row.type = "VariableName";
      //  row.value = variableNaming.name;
       // this.symbolTable.addRow(row);
        if(ctx.varType()!=null){
            //varTypeVisitor.symbolTable = this.symbolTable;
            variableNaming.type=varTypeVisitor.visitVarType(ctx.varType());
          //  this.symbolTable = varTypeVisitor.symbolTable;
        }
        Symbol symbol = new Symbol();
        symbol.scope = scope;
        symbol.type = variableNaming.type!=null?variableNaming.type.type:"any";
        symbol.value = variableNaming.name;
        scope.addSymbol(variableNaming.name,symbol);
        return variableNaming;
    }
}
