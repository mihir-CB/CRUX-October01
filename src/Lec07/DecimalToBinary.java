package Lec07;

public class DecimalToBinary {

	public static void main(String[] args) {
		int decimal = 14;
		
		int bin = 0;
		int mult = 1;
		
		while(decimal!=0) {
			int rem = decimal%2;
			bin+=rem*mult;
//			System.out.println(rem);
			mult*=10;
			decimal/=2;
		}
		
		System.out.println(bin);

	}

}
