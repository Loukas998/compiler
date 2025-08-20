package Classes.Values.Htmls.Tags.Attributes;

import Classes.GenericStatements.IfStatements.LogicalStatement;

public class NgIf extends Attribute{
    public String conditionalVariable;
    public LogicalStatement logicalStatement;
    public NgIf(){}
    public NgIf(String conditionalVariable) {
        this.conditionalVariable = conditionalVariable;
    }

    public NgIf(LogicalStatement logicalStatement) {
        this.logicalStatement = logicalStatement;
    }

    @Override
    public String toString(){
        if(this.conditionalVariable != null && this.logicalStatement == null){
            return "\n NgIf{" +
                   "\n ConditionalVariable: " + this.conditionalVariable +
                   "\n }";
        }
        else if(this.logicalStatement != null && this.conditionalVariable == null){
            return "\n NgIf{" +
                    "\n LogicalStatement: " + this.logicalStatement.toString() +
                    "\n }";
        }
        else if(this.logicalStatement != null && this.conditionalVariable != null){
            return "\n NgIf{" +
                    "\n LogicalStatement: " + this.logicalStatement.toString() + "," +
                    "\n ConditionalVariable: " + this.conditionalVariable +
                    "\n }";
        }
        return " ";
    }

    @Override
    public String codeGen() {
        return "";
    }
}
