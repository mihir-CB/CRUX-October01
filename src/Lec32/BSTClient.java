package Lec32;

public class BSTClient {

	public static void main(String[] args) {
		BinarySearchTree bst = new BinarySearchTree();
		
		bst.add(10);
		bst.add(15);
		bst.add(25);
		bst.add(8);
		bst.add(2);
		
		bst.display();
		
		System.out.println(bst.find(6));

	}

}
