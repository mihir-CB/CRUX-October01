package Lec26;

public class DynamicQueue extends Queue {
	@Override
	public void enqueue(int ele) {
		if (this.isFull()) {
			int[] big = new int[arr.length * 2];
			for (int i = front, j = 0; i < (front + size); i++, j++) {
				big[j] = arr[i % arr.length];
			}
			arr = big;
			front = 0;
		}
		try {
			super.enqueue(ele);
		} catch (Exception e) {
			System.out.println("Heap Memory is full");
		}

	}
}
