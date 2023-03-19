package Lec31;

public class BTClient {

	public static void main(String[] args) {
//		int[] pre = { 10, 20, 40, 50, 30, 60 };
//		int[] in = { 40, 20, 50, 10, 30, 60 };
//		BinaryTree tree = new BinaryTree(pre, in);
		int[] level = { 10, 20, 30, 40, 50, -1, 60 };
		int[] pre = { 10, 20, 40, -1, -1, 50, -1, -1, 30, -1, 60, -1, -1 };
		BinaryTree tree = new BinaryTree(pre,0);
		tree.display();
		System.out.println("___________________________");

		System.out.println(tree.find(25));
		System.out.println(tree.ht());
		System.out.println(tree.diameter());
		System.out.println(tree.diameter2());
		System.out.println(tree.isBalanced());
		tree.levelOrderTraversal();
	}

}
