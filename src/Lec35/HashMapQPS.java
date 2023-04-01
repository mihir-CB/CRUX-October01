package Lec35;

import java.util.HashMap;

public class HashMapQPS {

	public static void main(String[] args) {
		int[] arr1 = {30,20,40,50,70,30,20,20,50,50};
		int[] arr2 = {50,80,30,20,20,20,90,50,20,50,50,50,50};
		
//		intersectionOf2Arrays(arr1,arr2);
		
		
		int[] arr = {2,12,9,16,10,5,3,20,21,11,1,8,6};
		printConsecutiveNumbers(arr);
	}

	private static void printConsecutiveNumbers(int[] arr) {
		HashMap<Integer,Boolean> map = new HashMap<>();
		for(int i=0;i<arr.length;i++) {
			if(map.containsKey(arr[i]-1)) {
				map.put(arr[i], false);
			}else {
				map.put(arr[i],true);
			}
			if(map.containsKey(arr[i]+1)) {
				map.put(arr[i]+1, false);
			}
		}
		int msp=-1;
		int mc=0;
		for(int key:map.keySet()) {
			if(map.get(key)) {
				int temp=key;
				int c=0;
				while(map.containsKey(temp)) {
					c++;
					temp++;
				}
				if(mc<c) {
					msp=key;
					mc=c;
				}
			}
		}
		for(int i=0;i<mc;i++) {
			System.out.print(msp+i+"->");
		}
		System.out.println();
	}

	private static void intersectionOf2Arrays(int[] arr1, int[] arr2) {
		HashMap<Integer,Integer> map = new HashMap<>();
		for(int i=0;i<arr1.length;i++) {
			map.put(arr1[i], map.getOrDefault(arr1[i],0)+1);
		}
		for(int i=0;i<arr2.length;i++) {
			if(map.containsKey(arr2[i]) && map.get(arr2[i])>0) {
				System.out.println(arr2[i]);
				map.put(arr2[i], map.get(arr2[i])-1);
			}
		}
//		System.out.println(map);
	}

}
