package Lec20;

public class RecPrint {

	public static void main(String[] args) {
//		ct(3, "");
//		pss("abc", "");
//		PSSWithASCII("ab","");
		keyPadCombinations("235", "");

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

	public static void PSSWithASCII(String str, String ans) {
		if (str.length() == 0) {
			System.out.println(ans);
			return;
		}
		char ch = str.charAt(0);
		String rest = str.substring(1);

		// exclude ch
		PSSWithASCII(rest, ans);

		// include ch
		PSSWithASCII(rest, ans + ch);

		// include ch with ASCII
		PSSWithASCII(rest, ans + (int) (ch));

	}

	static String[] combinations = { "", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };

	public static String convert(char ch) {
//		if(ch=='2') {
//			return "abc";
//		}else if(ch=='3') {
//			return "def";
//		}.... :(

		return combinations[ch - '0'];
	}

	public static void keyPadCombinations(String str, String ans) {
		if (str.length() == 0) {
			System.out.println(ans);
			return;
		}
		char num = str.charAt(0);
		String possibleCharacters = convert(num);

		String rest = str.substring(1);

		for (int i = 0; i < possibleCharacters.length(); i++) {
			char ch = possibleCharacters.charAt(i);
			keyPadCombinations(rest, ans + ch);
		}
	}

}
