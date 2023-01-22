package Lec22;

public class MazePath {

	public static void main(String[] args) {
		int[][] mat = { { 0, 0, 0, 0, 1, 0 }, { 0, 1, 0, 0, 0, 0 }, { 0, 1, 0, 1, 1, 0 }, { 0, 0, 0, 0, 0, 0 } };
//		mazepath(0, 0, mat, "", new boolean[mat.length][mat[0].length]);
		mazepath2(0, 0, mat, "", new boolean[mat.length][mat[0].length]);
	}

	public static void mazepath(int cr, int cc, int[][] mat, String ans, boolean[][] vis) {
		if (cr == mat.length - 1 && cc == mat[0].length - 1) {
			System.out.println(ans);
			return;
		}

		vis[cr][cc] = true;

		// U
		if (cr - 1 >= 0 && mat[cr - 1][cc] != 1 && !vis[cr - 1][cc]) {
			mazepath(cr - 1, cc, mat, ans + "U", vis);
		}

		// R
		if (cc + 1 < mat[0].length && mat[cr][cc + 1] != 1 && !vis[cr][cc + 1]) {
			mazepath(cr, cc + 1, mat, ans + "R", vis);
		}

		// D
		if (cr + 1 < mat.length && mat[cr + 1][cc] != 1 && !vis[cr + 1][cc]) {
			mazepath(cr + 1, cc, mat, ans + "D", vis);
		}

		// L
		if (cc - 1 >= 0 && mat[cr][cc - 1] != 1 && !vis[cr][cc - 1]) {
			mazepath(cr, cc - 1, mat, ans + "L", vis);
		}

		vis[cr][cc] = false;
	}

	public static void mazepath2(int cr, int cc, int[][] mat, String ans, boolean[][] vis) {
		if (cr < 0 || cc < 0 || cr == mat.length || cc == mat[0].length || mat[cr][cc] == 1 || vis[cr][cc]) {
			return;
		}

		if (cr == mat.length - 1 && cc == mat[0].length - 1) {
			System.out.println(ans);
			return;
		}

		vis[cr][cc] = true;

		// U
		mazepath2(cr - 1, cc, mat, ans + "U", vis);

		// R
		mazepath2(cr, cc + 1, mat, ans + "R", vis);

		// D
		mazepath2(cr + 1, cc, mat, ans + "D", vis);

		// L
		mazepath2(cr, cc - 1, mat, ans + "L", vis);

		vis[cr][cc] = false;
	}

}
