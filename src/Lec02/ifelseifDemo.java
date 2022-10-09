package Lec02;

import java.util.Scanner;

public class ifelseifDemo {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int rem = n % 5;
		if (rem == 0 && (n > 50)) {
			System.out.println("Multiple of 5");
		} else if (rem == 1) {
			System.out.println("Not a multiple");
		} else {
			System.out.println("Abbey jaa naa!!");
		}
	}
}
