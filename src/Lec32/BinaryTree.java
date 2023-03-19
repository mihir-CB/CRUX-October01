package Lec32;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree {

	class Node {
		int data;
		Node left;
		Node right;

		Node(int d) {
			this.data = d;
		}
	}

	private Node root;

	BinaryTree(int[] lvl) {
		constructFromLevelOrder(lvl);
	}

	private void constructFromLevelOrder(int[] lvl) {
		int idx = 0;
		root = new Node(lvl[0]);
		idx++;

		Queue<Node> queue = new LinkedList<>();
		queue.add(root);

		while (idx < lvl.length && !queue.isEmpty()) {
			Node node = queue.remove();
			if (idx < lvl.length && lvl[idx] != -1) {
				Node left = new Node(lvl[idx]);
				node.left = left;
				queue.add(left);
			}
			idx++;

			if (idx < lvl.length && lvl[idx] != -1) {
				Node right = new Node(lvl[idx]);
				node.right = right;
				queue.add(right);
			}
			idx++;
		}
	}

	public boolean checkIfBTisBST() {
		return checkIsBST2(root).ans;
	}

	private boolean checkIsBST(Node node) {
		if (node == null) {
			return true;
		}
		boolean lans = checkIsBST(node.left);
		boolean rans = checkIsBST(node.right);
		if (lans && rans) {
			int lmax = TMax(node.left);
			int rmin = TMin(node.right);
			boolean ans = (lmax <= node.data) && (node.data <= rmin);
			return ans;
		}
		return false;
	}

	private int TMax(Node node) {
		if (node == null) {
			return 0;
		}
		int lmax = TMax(node.left);
		int rmax = TMax(node.right);
		return Math.max(node.data, Math.max(lmax, rmax));
	}

	private int TMin(Node node) {
		if (node == null) {
			return 0;
		}
		int lmin = TMin(node.left);
		int rmin = TMin(node.right);
		return Math.min(node.data, Math.min(lmin, rmin));
	}

	class checkBSTPair {
		boolean ans = true;
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
	}

	private checkBSTPair checkIsBST2(Node node) {
		if (node == null) {
			return new checkBSTPair();
		}
		checkBSTPair lpair = checkIsBST2(node.left);
		checkBSTPair rpair = checkIsBST2(node.right);

		checkBSTPair myPair = new checkBSTPair();

		boolean ans = lpair.max <= node.data && rpair.min >= node.data;
		myPair.ans = lpair.ans && rpair.ans && ans;

		myPair.max = Math.max(node.data, Math.max(lpair.max, rpair.max));
		myPair.min = Math.min(node.data, Math.min(lpair.min, rpair.min));
		return myPair;
	}
	
	/*
	 * public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root==null || root==p || root==q){
            return root;
        }else{
            TreeNode left = lowestCommonAncestor(root.left,p,q);
            TreeNode right = lowestCommonAncestor(root.right,p,q);
            if(left!=null && right!=null){
                return root;
            }else if(left==null){
                return right;
            }else{
                return left;
            }
        }
    }
	 * */

}
