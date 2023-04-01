package Lec35;

import java.util.ArrayList;

public class HashMap<K,V> {
	class Node {
		K key;
		V val;
		Node next;

		public Node(K key, V val) {
			this.key = key;
			this.val = val;
		}
	}

	private int size;
	private ArrayList<Node> buckets;
	private double loadFactor = 2.0;

	HashMap() {
		this(4);
	}

	HashMap(int cap) {
		buckets=new ArrayList<>();
		for (int i = 0; i < cap; i++) {
			buckets.add(null);
		}
		size = 0;
	}

	public V get(K key) {
		int bucNum = hashfunc(key);
		Node node = buckets.get(bucNum);
		while (node != null) {
			if ((node.key).equals(key)) {
				return node.val;
			}
			node = node.next;
		}
		return null;
	}

	public int size() {
		return this.size;
	}
	public void put(K key, V val) {
		int bucNum = hashfunc(key);
		Node node = buckets.get(bucNum);
		while (node != null) {
			if ((node.key).equals(key)) {
				node.val = val;
				return;
			}
			node = node.next;
		}
		Node nn = new Node(key, val);
		Node head = buckets.get(bucNum);
		if(head==null) {
			buckets.set(bucNum, nn);
		}else {
			nn.next = head;
			head = nn;
		}
		size++;

		if (loadFactor < (size * 1.0) / buckets.size()) {
			rehash();
		}
	}

	public boolean containsKey(K key) {
		int bucNum = hashfunc(key);
		Node node = buckets.get(bucNum);
		while (node != null) {
			if ((node.key).equals(key)) {
				return true;
			}
			node = node.next;
		}
		return false;
	}

	private int hashfunc(K key) {
		
		int num = key.hashCode();
		int bucNum = num % buckets.size();
		if (bucNum < 0) {
			bucNum += buckets.size();
		}
		return bucNum;
	}

	private void rehash() {
		ArrayList<Node> big = new ArrayList<>();
		for (int i = 0; i < buckets.size() * 2; i++) {
			big.add(null);
		}
		ArrayList<Node> old = buckets;
		buckets = big;
		size=0;

		for (Node head : old) {
			while (head != null) {
				this.put(head.key, head.val);
				head = head.next;
			}
		}
	}
}
