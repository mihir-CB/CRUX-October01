package Lec03;

import java.util.Scanner;

public class PrimeOpt1 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();

		int i = 2;
		int countOfFactors = 0;

		while (i < n) {
			int rem = n % i;
			if (rem == 0) {
				countOfFactors += 1;
			}
			i += 1;
		}

		if (n < 2) {
			System.out.println("Concept of Prime not for " + n);
		} else if (countOfFactors == 0) {
			System.out.println("PRIME !!!");
		} else {
			System.out.println("NOT A PRIME !!");
		}

	}

}
