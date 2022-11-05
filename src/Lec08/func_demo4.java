package Lec08;

public class func_demo4 {

	public static void main(String[] args) {
		printSum100(2, 5);
		int sum = add(2,5);
		System.out.println(sum*100);
		System.out.println(sum*1000);
		
	}
	public static int add(int a, int b) {
		int sum = a + b;
		return sum;
	}
	public static void printSum100(int a, int b) {
		int sum = a + b;
		System.out.println(sum*100);;
	}
	

}
