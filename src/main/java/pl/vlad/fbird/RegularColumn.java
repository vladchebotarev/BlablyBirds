package pl.vlad.fbird;

import java.awt.Color;
import java.awt.Graphics;
//import java.awt.image.*;
//import java.io.File;
//import java.io.IOException;
import java.util.Random;

//import javax.imageio.ImageIO;

public class RegularColumn implements Column{
	
	public static int x=740;
	public static int h;
	public static boolean bl = false;
	//private BufferedImage upcolumn1, downcolumn1;
	public RegularColumn(){
		System.out.println("RegularColumn");
		}
	
	
	public int getX() {
		return x;
	}
	
	public int getH() {
		return h;
	}
	
	public void randHeight() {
		Random rand = new Random();
        if (bl == false) {
            h = rand.nextInt(200);
            System.out.println(h);
            bl = true;
        }
	}
	
	public void paint(Graphics g) {
		
        randHeight();
        //Up column 1
        g.setColor(Color.green);
        g.fillRect(x, 0, 65, h);

        //DownColumn 1
        g.setColor(Color.green);
        g.fillRect(x, h + 150, 65, 500);
        
        /*try {
			upcolumn1 = ImageIO.read(new File("img\\upcolumn1.png"));
			downcolumn1 = ImageIO.read(new File("img\\downcolumn.png"));
			g.drawImage(upcolumn1, x, 0, 65, h, null);
            g.drawImage(downcolumn1, x, h + 150, 65, 500, null);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
    }
	
	 public void decrementX() {
			x--;
		}
	 
		public void replayX() {
			 if (x == -240) {
		            x = 500;
		            bl = false;
		        }
		}
}
