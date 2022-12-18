package Assignments;

public class AggresiveCows {

	public static void main(String[] args) {
		int n = 5;
		int[] arr = { 1, 2, 9, 8, 4 };
		int c = 3;
		bubble(arr);
		int mind = 1;
		int maxd = arr[n - 1] - arr[0];
		int ans = 0;
		while (mind <= maxd) {
			int mid = mind + (maxd - mind) / 2;
			if (allotStalls(arr, mid, c)) {
				ans = mid;
				mind = mid + 1;
			} else {
				maxd = mid - 1;
			}
		}
		System.out.println(ans);
	}

	public static boolean allotStalls(int[] stall, int dis, int totalCows) {
		int lastFilledStall = stall[0];
		int noOfCowsPlaced = 1;
		for (int i = 1; i < stall.length; i++) {
			if (stall[i] - lastFilledStall >= dis) {
				noOfCowsPlaced++;
				lastFilledStall = stall[i];
			}
			if (noOfCowsPlaced == totalCows) {
				return true;
			}
		}
		return false;
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

}
