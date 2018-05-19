import java.util.*;
import java.awt.*;
public class Deck{
    private ArrayList<Card> deck;
    public Deck(){
        for(int i = 0; i < 4; i++){ //adds Wild
            deck.add(new Card("Wild"));
        }
        for(int i = 0; i < 4; i++){ //adds +4
            deck.add(new Card("+4"));
        }
        double counter = .5;
        for(int i = 0; i < 19; i++){ //adds red 1-9
            int temp = (int)counter;
            deck.add(new Card(temp, Color.RED));
            counter += .5;
        }
        counter = .5;
        for(int i = 0; i < 19; i++){ //adds blue 1-9
            int temp = (int)counter;
            deck.add(new Card(temp, Color.BLUE));
            counter += .5;
        }
        counter = .5;
        for(int i = 0; i < 19; i++){ //adds green 1-9
            int temp = (int)counter;
            deck.add(new Card(temp, Color.GREEN));
            counter += .5;
        }
        counter = .5;
        for(int i = 0; i < 19; i++){ //adds yellow 1-9
            int temp = (int)counter;
            deck.add(new Card(temp, Color.YELLOW));
            counter += .5;
        }
        
    }

    public void shuffle(){
        //
    }
    
    public void reShuffle(ArrayList<Card> r){
        for(int i = 0; i < r.size(); i++){
            deck.add(r.get(i));
        }
    }
    
    public Card draw(){
        return deck.remove(deck.size() - 1);
    }
    
    public void add(Card c){
        deck.add(c);
    }

    public int getSize(){
        return deck.size();
    }
}



