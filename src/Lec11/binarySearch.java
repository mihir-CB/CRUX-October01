package Lec11;

public class binarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static int binarySearch(int[] arr, int ele) {
		int l = 0;
		int r = arr.length - 1;
		while (l <= r) {
			int mid = (l + r) / 2;
			if (arr[mid] == ele) {
				return mid;
			} else if (arr[mid] < ele) {
				l = mid + 1;
			} else {
				// arr[mid]>ele
				r = mid - 1;
			}
		}
		return -1;
	}

}
