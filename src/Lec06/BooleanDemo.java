package Lec06;

public class BooleanDemo {

	public static void main(String[] args) {
		boolean b = true;

		System.out.println(b);
		boolean b1 = true && false;
		System.out.println(b1);
		
		int a = 5;
		int c = 56;
		int d = 199;
		
		boolean b2 = (a>5)||(c<d);
		System.out.println(b2);
	}

}
