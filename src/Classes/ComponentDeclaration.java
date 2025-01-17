package Classes;

import java.util.ArrayList;
import java.util.List;

public class ComponentDeclaration extends Expression {
    public List<ComponentInfo> componentInfoList;
    public ComponentDeclaration(){
        componentInfoList = new ArrayList<>();
    }
    public  ComponentDeclaration(List<ComponentInfo>componentInfoList){
        this.componentInfoList = componentInfoList;
    }
    public void addComponentInfo(ComponentInfo componentInfo){
        this.componentInfoList.add(componentInfo);
    }
    @Override
    public String toString(){
        return "\n ComponentInfo {"
              +"\n ComponentInfoList: " + componentInfoList.toString()
              + "\n}";
    }
}
