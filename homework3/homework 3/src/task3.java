import java.util.Scanner;
public class task3 {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in,"UTF-8");
	    System.out.println("Please enter n:");
	    
	     int n = input.nextInt();
	     int min = 0;
         int max = 0;


for (int i = 0; i < n ; i++) {
   System.out.println("Please enter k:");
   int k = input.nextInt();
//if (k == 0) { break; }
if(i == 0){
	min = k; max = k;
	}

if ( k < min ){
	min = k;
	}

if ( k>max ){ 
	max = k;
	}

}
System.out.println("min = " + min);
System.out.println("max = " + max);
}
}
