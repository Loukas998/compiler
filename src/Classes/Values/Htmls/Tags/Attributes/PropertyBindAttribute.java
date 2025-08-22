package Classes.Values.Htmls.Tags.Attributes;

public class PropertyBindAttribute extends Attribute{
    public String attributeName;
    public String attributeValue;
    public PropertyBindAttribute(){}

    public PropertyBindAttribute(String attributeName, String attributeValue) {
        this.attributeName = attributeName;
        this.attributeValue = attributeValue;
    }

    @Override
    public String toString(){
        return "\n PropertyBindAttribute{" +
                "\n attributeName: " + this.attributeName + "," +
                "\n attributeValue: " + this.attributeValue +
                "\n }";
    }
    @Override
    public String codeGen() {
        StringBuilder sb = new StringBuilder();
        sb.append("id = \"");
        sb.append(this.attributeName);
        sb.append("_");
        sb.append(this.hashCode());
        sb.append("\"");
        return sb.toString();
    }
}
