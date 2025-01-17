package Classes;

import java.util.ArrayList;
import java.util.List;

public class Program {
    public List<Expression> expressionList;
    public Program(){
        this.expressionList=new ArrayList<>();
    }
    public Program(List<Expression>expressionList){
        this.expressionList=expressionList;
    }
    public void addExpression(Expression e){
        this.expressionList.add(e);
    }
}
