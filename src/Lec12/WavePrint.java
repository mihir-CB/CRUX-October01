package Lec12;

public class WavePrint {

	public static void main(String[] args) {
		int[][] mat = { { 11, 12, 13, 14 }, { 21, 22, 23, 24 }, { 31, 32, 33, 34 }, { 41, 42, 43, 44 } };

		wavePrint(mat);
	}

	public static void wavePrint(int[][] mat) {
		for (int c = 0; c < mat[0].length; c++) {
			for (int r = 0; r < mat.length; r++) {
				int rtp = r;
				if (c % 2 == 1) {
					rtp = mat.length - r - 1;
				}
				System.out.print(mat[rtp][c] + " ");
			}
			System.out.println();
		}
	}
}
