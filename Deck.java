import java.util.*;
import java.awt.*;
public class Deck{
    private static final int MAX_SIZE = 112;
    private ArrayList<Card> deck;
    public Deck(){
        addColor(Color.RED);
        addColor(Color.YELLOW);
        addColor(Color.BLUE);
        addColor(Color.GREEN);
        deck.add(new Card("Communism"));
        deck.add(new Card("+2 all"));
        deck.add(new Card("Swap Hands"));
        deck.add(new Card("no u"));
    }

    public void addColor(Color c){
        for(int k = 0; k<2; k++){
            for(int i = 1; i< 10; i++){
                deck.add(new Card(i, c));
            }
            deck.add(new Card("+2", c));
            deck.add(new Card("skip", c));
            deck.add(new Card("reverse", c));

        }
        deck.add(new Card("+4"));
        deck.add(new Card("wild"));
    }

    public boolean isEmpty()
    {
        return deck.isEmpty();
    }

    public int size()
    {
        return deck.size();
    }

    public Card deal()
    {
        if (isEmpty())
            return null;
        else
            return deck.remove(deck.size() -1);
    }

    public Card[] deal(int number)
    {
        if (number > deck.size())
            return null;
        else
        {
            Card[] hand = new Card[number];
            for (int i = 0; i < hand.length; i++)
                hand[i] = deal();
            return hand;

        }
    }

    public void shuffle()
    {
        Random gen = new Random();
        Card[] array = new Card[MAX_SIZE];
        while (deck.size() > 0)
        {
            Card card = deck.remove(deck.size() - 1);
            int z = gen.nextInt(MAX_SIZE);
            while (array[z] != null)
                z = gen.nextInt(MAX_SIZE);
            array[z] = card;

            for (Card c : array)
                deck.add(c);
        }
    }

    public String toString()
    {
        String result = "";
        for (Card card : deck)
            result += card + "\n";
        return result;

    }

    public void add(Card c){
        deck.add(c);
    }

}

