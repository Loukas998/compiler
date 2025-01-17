package Classes.ComponenetInfos;

import Classes.ComponentInfo;

import java.util.ArrayList;
import java.util.List;

public class Styles extends ComponentInfo {
    public List<String>paths;
    public Styles(){
        this.paths=new ArrayList<>();
    }
    public Styles(List<String>paths){
        this.paths=paths;
    }
    public void add(String path){
        this.paths.add(path);
    }

    @Override
    public String toString() {
        return this.paths.toString();
    }
}
