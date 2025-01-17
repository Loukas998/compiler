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
        return this.conditionalVariable;
    }
}
