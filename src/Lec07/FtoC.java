package Lec07;

public class FtoC {

	public static void main(String[] args) {
		int minF = 0;
		int maxF = 100;
		int step = 20;

		for (int F = minF; F <= maxF; F += step) {
//			int C = 5 * (F - 32) / 9; not recommended
//			int C = (int) ((5 / 9.0) * (F - 32));
//			int C = (int) ((5.0 / 9) * (F - 32));
			int C = (int) ((5.0 / 9.0) * (F - 32));
			System.out.println(F + "\t" + C);
		}

	}

}
