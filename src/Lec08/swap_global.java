package Lec08;

public class swap_global {
	
	static int a = 5;
	static int b = 10;

	public static void main(String[] args) {
		System.out.println("a:" + a + " b:" + b);
		swap();
		System.out.println("a:" + a + " b:" + b);
	}

	public static void swap() {
		System.out.println("------In swap");
		System.out.println("a:" + a + " b:" + b);
		int c = a;
		a = b;
		b = c;
		System.out.println("a:" + a + " b:" + b);
		System.out.println("----- Out swap");
	}

}
