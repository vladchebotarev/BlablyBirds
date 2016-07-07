package pl.vlad.fbird;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;
import javax.swing.JPanel;
/*import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;*/

public class Columns extends JPanel {


    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static int x1 = 500, x2 = x1 + 240, x3 = x2 + 240;//, x4 = x3 + 540; 
    private static int h1, h2, h3;//, h4;
    private static boolean bl1 = false;
    private static boolean bl2 = false;
    private static boolean bl3 = false;
  //  private static boolean bl4 = false;
   // private BufferedImage upcolumn, downcolumn;

    public int getX1() {
        return x1;
    }

    public int getX2() {
        return x2;
    }

    public int getX3() {
        return x3;
    }

   /* public int getX4() {
        return x4;
    }*/

    public int getH1() {
        return h1;
    }

    public int getH2() {
        return h2;
    }

    public int getH3() {
        return h3;
    }

  /*  public int getH4() {
        return h4;
    }*/

    
    public void randHeight() {
        Random rand = new Random();
        if (bl1 == false) {
            h1 = rand.nextInt(200); 
            bl1 = true;
        }
        if (bl2 == false) {
            h2 = rand.nextInt(200); 
            bl2 = true;
        }
        if (bl3 == false) {
            h3 = rand.nextInt(200); 
            bl3 = true;
        }
       /* if (bl4 == false) {
            h4 = rand.nextInt(200); 
            bl4 = true;
        }*/
    }

    
    public void paint(Graphics g) {
        try {
            randHeight();
            //Up column 1
            g.setColor(Color.green);
            g.fillRect(x1, 0, 65, h1);

            //DownColumn 1
            g.setColor(Color.green);
            g.fillRect(x1, h1 + 150, 65, 500);
            
            
//            upcolumn = ImageIO.read(new File("F:\\KyThuatLapTrinhHuongDoiTuong\\Baitap\\FlappyBird\\res\\upcolumn.png"));
//            downcolumn = ImageIO.read(new File("F:\\KyThuatLapTrinhHuongDoiTuong\\Baitap\\FlappyBird\\res\\downcolumn.png"));
//            g.drawImage(upcolumn, x1, 0, 65, h1, null);
//            g.drawImage(downcolumn, x1, h1 + 100, 65, 500, null);
            
            
            //Up column 2
            g.setColor(Color.green);
            g.fillRect(x2, 0, 65, h2);

            //DownColumn 2
            g.setColor(Color.green);
            g.fillRect(x2, h2 + 150, 65, 500);
            
            
//            g.drawImage(upcolumn, x2, 0, 65, h2, null);
//            g.drawImage(downcolumn, x2, h2 + 100, 65, 500, null);
            
            
            //Up column 3
            g.setColor(Color.green);
            g.fillRect(x3, 0, 65, h3);

            //DownColumn 3
            g.setColor(Color.green);
            g.fillRect(x3, h3 + 150, 65, 500);
             
            
//            g.drawImage(upcolumn, x3, 0, 65, h3, null);
//            g.drawImage(downcolumn, x3, h3 + 100, 65, 500, null);
            
            
            //Up column 4
            /*g.setColor(Color.green);
            g.fillRect(x4, 0, 65, h4);

            //DownColumn 4
            g.setColor(Color.green);
            g.fillRect(x4, h4 + 100, 65, 500);*/
            
            
//            g.drawImage(upcolumn, x4, 0, 65, h4, null);
//            g.drawImage(downcolumn, x4, h4 + 100, 65, 500, null);
            
        } catch (Exception ex) {
            //Logger.getLogger(Columns.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void decrementX() {
//        x = x - 1;
        x1--;
        x2--;
        x3--;
       // x4--;
    }

    public void replayX() {
        if (x1 == -240) {
            x1 = 500;
            bl1 = false;
        }
        if (x2 == -240) {
            x2 = 500;
            bl2 = false;
        }
        if (x3 == -240) {
            x3 = 500;
            bl3 = false;
        }
        /*if (x4 == -65) {
            x4 = 500;
            bl4 = false;
        }*/
    }
}