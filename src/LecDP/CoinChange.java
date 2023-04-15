package LecDP;

public class CoinChange {

	public static void main(String[] args) {
		int[] coins = { 1, 2, 3 };
		int A = 5;
//		System.out.println(change(coins, A, 0));
//		System.out.println(changeTD(coins, A, 0, new Integer[A + 1][coins.length + 1]));
		System.out.println(changeBU(A, coins));
	}

	private static int change(int[] coins, int A, int idx) {
		if (A == 0) {
			return 1;
		}
		if (A < 0 || idx == coins.length) {
			return 0;
		}
		// include
		int sp1 = change(coins, A - coins[idx], idx);

		// exclude
		int sp2 = change(coins, A, idx + 1);
		return sp1 + sp2;
	}

	private static int changeTD(int[] coins, int A, int idx, Integer[][] dp) {
		if (A == 0) {
			return 1;
		}
		if (A < 0 || idx == coins.length) {
			return 0;
		}
		if (dp[A][idx] != null) {
			return dp[A][idx];
		}
		// include
		int sp1 = changeTD(coins, A - coins[idx], idx, dp);

		// exclude
		int sp2 = changeTD(coins, A, idx + 1, dp);

		dp[A][idx] = sp1 + sp2;
		return sp1 + sp2;
	}

	private static int changeBU(int A, int[] coins) {
		int[][] dp = new int[A+1][coins.length+1];
		for (int a = 0; a <= A; a++) {
			for (int idx = coins.length - 1; idx >= 0; idx--) {
				if(a==0) {
					dp[a][idx]=1;
					continue;
				}
				int sp1 = 0;
				if(a-coins[idx]>=0) {
					sp1 = dp[a-coins[idx]][idx];
				}
				int sp2 = dp[a][idx + 1];
				dp[a][idx] = sp1 + sp2;
			}
		}
		return dp[A][0];
	}

}
