package Lec32;

public class BTClient {

	public static void main(String[] args) {
//		int[] level = { 10, 20, 30, 40, 50, -1, 60 };
		int[] level = {10,-1,20,-1,30,-1,40,-1,50};
		BinaryTree bt = new BinaryTree(level);
		
		System.out.println(bt.checkIfBTisBST());

	}

}
