package Lec22;

public class QueenBacktracking {

	static int count=0;
	public static void main(String[] args) {
		int n = 5;
		int q = 3;
//		placeWRTQueen(q,"",new boolean[n]);
//		placeWRTBox(0, n, "", new boolean[q]);
		place2D(0,0,"",3,2,2);
		System.out.println(count);
	}

	public static void placeWRTBox(int box, int n, String ans, boolean[] qVis) {
		if (box == n) {
			for (int i = 0; i < qVis.length; i++) {
				if (!qVis[i]) {
					return;
				}
			}
			count++;
			System.out.println(ans);
			return;
		}

		// include
		for (int i = 0; i < qVis.length; i++) {
			if (!qVis[i]) {
				qVis[i] = true;
				placeWRTBox(box + 1, n, ans + "-" + box + "->" + i, qVis);
				qVis[i] = false;
			}
		}

		// exclude
		placeWRTBox(box + 1, n, ans, qVis);
	}

	public static void placeWRTQueen(int noq, String ans, boolean[] vis) {
		if (noq == 0) {
			count++;
			System.out.println(ans);
			return;
		}
		for (int i = 0; i < vis.length; i++) {
			if (!vis[i]) {
				vis[i] = true;
				placeWRTQueen(noq - 1, ans + "-" + i, vis);
				vis[i] = false;
			}
		}

	}
	
	public static void place2D(int cr, int cc, String ans, int noq, int er, int ec) {
		if(noq==0) {
			System.out.println(ans);
			return;
		}
		if(cc==ec) {
			cc=0;
			cr++;
		}
		if(cr==er) {
			return;
		}
		
		// include 
		place2D(cr,cc+1,ans+"{"+cr+","+cc+"}",noq-1,er,ec);
		
		// exclude
		place2D(cr,cc+1,ans,noq,er,ec);
		
	}

}
