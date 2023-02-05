package Assignments;  	
import java.util.Arrays;
import java.util.Scanner;

public class SortInLinearTime {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int[] arr = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = scn.nextInt();
		}

		sortLinear(arr);
		for (int i = 0; i < n; i++) {
			System.out.print(arr[i]);
		}
	}

	private static void sortLinear(int[] arr) {
		int a = 0, b = 0, c = arr.length - 1;
		// [0,a) -> 0s
		// [a,b) -> 1s
		// [b,c] -> unexplored
		// (c, n-1] -> 2s

		while (b <= c) {
			if (arr[b] == 0) {
				// swap with a
				swap(arr, a, b);
				a++;
				b++;
			} else if (arr[b] == 1) {
				b++;
			} else {
				// 2 at b
				swap(arr, b, c);
				c--;
			}
			System.out.println(Arrays.toString(arr));
		}
	}

	private static void swap(int[] arr, int a, int b) {
		int temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
	}

}
