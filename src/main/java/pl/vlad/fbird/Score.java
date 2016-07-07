package pl.vlad.fbird;

public class Score {

    private static int scr = 0;
    //private Bird bird = new Bird();
    //ColumnsRepository colRepository = new ColumnsRepository();
    /*private ColumnFactory columnfactory = new ColumnFactory();
    private Column column1 = columnfactory.buildColumn("DARK");
    private Column column2 = columnfactory.buildColumn("REGULAR");
    private Column column3 = columnfactory.buildColumn("LIGHT");
    private static boolean bl1 = false;
    private static boolean bl2 = false;
    private static boolean bl3 = false;*/
    //private static boolean bl = false;
    Iterator iter;
    
    
    public int getScr() {
        return scr;
    }

    
    public void countScore() {
    	
        
    	for(iter = Facade.getInstance().getIterator(); iter.hasNext();){
            Column column = (Column)iter.next();
            if (Facade.getInstance().birdGetX()== column.getX() + 65)
			{
				scr++;
			}
            
         }
    	
    	
    	/*
    	//Column 1
        if (Bird.getInstance().getX() + 45 > column1.getX() && Bird.getInstance().getX() < column1.getX() + 65) {
            bl1 = true;
        }
        if (bl1 == true && Bird.getInstance().getX() > column1.getX() + 65) {
            scr++;
            bl1 = false;
        }
        
        //Column 2
        if (Bird.getInstance().getX() + 45 > column2.getX() && Bird.getInstance().getX() < column2.getX() + 65) {
            bl2 = true;
        }
        if (bl2 == true && Bird.getInstance().getX() > column2.getX() + 65) {
            scr++;
            bl2 = false;
        }
        
        //Column 3
        if (Bird.getInstance().getX() + 45 > column3.getX() && Bird.getInstance().getX() < column3.getX() + 65) {
            bl3 = true;
        }
        if (bl3 == true && Bird.getInstance().getX() > column3.getX() + 65) {
            scr++;
            bl3 = false;
        }
        
        //Column 4
       /* if (bird.getX() + 45 > column.getX4() && bird.getX() < column.getX4() + 65) {
            bl4 = true;
        }
        if (bl4 == true && bird.getX() > column.getX4() + 65) {
            scr++;
            bl4 = false;
        }*/
    }
}