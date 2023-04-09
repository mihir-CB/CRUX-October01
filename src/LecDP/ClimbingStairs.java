package LecDP;

public class ClimbingStairs {

	public static void main(String[] args) {
		int n = 100;
//		System.out.println(climb(n));
		System.out.println(climbTD(n, new int[n+1]));
		System.out.println(climbBU(n));
	}
	public static int climb(int n) {
		if(n==0) {
			return 1;
		}
		if(n<0) {
			return 0;
		}
		
		int sp1 = climb(n-1);
		int sp2 = climb(n-2);
		return sp1+sp2;
	}
	
	public static int climbTD(int n, int[] dp) {
		if(n==0) {
			return 1;
		}
		if(n<0) {
			return 0;
		}
		
		if(dp[n]!=0) {
			return dp[n];
		}
		
		int sp1 = climbTD(n-1, dp);
		int sp2 = climbTD(n-2, dp);
		
		dp[n]=sp1+sp2;
		return sp1+sp2;
	}
	
	public static int climbBU(int n) {
		int[] dp = new int[n+1];
		dp[0]=1;
		dp[1]=1;
		for(int i=2;i<=n;i++) {
			int sp1 = dp[i-1];
			int sp2 = dp[i-2];
			dp[i]=sp1+sp2;
		}
		return dp[n];
	}

}
