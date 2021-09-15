//Sean Fallon
//COMP-171
//Fall-19
//Lab 10

import java.util.Scanner;

public class sumElementsColumnByColumn {

	public static void main(String[] args) {

		double[][] matrix = getMatrix();

		for (int col = 0; col < matrix[0].length; col++) {	
			System.out.println(
				"Sum of the elements at column "
				+ col + " " + sumColumn(matrix, col));
		}
	}

	public static double[][] getMatrix() {
		Scanner input = new Scanner(System.in);

		double[][] m = new double[3][4];

		System.out.println("Enter a 3-by-4 matrix row by row:");
		for (int i = 0; i < m.length; i++)
			for (int j = 0; j < m[i].length; j++) 
				m[i][j] = input.nextDouble();
		
		input.close();
		return m;
	}

	public static double sumColumn(double[][] m, int columnIndex) {
		double total = 0;
		
		for (int row = 0; row < m.length; row++) {
			total += m[row][columnIndex];		
		}
		return total;
	}
}
