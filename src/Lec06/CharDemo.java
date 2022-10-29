package Lec06;

public class CharDemo {

	public static void main(String[] args) {
		char ch = 'b';
		System.out.println(ch);

		System.out.println((int) ch);

		System.out.println((char) (ch + 1));

		System.out.println((char) 97);

		System.out.println("---------");

		if (ch >= 'a' && ch <= 'z') {
			System.out.println("Lowercase");
		} else if (ch >= 'A' && ch <= 'Z') {
			System.out.println("Uppercase");
		}
	}

}
