package homework1;
import java.util.Scanner;
public class task6 {
	public static void main(String[] args) {

        Scanner input = new Scanner(System.in, "UTF-8");
        
        System.out.println("r: ");
        double r = input.nextDouble();
     
        double surface = 3.14 * r * r;
        double perimeter = 2 * 3.14 * r;
               
        System.out.println(surface);
        System.out.println(perimeter);
	}

}
