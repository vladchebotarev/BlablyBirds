package pl.vlad.fbird;

public class ColumnsRepository implements Container {
	
	
	 	private ColumnFactory columnfactory = new ColumnFactory();
     	private Column column1 = columnfactory.buildColumn("DARK");
     	private Column column2 = columnfactory.buildColumn("REGULAR");
     	private Column column3 = columnfactory.buildColumn("LIGHT");
     	public Column columnstab[] = {column1 , column2, column3};

	   //@Override
	   public Iterator getIterator() {
	      return new NameIterator();
	   }

	   private class NameIterator implements Iterator {

	      int index;

	     // @Override
	      public boolean hasNext() {
	      
	         if(index < columnstab.length){
	            return true;
	         }
	         return false;
	      }

	      //@Override
	      public Object next() {
	      
	         if(this.hasNext()){
	            return columnstab[index++];
	         }
	         return null;
	      }		
	   }
	}
