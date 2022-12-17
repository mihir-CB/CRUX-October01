package Assignments;

import java.util.Scanner;

public class TargetSumTriplet {

	public static void main(String[] args) {
		 Scanner scn = new Scanner(System.in);
		 int n = scn.nextInt();
		 int[] arr=  new int[n];
		 for(int i=0;i<n;i++) {
			 arr[i]=scn.nextInt();
		 }
		 int target = scn.nextInt();
		 
		 bubble(arr);
		 for(int i=0;i<n;i++) {
			 int target_dash = target - arr[i];
			 int j = i+1;
			 int k = n-1;
			 while(j<k) {
				 int sum = arr[j]+arr[k];
				 if(sum==target_dash) {
					 System.out.println(arr[i]+", "+arr[j]+" and "+arr[k]);
					 j++;
					 k--;
				 }else if(sum>target_dash) {
					 k--;
				 }else {
					 j++;
				 }
			 }
		 }

	}
	public static void bubble(int[] arr) {
		for (int c = 0; c < arr.length - 1; c++) {
			for (int i = 0; i < arr.length - 1 - c; i++) {
				if (arr[i] > arr[i + 1]) {
					int temp = arr[i];
					arr[i] = arr[i + 1];
					arr[i + 1] = temp;
				}
			}
		}
	}

}
