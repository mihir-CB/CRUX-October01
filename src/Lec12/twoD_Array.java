package Lec12;

public class twoD_Array {

	public static void main(String[] args) {

		int[][] mat = new int[5][3];

		// Print -> Address Print hojata
		System.out.println(mat);

		System.out.println(mat[0]);
		System.out.println(mat[1]);
		System.out.println(mat[2]);
		System.out.println(mat[3]);
		System.out.println(mat[4]);

		// arr[1]=10
		mat[1][0] = 10;
		mat[1][1] = 20;
		mat[1][2] = 30;

		System.out.println(mat[1][0]);

		// arr.length
		System.out.println(mat.length);
		// rows print ho jaati hai

		// cols print?
		System.out.println(mat[4].length);

		// How many arrays will be created for
		// making one 2D array of size rows*cols?
//		-> row + 1

		System.out.println("___________");
		
		int ntp = 1;
		for (int r = 0; r < mat.length; r++) {
			for (int c = 0; c < mat[r].length; c++) {
				mat[r][c] = ntp;
				ntp++;
			}
		}
		
		
		// Printing -> Row wise
		for(int[] row:mat) {
//			System.out.println(row);
			for(int ele:row) {
				System.out.print(ele+"\t");
			}
			System.out.println();
		}
		
		// Printing -> Col wise
		System.out.println("-------");
		for(int c=0;c<mat[0].length;c++) {
			for(int r=0;r<mat.length;r++) {
				System.out.print(mat[r][c]+" ");
			}
		}

	}

}
