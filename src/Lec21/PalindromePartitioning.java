package Lec21;

import java.util.ArrayList;

public class PalindromePartitioning {

	public static void main(String[] args) {
		pp("nitin", new ArrayList<>(), "");
	}

	public static void pp(String str, ArrayList<String> ans, String res) {
		if (str.length() == 0) {
			System.out.println(res);
			System.out.println(ans);
			return;
		}
		for (int i = 0; i < str.length(); i++) {
			String part = str.substring(0, i + 1);
			if (isPalindrome(part)) {
				String remaining = str.substring(i + 1);
				ans.add(part);
				pp(remaining, ans, res + "|" + part);
				ans.remove(ans.size()-1);
			}
		}
	}

	public static boolean isPalindrome(String str) {
		int s = 0;
		int e = str.length() - 1;
		while (s < e) {
			if (str.charAt(s) != str.charAt(e)) {
				return false;
			}
			s++;
			e--;
		}
		return true;
	}
}
