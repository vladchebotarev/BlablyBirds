package pl.vlad.fbird;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.*;
/*import java.util.logging.Level;
import java.util.logging.Logger;*/



public class MainWindow extends JFrame {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Activity action = new Activity();
    //private Bird bird = new Bird();
    JButton okButton = new JButton("OK");
    public MainWindow() {
        setSize(500, 500); 
        setVisible(true); 
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        setLocation(400, 100);
        setResizable(false);

        add(okButton);
        add(action);
        
        addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent ke) {
                //if (Facade.getInstance().bird.getY() >= 0) {
                	Facade.getInstance().birdUp();
                //}
            } 
        });
        
        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent me) {
                if (Facade.getInstance().birdGetY() >= 0) {
                	Facade.getInstance().birdUp();
                }
            }
        });
    }

    public static void main(String[] args) {
    	@SuppressWarnings("unused")
		MainWindow flappybird = new MainWindow();

    }
}