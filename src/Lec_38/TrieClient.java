package Lec_38;

public class TrieClient {

	public static void main(String[] args) {
		Trie t = new Trie();
		t.addWord("cat");
		t.addWord("jagmohan");
		t.addWord("car");
		t.addWord("ModiG");
		t.addWord("Polis");
		System.out.println(t.findWord("ModiG"));
	}

}
