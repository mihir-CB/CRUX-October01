package LecDP;

public class EditDistance {
	public static void main(String[] args) {
		String str1 = "horse";
		String str2 = "ros";
		System.out.println(solveTD(str1, str2, 0, 0, new Integer[str1.length() + 1][str2.length() + 1]));
	}

	private static int solve(String str1, String str2, int idx1, int idx2) {
		if (idx1 == str1.length() || idx2 == str2.length()) {
			int len1 = str1.length() - idx1;
			int len2 = str2.length() - idx2;
			return len1 + len2;
		}
		if (str1.charAt(idx1) == str2.charAt(idx2)) {
			return solve(str1, str2, idx1 + 1, idx2 + 1);
		} else {
			int in = 1 + solve(str1, str2, idx1, idx2 + 1);
			int del = 1 + solve(str1, str2, idx1 + 1, idx2);
			int rep = 1 + solve(str1, str2, idx1 + 1, idx2 + 1);

			int res = Math.min(in, Math.min(del, rep));
			return res;
		}
	}

	private static int solveTD(String str1, String str2, int idx1, int idx2, Integer[][] dp) {
		if (idx1 == str1.length() || idx2 == str2.length()) {
			int len1 = str1.length() - idx1;
			int len2 = str2.length() - idx2;
			return len1 + len2;
		}

		if (dp[idx1][idx2] != null) {
			return dp[idx1][idx2];
		}
		if (str1.charAt(idx1) == str2.charAt(idx2)) {
			int res = solveTD(str1, str2, idx1 + 1, idx2 + 1, dp);
			return dp[idx1][idx2] = res;
		} else {
			int in = 1 + solveTD(str1, str2, idx1, idx2 + 1, dp);
			int del = 1 + solveTD(str1, str2, idx1 + 1, idx2, dp);
			int rep = 1 + solveTD(str1, str2, idx1 + 1, idx2 + 1, dp);

			int res = Math.min(in, Math.min(del, rep));
			return dp[idx1][idx2] = res;
		}
	}

	private static int solveBU(String str1, String str2) {
		int[][] dp = new int[str1.length() + 1][str2.length() + 1];
		for (int idx1 = str1.length(); idx1 >= 0; idx1--) {
			for (int idx2 = str2.length(); idx2 >= 0; idx2--) {

				if (idx1 == str1.length() || idx2 == str2.length()) {
					int len1 = str1.length() - idx1;
					int len2 = str2.length() - idx2;
					dp[idx1][idx2] = len1 + len2;
					continue;
				}

				if (str1.charAt(idx1) == str2.charAt(idx2)) {
					int res = dp[idx1 + 1][idx2 + 1];
					dp[idx1][idx2] = res;
				} else {
					int in = 1 + dp[idx1][idx2 + 1];
					int del = 1 + dp[idx1 + 1][idx2];
					int rep = 1 + dp[idx1 + 1][idx2 + 1];

					int res = Math.min(in, Math.min(del, rep));
					dp[idx1][idx2] = res;
				}
			}
		}
		return dp[0][0];
	}
}
