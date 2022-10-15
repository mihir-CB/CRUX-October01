package Lec03;

import java.util.Scanner;

public class HCF {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n1 = scn.nextInt();
		int n2 = scn.nextInt();

		int dividend = n1;
		int divisor = n2;

		while ((dividend % divisor) != 0) {
			int rem = dividend % divisor;
			dividend = divisor;
			divisor = rem;
		}

		System.out.println("GCD of " + n1 + " and " + n2 + " is " + divisor);

		int lcm = n1 * n2 / divisor;
		System.out.println("LCM of " + n1 + " and " + n2 + " is " + lcm);
	}

}
