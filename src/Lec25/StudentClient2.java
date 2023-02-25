package Lec25;

import javax.management.RuntimeErrorException;

public class StudentClient2 {

	public static void main(String[] args) {
		Student s = new Student();
		System.out.println("Hi");
		int age = -10;
		try {
			s.setAge(age);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
			System.out.println("in exception");
		} finally {
			System.out.println(age);
		}
		if(age<0)
		System.out.println("Bye");
		
//		fun1();
	}

	public static void fun1() {
		System.out.println("in" + 1);
		fun2();
		System.out.println("out" + 1);
	}

	public static void fun2() {
		System.out.println("in" + 2);
		try {
			fun3();
		} catch (RuntimeException r) {
			System.out.println("Runtime Exception");
		} catch (Exception e) {
			System.out.println("Gadbad hogyi");
		}
		System.out.println("out" + 2);
	}

	public static void fun3() throws RuntimeException, Exception {
		System.out.println("in" + 3);
		if ((int) (100 * Math.random()) % 2 == 0) {
			throw new Exception("Ahhhhhhhhhh");
		} else {
			throw new RuntimeException("Runtime");
		}
	}

}
