package Lec25;

public class studentClient {

	public static void main(String[] args) {
//		Student s = new Student();
//		System.out.println(s);

//		s.name = "Harsh";
//		s.age = 20;
//
//		System.out.println(s.name + " is " + s.age);
//
//		Student s1 = new Student();
//		s1.name = "Raghav";
//		s1.age = 19;

//		System.out.println(s1.name + " is " + s1.age);
//		System.out.println("--------------");
//		System.out.println(s.name + " vs " + s1.name);
//		System.out.println(s.age + " vs " + s1.age);
//		swap1(s,s1); -> Failed
//		swap2(s, s1); // works
//		System.out.println(s.name + " vs " + s1.name);
//		System.out.println(s.age + " vs " + s1.age);

//		System.out.println("---------------");
//		String myName = "Mihir";
//		int myAge = 22;
////		demo(s, s1.name, s1.age, myName,myAge);
//		System.out.println(s.name + " is " + s.age);
//		System.out.println(s1.name + " is " + s1.age);
//		System.out.println(myName + " is " + myAge);
//		
//		
//		System.out.println("---------------------");
//		
//		s.intro();
//		s1.intro();
//		
//		Student s2 = new Student();
//		s2.intro();
		
//		Student s = new Student("Billu Sanda", 305);
//		s.setName("Munna");
//		s.setAge(60);
//		s.intro();
		
		Student[] studs = new Student[10];
		
//		System.out.println(studs[0]);
		
		for(int i=0;i<10;i++) {
			studs[i]=new Student();
		}
		
		System.out.println(Student.getCount());
		
	}

	public static void swap1(Student s1, Student s2) {
		Student temp = s1;
		s1 = s2;
		s2 = temp;
	}

	public static void swap2(Student s1, Student s2) {
		String temp = s1.name;
		s1.name = s2.name;
		s2.name = temp;

		int tem = s1.age;
		s1.age = s2.age;
		s2.age = tem;
	}

	public static void demo(Student s, String name, int age, String myName, int myAge) {
		s.name = "";
		s.age=0;
		
		name="";
		age=0;
		
		myName ="";
		myAge = 0;
	}

}
