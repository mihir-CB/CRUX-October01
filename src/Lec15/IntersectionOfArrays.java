package Lec15;

import java.util.ArrayList;

public class IntersectionOfArrays {

	public static void main(String[] args) {
		int[] arr1 = { 5, 10, 10, 15, 25, 28, 30, 35 };
		int[] arr2 = { 2, 3, 10, 10, 10, 20, 25, 35, 40 };
		ArrayList<Integer> res = intersect(arr1, arr2);
		System.out.println(res);
	}

	public static ArrayList<Integer> intersect(int[] arr1, int[] arr2) {
		ArrayList<Integer> res = new ArrayList<>();
		int i = 0;
		int j = 0;
		while (i < arr1.length && j < arr2.length) {
			if (arr1[i] == arr2[j]) {
				res.add(arr1[i]);
				i++;
				j++;
			} else if (arr1[i] < arr2[j]) {
				i++;
			} else {
				j++;
			}
		}
		return res;
	}

}
