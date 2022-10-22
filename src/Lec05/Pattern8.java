package Lec05;

public class Pattern8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 7;
		int row = 1;
		int nst = n;
		while (row <= n) {
			int cst = 0;
			while (cst < nst) {
				if (cst == row - 1 || cst == n-row) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
				cst++;
			}
			row++;
			System.out.println();
		}
	}

}
