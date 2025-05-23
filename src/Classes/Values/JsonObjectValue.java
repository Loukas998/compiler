package Classes.Values;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class JsonObjectValue extends ValueType{
    public Map<String, ValueType> jsons;
    public JsonObjectValue(){
        this.jsons = new LinkedHashMap<>();
    }
    public JsonObjectValue(Map<String, ValueType> jsons) {
        this.jsons = jsons;
    }
    public void addJsons(String key, ValueType value){
        jsons.put(key, value);
    }
    @Override
    public String toString(){
        return "\n JsonObjectValue{" +
                "\n " + jsons.toString() +
                "\n }";
    }
}
