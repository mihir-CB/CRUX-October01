package Lec27;

import java.util.ArrayList;

public class Client {
	public static void main(String[] args) {
//		C obj = new C();
//	System.out.println(obj.data);

//		Case 1
		P obj1 = new P();
//		obj1.data -> Parent ki properties only, No Props of C
	
//		Case 2
		P obj2 = new C();
		System.out.println(obj2.data);
		System.out.println(((C)obj2).data);
		System.out.println(((C)obj2).dataC);
		
		obj2.fun();
		
//		Case 3
		C obj3 = new C();
		System.out.println();
		obj3.fun();
		
//		Case 4
//		C obj4 = new P();
//		obj4.dataC;
		
		System.out.println(obj3.toString());
		
		ArrayList<Integer> l = new ArrayList<>();
		l.toString();
		System.out.println(l);
	}
}
