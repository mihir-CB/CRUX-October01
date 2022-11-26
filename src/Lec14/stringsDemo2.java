package Lec14;

public class stringsDemo2 {

	public static void main(String[] args) {
		String s1 = "Hello";
		String s2 = s1;

		System.out.println(s2);

		System.out.println(s1 == s2);

		s1 = "Hi";
		System.out.println(s2);

		System.out.println(s1 == s2);

		System.out.println("------------");

		String str = "Hello";
		String str1 = new String("Hello");
		System.out.println(str);
		System.out.println(str1);
		System.out.println(str == str1); // Address Compare
		System.out.println(str.equals(str1)); // Content Compare
	}

}
