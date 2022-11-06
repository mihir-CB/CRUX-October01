package Lec09;

public class swap_arr {

	public static void main(String[] args) {
		int[] arr1 = {10,20,30,40,50};
		int[] arr2 = {60,70,80};
		System.out.println("a:" + arr1[0] + " b:" + arr2[0]);
//		swap(arr1[0], arr2[0]); Nahi chalegi
		swap1(arr1, arr2, 0); //Chal raha hai
		System.out.println("a:" + arr1[0] + " b:" + arr2[0]);
	}
	
	public static void swap1(int[] a1, int[] a2, int i) {
		System.out.println("In Swap");
		System.out.println("a:" + a1[i] + " b:" + a2[i]);
		int d = a1[i];
		a1[i] = a2[i];
		a2[i] = d;
		System.out.println("a:" + a1[i] + " b:" + a2[i]);
		System.out.println("----- Out swap");
	}

	public static void swap(int a, int b) {
		System.out.println("------In swap");
		System.out.println("a:" + a + " b:" + b);
		int c = a;
		a = b;
		b = c;
		System.out.println("a:" + a + " b:" + b);
		System.out.println("----- Out swap");
	}

}
