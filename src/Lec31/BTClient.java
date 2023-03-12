package Lec31;

public class BTClient {

	public static void main(String[] args) {
		int[] pre = { 10, 20, 40, 50, 30, 60 };
		int[] in = { 40, 20, 50, 10, 30, 60 };
		BinaryTree tree = new BinaryTree(pre, in);
		tree.display();
		System.out.println("___________________________");
		
		System.out.println(tree.find(25));
		System.out.println(tree.ht());
		System.out.println(tree.diameter());
		System.out.println(tree.diameter2());
		System.out.println(tree.isBalanced());
	}

}
