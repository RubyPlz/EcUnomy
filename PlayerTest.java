import java.util.*;
import java.awt.*;
/**
 * Write a description of class PlayerTest here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class PlayerTest
{
    // instance variables - replace the example below with your own
    private String name;
    private Hand ownHand;
    /**DONT MIND ME
     * 
     */
    /**
     * Constructor for objects of class PlayerTest
     */
    public PlayerTest(String n,ArrayList<Card> start)
    {
        name=n;
        //Hand temp = new Hand();
        for(int i = 0; i<start.size();i++){
            ownHand.add(start.get(i));
        }
        //ownHand = temp;
    }

    public void draw(Card x){
        ownHand.add(x);

    }

    public void displayCards(){
        for(int i =0; i<ownHand.getSize();i++){
            ownHand.getCard(i).toString();
        }
        }

    }
