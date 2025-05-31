package Classes.ComponenetInfos;

import Classes.ComponentInfo;

public class TempUrl extends ComponentInfo {
    public String path;

    public TempUrl() {
    }
    public TempUrl(String path) {
        this.path = path;
    }
    public String toString(){
        return "\n TempUrl {" +
                "\n htmlPath: " +// this.path +
                "\n }";
    }
}
