import java.util.*;
import java .awt.*;
public class Hand{
    private ArrayList<Card> hand;
    public Hand(){
        hand = new ArrayList<Card>();
    }
    
    public void add(Deck d){
        hand.add(d.deal());
    }
    
    public Card play(int i){
        return hand.remove(i);
    }

}