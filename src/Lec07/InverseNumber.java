package Lec07;

public class InverseNumber {

	public static void main(String[] args) {
		int num = 643152;
		int p = 1;
		int ans = 0;
		while (num != 0) {
			int digit = num % 10;
			System.out.println(digit + ",\t" + p);
			int value = p;
			int place = (int) (Math.pow(10, digit - 1));
			ans += value * place;
			num /= 10;
			p++;
		}
		System.out.println(ans);
	}

}
