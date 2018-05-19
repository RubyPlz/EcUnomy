import java.awt.*;
import java.awt.image.*;
import java.io.*;
import javax.imageio.*;
import javax.swing.*;

/**
 * A Java class to demonstrate how to load an image from disk with the
 * ImageIO class. Also shows how to display the image by creating an
 * ImageIcon, placing that icon an a JLabel, and placing that label on
 * a JFrame.
 * 
 * @author alvin alexander, alvinalexander.com
 */
public class ImageDemo
{
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

        for(int r = 0; r< 8; r++){
            for(int c = 0; c< 14; c++){
                JFrame editorFrame = new JFrame("Image Demo"+r+" "+c);
                editorFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
                BufferedImage subImage = new BufferedImage(1,1,5);
                try{
                    subImage = image.getSubimage(c*50-1, r*75-1, 50, 75);
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
        }
    }

}