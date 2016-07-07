package pl.vlad.fbird;

import java.awt.Graphics;

/*public class ShapeMaker {
   private Shape circle;
   private Shape rectangle;
   private Shape square;

   public ShapeMaker() {
      circle = new Circle();
      rectangle = new Rectangle();
      square = new Square();
   }

   public void drawCircle(){
      circle.draw();
   }
   public void drawRectangle(){
      rectangle.draw();
   }
   public void drawSquare(){
      square.draw();
   }
}*/

/*public final class Singleton {
private static Singleton _instance = null;

private Singleton() {}

public static synchronized Singleton getInstance() {
    if (_instance == null)
        _instance = new Singleton();
    return _instance;m
}
}*/


public final class Facade {
	private static Facade _instance = null;
	
	ColumnsRepository colRepository;
    Bird bird;
    GameOver gameover1;
    Score score;
    
    private Facade() {
    	colRepository = new ColumnsRepository();
    	bird = new Bird();
    	gameover1 = new GameOver();
    	score = new Score();
    }
    
    public static synchronized Facade getInstance() {
        if (_instance == null)
            _instance = new Facade();
        return _instance;
    }
    
    
    public Iterator getIterator(){
    	return colRepository.getIterator();
    	   	
    }

	public void birdDown() {
		bird.birdDown();
		
	}

	public void countScore() {
		score.countScore();
		
	}

	public boolean check() {
		return gameover1.check();
	}

	public int getScr() {
		return score.getScr();
	}

	
	public void birdPaint(Graphics g) {
		bird.paint(g);
		
	}

	public int birdGetY() {
		// TODO Auto-generated method stub
		return bird.getY();
	}

	public int birdGetX() {
		// TODO Auto-generated method stub
		return bird.getX();
	}

	public void birdUp() {
		// TODO Auto-generated method stub
		bird.birdUp();
	}
    
}
