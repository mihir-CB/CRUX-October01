package Lec09;

import java.util.Scanner;

public class array_basics {

	public static void main(String[] args) {
		int[] arr = takeInput();
		display(arr);

//		int max = Max(arr);
//		System.out.println("Max element is: " + max);
		
		int idx = find(arr,15);
		System.out.println("Element found at: "+idx);

	}
	
	public static void reverse(int[] arr) {
		
	}
	
	public static void rotate(int[] arr) {
		
	}
	

	public static int find(int[] arr, int element) {
		// Find index of element in an array
		// if not found return -1
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == element) {
				return i;
			}
		}
		return -1;
	}

	public static int Max(int[] arr) {
		int chocolate = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > chocolate) {
				chocolate = arr[i];
			}
		}
		return chocolate;
	}

	public static int[] takeInput() {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter size of the array");
		int n = scn.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter the elements of the array");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scn.nextInt();
		}
		return arr;
	}

	public static void display(int[] arr) {
		System.out.println("--------");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		System.out.println("--------");
	}

}
