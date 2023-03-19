package Lec32;

public class BinarySearchTree {
	class Node {
		int data;
		Node left;
		Node right;

		public Node(int ele) {
			this.data = ele;
		}
	}

	Node root;

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

	public boolean find(int ele) {
		return find(root, ele);
	}

	private boolean find(Node node, int ele) {
		if (node == null) {
			return false;
		}
		if (node.data == ele) {
			return true;
		} else if (node.data > ele) {
			return find(node.left, ele);
		} else {
			return find(node.right, ele);
		}
	}

	public void add(int ele) {
		root = add(root, ele);
	}

	private Node add(Node node, int ele) {
		if (node == null) {
			return new Node(ele);
		}
		if (node.data > ele) {
			node.left = add(node.left, ele);
		} else {
			node.right = add(node.right, ele);
		}
		return node;
	}

	public int max() {
		return max(root);
	}

	private int max(Node node) {
		if (node != null) {
			while (node.right != null) {
				node = node.right;
			}
			return node.data;
		}
		return -1;
	}

	public int min() {
		return min(root);
	}

	private int min(Node node) {
		if (node != null) {
			while (node.left != null) {
				node = node.left;
			}
			return node.data;
		}
		return -1;
	}

	public void remove(int ele) {
		root = remove(root, ele);
	}

	private Node remove(Node node, int ele) {
		if (node == null) {
			return null;
		} else if (node.data < ele) {
			node.right = remove(node.right, ele);
			return node;
		} else if (node.data > ele) {
			node.left = remove(node.left, ele);
			return node;
		} else {
			// Node milgyi
			// Case 1: Leaf Node
			if (node.left == null && node.right == null) {
				return null;
			}
			// Case 2: 1 Child Only
			else if (node.left != null && node.right == null) {
				return node.left;
			} else if (node.left == null && node.right != null) {
				return node.right;
			}
			// Case 3: 2 Child
			else {
				int rmin = min(node.right);
				node.data = rmin;
				node.right = remove(node.right, rmin);
				return node;
			}
		}
	}
}
