package Lec14;

public class printPalindromicSS {

	public static void main(String[] args) {
		String str = "aabaacac";
		ppsso(str);
	}

	public static void ppss(String str) {
		for (int s = 0; s < str.length(); s++) {
			for (int e = s + 1; e <= str.length(); e++) {
				String ss = str.substring(s, e);
				if (isPalindrome(ss)) {
					System.out.println(ss);
				}
			}
		}
	}

	public static void ppsso(String str) {
		// for odd length ss
		for (int axis = 0; axis < str.length(); axis++) {
			for (int rad = 0; axis - rad >= 0 && axis + rad < str.length(); rad++) {
				int lidx = axis - rad;
				int ridx = axis + rad;

				if (str.charAt(lidx) == str.charAt(ridx)) {
					String ss = str.substring(lidx, ridx + 1);
					System.out.println(ss);
				} else {
					break;
				}
			}
			// break hokr yahan aaoge
		}

		// for even length ss
		for (double axis = 0.5; axis < str.length(); axis++) {
			for (double rad = 0.5; axis - rad >= 0 && axis + rad < str.length(); rad++) {
				int lidx = (int) (axis - rad);
				int ridx = (int) (axis + rad);
				if (str.charAt(lidx) == str.charAt(ridx)) {
					String ss = str.substring(lidx, ridx + 1);
					System.out.println(ss);
				} else {
					break;
				}
			}
		}
	}

	public static boolean isPalindrome(String str) {
		int l = 0;
		int r = str.length() - 1;
		while (l < r) {
			if (str.charAt(l) == str.charAt(r)) {
				l++;
				r--;
			} else {
				return false;
			}
		}
		return true;
	}

}
