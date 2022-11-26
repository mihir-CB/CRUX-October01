package Lec14;

public class palindrome {

	public static void main(String[] args) {
		String str = "nitin";
		System.out.println(isPalindrome(str));
	}

	public static boolean isPalindrome(String str) {
		int l=0;
		int r=str.length()-1;
		while(l<r) {
			if(str.charAt(l)==str.charAt(r)) {
				l++;
				r--;
			}else {
				return false;
			}
		}
		return true;
	}

}
