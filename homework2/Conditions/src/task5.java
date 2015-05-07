
import java.util.Scanner;

public class task5{

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in,"UTF-8");

        System.out.println("Please enter number:");
        int a = input.nextInt();
        int result1;
      
         if ( a>=1 && a<=3){
        	result1 = a * 5;
            System.out.println(result1);
         }
         else if ( a>=4 && a<=6){
        	 result1 = a * 10;
         System.out.println(result1);
         }
        	 
         else if ( a>=7 && a<=9){
        	 result1 = a * 50;
         System.out.println(result1);
         }
                  else   
            System.out.println("Entered numbers are not interval [1:9]");
        
    }
}