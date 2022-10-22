package Lec05;

public class Pattern11 {

	public static void main(String[] args) {
		int n = 7;
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
				if (cst % 2 == 0) {
					System.out.print("* ");
				} else {
					System.out.print("! ");
				}
				cst++;
			}

			// preparation
			row++;
			nsp--;
			nst += 2;
			System.out.println();
		}
	}

}
