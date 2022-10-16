package Lec04;

public class ReverseANumber {

	public static void main(String[] args) {
		int num = 12345;
		int res = 0;
		
		while(num!=0) {
			int rem = num%10;
			num = num/10;
			res = res*10+rem;
			System.out.println(num+"," + res);
		}
		System.out.println(res);

	}

}
