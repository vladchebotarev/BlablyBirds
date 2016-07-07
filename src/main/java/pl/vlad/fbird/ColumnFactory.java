package pl.vlad.fbird;

public class ColumnFactory {
	 public Column buildColumn(String columnType){
	      if(columnType == null){
	         return null;
	      }		
	      if(columnType.equalsIgnoreCase("DARK")){
	         return new DarkColumn();
	         
	      } else if(columnType.equalsIgnoreCase("REGULAR")){
	         return new RegularColumn();
	         
	      } else if(columnType.equalsIgnoreCase("LIGHT")){
	         return new LightColumn();
	      }
	      
	      return null;
	   }
}
