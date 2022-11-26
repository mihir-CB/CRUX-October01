package Lec14;
import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		int[] arr = new int[5];
		ArrayList<Integer> al = new ArrayList<Integer>();
		
		System.out.println(al);
		
		// insert
		arr[0]=10;
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);
		al.add(60);
		al.add(0,0);
		
		al.add(5,100);
		
		System.out.println(al);
		
		System.out.println("-----------");
		// size
		System.out.println(arr.length);
		System.out.println(al.size());
		
		System.out.println("-----------");
		// indexing -> same as array
		System.out.println(arr[0]);
		System.out.println(al.get(2));
		
		System.out.println("-----------");
		// update 
		arr[0]=5;
		al.set(3, 500);
		System.out.println(al);
		
		System.out.println("----------");
		// remove
//		arr[]?
		al.remove(0);
		System.out.println(al);
		System.out.println(al.get(0));
		
//		Limited memory hi available
//		
//		ArrayList<Integer> al1 = new ArrayList<>();
//		for(long i=0;i<1000000000000L;i++) {
//			al1.add((int)i);
//		}
	}

}
