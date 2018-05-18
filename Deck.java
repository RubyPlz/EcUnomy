import java.util.*;
public class Deck{
    private ArrayList<Card> deck;
    public Deck(){
        for(int i = 0; i < 4; i++){
            deck.add(new Card("Wild"));
        }
        for(int i = 0; i < 4; i++){
            deck.add(new Card("+4"));
        }
        double redC = 1;
        for(int i = 0; i < 18; i++){
            int temp = (int)redC;
            deck.add(new Card(temp, "Red"));
            redC += .5;
        }
        for(int i = 0; i < 2; i++){
            deck.add(new Card(1, "Blue"));
        }
        for(int i = 0; i < 2; i++){
            deck.add(new Card(1, "Green"));
        }
        for(int i = 0; i < 2; i++){
            deck.add(new Card(1, "Yellow"));
        }
        for(int i = 0; i < 2; i++){
            deck.add(new Card(2, ""));
        }
    }
}