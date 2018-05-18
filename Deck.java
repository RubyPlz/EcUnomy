import java.util.*;
public class Deck{
    private ArrayList<Card> deck;
    public Deck(){
        for(int i = 0; i < 4; i++){ //adds Wild
            deck.add(new Card("Wild"));
        }
        for(int i = 0; i < 4; i++){ //adds +4
            deck.add(new Card("+4"));
        }
        double counter = 1;
        for(int i = 0; i < 18; i++){ //adds red 1-9
            int temp = (int)counter;
            deck.add(new Card(temp, "Red"));
            counter += .5;
        }
        counter = 1;
        for(int i = 0; i < 18; i++){ //adds blue 1-9
            int temp = (int)counter;
            deck.add(new Card(temp, "Blue"));
            counter += .5;
        }
        counter = 1;
        for(int i = 0; i < 18; i++){ //adds green 1-9
            int temp = (int)counter;
            deck.add(new Card(temp, "Green"));
            counter += .5;
        }
        counter = 1;
        for(int i = 0; i < 18; i++){ //adds yellow 1-9
            int temp = (int)counter;
            deck.add(new Card(temp, "Yellow"));
            counter += .5;
        }
        for(int i = 0; i < 2; i++){
            deck.add(new Card(2, ""));
        }
    }
}