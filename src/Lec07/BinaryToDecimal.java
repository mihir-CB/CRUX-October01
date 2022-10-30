package Lec07;

public class BinaryToDecimal {

	public static void main(String[] args) {
		int bin = 1111;
		int decimal = 0;
		int mult = 1;

		while (bin != 0) {
			int rem = bin % 10;
			decimal = decimal + rem * mult;
//			System.out.println(rem);
			mult *= 2;
			bin /= 10;
		}
		System.out.println(decimal);
	}

}
