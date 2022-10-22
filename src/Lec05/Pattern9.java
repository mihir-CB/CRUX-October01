package Lec05;

public class Pattern9 {

	public static void main(String[] args) {
		int n = 5;
		int row = 1;
		int nsp = n - 1;
		int nst = 1;
		while (row <= n) {
			// spaces
			int csp = 0;
			while (csp < nsp) {
				System.out.print("  ");
				csp++;
			}
			// stars
			int cst = 0;
			while (cst < nst) {
				System.out.print("* ");
				cst++;
			}

			// mera row ke liye kaam khtm

			// preparation
			row++;
			nsp--;
			nst += 2;
			System.out.println();
		}
	}

}
