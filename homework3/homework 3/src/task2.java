
import java.util.Scanner;
public class task2 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in,"UTF-8");

	    System.out.println("Please enter n:");
	    int n = input.nextInt();
		
	for (int i = 1; i <=n ; i++) {
		if(i % 21 != 0){
		System.out.println(i);
		}
	}

}
}