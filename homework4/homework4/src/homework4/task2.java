package homework4;

import java.util.Scanner;
public class task2 {
	 
    public static void main(String[] args){

        
        Scanner input = new Scanner(System.in,"UTF-8");
        
        System.out.println("Please enter n:");
        
        int n = input.nextInt();
        int[] array = new int[n];
        array[0] = 0;
        array[1] = 1;
        
        for(int i = 2; i < array.length; i++){
            array[i] = array[i-2]+array[i-1];
        }
        
        for(int i = 0; i < array.length; i++){
            System.out.print(array[i]+" ");
        }
    }
 
}
