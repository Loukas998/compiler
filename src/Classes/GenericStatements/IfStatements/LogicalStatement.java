package Classes.GenericStatements.IfStatements;

import Classes.GenericStatements.GenericStatement;
import Classes.Values.ValueType;

import java.io.FileWriter;

public class LogicalStatement  extends ConditionalState {
    public ValueType leftValue;
    public String logicalOp;
    public ValueType rightValue;

    public LogicalStatement(){}

    public LogicalStatement(ValueType leftValue, String logicalOp, ValueType rightValue) {
        this.leftValue = leftValue;
        this.logicalOp = logicalOp;
        this.rightValue = rightValue;
    }

    @Override
    public String toString(){
        return "leftValue: " + this.leftValue.toString() +
                "\n logicalOp: " + this.logicalOp +
                "\n rightValue: " + this.rightValue.toString() +
                "\n }";
    }
    public String codeGen(){
        StringBuilder sb = new StringBuilder();
        sb.append(leftValue.codeGen());

        sb.append(logicalOp);
        sb.append(rightValue.codeGen());
        return sb.toString();
    }
}
