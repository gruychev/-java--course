package homework4;

import java.util.Scanner;
public class task1 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in,"UTF-8");

	    System.out.println("Please enter n:");
	   
		
	     int n = input.nextInt();
	     int[] array = new int[n];
	     for (int i = 0; i < array.length; i++) {
	    	 array[i] = input.nextInt();
	     }
	    	 	    	 
	     int sum = 0;
	     for (int i = 0; i < array.length; i++) {
	    	 if(array[i] % 2 == 0){
	    	 sum=sum +array[i];
	    	 }
	     
	     }
	     
	     System.out.print(sum);


}
}