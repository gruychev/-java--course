
import java.util.Scanner;

public class task4{

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in,"UTF-8");

        System.out.println("Please enter a:");
        int a = input.nextInt();
        System.out.println("Please enter b:");
        int b = input.nextInt();
        System.out.println("Please enter c:");
        int c = input.nextInt();
        
        // if ( (a*a)+(b*b) == (c*c) )
        if ( a+b > c && a+c>b && b+c>a ){
            System.out.println("triangle");
        }    
            else {   
            System.out.println("Entered numbers are not triangle");
            }
        
    }
}