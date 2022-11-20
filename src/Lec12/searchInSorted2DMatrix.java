package Lec12;

public class searchInSorted2DMatrix {

	public static void main(String[] args) {
		int[][] mat = { 
				{ 10, 20, 30, 40 }, 
				{ 15, 25, 35, 45 }, 
				{ 27, 28, 37, 48 }, 
				{ 29, 33, 39, 55 } };

		boolean res = search(mat, 33);
		System.out.println(res);
	}

	public static boolean search(int[][] mat, int ele) {
		int c = mat[0].length - 1;
		int r = 0;
		while (c >= 0 && r < mat.length) {
//			System.out.println(r + " " + c);
			if (mat[r][c] == ele) {
				System.out.println(r + " " + c);
				return true;
			} else if (mat[r][c] < ele) {
				r++;
			} else {
				c--;
			}
		}
		return false;
	}

}
