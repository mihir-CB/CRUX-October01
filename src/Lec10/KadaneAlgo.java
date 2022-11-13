package Lec10;

public class KadaneAlgo {

	public static void main(String[] args) {
		int[] arr = { -100, -20, -30, 40, -50 };
		int max = kadane(arr);
		System.out.println(max);
	}

	public static int kadane(int[] arr) {
		int max = Integer.MIN_VALUE;
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
			max = Math.max(max, sum);
			if (sum < 0) {
				sum = 0;
			}
		}
		return max;
	}
}
