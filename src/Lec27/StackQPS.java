package Lec27;

import java.util.Arrays;
import java.util.Stack;

public class StackQPS {

	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<>();
		stack.add(1);
		stack.add(2);
		stack.add(3);
		stack.add(4);

		System.out.println(stack);

		System.out.println("__________________");
//		displayReverse(stack);
		Stack<Integer> ns = new Stack<>();
//		copyAStack(stack,ns);
		System.out.println(ns);
		System.out.println("__________________");
		reverseCopyAStack(stack, ns);
		System.out.println(ns);
		System.out.println("__________________");

		int[] arr = { 50, 30, 20, 40, 10, 45, 5, 60, 15, 8 };
		int[] narr = nextGreaterOnRight(arr);
		System.out.println(Arrays.toString(narr));

	}

	private static int[] nextGreaterOnRight(int[] arr) {
		int[] res = new int[arr.length];
		Stack<Integer> stack = new Stack<>();
		for (int i = 0; i < arr.length; i++) {
			while (!stack.isEmpty() && arr[stack.peek()] < arr[i]) {
				int idx = stack.pop();
				res[idx] = arr[i];
			}
			stack.push(i);
		}
		while (!stack.isEmpty()) {
			int idx = stack.pop();
			res[idx] = -1;
		}
		return res;
	}

	private static void reverseCopyAStack(Stack<Integer> stack, Stack<Integer> ns) {
		while (!stack.isEmpty()) {
			int ele = stack.pop();
			ns.add(ele);
		}
	}

	private static void copyAStack(Stack<Integer> stack, Stack<Integer> ns) {
		if (stack.isEmpty()) {
			return;
		}
		int ele = stack.pop();
		copyAStack(stack, ns);
		ns.add(ele);
	}

	private static void displayReverse(Stack<Integer> stack) {
		if (stack.isEmpty()) {
			return;
		}
		int ele = stack.pop();
		System.out.println(ele);
		displayReverse(stack);
		stack.add(ele);
	}

}
