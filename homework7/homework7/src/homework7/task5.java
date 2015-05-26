package homework7;

import java.util.Scanner;

public class task5 {
	
public static void main(String[] args) {
	Scanner input = new Scanner(System.in,"UTF-8");
	
	doSimetric(11,100);
    doSimetric(101,1000);
}

public static void doSimetric(int number1,int number2){
	for(int i=0;i<number2;i++){
		if(i % number1 == 0){
			System.out.println(i);

		
	}
	}
}


}

