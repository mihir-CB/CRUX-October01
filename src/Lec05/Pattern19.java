package Lec05;

public class Pattern19 {

	public static void main(String[] args) {
		int n = 7;
		int nsp = -1;
		int nst1 = n / 2 + 1;
		int nst2 = n / 2 + 1;

		int row = 1;
		while (row <= n) {
			// star 1
			int cst1 = 0;
			while (cst1 < nst1) {
				System.out.print("* ");
				cst1++;
			}

			// space
			int csp = 0;
			while (csp < nsp) {
				System.out.print("  ");
				csp++;
			}

			// star 2
			int cst2 = 0;
			if (row == 1 || row == n) {
				cst2++;
			}
			while (cst2 < nst2) {
				System.out.print("* ");
				cst2++;
			}

			row++;
			if (row <= n / 2 + 1) {
				nst1--;
				nst2--;
				nsp += 2;
			} else {
				nst1++;
				nst2++;
				nsp -= 2;
			}
			System.out.println();
		}

	}

}
