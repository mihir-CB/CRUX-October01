package Lec03;

import java.util.Scanner;

public class PrimeOpt2 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();

		int i = 2;
		boolean flag = false;
		
		while (i < n) {
			int rem = n % i;
			if (rem == 0) {
				// Factor milgya ek
				flag = true;
				break;
			}
			i += 1;
		}

		if (n < 2) {
			System.out.println("Concept of Prime not for " + n);
		} else if (flag==false) {
			// or check if (i==n) in case of prime
			System.out.println("PRIME !!!");
		} else {
			System.out.println("NOT A PRIME !!");
		}

	}

}
