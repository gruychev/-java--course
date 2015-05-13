package homework4;

import java.util.Scanner;
public class task5 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in,"UTF-8");
	         
	     System.out.println("Please enter a:");
		   
	     int a = input.nextInt();
	    		 
	    System.out.println("Please enter b:");
		   
	     int b = input.nextInt();
	          
	     int[] array = new int[b];
	 	
	     for (int i = a-1; i < array.length; i++) {
		    array[i] = i + 1;
		}
		
		for (int i = a-1; i < array.length; i++) {
			 if(array[i] % 3 == 0){
	    		 //System.out.print(i+1);
			System.out.println("array[" + i + "] = " + array[i]);
		}
		}
	     
	     
	}
}