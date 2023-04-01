package Lec35;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class HashmapDemo {

	public static void main(String[] args) {
		// HashMap<Key,Value>
		HashMap<String,Integer> map = new HashMap<>();
		map.put("D", 20); //O(1)
		map.put("A", 10);
		map.put("C", 15);
		map.put("E", 5);
		map.put("B", 20);
		map.put("F", null);
		
		System.out.println(map.get("C")); //O(1)
		System.out.println(map.get("X"));
		
		map.put("C", 14);
		System.out.println(map.get("C"));
		System.out.println(map.get("B"));
		System.out.println(map.get("D"));
		System.out.println(map.get("F"));
		
		System.out.println(map.containsKey("F")); //O(1)
		System.out.println(map.containsKey("Z"));
		System.out.println(map.size());
		map.remove("F"); //O(1)
		map.remove("X");
		System.out.println(map.size()); //O(1)
		System.out.println(map.containsKey("B"));
		
		Set<String> keys = map.keySet(); //O(n)
		System.out.println(keys);
//		
//		ArrayList<String> al = new ArrayList<>(keys);
//		System.out.println(al);
		
		for(String key:map.keySet()) {
			int val = map.get(key);
			System.out.println(key+"->"+val);
		}
		
	}

}
