package Lec14;

public class reverseWordsOfString {

	public static void main(String[] args) {
		String str = "Let's do coding heheh";
		String rev = reverseWords(str);
		System.out.println(rev);
	}

	public static String reverseWords(String str) {
		String rev = "";
		while (str.indexOf(' ') != -1) {
			int idx = str.lastIndexOf(' ');
			rev = rev + str.substring(idx + 1) + " ";
			str = str.substring(0, idx);
		}
		rev += str;
		return rev;
	}

}
