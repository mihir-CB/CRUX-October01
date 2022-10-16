package Lec04;

public class FibonacciNumbers {

	public static void main(String[] args) {
		int n1 = 0;
		int n2 = 1;

		int n = 10;
		int count = 1; // n1 abhi tk kitne numbers process kr chuka hai 

		while (count <= n) {
			int nn = n1 + n2;
//			System.out.println(nn);

			n1 = n2;
			n2 = nn;
			count++;
		}

		System.out.println(n1);

	}

}
