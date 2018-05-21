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
    public static void main(String[] args) throws Exception
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

        while(!deck.isEmpty()){
            Card c = deck.deal();
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

        /**for(int r = 0; r< 8; r++){
        for(int c = 0; c< 14; c++){
        JFrame editorFrame = new JFrame("Image Demo"+r+" "+c);
        editorFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        BufferedImage subImage = new BufferedImage(1,1,5);
        int row = (r==0)?r*75:r*75-1;
        int col = (c==0)?c*50:c*50-1;
        try{
        subImage = image.getSubimage(col, row, 50, 75);
        }catch(Exception e){
        System.out.println(r+" "+c);
        }
        ImageIcon imageIcon = new ImageIcon(subImage);
        JLabel jLabel = new JLabel();
        jLabel.setIcon(imageIcon);
        editorFrame.getContentPane().add(jLabel, BorderLayout.CENTER);

        editorFrame.pack();
        editorFrame.setLocationRelativeTo(null);
        editorFrame.setVisible(true);
        }
        }*/
    }

}