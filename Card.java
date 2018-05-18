import java.util.*;

abstract class Card
{
    public int value;
    public String color;
    public boolean hasColor;
    public String special;
    public boolean isSpecial;
    public Card(int v, String c){ //Number Cards
        value = v;
        color = c; 
        hasColor = true;
        special = "";
        isSpecial = false;
    }
    public Card(String s, String c){ //+2, Skip, Reverse
        value = -1;
        color = c;
        hasColor = true;
        special = s;
        isSpecial = true;
    }
    public Card(String s){ //Wild, +4
        value = -1;
        color = "";
        hasColor = false;
        special = s;
        isSpecial = true;
    }
    public String getColor(){
        return color;
    }
    public int getValue(){
        return value;
    }
}
