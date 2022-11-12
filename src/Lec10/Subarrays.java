package Lec10;

public class Subarrays {

	public static void main(String[] args) {
		int[] arr = { 10, 20, -30, -40, 50 };
		printAllSubarrays(arr);
		int max = maximumSumSubarray(arr);
		System.out.println(max);
	}

	public static void printAllSubarrays(int[] arr) {
		for (int s = 0; s < arr.length; s++) {
			for (int e = s; e < arr.length; e++) {
				int sum = 0;
				for (int i = s; i <= e; i++) {
					sum += arr[i];
					System.out.print(arr[i] + " ");
				}
				System.out.println(": " + sum);
				System.out.println();
			}
		}
	}

	public static int maximumSumSubarray(int[] arr) {
		int maxSum = Integer.MIN_VALUE;
		for (int s = 0; s < arr.length; s++) {
			int sum = 0;
			for (int e = s; e < arr.length; e++) {
				sum += arr[e];
				maxSum = Math.max(maxSum, sum);
				System.out.println(s+" "+e+":"+sum);
			}
		}
		return maxSum;
	}
}
