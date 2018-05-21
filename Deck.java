import java.util.*;
import java.awt.*;
public class Deck{
    private static final int MAX_SIZE = 112;
    private ArrayList<Card> deck;
    public Deck(){
        deck = new ArrayList<Card>();
        Card c = null;
        addColor(Color.RED, 0);
        addColor(Color.YELLOW, 1);
        addColor(Color.GREEN, 2);
        addColor(Color.BLUE,3);
        c = new Card("Communism", 7); c.setPos(0, 4);
        deck.add(c);
        c = new Card("+2 all", 8); c.setPos(0, 5);
        deck.add(c);
        c = new Card("Swap Hands", 9); c.setPos(0, 6);
        deck.add(c);
        c = new Card("no u", 10); c.setPos(0, 7);
        deck.add(c);
    }

    public void addColor(Color c, int rowpos){
        int r = rowpos;
        Card card = new Card(0, Color.BLACK);
        for(int k = 0; k<2; k++){
            for(int i = 1; i< 10; i++){
                card = new Card(i, c); card.setPos(r, i);
                deck.add(card);
            }
            card = new Card("+2", c, 2); card.setPos(r, 12);
            deck.add(card);
            card = new Card("Skip", c, 3); card.setPos(r, 10);
            deck.add(card);
            card = new Card("Reverse", c, 4); card.setPos(r, 11);
            deck.add(card);
            r+=4;
        }
        card = new Card(0, c); card.setPos(rowpos, 0);
        deck.add(card);
        card = new Card("+4", 5); card.setPos(rowpos+4, 13);
        deck.add(card);
        card = new Card("Wild", 6); card.setPos(rowpos, 13);
        deck.add(card);
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

    public ArrayList<Card> deal(int number)
    {
        if (number > deck.size())
            return null;
        else
        {
            ArrayList<Card> temp = new ArrayList<Card>();
            for (int i = 0; i < number; i++)
                temp.add(deck.remove(0));
            return temp;

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

