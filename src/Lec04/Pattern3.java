package Lec04;

public class Pattern3 {

	public static void main(String[] args) {
		int n = 5;
		int row = 1;
		while (row <= n) {
			int nst = n - row + 1;
			int cst = 0;
			while (cst < nst) {
				System.out.print("* ");
				cst++;
			}
			System.out.println();
			row++;
		}

	}

}
