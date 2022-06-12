package paiza;

import java.util.Scanner;

public class B062 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int H = sc.nextInt();
		int W = sc.nextInt();
		int ans = 0;
		String[][] table = new String[H][W];
		for (int i = 0; i < H; i++) {
			String S = sc.next();
			table[i] = S.split("");
		}
		int dir = 0; //0 right 1 down 2 left 3 up
		int nowH = 0;
		int nowW = 0;
		for (int i = 0; i < N; i++) {
			
			if (dir == 0) {
				//System.out.println("nowH,nowW = " + nowH + " " + nowW);
				if (nowW == W || table[nowH][nowW].equals("*")) {
					nowW--;
					nowH++;
					dir++;
					i--;
					continue;
				}
				if (table[nowH][nowW].equals("#")) {
					ans++;
				}
				//System.out.println(table[nowH][nowW]);
				table[nowH][nowW] = "*";
				nowW++;
			} else if (dir == 1) {
				//System.out.println("nowH,nowW = " + nowH + " " + nowW);
				if (nowH == H || table[nowH][nowW].equals("*")) {
					nowH--;
					nowW--;
					dir++;
					i--;
					continue;
					
				}
				if (table[nowH][nowW].equals("#")) {
					ans++;
				}
				//System.out.println(table[nowH][nowW]);
				table[nowH][nowW] = "*";
				nowH++;
			} else if (dir == 2) {
				//System.out.println("nowH,nowW = " + nowH + " " + nowW);
				if (nowW == -1 || table[nowH][nowW].equals("*")) {
					nowW++;
					nowH--;
					dir++;
					i--;
					continue;
				}
				if (table[nowH][nowW].equals("#")) {
					ans++;
				}
				//System.out.println(table[nowH][nowW]);
				table[nowH][nowW] = "*";
				nowW--;
			} else if (dir == 3) {
				//System.out.println("nowH,nowW = " + nowH + " " + nowW);
				if (nowH == -1 || table[nowH][nowW].equals("*")) {
					nowH++;
					nowW++;
					dir = 0;
					i--;
					continue;
				}
				if (table[nowH][nowW].equals("#")) {
					ans++;
				}
				//System.out.println(table[nowH][nowW]);
				table[nowH][nowW] = "*";
				nowH--;
			}
		}
		System.out.println(ans);
	}
}
