package Classes.GenericStatements.Functions;

import Classes.GenericStatements.GenericStatement;
import Classes.Values.ValueType;
import Classes.VariableNaming;

import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

public class FunctionStatement extends FunctionValue {
    public boolean isArrow = false;
    public List<ValueType> params = new ArrayList<>();
    public List<VariableNaming>paramVariableNames=new ArrayList<>();
   /* public List<GenericStatement> paramgenericStatements;*/
    public List<GenericStatement> functionBodyStatements = new ArrayList<>();
    public FunctionStatement(){
        this.params = new ArrayList<ValueType>();
        /*this.paramgenericStatements = new ArrayList<GenericStatement>();*/
        this.functionBodyStatements = new ArrayList<GenericStatement>();
        this.paramVariableNames = new ArrayList<>();
    }
    public FunctionStatement(List<ValueType> variableNamings,
                            /* List<GenericStatement> paramgenericStatements,*/
                             List<GenericStatement> functionBodyStatements
                             ) {
        this.params = variableNamings;
      /*  this.paramgenericStatements = paramgenericStatements;*/
        this.functionBodyStatements = functionBodyStatements;
    }
    public void addVariableNamings(VariableNaming vn){
        paramVariableNames.add(vn);
    }
    public void addValueType(ValueType vn){
        params.add(vn);
    }

    /*public void addParamGenericStatements(GenericStatement gs){
        paramgenericStatements.add(gs);
    }*/
    public void addFunctionBodyLine(GenericStatement gs){
        functionBodyStatements.add(gs);
    }


    @Override
    public String toString(){
        String retString = "\n FunctionStatement {";
        if(this.params!=null && !this.params.isEmpty()){
            retString+= "\n arguments: " + this.params.toString();
        }
        if(this.paramVariableNames!=null && !this.paramVariableNames.isEmpty()){
            retString+= "\n arguments: " + this.paramVariableNames.toString();
        }
        if(this.functionBodyStatements!=null && !this.functionBodyStatements.isEmpty()){
            retString+= "\n ,body: " + this.functionBodyStatements.toString() +
                    "\n }";
        }

        return retString;

    }

    @Override
    public String codeGen() {
        StringBuilder sb = new StringBuilder();
        sb.append("(");
        for(ValueType valueParam:params){
            sb.append(valueParam.codeGen());
            sb.append(",");
        }
        if( this.params!=null && !params.isEmpty() ){
            sb.deleteCharAt(sb.length()-1);
        }
        for(VariableNaming variableParam:paramVariableNames){
            sb.append(variableParam.codeGen());
            sb.append(",");
        }
        if(this.paramVariableNames!=null && !paramVariableNames.isEmpty()){
            sb.deleteCharAt(sb.length()-1);
        }
        sb.append(')');
        if(this.isArrow){
            sb.append("=>");
        }
        if(!this.isArrow){
            sb.append("{");
        }
        sb.append("\n");
        if(this.functionBodyStatements!=null && !this.functionBodyStatements.isEmpty()) {
            for (GenericStatement functionBodyLine : functionBodyStatements) {
                sb.append(functionBodyLine.codeGen());
            }
        }
        if(!this.isArrow){
            sb.append("}");
        }
        sb.append("\n");
        return sb.toString();
    }
}
