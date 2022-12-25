package Lecture19;

public class RecursionOnArrays {

	public static void main(String[] args) {
		int[] arr = { 10, 50, 20, 10, 40, 80, 10, 70 };
//		printArray(arr, 0);
//		printArrayRev(arr,0);
//		int max = getMax(arr, 0);
//		System.out.println(max);
//		int idx = firstOccurence(arr, 200, 0);
//		System.out.println(idx);
		int[] res = allOccurrences(arr, 10, 0, 0);
		printArray(res, 0);
	}

	private static void printArray(int[] arr, int idx) {
		if (idx == arr.length) {
			return;
		}
		System.out.println(arr[idx]);
		printArray(arr, idx + 1);
	}

	public static void printArrayRev(int[] arr, int idx) {
		if (idx == arr.length) {
			return;
		}
		printArrayRev(arr, idx + 1);
		System.out.println(arr[idx]);
	}

	public static int getMax(int[] arr, int idx) {
		if (idx == arr.length - 1) {
			return arr[idx];
		}
		int sp = getMax(arr, idx + 1);
		return Math.max(arr[idx], sp);
	}

	public static int firstOccurence(int[] arr, int val, int idx) {
		if (idx == arr.length) {
			return -1;
		}

		if (arr[idx] == val) {
			return idx;
		} else {
			int sp = firstOccurence(arr, val, idx + 1);
			return sp;
		}
	}

	public static int lastOccurence(int[] arr, int val, int idx) {
		if (arr.length == idx) {
			return -1;
		}
		int sp = lastOccurence(arr, val, idx + 1);
		if (arr[idx] == val) {
			if (sp == -1) {
				return idx;
			} else {
				return sp;
			}
		} else {
			return sp;
		}
	}

	public static int[] allOccurrences(int[] arr, int val, int idx, int c) {
		if (idx == arr.length) {
			return new int[c];
		}
		if (arr[idx] == val) {
			int[] sp = allOccurrences(arr, val, idx + 1, c + 1);
			// self work -> add the index
			sp[c] = idx;
			return sp;
		} else {
			int[] sp = allOccurrences(arr, val, idx + 1, c);
			return sp;
		}
	}

}