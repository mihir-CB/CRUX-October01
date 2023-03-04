package Lec28;

public class MinStackClient {

	public static void main(String[] args) throws Exception{
		MinStack ms = new MinStack(10);
		ms.push(8);
		ms.push(10);
		ms.push(5);
		ms.push(7);
		ms.push(2);
		ms.push(6);
		System.out.println(ms.peek());
		System.out.println(ms.pop());
		System.out.println(ms.min());
		System.out.println(ms.pop());
		System.out.println(ms.min());
		
	}

}
