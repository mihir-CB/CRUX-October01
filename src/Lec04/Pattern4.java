package Lec04;

public class Pattern4 {

	public static void main(String[] args) {
		int n = 7;
		int row = 1;
		while (row <= n) {
			// Spaces
			int nsp = n - row;
			int csp = 0;
			while (csp < nsp) {
				System.out.print("  ");
				csp++;
			}
			// Stars
			int nst = row;
			int cst = 0;
			while (cst < nst) {
				System.out.print("* ");
				cst++;
			}
			row++;
			System.out.println();
		}

	}

}
