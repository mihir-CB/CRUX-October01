package Lec20;

public class climbingStairs {

	public static void main(String[] args) {
//		climb(0, 5, "");
		climbUnique(0, 5, 0, "");
		System.out.println("----" + count + "----");
	}

	static int count = 0;

	public static void climb(int curr, int end, String ans) {
		if (curr == end) {
			System.out.println(ans);
			count++;
			return;
		}

		// jump 1
		if (curr + 1 <= end) {
			climb(curr + 1, end, ans + 1);
		}

		// jump 2
		if (curr + 2 <= end) {
			climb(curr + 2, end, ans + 2);
		}

		// jump 3
		if (curr + 3 <= end) {
			climb(curr + 3, end, ans + 3);
		}
	}

	public static void climbUnique(int curr, int end, int lastJump, String ans) {
		if (curr == end) {
			System.out.println(ans);
			count++;
			return;
		}

		// jump 1
		if (curr + 1 <= end && lastJump <= 1) {
			climbUnique(curr + 1, end, 1, ans + 1);
		}

		// jump 2
		if (curr + 2 <= end && lastJump <= 2) {
			climbUnique(curr + 2, end, 2, ans + 2);
		}

		// jump 3
		if (curr + 3 <= end && lastJump <= 3) {
			climbUnique(curr + 3, end, 3, ans + 3);
		}
	}

}
