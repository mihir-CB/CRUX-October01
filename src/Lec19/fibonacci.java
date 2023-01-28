package Lec19;

public class fibonacci {

	public static void main(String[] args) {
		int n = 8;
		int res = fibonacci(n);
		System.out.println(res);
	}
	public static int fibonacci(int n) {
		if(n<=1) {
			return n;
		}
		int sp1 = fibonacci(n-1);
		int sp2 = fibonacci(n-2);
		return sp1+sp2;
	}

}
