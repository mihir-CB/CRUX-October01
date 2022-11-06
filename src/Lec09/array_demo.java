package Lec09;

public class array_demo {

	public static void main(String[] args) {
		int[] arr = new int[4];

		// default values
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);

		System.out.println("-------");

		arr[2] = 10;
		arr[0] = 5;
		arr[1] = 20;

		System.out.println(arr[2]);
		System.out.println(arr[0]);
		System.out.println(arr[3]);

		System.out.println("-----");

		System.out.println(arr);

		System.out.println("-----");

		int size = arr.length;
		System.out.println(size);

		System.out.println("-----");
		// indexes: 0 to arr.length-1
//		System.out.println(arr[45]);

		System.out.println(arr[arr.length - 1]);

		System.out.println("-----");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = 2 * i;
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		System.out.println("-----");

		for (int i = arr.length - 1; i >= 0; i--) {
			System.out.print(arr[i] + " ");
		}

		System.out.println();

		System.out.println("-----");

//		for(int val: arr) {
//			val = 2; nahi chalta
//		}
		// Enhanced For Loop
		for (int a : arr) {
			System.out.print(a + " ");
		}
		System.out.println();
	}

}
