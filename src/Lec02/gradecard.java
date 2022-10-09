package Lec02;

import java.util.Scanner;

public class gradecard {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int marks = scn.nextInt();

		if(marks > 100 || marks < 0) {
			System.out.println("Invalid");
		}else if (marks > 80 && marks<=100) {
			System.out.println("A");
		} else if (marks > 60 && marks<=80) {
			System.out.println("B");
		} else if (marks > 40 && marks<=50) {
			System.out.println("D");
		} else if (marks > 50 && marks<=60) {
			System.out.println("C");
		}  else if (marks > 30 && marks<=40) {
			System.out.println("Pass");
		} else {
			System.out.println("Fail");
		}
	}

}
