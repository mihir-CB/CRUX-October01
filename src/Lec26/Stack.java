package Lec26;

public class Stack {

	protected int[] arr;
	private int tos;
	
	public Stack() {
		arr = new int[5];
		tos = -1;
	}
	
	public Stack(int cap){
		arr = new int[cap];
		tos = -1;
	}
	
	public int size() { // O(1) 
		return tos+1;
	}
	
	public boolean isEmpty() { // O(1)
		return (this.size()==0);
	}
	
	public boolean isFull() { // O(1)
		return (this.size()==arr.length);
	}
	
	public void push(int ele) throws Exception{ // O(1)
		if(isFull()) {
			throw new Exception("Cannot push as Stack is full");
		}
		tos=tos+1;
		arr[tos]=ele;
	}
	
	public int peek() throws Exception{ // O(1)
		if(isEmpty()) {
			throw new Exception("Cannot peek as Stack is Empty");
		}
		return arr[tos];
	}
	
	public int pop() throws Exception{ // O(1)
		if(isEmpty()) {
			throw new Exception("Cannot remove as Stack is Empty");
		}
		int ele = arr[tos];
		arr[tos]=0;
		tos--;
		return ele;
	}
	
	public void display() { // O(n)
		System.out.print("TOP:");
		for(int i=tos;i>=0;i--) {
			System.out.print(arr[i]+"->");
		}
		System.out.println("___________");
	}
}
