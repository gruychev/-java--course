package homework7;

import java.util.Random;

public class task3 {

	public static void main(String[] args) {
		
		Random rand = new Random();
		
				
		for(int i=1;i<21;i++){
		int number1 = rand.nextInt(10);
		int number2 = rand.nextInt(10);
		int number3 = rand.nextInt(10);
		int result= number1*number2*number3;
				
		System.out.println(number1);
		System.out.println(number2);
		System.out.println(number3);
		System.out.println(result);
		System.out.println("");
		}
		
		
	}

}

