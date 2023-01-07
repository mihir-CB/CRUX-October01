package Lec20;

public class RecPrint {

	public static void main(String[] args) {
//		ct(3, "");
		pss("abc", "");

	}

	public static void ct(int noc, String ans) {
		if (noc == 0) {
			System.out.println(ans);
			return;
		}
		ct(noc - 1, ans + "H");
		ct(noc - 1, ans + "T");
	}

	public static void pss(String str, String ans) {
		if (str.length() == 0) {
			System.out.println(ans);
			return;
		}
		char ch = str.charAt(0);
		String rest = str.substring(1);

		// exclude ch
		pss(rest, ans);

		// include ch
		pss(rest, ans + ch);
	}

}
