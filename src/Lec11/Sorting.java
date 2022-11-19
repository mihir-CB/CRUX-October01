package Lec11;

public class Sorting {

	public static void main(String[] args) {
		int[] arr = { 10, 56, 3, 7, 18, 1 };
		display(arr);
//		bubble(arr);
//		selection(arr);
		insertion(arr);
		System.out.println("------");
		display(arr);
	}

	public static void bubble(int[] arr) {
		for (int c = 0; c < arr.length - 1; c++) {
			for (int i = 0; i < arr.length - 1 - c; i++) {
				if (arr[i] > arr[i + 1]) {
					int temp = arr[i];
					arr[i] = arr[i + 1];
					arr[i + 1] = temp;
				}
			}
		}
	}

	public static void selection(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			int min_idx = i;
			for (int curr = i + 1; curr < arr.length; curr++) {
				if (arr[curr] < arr[min_idx]) {
					min_idx = curr;
				}
			}
			if (min_idx != i) {
				int temp = arr[min_idx];
				arr[min_idx] = arr[i];
				arr[i] = temp;
			}
		}
	}

	public static void insertion(int[] arr) {
		for (int i = 1; i < arr.length; i++) {
			int val = arr[i];
			int j = i; // sahi jagah jahan place krna

			while (j - 1 >= 0 && arr[j - 1] > val) {
				arr[j] = arr[j - 1];
				j--;
//				display(arr);
			}
			arr[j] = val;
		}
	}

	public static void display(int[] arr) {
		for (int a : arr) {
			System.out.print(a + " ");
		}
		System.out.println();
	}
}
