package Lec21;

public class PrintLexicographically {

	public static void main(String[] args) {
		solve(0, 1000);
	}

	public static void solve(int curr, int limit) {
		if (curr > limit) {
			return;
		}
		int d = 0;
		if (curr == 0) {
			d = 1;
		} else {
			System.out.println(curr);
		}
		for (; d <= 9; d++) {
			solve(curr * 10 + d, limit);
		}
	}

}
