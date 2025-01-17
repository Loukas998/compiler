package Classes;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ExpressionProcessor {
    List<Expression> list;
    // symbol table for storing values of variables
    public ExpressionProcessor(List<Expression> list){
        this.list = list;
    }

    public List<String> getEvaluationResults(){
        List<String> evaluations = new ArrayList<>();
        for(Expression e : list){
            { // e, instance of Number, Addition, Variable, Multiplication, Subtraction
                String input = e.toString();
               evaluations.add(e.toString());
            }
        }

        return evaluations;
    }

    private Expression getEvaResult(Expression e){
        Expression result;
        return e;
    }
}
