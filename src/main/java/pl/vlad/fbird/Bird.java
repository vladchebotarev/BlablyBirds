package pl.vlad.fbird;

//  import java.awt.Color;
import java.awt.Graphics;

import java.awt.image.BufferedImage;
import java.io.File;
//import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
//import javax.swing.JPanel;


/*public final class Singleton {
    private static Singleton _instance = null;

    private Singleton() {}

    public static synchronized Singleton getInstance() {
        if (_instance == null)
            _instance = new Singleton();
        return _instance;
    }
}*/

public class Bird {
	/*private static Bird _instance = null;
	
	private Bird(){
		System.out.println("Konstuktor Bird");
		}
	
	public static synchronized Bird getInstance() {
        if (_instance == null)
            _instance = new Bird();
        return _instance;
    }*/
	
    private static int y = 200;
    private static int x = 100;
    private BufferedImage bird;

  

	//otrzymac wartosc x
    public int getX() {
        return x;
    }
    
    //otrzymac wartosc y
    public int getY() {
        return y;
    }

    
    public void paint(Graphics g) {
        try {
        	//g.setColor(Color.red);
        	//g.fillRect(x, y, 45, 45);
            
            bird = ImageIO.read(new File("img\\Bird.png"));
            g.drawImage(bird, x, y, null);
        } catch (Exception ex) {
           Logger.getLogger(Bird.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    
    public void birdDown() {
    	y++;
    }

    
    public boolean birdUp() {

        y -= 40;
        return true;
        
    }
}
