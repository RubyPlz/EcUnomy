import java.util.*;

abstract class Card
{
    public int value;
    public String color;
    public boolean hasColor;
    public String special;
    public boolean isSpecial;
    public Card(int v, String c){
        value = v;
        color = c; //boop
    }
    public Card(String s, String c){
        
    }
    public Card(String s){
        
    }
}
