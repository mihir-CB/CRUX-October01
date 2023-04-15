package LecDP;

public class WineSeller {

	public static void main(String[] args) {
		// https://www.codechef.com/MALI2017/problems/MAXCOST

		int[] daaru = {2,3,5,1,4};
//		System.out.println(solve(daaru,0,daaru.length-1));
//		System.out.println(solveTD(daaru, 0, daaru.length-1, new Integer[daaru.length][daaru.length]));
		System.out.println(solveBU(daaru));
	}

	private static int solve(int[] daaru, int s, int e) {
		if(s>e) {
			return 0;
		}
		int days = daaru.length - (e-s);
		int st = daaru[s]*days + solve(daaru,s+1,e);
		int end = daaru[e]*days + solve(daaru,s,e-1);
		return Math.max(st, end);
	}
	
	private static int solveTD(int[] daaru, int s, int e,Integer[][] dp) {
		if(s>e) {
			return 0;
		}
		if(dp[s][e]!=null) {
			return dp[s][e];
		}
		int days = daaru.length - (e-s);
		int st = daaru[s]*days + solveTD(daaru,s+1,e,dp);
		int end = daaru[e]*days + solveTD(daaru,s,e-1,dp);
		return dp[s][e]=Math.max(st, end);
	}
	private static int solveBU(int[] daaru) {
		int[][] dp = new int[daaru.length][daaru.length];
		for(int s=daaru.length-1;s>=0;s--) {
			for(int e=s;e<daaru.length;e++) {
				int days = daaru.length-(e-s);
				int st = daaru[s]*days;
				if(s+1<daaru.length) {
					st+= dp[s+1][e];
				}
				int end = daaru[e]*days;
				if(e-1>=0) {
					end+= dp[s][e-1];
				}
				dp[s][e]=Math.max(st, end);
			}
		}
		return dp[0][daaru.length-1];
	}
}
