package Lec05;

public class Pattern26 {

	public static void main(String[] args) {
		int n = 5;
		int row = 1;
		int nsp = n - 1;
		int nst = 1;
		
		while (row <= n) {
			int ntp = row;
			// spaces
			int csp = 0;
			while (csp < nsp) {
				System.out.print("\t");
				csp++;
			}
			// stars
			int cst = 0;
			while (cst < nst) {
				System.out.print(ntp + "\t");
				if(cst<nst/2) {
					ntp++;
				}else {
					ntp--;
				}
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
