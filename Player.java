
/**
 * Write a description of class Player here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Player
{
    public Hand hand;
    private String name;
    private int numcards;
    public Player(String n, Card[] cards){
        numcards = cards.length;
        hand = new Hand();
        hand.add(cards);
        name = n;
    }
    
    public void askTrade(Player p){
        
    }
    
    public boolean acceptTrade(){
        return true;
    }
    
    public boolean declineTrade(){
        return false;
    }
}
