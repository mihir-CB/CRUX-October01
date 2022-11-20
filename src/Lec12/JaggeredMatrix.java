package Lec12;

import java.util.Scanner;

public class JaggeredMatrix {

	public static void main(String[] args) {
		int[][] mat = new int[3][];
		
		Scanner scn = new Scanner(System.in);
		
		System.out.println(mat[0]);
		System.out.println(mat[1]);
		
//		System.out.println(mat[1][2]); Throws null pointer exception

		mat[0]=new int[2];
		System.out.println(mat[0]);
		
		for(int i=0;i<mat.length;i++) {
			int n = scn.nextInt();// kitne cols?
			mat[i]=new int[n];
			for(int j=0;j<n;j++) {
				mat[i][j]=scn.nextInt();
			}
		}
		
		for(int i=0;i<mat.length;i++) {
			for(int c=0;c<mat[i].length;c++) {
				System.out.print(mat[i][c]+" ");
			}
			System.out.println();
		}
		
//		int[][] mat = new int[][3]; -> Invalid
		
		
		
	}

}
