package Lec05;

public class Pattern7 {

	public static void main(String[] args) {
		int n = 5;
		int row = 1;
		int nst = n;
		while (row <= n) {
			int cst = 0;
			while (cst < nst) {
				if (row == 1 || row == n || cst == 0 || cst == n - 1) {
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
