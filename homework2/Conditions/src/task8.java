
import java.util.Scanner;

public class task8{

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in,"UTF-8");

        System.out.println("Please enter n1:");
        int n1 = input.nextInt();
        System.out.println("Please enter n2:");
        int n2 = input.nextInt();
        System.out.println("Please enter n3:");
        int n3 = input.nextInt();
        System.out.println("Please enter n4:");
        int n4 = input.nextInt();
        System.out.println("Please enter n5:");
        int n5 = input.nextInt();
        
        
        if ( n1 > n2 && n1 > n3 && n1 > n4 && n1 > n5  ){
            System.out.println("n1 number is largest.");
        }
         else if ( n2 > n1 && n2 > n3 && n2 > n4 && n2 > n5  ){
            System.out.println("n2 number is largest.");
         }
         else if ( n3 > n1 && n3 > n2 && n3 > n4 && n3 > n5  ){
            System.out.println("n3 number is largest.");
         }
         else if ( n4 > n1 && n4 > n2 && n4 > n3 && n4 > n5  ){
             System.out.println("n4 number is largest.");
         }
         else if ( n5 > n1 && n5 > n2 && n5 > n3 && n5 > n4  ){
             System.out.println("n5 number is largest.");
         }              
         else{   
            System.out.println("Entered numbers are not distinct.");
         }
        
    }
}
