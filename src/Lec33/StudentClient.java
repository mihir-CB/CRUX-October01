package Lec33;

import java.util.Comparator;

public class StudentClient {

	public static void main(String[] args) {
		Student s = new Student("Mohit", 18);
//		System.out.println(s);
//		System.out.println(10);
//		System.out.println("ABSSJNInid");

		int[][] arr = { { 10, 20, 30, 40, 50 }, { 60, 80 }, { 90, 110 } };

		Student[] st = new Student[10];
		st[0] = new Student("Mohit", 18);
		st[1] = new Student("Rohit", 19);
		st[2] = new Student("Sohit", 1);
		st[3] = new Student("Pohit", 8);
		st[4] = new Student("Aohit", 0);
		st[5] = new Student("Lohit", 18);
		st[6] = new Student("Lohit", 8);
		st[7] = new Student("Lohit", 218);
		st[8] = new Student("Aohit", 118);
		st[9] = new Student("Bohit", 118);
		Disp(st);

		sort(st, new T());
		sort(arr, new I());
		Disp(st);
	}

//	private static void Disp(Object[] arr) {
//		for(int i=0;i<arr.length;i++) {
//			System.out.print(arr[i]+", ");
//		}
//		System.out.println();
//	}
	static class T implements Comparator<Student> {
		@Override
		public int compare(Student o1, Student o2) {
			return o1.age - o2.age;
		}
	}

	static class I implements Comparator<int[]> {
		@Override
		public int compare(int[] o1, int[] o2) {
			return o1[1] - o2[1];
		}
	}

	private static <T> void Disp(T[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

	private static <T extends Comparable<T>> void sort(T[] arr) {
		for (int c = 0; c < arr.length - 1; c++) {
			for (int i = 0; i < arr.length - 1 - c; i++) {
				if (arr[i].compareTo(arr[i + 1]) > 0) {
					T temp = arr[i];
					arr[i] = arr[i + 1];
					arr[i + 1] = temp;
				}
			}
		}
	}

	private static <T> void sort(T[] arr, Comparator<T> comp) {
		for (int c = 0; c < arr.length - 1; c++) {
			for (int i = 0; i < arr.length - 1 - c; i++) {
				if (comp.compare(arr[i], arr[i + 1]) > 0) {
					T temp = arr[i];
					arr[i] = arr[i + 1];
					arr[i + 1] = temp;
				}
			}
		}
	}

}
