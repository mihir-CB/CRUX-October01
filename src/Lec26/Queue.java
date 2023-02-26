package Lec26;

public class Queue {

	protected int[] arr;
	protected int front;
	protected int size;

	public Queue() {
		arr = new int[5];
		size = 0;
		front = 0;
	}

	public Queue(int cap) {
		arr = new int[cap];
		size = 0;
		front = 0;
	}

	public int size() {
		return this.size;
	}

	public boolean isEmpty() {
		return (this.size() == 0);
	}

	public boolean isFull() {
		return (this.size() == arr.length);
	}

	public void enqueue(int ele) throws Exception {
		if(this.isFull()) {
			throw new Exception("Queue is Full");
		}
		int rear = (front+size)%arr.length;
		arr[rear]=ele;
		size++;
	}

	public int dequeue() throws Exception {
		if (this.isEmpty()) {
			throw new Exception("Queue is Empty");
		}
		int ele = arr[front];
		arr[front]=0;
		front=(front+1)%arr.length;
		size--;
		return ele;
	}

	public int peek() throws Exception {
		if (this.isEmpty()) {
			throw new Exception("Queue is Empty");
		}
		return arr[front];
	}

	public void display() {
		System.out.print("FRONT:");
		for (int i = front; i<(front+size); i++) {
			System.out.print(arr[i%arr.length]+"->");
		}
		System.out.println("_______________");
	}

}
