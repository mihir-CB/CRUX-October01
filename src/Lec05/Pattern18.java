package Lec05;

public class Pattern18 {

	public static void main(String[] args) {
		int n =7;
		int row=1;
		int nsp = (n-1)/2;
		int nst =1;
		
		while(row<=n) {
			// space
			int csp = 0;
			while(csp<nsp) {
				System.out.print("  ");
				csp++;
			}
			
			// star
			int cst = 0;
			while(cst<nst) {
				if(cst==0 || cst == nst-1) {
				System.out.print("* ");
				}else {
					System.out.print("  ");
				}
				cst++;
			}
			
			row++;
			if(row<=n/2+1) {
				nsp--;
				nst+=2;
			}else {
				nsp++;
				nst-=2;
			}
			System.out.println();
		}
	}
}
