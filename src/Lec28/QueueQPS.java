package Lec28;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class QueueQPS {

	public static void main(String[] args) {
		Queue<Integer> queue = new LinkedList<>();
		queue.add(10);
		queue.add(20);
		queue.add(30);
		queue.add(40);
		queue.add(50);

//		System.out.println(queue);

//		displayRev(queue,0);

//		System.out.println(queue);

		int[] arr = { 20, -5, 10, 9, -8, -2, 3, 6, -4 };
		firstNegInWindowK(arr, 3);
	}

	public static void displayRev(Queue<Integer> queue, int idx) {
		if (queue.size() == idx) {
			return;
		}
		int ele = queue.remove();
		queue.add(ele);
		displayRev(queue, idx + 1);
		System.out.println(ele);

	}

	public static void Rev(Queue<Integer> queue) {
		if (queue.size() == 0) {
			return;
		}
		int ele = queue.remove();
		Rev(queue);
		queue.add(ele);
	}

	private static void firstNegInWindowK(int[] arr, int k) {
		Queue<Integer> queue = new LinkedList<>();
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < 0) {
				queue.add(i);
			}
		}
		int now = arr.length - k + 1;
		for (int i = 0; i < now; i++) {
			if (!queue.isEmpty() && queue.peek() < i) {
				queue.remove();
			}
			if (!queue.isEmpty() && queue.peek() < (i + k)) {
				System.out.println(arr[queue.peek()]);
			} else {
				System.out.println(0);
			}
		}
	}

}
