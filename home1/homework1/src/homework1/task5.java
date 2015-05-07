package homework1;

import java.util.Scanner;

public class task5 {
	
	 public static void main(String[] args) {

	        Scanner input = new Scanner(System.in, "UTF-8");
	        
	        System.out.println("number1: ");
	        int number1 = input.nextInt();
	        
	        System.out.println("number2: ");
	        int number2 = input.nextInt();
	        
	        System.out.println("number3: ");
	        int number3 = input.nextInt();
	        
	        System.out.println("number4: ");
	        int number4 = input.nextInt();
	        
	        int sum = number1 + number2 + number3 + number4 ;
	               
	        System.out.println(sum);
	 }

}
