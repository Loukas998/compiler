package Classes.ComponenetInfos;

import Classes.ComponentInfo;

public class StandaloneStatus extends ComponentInfo {
    public String status;
    public StandaloneStatus(){

    }
    public StandaloneStatus(String status){
        this.status= status;
    }

    @Override
    public String toString() {
        return status;
    }
}
