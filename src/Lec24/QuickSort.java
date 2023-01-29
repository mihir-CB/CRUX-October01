package Lec24;

import java.util.Arrays;

public class QuickSort {

	public static void main(String[] args) {
		int[] arr = { 50, 40, 80, 90, 70, 10, 30, 60, 120 };
//		int[] arr = {50,40,30,20,10,5,2};
		quickSort(arr, 0, arr.length - 1);
		System.out.println(Arrays.toString(arr));
	}

	private static void quickSort(int[] arr, int s, int e) {
		if (s > e) {
			return;
		}

		int mid = s + (e - s) / 2;
		int pivot = arr[mid];

		// Partitioning
		int L = s;
		int R = e;

		while (L <= R) {
			// left problem
			while (arr[L] < pivot) {
				L++;
			}

			// right problem
			while (arr[R] > pivot) {
				R--;
			}

			if (L <= R) {
				int temp = arr[L];
				arr[L] = arr[R];
				arr[R] = temp;
				L++;
				R--;
			}
		}

		quickSort(arr, s, R);
		quickSort(arr, L, e);
	}

}
