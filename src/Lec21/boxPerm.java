package Lec21;

public class boxPerm {

	public static void main(String[] args) {
//		getPerms(4, 2, "", new boolean[4]);
		getComb(4, 2, "", -1);

	}

	public static void getPerms(int box, int noc, String ans, boolean[] vis) {
		if (noc == 0) {
			System.out.println(ans);
			return;
		}
		for (int i = 0; i < box; i++) {
			if (vis[i] == false) {
				vis[i] = true;
				getPerms(box, noc - 1, ans + "b" + i, vis);
				vis[i] = false;
			}
		}
	}

	public static void getComb(int box, int noc, String ans, int lastUsedBox) {
		if (noc == 0) {
			System.out.println(ans);
			return;
		}
		for (int i = lastUsedBox + 1; i < box; i++) {
			getComb(box, noc - 1, ans + "b" + i, i);
		}
	}

}
