import java.util.*;
import java .awt.*;
public class Hand{
    private ArrayList<Card> hand;
    public Hand(){
        hand = new ArrayList<Card>();
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