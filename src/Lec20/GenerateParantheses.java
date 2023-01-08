package Lec20;

public class GenerateParantheses {

	public static void main(String[] args) {
		GP(4, 0, 0, "");

	}

	public static void GP(int n, int oc, int cc, String ans) {

		if (oc == n && cc == n) {
			System.out.println(ans);
			return;
		}
		if (cc > oc || oc > n) {
			return;
		}

		// open
		GP(n, oc + 1, cc, ans + "(");

		// close
		GP(n, oc, cc + 1, ans + ")");
	}

}
