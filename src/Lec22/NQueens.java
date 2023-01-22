package Lec22;

public class NQueens {

	public static void main(String[] args) {
		nqueens(0, 0, 4, "", new boolean[4][4]);

	}

	public static void nqueens(int cr, int cc, int noq, String ans, boolean[][] vis) {

		if (noq == 0) {
			System.out.println(ans);
			return;
		}
		if (cc == vis.length) {
			cc = 0;
			cr++;
		}
		if (cr == vis.length) {
			return;
		}

		// box -> include
		if (isSafe(cr, cc, vis)) {
			vis[cr][cc] = true;
			nqueens(cr, cc + 1, noq - 1, ans + "{" + cr + "," + cc + "}", vis);
			vis[cr][cc] = false;
		}
		
		// box -> exclude
		nqueens(cr, cc + 1, noq , ans , vis);

	}

	private static boolean isSafe(int cr, int cc, boolean[][] vis) {
		// same row
		for (int c = 0; c < cc; c++) {
			if (vis[cr][c]) {
				return false;
			}
		}

		// same col
		for (int r = 0; r < cr; r++) {
			if (vis[r][cc]) {
				return false;
			}
		}

		// primary diagonal
		int r = cr - 1;
		int c = cc - 1;
		while (r >= 0 && c >= 0) {
			if (vis[r][c]) {
				return false;
			}
			r--;
			c--;
		}

		// secondary diagonal
		r = cr - 1;
		c = cc + 1;
		while (r >= 0 && c < vis.length) {
			if (vis[r][c]) {
				return false;
			}
			r--;
			c++;
		}
		return true;
	}

}
