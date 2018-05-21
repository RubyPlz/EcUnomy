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
    public int imagex;
    public int imagey;
    public Card(int v, Color c){ //Number Cards
        value = v;
        color = c;
        special = null;
        type = 1;
        imagex = 0;
        imagey = 0;
    }

    public Card(String s, Color c, int t){ //+2, Skip, Reverse
        value = -1;
        color = c;
        special = s;
        type = t;
        imagex = 0;
        imagey = 0;
    }

    public Card(String s, int t){ //Wild, +4, Communism, +2 all, swap, no u
        value = -1;
        color = null;
        special = s;
        type = t;
        imagex = 0;
        imagey = 0;
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

    public void setPos(int x ,int y){
        imagex = x;
        imagey = y;
    }

    public BufferedImage getImage(){
        BufferedImage image = null;
        try
        {
            image = ImageIO.read(new File("UNOdeck.png"));
        }
        catch (Exception e)
        {
            e.printStackTrace();
            System.exit(1);
        }
        BufferedImage subImage = new BufferedImage(1,1,5);
        int row = (imagey==0)?imagey*75:imagey*75-1;
        int col = (imagex==0)?imagex*50:imagex*50-1;
        try{
            subImage = image.getSubimage(col, row, 50, 75);
        }catch(Exception e){
            e.printStackTrace();
        }
        return subImage;
    }

    public String toString(){
        return "Color: " + color + "\n" + "Value: " + value + "\n" + 
        "Special: " + special;
    }
}