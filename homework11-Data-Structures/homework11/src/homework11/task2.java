import java.util.LinkedList;
import java.util.Queue;


public class task2 {
	public static void main(String[] args) {
	
	String sentance = "This is one very long sentance";
	
	Queue<String> queue = new LinkedList<String>();
	 String[] parts = sentance.split(" ");
	 
	 for(int i = 0; i <6; i++){
		 String text=parts[i];
		 int lenght = text.length();
		 if (lenght>3){
		  queue.offer(parts[i]);
		 }
		}
	 
	
	 String rr = "";
	while (!queue.isEmpty()) {
		
		String current = queue.poll();
		  rr =rr +" "+ current;
	    System.out.println(current);
	  
	}
	
	System.out.println(rr);
	}
}