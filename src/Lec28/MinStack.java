package Lec28;

import Lec26.Stack;

public class MinStack extends Stack {
	private int min;

	public MinStack(int cap) {
		super(cap);
	}

	@Override
	public void push(int ele) throws Exception {
		if (isEmpty()) {
			super.push(ele);
			min = ele;
			return;
		}
		if (ele < min) {
			// special case
			int X = 2 * ele - min;
			super.push(X);
			min = ele;

		} else {
			super.push(ele);
		}
	}

	@Override
	public int pop() throws Exception {
		if (isEmpty()) {
			throw new Exception("Stack is Empty");
		}
		int ele = super.pop();
		if (ele < min) {
			// special case
			int X = ele;
			int curr = min;
			int prev = 2 * curr - X;
			min = prev;
			return curr;
		} else {
			return ele;
		}
	}

	@Override
	public int peek() throws Exception {
		if (isEmpty()) {
			throw new Exception("Stack is Empty");
		}
		int ele = super.peek();
		if(ele<min) {
			// special case
			return min;
		}else {
			return ele;
		}
	}

	public int min() throws Exception {
		if (isEmpty()) {
			throw new Exception("Stack is Empty");
		}
		return min;
	}
}
