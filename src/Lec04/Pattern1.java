package Lec04;

public class Pattern1 {

	public static void main(String[] args) {
		int n = 7;
		int row = 1;
		while(row<=n) {
			int nst = n; // number of stars

			int cst = 0; // count of stars

			while (cst < nst) {
				System.out.print("*");
				cst++;
			}
			row++;
			System.out.println();
		}

	}

}
