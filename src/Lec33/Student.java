package Lec33;

public class Student implements Comparable<Student>{
	String Name = "student";
	int age = 10;

	Student(String s, int a) {
		Name = s;
		age = a;
	}
	
	@Override
	public String toString() {
		return Name+" "+age;
	}

	@Override
	public int compareTo(Student o) {
		if(this.Name.compareTo(o.Name)>0) {
			return this.Name.compareTo(o.Name);
		}else {
			return this.age-o.age;
		}
	}
}
