package homework12;

import java.util.Scanner;
import java.util.Arrays;

public class task4 {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in, "UTF-8");
		System.out.println("Please enter n:");
		int n = input.nextInt();
		int[] array = new int[n];
		for (int i = 0; i < n; i++) {
			System.out.println("input");
			array[i] = input.nextInt();
		}
       //part one
		int sum = 0;
		for (int i = 0; i < n; i++) {
			if (array[i] % 2 == 0) {
				sum = sum + 1;
			}
		}
		int[] array1 = new int[sum];
		int ss = 0;
		for (int i = 0; i < n; i++) {
			if (array[i] % 2 == 0) {
				array1[ss] = array[i];
				ss = ss + 1;
			}
		}
		int temp; 
		for (int j = 0; j < array1.length - 1; j++) {
			for (int i = 0; i < array1.length - 1; i++) {
				if (array1[i] > array1[i + 1]) {
					temp = array1[i];
					array1[i] = array1[i + 1];
					array1[i + 1] = temp;
				}
			}
		}
	System.out.println(Arrays.toString(array1));
     //part two
		int[] array2 = new int[n - sum];
		int ss1 = 0;
		for (int i = 0; i < n; i++) {
			if (array[i] % 2 != 0) {
				array2[ss1] = array[i];
				ss1 = ss1 + 1;
			}
		}
		int temp2;
		for (int j = 0; j < array2.length - 1; j++) {
			for (int i = 0; i < array2.length - 1; i++) {
				if (array2[i] < array2[i + 1]) {
					temp2 = array2[i];
					array2[i] = array2[i + 1];
					array2[i + 1] = temp2;
				}
			}
		}
	System.out.println(Arrays.toString(array2));
	}
}