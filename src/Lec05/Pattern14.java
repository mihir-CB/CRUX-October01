package Lec05;

public class Pattern14 {
	public static void main(String[] args) {
		int n = 5;
		int row = 1;
		int nst = 1;
		int nsp = n-1;
		while (row <= 2 * n - 1) {
			// space
			int csp = 0;
			while(csp<nsp) {
				System.out.print("  ");
				csp++;
			}
			
			// star
			int cst = 0;
			while (cst < nst) {
				System.out.print("* ");
				cst++;
			}
			row++;
			// preparation
			if (row <= n) {
				nst++;
				nsp--;
			} else {
				nst--;
				nsp++;
			}
			System.out.println();
		}

	}
}
