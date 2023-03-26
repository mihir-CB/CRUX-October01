package Lec34;

import java.util.PriorityQueue;

public class HeapQPS {

	public static void main(String[] args) {
		int[] arr = {20,30,60,50,10,55,57,40};
		topK(arr,3);

	}

	private static void topK(int[] arr, int k) {
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		
		for(int i=0;i<arr.length;i++) {
			if(pq.size()<k) {
				pq.add(arr[i]);
			}else {
				if(pq.peek()<arr[i]) {
					pq.remove();
					pq.add(arr[i]);
				}
			}
		}
		System.out.println(pq);
	}

}
