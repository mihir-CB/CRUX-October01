package Lec08;

public class global_demo {
	static int global = 1000;

	public static void main(String[] args) {
		System.out.println(global);
		global += 10;
		fun();
		System.out.println(global);
	}

	public static void fun() {
		System.out.println(global);
	}

}
