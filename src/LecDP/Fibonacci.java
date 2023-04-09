package LecDP;

public class Fibonacci {

	public static void main(String[] args) {
		int n = 20000;
//		System.out.println(Fibo(n));
//		System.out.println(FiboTD(n,new int[n+1]));
		System.out.println(FiboBU(n));

	}

	public static int Fibo(int n) {
		if (n <= 1) {
			return n;
		}
		int sp1 = Fibo(n - 1);
		int sp2 = Fibo(n - 2);
		return sp1 + sp2;
	}
	
	public static int FiboTD(int n, int[] dp) {
		// Memorization - Top Down
		if (n <= 1) {
			return n;
		}
		if(dp[n]!=0) {
			return dp[n];
		}
		int sp1 = FiboTD(n - 1, dp);
		int sp2 = FiboTD(n - 2, dp);
		dp[n]=sp1+sp2;
		return sp1 + sp2;
	}
	
	public static int FiboBU(int n) {
		// Tabulation - Iterative - Bottom Up
		int[] dp = new int[n+1];
		dp[0]=0;
		dp[1]=1;
		for(int i=2;i<=n;i++) {
			int sp1 = dp[i-1];
			int sp2 = dp[i-2];
			dp[i]=sp1+sp2;
		}
		return dp[n];
	}
	
	public static int FiboBUSE(int n) {
		// Tabulation - Iterative - Bottom Up
		
		int a=0;
		int b=1;
		for(int i=2;i<=n;i++) {
			int sp1 = a;
			int sp2 = b;
			int ans = sp1+sp2;
			a=b;
			b=ans;
		}
		return b;
	}

}
