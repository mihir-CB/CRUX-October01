package LecDP;

public class StepsTo1 {

	public static void main(String[] args) {
//		System.out.println(ops(15));
		int n = 15;
		System.out.println(opsTD(n, new Integer[n+1]));

	}
	public static int ops(int n) {
		if(n==1) {
			return 0;
		}
		if(n%2==0) {
			return 1+ops(n/2);
		}else {
			int sp1 = 1+ops(n-1);
			int sp2 = 1+ops(n+1);
			return Math.min(sp1, sp2);
		}
		
	}
	
	public static int opsTD(int n, Integer[] dp) {
		if(n==1) {
			return 0;
		}
		if(dp[n]!=null) {
			return dp[n];
		}
		if(n%2==0) {
			int sp=1+opsTD(n/2,dp);
			dp[n]=sp;
			return sp;
		}else {
			int sp1 = 1+opsTD(n-1,dp);
			int sp2 = 1+(1+opsTD((n+1)/2,dp));
			int res= Math.min(sp1, sp2);
			dp[n]=res;
			return res;
		}
	}
	public static int opsBU(int n) {
		int[] dp = new int[n+1];
		for(int i=2;i<=n;i++) {
			if(i%2==0) {
				dp[i]=1+dp[i/2];
			}else {
				int sp1 = 1+dp[i-1];
				int sp2 = 1+(1+dp[(i+1)/2]);
				int res= Math.min(sp1, sp2);
				dp[i]=res;
			}
		}
		return dp[n];
	}

}
