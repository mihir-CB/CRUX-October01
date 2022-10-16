package Lec04;

public class IncrementDecrement {

	public static void main(String[] args) {
		int a = 6;
		int b = 5;
		int c = a + ++a + b-- + a++ + b++ + ++b;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
	}

}
