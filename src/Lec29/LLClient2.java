package Lec29;

public class LLClient2 {

	public static void main(String[] args) throws Exception {
		LinkedList list = new LinkedList();
		list.addLast(1);
		list.addLast(2);
		list.addLast(3);
		list.addLast(4);
		list.addLast(5);
		list.addLast(6);
		list.addLast(7);
		list.addLast(8);
		list.addLast(9);
		list.addLast(10);
		list.addLast(11);
		
		list.revK(3);
		list.display();

	}

}
