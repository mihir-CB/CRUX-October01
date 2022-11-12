package Lec10;

public class RotateAnArray {

	public static void main(String[] args) {
		int[] arr = { 10, 20, 30, 40, 50 };
		rotate2(arr, 2);
		display(arr);
	}

	public static void rotate(int[] arr, int rot) {
		rot = rot % arr.length;
		for (int r = 0; r < rot; r++) {
			int last = arr[arr.length - 1];
			for (int i = arr.length - 1; i > 0; i--) {
				arr[i] = arr[i - 1];
			}
			arr[0] = last;
			display(arr);
		}
	}
	
	public static void rotate2(int[] arr, int rot) {
		rot = rot % arr.length;
		reverse(arr,0,arr.length-1);
		reverse(arr,0,rot-1);
		reverse(arr,rot,arr.length-1);
	}
	public static void reverse(int[] arr, int l, int r) {
		while(l<r) {
			int temp = arr[l];
			arr[l]=arr[r];
			arr[r]=temp;
			l++;
			r--;
		}
	}

	public static void display(int[] arr) {
		System.out.println("--------");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		System.out.println("--------");
	}

}
