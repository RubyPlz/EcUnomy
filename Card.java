import java.util.*;
import java.awt.*;
import java.awt.image.*;
import java.io.*;
import javax.imageio.*;
import javax.swing.*;
public class Card
{
    public int value;
    public Color color;
    public String special;
    public int type; //1: Numbers 2: +2, Skip, Reverse 3: Wild, +4
    public Card(int v, Color c){ //Number Cards
        value = v;
        color = c;
        special = "";
        type = 1;
    }
    public Card(String s, Color c){ //+2, Skip, Reverse
        value = -1;
        color = c;
        special = s;
        type = 2;
    }
    public Card(String s){ //Wild, +4
        value = -1;
        color = null;
        special = s;
        type = 3;
    }
    public Color getColor(){
        return color;
    }
    public int getValue(){
        return value;
    }
    public int getType(){
        return type;
    }
    public String toString(){
        return "Color: " + color + "\n" + "Value: " + value + "\n" + 
        "Special: " + special;
    }
}