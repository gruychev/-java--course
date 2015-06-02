package homework11;

import java.util.Stack;
public class task1 {
	
	
	public static void main(String[] args) {
		String sentance = "This is one very long sentance";
		
		String[] parts = sentance.split(" ");
			
		Stack<String> myStack = new Stack<String>();
		for(int i = 0; i <6; i++){
		
		 myStack.push(parts[i]);
		}
		String rr="";
         while(!myStack.isEmpty()){
		
			String current = myStack.pop();
			rr =rr +" "+ current;
			System.out.println(current);
      }
System.out.println(rr);
		
	
	}

}