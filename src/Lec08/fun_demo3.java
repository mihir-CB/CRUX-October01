package Lec08;

public class fun_demo3 {

	public static void main(String[] args) {
		int maggi = add(10, 15);
		System.out.println("Plate mein:" + maggi);
//		
//		boolean ans = maggiMilli(5, 10);
//		System.out.println(ans);
//		
//		String a = sayHi();
//		System.out.println(a);
	}

	public static int add(int a, int b) {
		int sum = a + b;
		return sum;
	}
	
	public static boolean maggiMilli(int a, int b) {
		return a<b;
	}
	
	public static String sayHi() {
		return "Hi";
	}
}
