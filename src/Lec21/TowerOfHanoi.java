package Lec21;

public class TowerOfHanoi {

	public static void main(String[] args) {
		toh(4,'A','C','B');

	}
	public static void toh(int n, char src, char dst, char hlp) {
		if(n==0) {
			return;
		}
		// BP: Move n disks from src to dst using hlp
		toh(n-1,src, hlp, dst);
		System.out.println("Move from "+src+" to "+dst);
		toh(n-1,hlp,dst,src);
	}

}
