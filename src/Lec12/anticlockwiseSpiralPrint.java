package Lec12;

public class anticlockwiseSpiralPrint {

	public static void main(String[] args) {
		int[][] mat = { { 11, 12, 13, 14, 15 }, { 21, 22, 23, 24, 25 }, { 31, 32, 33, 34, 35 } };
		spiralAntiClockPrint(mat);
	}

	public static void spiralAntiClockPrint(int[][] mat) {
		int minr = 0; // top boundary
		int minc = 0; // left boundary
		int maxr = mat.length - 1; // bottom boundary
		int maxc = mat[0].length - 1; // right boundary
		int tot = mat.length * mat[0].length;
		int cnt = 0;		

		while (cnt < tot) {
			// left boundary traversal
			for (int r = minr; r <= maxr && cnt<tot; r++) {
				System.out.print(mat[r][minc] + " ");
				cnt++;
			}

			// bottom boundary traversal
			for (int c = minc + 1; c <= maxc && cnt<tot; c++) {
				System.out.print(mat[maxr][c] + " ");
				cnt++;
			}

			// right boundary traversal
			for (int r = maxr - 1; r >= minr  && cnt<tot; r--) {
				System.out.print(mat[r][maxc] + " ");
				cnt++;
			}

			// top boundary traversal
			for (int c = maxc - 1; c >= minc + 1 && cnt<tot; c--) {
				System.out.print(mat[minr][c] + " ");
				cnt++;
			}

			System.out.println();
			minc++;
			maxr--;
			maxc--;
			minr++;
		}
	}

}
