package Lec04;

public class Fibonacci2 {
	public static void main(String[] args) {
		int n1 = 0;
		int n2 = 1;

		int n = 10;
		int count = 0; // n1 mein konsa fibonacci stored hai?

		while (count<=n-1) {
			int nn = n1 + n2;
//			System.out.println(nn);
			
			n1 = n2;
			n2 = nn;
			count++;
		}
		
		System.out.println(n1);

	}
}
