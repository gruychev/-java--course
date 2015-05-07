import java.util.Scanner;

public class task2{

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in,"UTF-8");

        System.out.println("Please enter x:");
        int x = input.nextInt();
        System.out.println("Please enter y:");
        int y = input.nextInt();
        System.out.println("Please enter an z:");
        int z = input.nextInt();
        
        if ( x > y && x > z ){
            System.out.println("First number is largest.");
        }
         else if ( y > x && y > z ){               
            System.out.println("Second number is largest.");
         }
         else if ( z > x && z > y ){
            System.out.println("Third number is largest.");
         }   
         else {  
            System.out.println("Entered numbers are not distinct.");
         }   
        
    }
}


    