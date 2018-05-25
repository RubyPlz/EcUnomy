import java.awt.*;
import java.awt.image.*;
import java.io.*;
import javax.imageio.*;
import javax.swing.*;

/**
 * 
 */
public class ImageDemo
{//
    public static void main(String[] args) 
    {
        BufferedImage image = null;
        try
        {
            image = ImageIO.read(new File("UNOdeck.png"));
        }
        catch (Exception e)
        {
            e.printStackTrace();
            System.exit(1);
        }
        Deck deck = new Deck();
        deck.shuffle();
        while(!deck.isEmpty()){
            Card c = deck.deal();
            JFrame editorFrame = new JFrame(c.toString());
            editorFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
            BufferedImage subImage = c.getImage();
            
            ImageIcon imageIcon = new ImageIcon(subImage);
            JLabel jLabel = new JLabel();
            jLabel.setIcon(imageIcon);
            editorFrame.getContentPane().add(jLabel, BorderLayout.CENTER);
            int x;
            editorFrame.pack();
            editorFrame.setLocationRelativeTo(null);
            editorFrame.setVisible(true);
        }

        
    }

}