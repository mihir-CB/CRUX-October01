package Lec08;

public class func_demo1 {
	

	public static void fun1() {
		System.out.println("Khaaja");
	}

	public static void fun2() {
		System.out.println("Gaaja");
	}
	
	public static void main(String[] args) {
		System.out.println("In main");
		fun1();
		fun2();
		fun1();
		fun1();
	}

}
