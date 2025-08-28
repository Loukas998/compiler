package Classes.GenericStatements.Functions;

import Classes.GenericStatements.GenericStatement;
import Classes.Values.JsonObjectValue;
import Classes.Values.ValueType;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class RouterFunctionCall extends GenericStatement {
    public String basePath;
    public List<String> routePaths = new ArrayList<>();
    public JsonObjectValue queryParams;

    public RouterFunctionCall(String basePath, JsonObjectValue queryParams, List<String> routePaths) {
        this.basePath = basePath;
        this.queryParams = queryParams;
        this.routePaths = routePaths;
    }

    public RouterFunctionCall() {
        routePaths = new ArrayList<>();
        queryParams = new JsonObjectValue();
    }

    @Override
    public String toString() {
        String toSt = "\n RouterFunction Call "+"\n basePath is "+ basePath;
                if(routePaths!=null){
                    for (String route :routePaths){
                        toSt+="\n routePath "+route;
                    }
                }
                if(queryParams!=null && !queryParams.jsons.isEmpty()){
                    toSt+="queryParams"+queryParams.toString();
                }
                return  toSt;
    }

    @Override
    public String codeGen() {
        StringBuilder sb = new StringBuilder("window.location.href = " + basePath);
        if(routePaths!=null && !routePaths.isEmpty()){
            for(String route : routePaths){
                sb.append("/").append(route);
            }
        }
        if(queryParams!=null && !queryParams.jsons.isEmpty()){
            sb.append("?");
            for(Map.Entry<String, ValueType>jsonValue:queryParams.jsons.entrySet()){
                sb.append(jsonValue.getKey());
                sb.append("=");
                sb.append(jsonValue.getValue().codeGen());
                sb.append(",");
                sb.append("\n");
            }
        }
        return sb.toString();
    }
}
