package pl.vlad.fbird;

public class GameOver {

    //private Bird bird = new Bird();
    //private Columns column = new Columns();
	/*private ColumnFactory columnfactory = new ColumnFactory();
    private Column column1 = columnfactory.buildColumn("DARK");
    private Column column2 = columnfactory.buildColumn("REGULAR");
    private Column column3 = columnfactory.buildColumn("LIGHT");*/
	//ColumnsRepository colRepository = new ColumnsRepository();
	Iterator iter;
	private boolean bl;
    
    public boolean check() {
        
    	

        //Bird is dropped 
        if (Facade.getInstance().birdGetY() + 45 >= 400) {
            //return true;
        	bl = true;
        }
        
        if (Facade.getInstance().birdGetY()< 0){
        	bl = true;
        }
       
        for(iter = Facade.getInstance().getIterator(); iter.hasNext();){
            Column column = (Column)iter.next();
            if (Facade.getInstance().birdGetY() <= column.getH() && (((Facade.getInstance().birdGetX() + 45) >= column.getX())) && Facade.getInstance().birdGetX() <= (column.getX() + 65)) {
            	//System.out.println("Game Over upper column 2 check");
            	//return true;
            	bl = true;
            }
            if ((Facade.getInstance().birdGetY() + 45) >= (column.getH() + 150) && ((Facade.getInstance().birdGetX() + 45) >= column.getX() && Facade.getInstance().birdGetX() <= (column.getX() + 65))) {
            	//System.out.println("Game Over down column 2 check");
            	//return true;
            	bl = true;
            }
         }
        return bl;
        //Bird touch the column
        /*if (Bird.getInstance().getY() <= column1.getH() && (((Bird.getInstance().getX() + 45) >= column1.getX())) && Bird.getInstance().getX() <= (column1.getX() + 65)) {
        	System.out.println("Game Over upper column 1 check");
            return true;
        }
        if ((Bird.getInstance().getY() + 45) >= (column1.getH() + 100) && ((Bird.getInstance().getX() + 45) >= column1.getX() && Bird.getInstance().getX() <= (column1.getX() + 65))) {
        	System.out.println("Game Over down column 1 check");
        	return true;
        }
       
        
        
        //--------
        if (Bird.getInstance().getY() <= column2.getH() && (((Bird.getInstance().getX() + 45) >= column2.getX())) && Bird.getInstance().getX() <= (column2.getX() + 65)) {
        	System.out.println("Game Over upper column 2 check");
        	return true;
        }
        if ((Bird.getInstance().getY() + 45) >= (column2.getH() + 150) && ((Bird.getInstance().getX() + 45) >= column2.getX() && Bird.getInstance().getX() <= (column2.getX() + 65))) {
        	System.out.println("Game Over down column 2 check");
        	return true;
        }
       
        
        //--------
        if (Bird.getInstance().getY() <= column3.getH() && (((Bird.getInstance().getX() + 45) >= column3.getX())) && Bird.getInstance().getX() <= (column3.getX() + 65)) {
        	System.out.println("Game Over upper column 3 check");
        	return true;
        }
        if ((Bird.getInstance().getY() + 45) >= (column3.getH() + 200) && ((Bird.getInstance().getX() + 45) >= column3.getX() && Bird.getInstance().getX() <= (column3.getX() + 65))) {
        	System.out.println("Game Over down column 3 check");
        	return true;
        }
        
        
        //--------
      /*  if (bird.getY() <= column.getH4() && (((bird.getX() + 45) >= column.getX4())) && bird.getX() <= (column.getX4() + 65)) {
            return true;
        }
        if ((bird.getY() + 45) >= (column.getH4() + 100) && ((bird.getX() + 45) >= column.getX4() && bird.getX() <= (column.getX4() + 65))) {
            return true;
        }*/
        //return false;
    }

}
