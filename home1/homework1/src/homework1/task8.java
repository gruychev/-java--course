package homework1;
import java.util.Scanner;
public class task8 {
	public static void main(String[] args) {

        Scanner input = new Scanner(System.in, "UTF-8");
        
        System.out.println("number: ");
        int n = input.nextInt();
        
        boolean aEqualsB = n % 2 == 0;
        System.out.println(aEqualsB);
}
}
