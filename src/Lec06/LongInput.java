package Lec06;

import java.util.Scanner;

public class LongInput {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
//		long l = scn.nextLong();
//		long l1 = 1000000000000000L;
//		System.out.println(l);
		
//		double d = scn.nextDouble();
//		System.out.println(d);
		
//		char ch = scn.next().charAt(0);
//		System.out.println(ch);
//		
		String str = scn.next();
		System.out.println(str);
		
		String str1 = scn.nextLine();
		System.out.println(str1);
		
		String str2 = scn.next();
		System.out.println("*"+str2);
		
		
	}

}
