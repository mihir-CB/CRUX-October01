package Lec18;

public class RecursionDemo {

	public static void main(String[] args) {
		int n = 8;
//		PD(n);
		PI(n);
	}

	public static void PD(int n) {
		if (n == 0) {
			return;
		}
		System.out.println(n);
		PD(n - 1);
	}

	public static void PI(int n) {
		if (n == 0) {
			return;
		}
		PI(n - 1);
		System.out.println(n);
	}
}
