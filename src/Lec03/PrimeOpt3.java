package Lec03;

public class PrimeOpt3 {

	public static void main(String[] args) {
		int n = 45;
		int i = 2;
		boolean factorMilla = false; // kya tereko factor milla?
		
		while(i*i<=n) {
			int rem = n%i;
			if(rem==0) {
				System.out.println(i);
				factorMilla = true;
				// factor milgya
				break;
			}
			i=i+1;
		}
		
		if(factorMilla==true) {
			System.out.println("Not Prime");
		}else {
			System.out.println("Prime");
		}

	}

}
