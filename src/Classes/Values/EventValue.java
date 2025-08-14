package Classes.Values;

import java.io.FileWriter;

public class EventValue extends ValueType{
    public ValueType event;

    public EventValue() {}
    public EventValue(ValueType event) {
        this.event = event;
    }

    @Override
    public String toString(){
        return "\n EventValue{ " +
                "\n event: "+ event.toString() +
                "\n }";
    }

    @Override
    public String codeGen() {
return "";
    }
}
