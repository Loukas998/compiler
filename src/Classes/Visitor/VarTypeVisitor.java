package Classes.Visitor;

import Angular.AngularParser;
import Angular.AngularParserBaseVisitor;
import Classes.SymbolTable.Row;
import Classes.SymbolTable.SymbolTable;
import Classes.VarType;

public class VarTypeVisitor extends AngularParserBaseVisitor<VarType> {

    public SymbolTable symbolTable = new SymbolTable();
    @Override
    public VarType visitVarType(AngularParser.VarTypeContext ctx) {
        VarType varType = new VarType(ctx.getChild(0).getText());
       // Row row = new Row();
       /* row.type = "VariableType";
        row.value = varType.type;
        this.symbolTable.addRow(row);*/
        return varType;
    }
}
