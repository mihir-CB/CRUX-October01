package Lec14;

public class WrapperClass {

	public static void main(String[] args) {
		int a = 15;
		Integer A = 5;
		System.out.println(A);

		A = a;
		System.out.println(A);
		a = 10;
		a = A;
		System.out.println(a);
	}
}
