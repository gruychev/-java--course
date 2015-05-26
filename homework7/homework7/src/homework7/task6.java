package homework7;

import java.util.Scanner;


public class task6 {

     public static void main(String[] args) {
    	Scanner input = new Scanner(System.in,"UTF-8");
           System.out.print("n = ");
        int n = input.nextInt();
        long factorial = factorial(n);
    
        System.out.printf(n + "! = " + factorial);
    }
 
    public static long factorial(int n) {
 
        if (n == 0) {

            return 1;
        }
 
        else {

            return n * factorial(n - 1);

        }

    }

}
