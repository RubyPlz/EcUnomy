import java.util.*;
import java .awt.*;
public class Pile{
    private ArrayList<Card> pile;
    public Pile(){
        pile = new ArrayList<Card>();
    }
    public void add(Card c){  
        pile.add(c);
    }
    public ArrayList<Card> removeUnder(Deck d){
        ArrayList<Card> temp = new ArrayList<Card>();
        int size = pile.size();
        for(int i = 0; i < size - 1; i++){
            temp.add(pile.remove(1));
        }
        d.add(temp);
        return temp;
    }
    public Card getTop(){
        return pile.get(pile.size() - 1);
    }
}











