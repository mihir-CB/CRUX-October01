package Lec18;

import java.util.ArrayList;
import java.util.Arrays;

public class primeSieve {

	public static void main(String[] args) {
		int n = 50;
		ArrayList<Integer> primes = getPrimesTillN(n);

		System.out.println(primes);
	}

	private static ArrayList<Integer> getPrimesTillN(int n) {
		ArrayList<Integer> res = new ArrayList<>();
		boolean[] isPrime = new boolean[n + 1];
		Arrays.fill(isPrime, true);
//		for(int i=0;i<=n;i++) {
//			isPrime[i]=true;
//		}
		isPrime[0] = false;
		isPrime[1] = false;
		for (int div = 2; div <= n; div++) {
			if (isPrime[div] == true) {
				for (int kata = div * div; kata <= n; kata += div) {
					isPrime[kata] = false;
				}
			}
		}

		for (int i = 2; i <= n; i++) {
			if (isPrime[i]) {
				res.add(i);
			}
		}

		return res;
	}

}
