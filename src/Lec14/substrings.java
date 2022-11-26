package Lec14;

public class substrings {

	public static void main(String[] args) {
		String str = "abcde";

		printAllSubstrings(str);
	}

	public static void printAllSubstrings(String str) {
		for(int s=0;s<str.length();s++) {
			for(int e=s+1;e<=str.length();e++) {
				String ss = str.substring(s,e);
				System.out.println(ss);
			}
		}
		
	}

}
