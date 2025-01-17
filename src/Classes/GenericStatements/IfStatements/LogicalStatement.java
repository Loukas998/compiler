package Classes.GenericStatements.IfStatements;

import Classes.Values.ValueType;

public class LogicalStatement {
    public ValueType leftValue;
    public LogicalOp logicalOp;
    public ValueType rightValue;

    public LogicalStatement(){}

    public LogicalStatement(ValueType leftValue, LogicalOp logicalOp, ValueType rightValue) {
        this.leftValue = leftValue;
        this.logicalOp = logicalOp;
        this.rightValue = rightValue;
    }

    @Override
    public String toString(){
        return "leftValue: " + this.leftValue.toString() +
                "\n logicalOp: " + this.logicalOp.toString() +
                "\n rightValue: " + this.rightValue.toString() +
                "\n }";
    }
}
