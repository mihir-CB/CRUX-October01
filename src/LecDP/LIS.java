package LecDP;

import java.util.ArrayList;

public class LIS {

	public static void main(String[] args) {
		int[] arr = { 10, 9, 2, 5, 3, 7, 101, 18 };
//		System.out.println(solve(arr, 0, -1));
//		System.out.println(solveTD(arr,0,-1,new Integer[arr.length][arr.length+1]));
//		System.out.println(solveBU(arr));
		System.out.println(LIS(arr));
	}

	private static int solve(int[] arr, int idx, int prev_idx) {
		if (idx == arr.length) {
			return 0;
		}
		// include
		int sp1 = 0;
		if (prev_idx == -1 || arr[idx] > arr[prev_idx]) {
			sp1 = 1 + solve(arr, idx + 1, idx);
		} // exclude
		int sp2 = solve(arr, idx + 1, prev_idx);
		return Math.max(sp1, sp2);
	}

	private static int solveTD(int[] arr, int idx, int prev_idx, Integer[][] dp) {
		if (idx == arr.length) {
			return 0;
		}

		if (dp[idx][prev_idx + 1] != null) {
			return dp[idx][prev_idx + 1];
		}
		// include
		int sp1 = 0;
		if (prev_idx == -1 || arr[idx] > arr[prev_idx]) {
			sp1 = 1 + solveTD(arr, idx + 1, idx, dp);
		} // exclude
		int sp2 = solveTD(arr, idx + 1, prev_idx, dp);
		return dp[idx][prev_idx + 1] = Math.max(sp1, sp2);
	}

	private static int solveBU(int[] arr) {
		int[][] dp = new int[arr.length + 1][arr.length + 1];
		for (int idx = arr.length - 1; idx >= 0; idx--) {
			for (int prev_idx = -1; prev_idx < arr.length; prev_idx++) {
				int sp1 = 0;
				if (prev_idx == -1 || arr[idx] > arr[prev_idx]) {
					sp1 = 1 + dp[idx + 1][idx + 1];
				}
				int sp2 = dp[idx + 1][prev_idx + 1];
				dp[idx][prev_idx + 1] = Math.max(sp1, sp2);
			}
		}
		return dp[0][0];
	}
	
	private static int LIS(int[] arr) {
		ArrayList<Integer> list = new ArrayList<>();
		for(int ele:arr) {
			if(list.isEmpty()||list.get(list.size()-1)<ele) {
				list.add(ele);
			}else {
				int s=0;
				int e=list.size()-1;
				while(s<e) {
					int mid = s+(e-s)/2;
					if(list.get(mid)<ele) {
						s=mid+1;
					}else {
						e=mid;
					}
				}
				list.set(s, ele);
			}
		}
		return list.size();
	}

}
