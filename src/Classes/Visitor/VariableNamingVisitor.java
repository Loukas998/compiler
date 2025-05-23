package Classes.Visitor;

import Angular.AngularParser;
import Angular.AngularParserBaseVisitor;
import Classes.SymbolTable.Row;
import Classes.SymbolTable.Scope;
import Classes.SymbolTable.Symbol;
import Classes.SymbolTable.SymbolTable;
import Classes.VarType;
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
        //variableNaming.name=(ctx.ID().getText());
        if(ctx.Let()==null && ctx.Const()==null && ctx.Var() == null){
                variableNaming.name = ctx.ID(ctx.ID().size()-1).getText();
        }
        if(ctx.varType()!=null){
            //varTypeVisitor.symbolTable = this.symbolTable;
            variableNaming.type=varTypeVisitor.visitVarType(ctx.varType());
          //  this.symbolTable = varTypeVisitor.symbolTable;
        }
        else if(ctx.ID().size()==1){
            variableNaming.type = new VarType("any");
        }
        else{
            variableNaming.type = new VarType(ctx.ID(0).getText());
        }
        Symbol symbol = new Symbol();
        symbol.scope = scope;
        symbol.type =variableNaming.type.type;
        symbol.value = variableNaming.name;
        scope.addSymbol(variableNaming.name,symbol);
        return variableNaming;
    }
}
