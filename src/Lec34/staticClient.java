package Lec34;

public class staticClient {

	public static void main(String[] args) {
		StaticDemo sd = new StaticDemo();
		System.out.println(StaticDemo.noo);
		sd.noo++;
		System.out.println(sd.noo);
		System.out.println(StaticDemo.noo);
		sd.fun();
		StaticDemo.fun();
		System.out.println("------");
		final int a;
		a=10;
		System.out.println(a);
	}

}
