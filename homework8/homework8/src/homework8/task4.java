package homework8;


public class task4 {
	
	
	public static void main(String[] args) {
		String sentance = "This is one . very long sentance . but we will split it into separated words!";
		
		String[] parts = sentance.split(" . ");
		int l=parts.length;
		for (int i = 0; i < parts.length; i++) {
	    	 System.out.println(parts[i]);
		}
		
	}

}