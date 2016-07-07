package pl.vlad.fbird;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.JPanel;
import java.awt.image.BufferedImage;
import java.io.File;
//import java.io.IOException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;



public class Activity extends JPanel implements Runnable {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	//private Columns column = new Columns();
	
	/*private ColumnFactory columnfactory = new ColumnFactory();
    private Column column1 = columnfactory.buildColumn("DARK");
    private Column column2 = columnfactory.buildColumn("REGULAR");
    private Column column3 = columnfactory.buildColumn("LIGHT");*/
    //ColumnsRepository colRepository = new ColumnsRepository();
    //private Bird bird = new Bird();
    //private GameOver gameover1 = new GameOver();
    //private Score score = new Score();
    private static boolean bl = false;
    private BufferedImage bg, ground, gameover;
    private Thread threadA;
    Iterator iter;

    public Activity() {
        threadA = new Thread(this);
        threadA.start(); //go run() method
        
    }

    public void paint(Graphics g) {
        try {
        	
        	//Background
        	g.setColor(Color.cyan);
        	g.fillRect(0, 0, getWidth(), getHeight());

            //java.net.URL imgURL = Activity.class.getResource("img/BG.png");
            //java.net.URL logoOneUrl = getClass().getResource("img/BG.png");
            //URL u = getClass().getResource("img\\BG.png");
            //bg = ImageIO.read(new File("img\\BG.png"));
           // g.drawImage(bg, 0, 0, null);

            //Columns
        	  for(iter = Facade.getInstance().getIterator(); iter.hasNext();){
                  Column column = (Column)iter.next();
                  column.paint(g);
               }
            /*column1.paint(g);
            column2.paint(g);
            column3.paint(g);*/
            
            //Ground
            //g.setColor(Color.green);
            //g.fillRect(0, 400, getWidth(), getHeight());

           // g.setColor(Color.orange);
           // g.fillRect(0, 410, getWidth(), getHeight());
            
            
            ground = ImageIO.read(new File("img\\grow.png"));
            g.drawImage(ground, 0, 400, null);

            //Bird
            Facade.getInstance().birdPaint(g);

            g.setColor(Color.BLACK);
            g.setFont(new Font("Arial", Font.BOLD, 20)); 
            g.drawString("Score: " + Facade.getInstance().getScr(), 10, 20); 

            if (bl == true) {
                gameover = ImageIO.read(new File("img\\go.png"));
                g.drawImage(gameover, 120, 175, null);
            	//g.drawString("Game Over!", 120, 175);
            }
        } catch (Exception ex) {
            Logger.getLogger(Activity.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    
	@SuppressWarnings("deprecation")
	//@Override
    public void run() {
       
        while (true) {
            repaint();
            for(iter = Facade.getInstance().getIterator(); iter.hasNext();){
                Column column = (Column)iter.next();
                column.decrementX();
             }
            /*column1.decrementX();
            column2.decrementX();
            column3.decrementX();*/
            try {
                Thread.sleep(10);
            } catch (InterruptedException ex) {
                Logger.getLogger(Activity.class.getName()).log(Level.SEVERE, null, ex);
            }
            for(Iterator iter = Facade.getInstance().getIterator(); iter.hasNext();){
                Column column = (Column)iter.next();
                column.replayX();
             }
            /*column1.replayX();
            column2.replayX();
            column3.replayX();*/
            Facade.getInstance().birdDown();
            Facade.getInstance().countScore();
            
            if (Facade.getInstance().check() == true) {
                bl = true;
                repaint();
                threadA.stop();
                
                
            }
        }
    }
}