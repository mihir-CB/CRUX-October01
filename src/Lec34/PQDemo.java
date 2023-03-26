package Lec34;

import java.util.Collections;
import java.util.PriorityQueue;

public class PQDemo {

	public static void main(String[] args) {
		PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
		pq.add(10);
		pq.add(20);
		pq.add(100);
		pq.add(5);
		pq.add(25);
		
		System.out.println(pq);
		
		System.out.println(pq.remove());
		System.out.println(pq.remove());
		System.out.println(pq.remove());
		System.out.println(pq.remove());
		System.out.println(pq.remove());
		System.out.println("_____________________");
		minHeap<Integer> heap = new minHeap<>();
		heap.add(10);
		heap.add(20);
		heap.add(100);
		heap.add(5);
		heap.add(25);
		
		heap.display();
		
		System.out.println(heap.remove());
		System.out.println(heap.remove());
		System.out.println(heap.remove());
		System.out.println(heap.remove());
		System.out.println(heap.remove());
		
		
	}

}
