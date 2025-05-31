package Classes.ComponenetInfos;

import Classes.ComponentInfo;

public class Select extends ComponentInfo {
public String name;

    public Select() {
    }
    public Select(String name) {
        this.name = name;
    }
    public String toString(){
        return "\n Select {" +
                "\n selector: " +//+ this.name +
                "\n }";
    }
}
