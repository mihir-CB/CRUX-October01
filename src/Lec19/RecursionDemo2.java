package Lec19;

public class RecursionDemo2 {

	public static void main(String[] args) {
		int n = 6;
//		PDI(n);
//		PID(1, n);
//		int res = fact(n);
		int res = pow(2, n);
		System.out.println(res);
	}

	public static void PDI(int n) {
		if (n == 0) {
			return;
		}
		System.out.println(n);
		PDI(n - 1);
		System.out.println(n);
	}

	public static void PID(int s, int e) {
		if (s > e) {
			return;
		}
		System.out.println(s);
		PID(s + 1, e);
		System.out.println(s);
	}

	public static int fact(int n) {
		if (n == 1) {
			return 1;
		}
		int sp = fact(n - 1);
		return n * sp;
	}

	public static int pow(int a, int x) {
		if (x == 0) {
			return 1;
		}
		int sp = pow(a, x - 1);
		return a * sp;
	}

}
