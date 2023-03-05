package Lec29;

public class LLClient {

	public static void main(String[] args) throws Exception {
		LinkedList ll = new LinkedList();
		ll.addFirst(10);
		ll.addLast(20);
		ll.addAt(1, 15);
		ll.addLast(25);
		ll.addFirst(5);
		ll.display();
//		System.out.println(ll.size());
//		System.out.println(ll.getFirst());
//		System.out.println(ll.getLast());
//		System.out.println(ll.getAt(2));
//		ll.addLast(30);
//		ll.display();	
//
//		ll.removeFirst();
//		ll.display();

//		ll.removeLast();
//		ll.display();
//
//		ll.removeAt(3);
//		ll.display();
		
		ll.reverse2();
		ll.display();
		
		ll.addFirst(40);
		ll.display();
		System.out.println(ll.getKthfromLast(2));
	}

}
