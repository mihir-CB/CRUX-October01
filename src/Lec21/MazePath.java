package Lec21;

import java.util.ArrayList;

public class MazePath {

	public static void main(String[] args) {
		ArrayList<String> res = mazePath(0,0,2,2);
		System.out.println(res);
	}
	
	public static ArrayList<String> mazePath(int cr, int cc, int er, int ec){
		ArrayList<String> res = new ArrayList<>();
		if(cr==er && cc==ec) {
			res.add("");
			return res;
		}
		if(cr>er || cc>ec) {
			return res;
		}
		
		// R
		ArrayList<String> rr1 = mazePath(cr,cc+1,er,ec);
		for(String s:rr1) {
			res.add("R"+s);
		}
		
		// D
		ArrayList<String> rr2 = mazePath(cr+1,cc,er,ec);
		for(String s:rr2) {
			res.add("D"+s);
		}
		return res;
	}

}
