package Classes.Visitor;

import Angular.AngularParser;
import Angular.AngularParserBaseVisitor;
import Classes.VariableNaming;

public class VariableNamingVisitor extends AngularParserBaseVisitor<VariableNaming> {
    @Override
    public VariableNaming visitVariableNaming(AngularParser.VariableNamingContext ctx) {
        VarTypeVisitor varTypeVisitor=new VarTypeVisitor();
        VariableNaming variableNaming=new VariableNaming();
         variableNaming.name=(ctx.ID().getText());
         if(ctx.varType()!=null){
             variableNaming.type=varTypeVisitor.visitVarType(ctx.varType());
         }
         return variableNaming;
    }
}
