package Classes.ComponenetInfos;

import Classes.ComponentInfo;

import java.util.ArrayList;
import java.util.List;

public class Importss extends ComponentInfo {
    public List<String>imported;
    public Importss(){
        this.imported=new ArrayList<>();
    }
    public Importss(List<String>imported){
        this.imported=imported;
    }
    public void add(String lilImport){
        this.imported.add(lilImport);
    }
    @Override
    public String toString() {
        return "\n Importss {" +
                "\n imported: " + //this.imported.toString() +
                "\n }";
    }
}
