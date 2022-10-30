package Lec07;

public class RotateNumber1 {

	public static void main(String[] args) {
		int num = 12345;
		int rot = 100009;
		int nod = 0;
		int backup = num;
		
		while(num!=0) {
			num/=10;
			nod++;
		}
		
		num=backup;
		System.out.println(nod);
		System.out.println(num);
		System.out.println("---------");
		
		rot=rot%nod;
		System.out.println(rot);
		int r=0;
		while(r<rot) {
			//Rotation
			int last = num%10;
			int remNum=num/10;
			int rotatedNumber = last*(int)Math.pow(10, nod-1)+remNum;
			System.out.println(r+1+" "+rotatedNumber);
			num=rotatedNumber;
			r++;
		}
		System.out.println("-------------");
		System.out.println(num);
	}

}
