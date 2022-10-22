
public class Le05 {

	public static void main(String[] args) {
		int n = 7;
		int row = 1;
		int nsp = 0;
		while(row<=n) {
			// spaces
			int csp = 0;
			while(csp<nsp) {
				System.out.print("  ");
				csp++;
			}
			
			int nst = n-row+1;
			int cst = 0;
			// stars
			while(cst<nst) {
				System.out.print("* ");
				cst++;
			}
			
			row++;
			nsp+=2;
			System.out.println();
		}
	}

}
