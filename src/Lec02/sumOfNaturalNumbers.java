package Lec02;

import java.util.Scanner;

public class sumOfNaturalNumbers {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		
		int sum = 0; // Jahan sum store hoga
		int count = 1; // Konsa number ko sum mein add kr rahe

		while(count <= n) {
			sum = sum + count;
			count += 1;
		}
		System.out.println(sum);
	}

}



