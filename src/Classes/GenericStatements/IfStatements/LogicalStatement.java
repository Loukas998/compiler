package Classes.GenericStatements.IfStatements;

import Classes.Values.ValueType;

import java.io.FileWriter;

public class LogicalStatement {
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
    public void codeGen(String s, FileWriter fw){
        leftValue.codeGen(s,fw);
        StringBuilder sb = new StringBuilder(s);
        sb.append(logicalOp);
        rightValue.codeGen(s,fw);
    }
}
