package homework8;


public class task1 {
	

	    public static void main(String[] args) {

	        String text = "homework";
          
          StringBuilder tt = new StringBuilder();

	        for (int i = text.length() - 1; i >= 0; i--){

	            tt.append(text.charAt(i));
	            }
	           String ss = tt.toString();
	        
	          System.out.println(ss);
	        
	    }

	}


