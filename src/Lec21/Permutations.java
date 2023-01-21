package Lec21;

import java.util.ArrayList;

public class Permutations {

	public static void main(String[] args) {
		ArrayList<String> res = permutations("abc");
		System.out.println(res);
	}

	public static ArrayList<String> permutations(String str) {
		ArrayList<String> res = new ArrayList<>();
		if (str.length() == 0) {
			res.add("");
			return res;
		}
		char ch = str.charAt(0);
		String ros = str.substring(1);

		ArrayList<String> rr = permutations(ros);

		for (String s : rr) {
			for (int i = 0; i <= s.length(); i++) {
				String ans = s.substring(0, i) + ch + s.substring(i);
				res.add(ans);
			}
		}
		return res;
	}

}
