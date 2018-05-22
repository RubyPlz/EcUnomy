import java.util.*;
import java .awt.*;
public class Player{
    private ArrayList<Card> hand;
    private String name;
    private int numcards;
    public Player(String n){
        numcards = 0;
        hand = new ArrayList<Card>();
        name = n;
    }
    
    public void add(Card c){
        hand.add(c);
    }
    
    public void add(Card[] c){
        for(Card card: c){
            hand.add(card);
        }
    }
    
    public Card play(int i){
        return hand.remove(i);
    }
    
    public Card[] playMultiple(ArrayList<Integer> indices){
        Card[] c = new Card[indices.size()];
        for(int i = 0; i< c.length; i++){
            c[i] = hand.get(indices.get(i));
        }
        return c;
    }
    
    public int getSize(){
        return hand.size();
        
    }
    
    public Card getCard(int i){
        return hand.get(i);
        
    }

}