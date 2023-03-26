package Lec34;

public class StaticDemo {

	static int noo;
	final static int a;
	int val;

	StaticDemo() {
		noo++;
	}

	StaticDemo(int v) {
		this.val = v;
		noo++;
	}

	static void fun() {
		System.out.println("In Static fun");
	}

	static {
		System.out.println("In static block");
		fun();
	}
	static {
		System.out.println("In static block2");
		a = 100;
	}
}
