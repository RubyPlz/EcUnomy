import java.util.*;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.WindowConstants;

import java .awt.*;
import java.awt.image.BufferedImage;
public class Player{
	public static void main(String[] args) {
		Player q = new Player("gerv");
		Deck d = new Deck();
		d.shuffle();
		for(int i = 0; i<7;i++) {
			q.add(d.deal());
		}
		while(q.getSize()!=0) {
			Card c = q.play(0);
			JFrame editorFrame = new JFrame(c.toString());
            editorFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
            BufferedImage subImage = c.getImage();
            
            ImageIcon imageIcon = new ImageIcon(subImage);
            JLabel jLabel = new JLabel();
            jLabel.setIcon(imageIcon);
            editorFrame.getContentPane().add(jLabel, BorderLayout.CENTER);
            editorFrame.pack();
            editorFrame.setLocationRelativeTo(null);
            editorFrame.setVisible(true);
		}
	}
    private ArrayList<Card> hand;
    private String name;
    private int numcards;
    public Player(String n){
        numcards = 0;
        hand = new ArrayList<Card>();
        name = n;
    }
    
    public void add(Card c){
        hand.add(c);
    }
    
    public void add(Card[] c){
        for(Card card: c){
            hand.add(card);
        }
    }
    
    public void add(ArrayList<Card> c){
        for(Card card: c){
            hand.add(card);
        }
    }
    
    public Card play(int i){
        return hand.remove(i);
    }
    
    public Card[] playMultiple(ArrayList<Integer> indices){
        Card[] c = new Card[indices.size()];
        for(int i = 0; i< c.length; i++){
            c[i] = hand.get(indices.get(i));
        }
        return c;
    }
    
    public String getName() {
    	return name;
    }
    
    public int getSize(){
        return hand.size();
        
    }
    
    public Card getCard(int i){
        return hand.get(i);
        
    }

}