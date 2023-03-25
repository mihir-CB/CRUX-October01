package Lec33;

public class A implements I1 {

	@Override
	public void fun() {
		System.out.println("In fun");
	}

	@Override
	public int fun2() {
		return 2;
	}

	public int funA() {
		System.out.println("in funA");
		return 100;
	}

}
