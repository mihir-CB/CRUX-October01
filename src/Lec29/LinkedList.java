package Lec29;

import java.util.Stack;

public class LinkedList {
	private class Node {
		int data;
		Node next;

		Node(int d) {
			this.data = d;
		}
	}

	Node head;

	public void display() throws Exception { // O(n)
		if (isEmpty()) {
			throw new Exception("Khaali hai");
		}
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.data);
			if (temp.next != null)
				System.out.print("->");
			temp = temp.next;
		}
		System.out.println();
	}

	public int size() { // O(n)
		Node temp = head;
		int c = 0;
		while (temp != null) {
			c++;
			temp = temp.next;
		}
		return c;
	}

	public boolean isEmpty() { // O(n)
		return size() == 0;
	}

	public int getFirst() throws Exception { // O(1)
		if (isEmpty()) {
			throw new Exception("Khaali hai");
		}
		return head.data;
	}

	public int getLast() throws Exception { // O(n)
		if (isEmpty()) {
			throw new Exception("Khaali hai");
		}
		Node temp = head;
		while (temp.next != null) {
			temp = temp.next;
		}
		return temp.data;
	}

	private Node getFirstNode() throws Exception { // O(1)
		if (isEmpty()) {
			throw new Exception("Khaali hai");
		}
		return head;
	}

	private Node getLastNode() throws Exception { // O(n)
		if (isEmpty()) {
			throw new Exception("Khaali hai");
		}
		Node temp = head;
		while (temp.next != null) {
			temp = temp.next;
		}
		return temp;
	}

	public int getAt(int idx) throws Exception { // O(n)
		if (isEmpty()) {
			throw new Exception("Khaali hai");
		} else if (idx < 0 || idx >= size()) {
			throw new IndexOutOfBoundsException("Invalid Index");
		}
		int i = 0;
		Node temp = head;
		while (i != idx) {
			temp = temp.next;
			i++;
		}
		return temp.data;
	}

	private Node getNodeAt(int idx) throws Exception { // O(n)
		if (isEmpty()) {
			throw new Exception("Khaali hai");
		} else if (idx < 0 || idx > size()) {
			throw new IndexOutOfBoundsException("Invalid Index");
		}
		int i = 0;
		Node temp = head;
		while (i != idx) {
			temp = temp.next;
			i++;
		}
		return temp;
	}

	public void addFirst(int data) { // O(1)
		Node nn = new Node(data);
		nn.next = head;
		head = nn;
	}

	public void addLast(int data) { // O(n)
		if (isEmpty()) {
			addFirst(data);
			return;
		}
		Node nn = new Node(data);
		Node temp = head;
		while (temp.next != null) {
			temp = temp.next;
		}
		temp.next = nn;
	}

	public void addAt(int idx, int data) throws Exception { // O(n)
		if (idx < 0 || idx > size()) {
			throw new IndexOutOfBoundsException("Invalid Index");
		} else if (isEmpty() || idx == 0) {
			addFirst(data);
			return;
		} else if (idx == size()) {
			addLast(data);
			return;
		}
		Node nn = new Node(data);
		Node prev = getNodeAt(idx - 1);
		Node curr = getNodeAt(idx);
		nn.next = curr;
		prev.next = nn;
	}

	public int removeFirst() throws Exception { // O(1)
		if (isEmpty()) {
			throw new Exception("Khaali hai");
		}
		Node temp = head;
		head = head.next;
		return temp.data;
	}

	public int removeLast() throws Exception { // O(n)
		if (isEmpty()) {
			throw new Exception("Khaali hai");
		} else if (size() == 1) {
			return removeFirst();
		}
		Node prev = getNodeAt(size() - 2);
		Node last = getNodeAt(size() - 1);
		prev.next = null;
		return last.data;
	}

	public int removeAt(int idx) throws Exception { // O(n)
		if (isEmpty()) {
			throw new Exception("Khaali hai");
		} else if (idx < 0 || idx >= size()) {
			throw new IndexOutOfBoundsException("Invalid Index");
		} else if (idx == 0) {
			return removeFirst();
		}
		Node prev = getNodeAt(idx - 1);
		Node curr = getNodeAt(idx);
		prev.next = curr.next;
		return curr.data;
	}

	public void reverse() { // O(n)
		Node prev = null;
		Node curr = head;
		while (curr != null) {
			Node next = curr.next;
			curr.next = prev;

			prev = curr;
			curr = next;
		}
		head = prev;
	}

	public void reverse2() { // O(n)
		head = rev(head);
	}

	private Node rev(Node node) {
		if (node == null || node.next == null) {
			return node;
		}

		Node updatedHead = rev(node.next);
		node.next.next = node;
		node.next = null;
		return updatedHead;
	}

	public int getMid() {
		Node slow = head;
		Node fast = head;
		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		return slow.data;
	}

	public int getKthfromLast(int k) {
		Node slow = head;
		Node fast = head;
		while (k > 0) {
			fast = fast.next;
			k--;
		}
		while (fast != null) {
			slow = slow.next;
			fast = fast.next;
		}
		return slow.data;
	}

	/*
	 * returns a ll after reves params: int k
	 * 
	 * returns: list
	 */
	public void revK(int k) {
		Stack<Node> stack = new Stack<>();
		Node upHead = null;
		Node last = null;
		Node ptr = head;

		while (ptr != null) {

			stack.push(ptr);
			ptr = ptr.next;

			if (stack.size() == k) {
				while (!stack.isEmpty()) {
					Node nn = stack.pop();
					nn.next = null;
					if (upHead == null) {
						upHead = nn;
						last = nn;
					} else {
						last.next = nn;
						last = nn;
					}
				}
			}
		}
		if (!stack.isEmpty()) {
			Node l2 = null;
			Node l2H = null;
			while (!stack.isEmpty()) {
				Node nn = stack.pop();
				nn.next = null;
				if (l2 == null) {
					l2H = nn;
					l2 = nn;
				} else {
					l2.next = nn;
					l2 = nn;
				}
			}

			Node prev = null;
			Node curr = l2H;
			while (curr != null) {
				Node ahead = curr.next;
				curr.next = prev;
				prev = curr;
				curr = ahead;
			}
			last.next = prev;

		}
		this.head = upHead;
	}
	/*
	 * public ListNode reverseKGroup(ListNode head, int k) { if(head==null){ return
	 * head; } int c=1; ListNode p = head; while(c<k && p!=null){ p=p.next; c++; }
	 * if(p==null){ // k elements not available return head; } ListNode next =
	 * p.next; ListNode rr = reverseKGroup(next,k); p.next=null;
	 * 
	 * // head -> 1 ListNode uh = rev(head);// 3 head.next=rr; return uh; } private
	 * ListNode rev(ListNode n){ ListNode prev = null; ListNode curr = n;
	 * while(curr!=null){ ListNode ahead = curr.next; curr.next = prev; prev=curr;
	 * curr=ahead; } return prev; }
	 */

	public boolean isCyclic() {
		Node slow = head;
		Node fast = head;
		while (fast != null && fast.next != null) {
			if (slow == fast) {
				return true;
			}
			slow = slow.next;
			fast = fast.next.next;
		}
		return false;
	}

	public void removeCycle() {
		if (!isCyclic()) {
			return;
		}

		Node slow = head;
		Node fast = head;

		Node intersection = null;

		while (fast != null && fast.next != null) {
			if (slow == fast) {
				intersection = slow;
				break;
			}
			slow = slow.next;
			fast = fast.next.next;
		}

		slow = head;
		fast = intersection;
		while (slow.next != fast.next) {
			slow = slow.next;
			fast = fast.next;
		}
		fast.next = null;
	}
}
