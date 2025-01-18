package Classes.Visitor;

import Angular.AngularParser;
import Angular.AngularParserBaseVisitor;
import Classes.SymbolTable.Row;
import Classes.SymbolTable.SymbolTable;
import Classes.VariableNaming;

public class VariableNamingVisitor extends AngularParserBaseVisitor<VariableNaming> {

    public SymbolTable symbolTable = new SymbolTable();

    @Override
    public VariableNaming visitVariableNaming(AngularParser.VariableNamingContext ctx) {
        VarTypeVisitor varTypeVisitor=new VarTypeVisitor();
        VariableNaming variableNaming=new VariableNaming();
        variableNaming.name=(ctx.ID().getText());
        Row row = new Row();
        row.type = "VariableName";
        row.value = variableNaming.name;
        this.symbolTable.addRow(row);
        if(ctx.varType()!=null){
            varTypeVisitor.symbolTable = this.symbolTable;
            variableNaming.type=varTypeVisitor.visitVarType(ctx.varType());
            this.symbolTable = varTypeVisitor.symbolTable;
        }
        return variableNaming;
    }
}
