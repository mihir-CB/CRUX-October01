package Lec07;

public class DecimalToOctl {

	public static void main(String[] args) {
		int decimal = 19;

		int oct = 0;
		int mult = 1;

		while (decimal != 0) {
			int rem = decimal % 8;
			oct += rem * mult;
//			System.out.println(rem);
			mult *= 10;
			decimal /= 8;
		}

		System.out.println(oct);

	}

}
