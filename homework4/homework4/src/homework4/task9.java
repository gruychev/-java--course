package homework4;

import java.util.Scanner;
public class task9 {
	public static void main(String[] args) {
		
Scanner input = new Scanner(System.in,"UTF-8");
System.out.println("Please enter rows:");
int rows = input.nextInt();
System.out.println("Please enter cols:");
int cols = input.nextInt();
int k=1;

int[][] matrix = new int[rows][cols];

for (int row = 0; row < rows; row++) {
for (int col = 0; col < cols; col++) {
matrix[col][row] =k++ ;
}
}

for (int row = 0; row < matrix.length; row++) {
	for (int col = 0; col < matrix[0].length; col++) { System.out.printf("%d ", matrix[row][col]);
	}
	System.out.println();
}


	}
}
