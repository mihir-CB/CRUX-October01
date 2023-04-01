package Lec35;

public class HashmapClient {

	public static void main(String[] args) {
		HashMap<String,Integer> map = new HashMap();
		map.put("ABC", 10);
		map.put("DEF", 20);
		map.put("GHI", 50);
		map.put("ABC", 15);
		map.put("DEF", 20);
		
		System.out.println(map.get("ABC"));
		
		System.out.println(map.size());
		
	}

}
