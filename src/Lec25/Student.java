package Lec25;

public class Student {
	// data members
	private String name = "Bacha Singh";
	private int age = 110;

	static private int count;

	public Student() {
		name = "Facha Singh";
		age = 105;
		count++;
	}

	public Student(String name, int age) {
		this.name = name;
		this.age = age;
		count++;
	}

	public Student(String name) {
		this.name = name;
		this.age = 5;
		count++;
	}

	// methods
	public void intro() {
		System.out.println("My name is " + this.name + " and I am " + this.age + " years old");
	}

	static {
		System.out.println("first");
		count = 0;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return this.name;
	}

	public int getAge() {
		return this.age;
	}

	public static int getCount() {
		return count;
	}

}
