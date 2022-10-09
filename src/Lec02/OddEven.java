package Lec02;
import java.util.Scanner;
public class OddEven {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		
		int rem = n%2;
		
		if(rem==0) {
			System.out.println("Even");
		}else {
			System.out.println("Odd");
		}
	}

}
