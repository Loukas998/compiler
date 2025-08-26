package Classes.CSS;
public class Css extends CssGeneric{
    //Display|Flex_Direction|Gap|Padding|Box_Size|Flex|Border|Text_Align|Max_With|Height|Cursor|Transition|Background_Color|Margin
    public String cssPropertyName;

    @Override
    public String toString() {
        return this.cssPropertyName;
    }

    @Override
    public String codeGen() {
        return cssPropertyName;
    }
}