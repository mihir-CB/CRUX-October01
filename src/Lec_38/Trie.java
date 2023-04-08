package Lec_38;

import java.util.HashMap;

public class Trie {

	class TrieNode {
		public TrieNode(char c) {
			this.ch = c;
			this.children = new HashMap<>();
			this.eow = false;
		}

		char ch;
		boolean eow;
		HashMap<Character, TrieNode> children;
	}

	TrieNode root;

	Trie() {
		root = new TrieNode('*');
	}

	public void addWord(String str) {
		TrieNode curr = root;
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (!curr.children.containsKey(ch)) {
				curr.children.put(ch, new TrieNode(ch));
			}
			curr = curr.children.get(ch);
		}
		curr.eow=true;
	}
	public boolean findWord(String str) {
		TrieNode curr = root;
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (!curr.children.containsKey(ch)) {
				return false;
			}
			curr=curr.children.get(ch);
		}
		return curr.eow;
	}

}
