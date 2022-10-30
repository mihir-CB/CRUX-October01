package Lec07;

public class Rotate2 {

	public static void main(String[] args) {
		int num = 12345;
		int rot = 10;
		int nod = 0;
		int backup = num;
		while (num != 0) {
			num /= 10;
			nod++;
		}
		num=backup;
		rot %= nod;
		int part1 = num / (int) (Math.pow(10, rot));
		int part2 = num % (int) (Math.pow(10, rot));
		
		// part2 ko aage khiskana
		int rotatedNum = part2*(int) (Math.pow(10, nod-rot))+part1;
		
		System.out.println(rotatedNum);
	}

}
