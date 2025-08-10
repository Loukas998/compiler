package Classes.GenericStatements.Functions;

import Classes.GenericStatements.GenericStatement;
import Classes.Values.ValueType;
import Classes.VariableNaming;

import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

public class FunctionStatement extends FunctionValue {
    public List<ValueType> params;
    public List<VariableNaming>paramVariableNames;
   /* public List<GenericStatement> paramgenericStatements;*/
    public List<GenericStatement> functionBodyStatements;
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
    public void codeGen(String s, FileWriter fw) {
        StringBuilder sb = new StringBuilder(s);
        sb.append("(");
        for(ValueType valueParam:params){
            valueParam.codeGen(s,fw);
            sb.append(",");
        }
        sb.deleteCharAt(s.length()-1);
        for(VariableNaming variableParam:paramVariableNames){
            variableParam.codeGen(s,fw);
            sb.append(",");
        }
        sb.deleteCharAt(s.length()-1);
        sb.append("{");
        for(GenericStatement functionBodyLine:functionBodyStatements){
            functionBodyLine.codeGen(s,fw);
        }
        sb.append("}");
        sb.append("\n");
    }
}
