package Lec26;

public class DynamicQueueClient {

	public static void main(String[] args) throws Exception {
		DynamicQueue dq = new DynamicQueue();
		dq.enqueue(1);
		dq.enqueue(2);
		dq.enqueue(3);
		dq.enqueue(4);
		dq.enqueue(5);
		dq.enqueue(6);
		dq.enqueue(7);
		dq.enqueue(8);
		dq.dequeue();
		dq.display();
	}

}
