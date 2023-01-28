package Lec23;

import java.util.Arrays;

public class mergeSort {

	public static void main(String[] args) {
//		int[] a1 = {10,30,50,80,100};
//		int[] a2 = {15,20,25,40,90};
//		System.out.println(Arrays.toString(merge2SortedArrays(a1, a2)));

		int[] arr = { 10, 5, 2, 81, 27, 14 };
		int[] res = mergeSort(arr,0,arr.length-1);
		System.out.println(Arrays.toString(res));
	}

	private static int[] mergeSort(int[] arr, int s, int e) {
		if(s==e) {
			int[] res = new int[1];
			res[0]=arr[s];
			return res;
		}
		int mid = s+(e-s)/2;
		int[] sp1 = mergeSort(arr,s,mid);
		int[] sp2 = mergeSort(arr,mid+1,e);
		return merge2SortedArrays(sp1, sp2);
	}

	public static int[] merge2SortedArrays(int[] a1, int[] a2) {
		int i = 0, j = 0, k = 0;
		int[] res = new int[a1.length + a2.length];

		while (i < a1.length && j < a2.length) {
			if (a1[i] < a2[j]) {
				res[k] = a1[i];
				i++;
				k++;
			} else {
				res[k] = a2[j];
				j++;
				k++;
			}
		}
		while (i < a1.length) {
			res[k] = a1[i];
			i++;
			k++;
		}
		while (j < a2.length) {
			res[k] = a2[j];
			j++;
			k++;
		}
		return res;
	}

}
