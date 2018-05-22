import java.util.*;
import java.awt.*;
public class Deck{
    private static final int MAX_SIZE = 112;
    private ArrayList<Card> deck;
    public Deck(){
        deck = new ArrayList<Card>();
        Card c = null;
        addColor("red", 0);
        addColor("yellow", 1);
        addColor("green", 2);
        addColor("blue",3);
        c = new Card("Communism", Type.COMMUNISM); c.setPos(0, 4);
        deck.add(c);
        c = new Card("+2 all", Type.PLUS2ALL); c.setPos(0, 5);
        deck.add(c);
        c = new Card("Swap Hands", Type.SWAPHANDS); c.setPos(0, 6);
        deck.add(c);
        c = new Card("no u", Type.NOU); c.setPos(0, 7);
        deck.add(c);
    }

    public void addColor(String c, int rowpos){
        int r = rowpos;
        Card card = null;
        for(int k = 0; k<2; k++){
            for(int i = 1; i< 10; i++){
                card = new Card(i, c); card.setPos(i, r);
                deck.add(card);
            }
            card = new Card("+2", c, Type.PLUS2); card.setPos(12, r);
            deck.add(card);
            card = new Card("Skip", c, Type.SKIP); card.setPos(10, r);
            deck.add(card);
            card = new Card("Reverse", c, Type.REVERSE); card.setPos(11, r);
            deck.add(card);
            r+=4;
        }
        card = new Card(0, c); card.setPos(0,rowpos);
        deck.add(card);
        card = new Card("+4", Type.PLUS4); card.setPos(13, rowpos+4);
        deck.add(card);
        card = new Card("Wild", Type.WILD); card.setPos(13, rowpos);
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

