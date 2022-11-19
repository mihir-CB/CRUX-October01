package Lec12;

import java.util.Scanner;

public class twoDArray_Input {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int rows = scn.nextInt();
		int cols = scn.nextInt();
		int[][] mat = new int[rows][cols];

		for (int r = 0; r < rows; r++) {
			for (int c = 0; c < cols; c++) {
				mat[r][c] = scn.nextInt();
			}
		}

		System.out.println("___________");
		// Printing -> Row wise
		for (int[] row : mat) {
//					System.out.println(row);
			for (int ele : row) {
				System.out.print(ele + " ");
			}
			System.out.println();
		}
		
		System.out.println();

		// Printing -> Col wise
		System.out.println("-------");
		for (int c = 0; c < mat[0].length; c++) {
			for (int r = 0; r < mat.length; r++) {
				System.out.print(mat[r][c] + " ");
			}
		}
	}

}
