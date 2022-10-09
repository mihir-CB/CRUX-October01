package Lec02;

import java.util.Scanner;

public class printNumbers {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		
		int count = 1; // Jo number humme print krvana hai
		while(count <= n) {
			System.out.println(count); // Kaam
			count+=1; // reinitialize
		}

	}

}
