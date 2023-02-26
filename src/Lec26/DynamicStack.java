package Lec26;

public class DynamicStack extends Stack {
	@Override
	public void push(int ele) throws Exception {
		if (this.isFull()) {
			int[] big = new int[arr.length * 2];
			for (int i = 0; i < arr.length; i++) {
				big[i] = arr[i];
			}
			arr = big;
		}
		super.push(ele);
	}
}
