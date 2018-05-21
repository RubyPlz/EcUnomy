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
    public int type; //1: Numbers 2-4: +2, Skip, Reverse 5-10: Wild, +4, Communism, +2 all, swap, no u
    public Card(int v, Color c){ //Number Cards
        value = v;
        color = c;
        special = null;
        type = 1;
    }
    public Card(String s, Color c, int t){ //+2, Skip, Reverse
        value = -1;
        color = c;
        special = s;
        type = t;
    }
    public Card(String s, int t){ //Wild, +4, Communism, +2 all, swap, no u
        value = -1;
        color = null;
        special = s;
        type = t;
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