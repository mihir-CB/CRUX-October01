package Lec14;

public class StringBuilderDemo {

	public static void main(String[] args) {
		// Initialisation
		String str = "Hello";
		String str1 = new String("Hello");
		StringBuilder sb = new StringBuilder();

		// insert -> adding at last position
		sb.append(123); // 123-> "123"
		sb.append(false); // false -> "false"
		sb.append(str);
		sb.append(1.25);
		// -> adding in between
		sb.insert(3, true);

		System.out.println(sb);

		// indexing
		System.out.println(sb.charAt(0));
		System.out.println(sb.charAt(10));
		System.out.println(sb.charAt(12));

		// update
		sb.setCharAt(3, '8');
		System.out.println(sb);

		// substring -> ditto as string
		System.out.println(sb.substring(0,7));
		System.out.println(sb);
		
		// deleteCharAt
		sb.deleteCharAt(0);
		System.out.println(sb);
		
		//length
		System.out.println(sb.length());
		
		// reverse
		sb.reverse();
		System.out.println(sb);
		System.out.println(sb.charAt(0));
		
		System.out.println("--------------------");
		String st = "";
		StringBuilder sb2 = new  StringBuilder();
		long start = System.currentTimeMillis();
		for(int i=0;i<100000000;i++) {
//			st+="Hello";
			sb2.append("Hello");
		}
		long end = System.currentTimeMillis();
		System.out.println(end-start);
	}

}
