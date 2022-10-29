package Assignments;

import java.util.Scanner;

public class IncreasingDecreasing {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		int n = scn.nextInt();

		int prev = scn.nextInt();
		int curr;

		int i = 0;

		boolean isDecreasing = true;
		// Yeh btadega ki increase hora ya decrease

		boolean ans = true;

		while (i < n - 1) {
			curr = scn.nextInt();

			if (prev == curr) {
				ans = false;
			} else if (prev > curr) {
				if (isDecreasing == true) {

				} else { // isDecreasing == false
					ans = false;
				}

			} else { // prev < curr
				if (isDecreasing == true) {
					isDecreasing = false;
					// bottom most
					// System.out.println(prev);
				} else {
					// sequence pehle se hi increasing
				}
			}
			prev = curr;
			i++;
		}

		System.out.println(ans);

	}

}
