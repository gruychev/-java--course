package homework8;

public class task2{
	   public static void main(String args[]){
	      String text="rado";
	      String text1="rado rado ivan rado";
	        String Str = new String(text);
		   String StrUpper=Str.toUpperCase();
	       String modified = text1.replace("rado", StrUpper);
	      System.out.println(StrUpper);
	      System.out.println(modified);
	      
	   }
	}