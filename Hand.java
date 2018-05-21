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
    
    public Card play(int i){
        return hand.remove(i);
    }

}