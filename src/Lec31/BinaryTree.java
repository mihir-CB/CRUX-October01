package Lec31;

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

	BinaryTree(int[] pre, int[] in) {
		root = constructTreeFromPreIn(pre, 0, pre.length - 1, in, 0, in.length - 1);
	}

	private Node constructTreeFromPreIn(int[] pre, int ps, int pe, int[] in, int is, int ie) {
		if (ps > pe || is > ie) {
			return null;
		}
		Node node = new Node(pre[ps]);
		int val = pre[ps];
		int posn = is;
		int c = 0;
		for (int i = is; i <= ie; i++) {
			if (in[i] == val) {
				posn = i;
				break;
			}
			c++;
		}
		node.left = constructTreeFromPreIn(pre, ps + 1, ps + c, in, is, posn - 1);
		node.right = constructTreeFromPreIn(pre, ps + c + 1, pe, in, posn + 1, ie);

		return node;
	}

	public void display() {
		disp(root);
	}

	private void disp(Node node) {
		if (node == null) {
			return;
		}
		if (node.left != null) {
			System.out.print(node.left.data);
		} else {
			System.out.print(" ");
		}
		System.out.print("<-" + node.data + "->");
		if (node.right != null) {
			System.out.print(node.right.data);
		} else {
			System.out.print(" ");
		}
		System.out.println();
		disp(node.left);
		disp(node.right);
	}

	public boolean find(int val) {
		return find(root, val);
	}

	private boolean find(Node node, int val) {
		if (node == null) {
			return false;
		}
		if (node.data == val) {
			return true;
		}
		boolean spl = find(node.left, val);
		boolean spr = find(node.right, val);
		return spl || spr;
	}

	public int ht() {
		return ht(root);
	}

	private int ht(Node node) {
		if (node == null) {
			return -1;
		}
		int lth = ht(node.left);
		int rth = ht(node.right);
		return Math.max(lth, rth) + 1;
	}

	public int diameter() {
		return diameter(root);
	}

	private int diameter(Node node) {
		if (node == null) {
			return 0;
		}
		int lh = ht(node.left);
		int rh = ht(node.right);
		int myDiameter = lh + rh + 2;

		int lans = diameter(node.left);
		int rans = diameter(node.right);
		return Math.max(myDiameter, Math.max(lans, rans));
	}

	class pairDiameter {
		int ht;
		int ans;
	}

	public int diameter2() {
		return diameter2(root).ans;
	}

	private pairDiameter diameter2(Node node) {
		pairDiameter myPair = new pairDiameter();
		if (node == null) {
			myPair.ht = -1;
			myPair.ans = 0;
			return myPair;
		}

		pairDiameter left = diameter2(node.left);
		pairDiameter right = diameter2(node.right);

		myPair.ht = Math.max(left.ht, right.ht) + 1;

		int myDiameter = left.ht + right.ht + 2;
		myPair.ans = Math.max(myDiameter, Math.max(left.ans, right.ans));
		return myPair;
	}

	public boolean isBalanced() {
		return isBalanced(root).ans;
	}

	private pairBalanced isBalanced(Node node) {
		pairBalanced myPair = new pairBalanced();
		if (node == null) {
			myPair.ht = -1;
			myPair.ans = true;
			return myPair;
		}

		pairBalanced left = isBalanced(node.left);
		pairBalanced right = isBalanced(node.right);

		myPair.ht = Math.max(left.ht, right.ht) + 1;
		int diff = (int) (Math.abs(left.ht - right.ht));
		boolean myAns = (diff <= 1);
		myPair.ans = myAns && left.ans && right.ans;

		return myPair;
	}

	class pairBalanced {
		int ht;
		boolean ans;
	}

	/*
	public boolean flipEquiv(TreeNode root1, TreeNode root2) {
        if(root1==null && root2==null){
            return true;
        }else if(root1==null || root2==null){
            return false;
        }
        if(root1.val!=root2.val){
            return false;
        }
        boolean flip = flipEquiv(root1.left,root2.right) && flipEquiv(root1.right,root2.left);
        boolean noFlip = flipEquiv(root1.left,root2.left) && flipEquiv(root1.right,root2.right);
        return flip||noFlip;
    }
    */
}
