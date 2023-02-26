package Lec27;

public class C extends P {
	int data = 20;
	int dataC = 200;

	public void fun() {
		System.out.println("In C fun");
	}

	public void funC() {
		System.out.println("In funC");
	}
	
	@Override
	public String toString() {
		return "Mai Bacha hu";
	}
}
