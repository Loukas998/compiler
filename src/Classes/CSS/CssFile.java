package Classes.CSS;

import java.util.ArrayList;

public class CssFile {
    public ArrayList<CssElement>elements= new ArrayList<>();
    public CssFile() {
    }

    public CssFile(ArrayList<CssElement> elements) {
        this.elements = elements;
    }


    public void addCssElement(CssElement element){
        this.elements.add(element);
    }
}
