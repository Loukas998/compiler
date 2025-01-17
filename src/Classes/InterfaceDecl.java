package Classes;

import java.util.ArrayList;
import java.util.List;

public class InterfaceDecl extends Expression {
    public String name;
    public List<VariableNaming> variableNamingList;
    public InterfaceDecl(){
        variableNamingList=new ArrayList<>();
    }
    public  InterfaceDecl(String name,List<VariableNaming>variableNamingList){

        this.name=name;
        this.variableNamingList=variableNamingList;
    }
    public void addVariableNaming(VariableNaming variableNaming){
        this.variableNamingList.add(variableNaming);
    }
    @Override
    public String toString(){
        return "\n InterfaceDeclaration {" +
                "\n InterfaceName: " + this.name +
                "\n , InterfaceVariables: " + this.variableNamingList.toString() +
                "\n}";
    }
}
