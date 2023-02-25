package Lec26;

public class QueueClient {

	public static void main(String[] args) throws Exception {
		Queue queue = new Queue(6);
		queue.enqueue(1);
		queue.enqueue(2);
		System.out.println(queue.size());
		queue.display();
		queue.enqueue(3);
		queue.display();
		queue.enqueue(4);
		queue.enqueue(5);
		queue.display();
		System.out.println(queue.size());
		
		queue.dequeue();
		queue.dequeue();
		queue.display();
		System.out.println(queue.size());
		System.out.println("PEAK:"+queue.peek());
		
		queue.enqueue(6);
		queue.enqueue(7);
		queue.display();
		queue.enqueue(8);
		
		queue.display();
		
		System.out.println("PEAK:"+queue.peek()+" SIZE:"+queue.size());
		queue.dequeue();
		queue.display();
		queue.dequeue();
		queue.display();

	}

}
