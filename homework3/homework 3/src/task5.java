

import java.util.Scanner;
public class task5 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in,"UTF-8");

	    System.out.println("Please enter n >k:");
	     int n = input.nextInt();
	     
	     System.out.println("Please enter k <n:");
	     int k = input.nextInt();
		
		for (int number = 1; number <= n; number++) {
		    System.out.print(number + " ");
		}
		System.out.println();
		
		for (int number = 1; number <= k; number++) {
		    System.out.print(number + " ");
		}
		System.out.println();
		if ((n>k)&&(k>1)) {
		
		long factorialn = 1;
		for (int i = 1; i <= n; i++) {
		    factorialn *= i;
		}
		
		long factorialk = 1;
		for (int i = 1; i <= k; i++) {
		    factorialk *= i;
		}
		long d = (factorialn * factorialk)/( factorialn - factorialk) ;
		System.out.println(n + "! = " + factorialn);
		System.out.println(k + "! = " + factorialk);
		System.out.println("n/k = " + d);
		}
    	}

}
