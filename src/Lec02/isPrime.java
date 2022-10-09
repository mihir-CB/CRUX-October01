package Lec02;

import java.util.Scanner;

public class isPrime {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();

		int i = 1;
		int countOfFactors = 0;
		// Factors count krenge ki kitne hai
		// Koi number factor hai agar n ka toh
		// n ko us number se divide krne par remainder
		// 0 aayega
		// n = factor * X + 0

		while (i <= n) {
			int rem = n % i;
			// har number ko check krenge ki remainder kya aayega
			if (rem == 0) {
				// agar remainder 0 hi toh
				// i hai n ka factor
				// factor milgya toh count increase krdo
				countOfFactors += 1;
			}
			i += 1;
		}

		if (countOfFactors == 2) {
			// Agar kisi number ke 2 factors hain (1 & n)
			// hain toh voh prime hai
			System.out.println("PRIME !!!");
		} else {
			System.out.println("NOT A PRIME !!");
		}

	}

}
