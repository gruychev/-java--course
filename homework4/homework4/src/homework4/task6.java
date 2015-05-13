package homework4;


public class task6 {
	public static void main(String[] args) {
int rows = 5;
int cols = 6;
int k=30;

int[][] matrix = new int[rows][cols];

for (int row = 0; row < rows; row++) {
for (int col = 0; col < cols; col++) {
matrix[row][col] =k-- ;
}
}

for (int row = 0; row < matrix.length; row++) {
	for (int col = 0; col < matrix[0].length; col++) { System.out.printf("%d ", matrix[row][col]);
	}
	System.out.println();
}

	}
}

