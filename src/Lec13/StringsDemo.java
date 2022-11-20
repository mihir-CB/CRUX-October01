package Lec13;

public class StringsDemo {

	public static void main(String[] args) {
		String str = "Chutti dedo tt";
		
		// length
		System.out.println(str.length());
		
		// indexing -> Hoti hai
//		str[0]? // But nahi kr skte
		char ch = str.charAt(1);
//		System.out.println(ch);
		// 0 to len-1 // Just like an array
		
		// 'e' exist krta hai?
		System.out.println(str.indexOf('d'));
		System.out.println(str.indexOf("tt"));
//		indexOf -> first starting index -> left to right
		
		// last index of the word
		System.out.println(str.lastIndexOf('d'));
		System.out.println(str.lastIndexOf("edo"));
		// right to left
		
		
		// substring
		String s1 = "Hellllo";
		System.out.println(s1.substring(1));
		System.out.println(s1.substring(1, 6));
		
		// startsWith
		System.out.println(s1.startsWith("He"));
		//endsWith
		System.out.println(s1.endsWith("O"));
	}

}
