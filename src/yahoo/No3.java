package yahoo;

import java.util.Scanner;

public class No3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		int W = sc.nextInt();
		char[][] table = new char[H][W];
		for (int i = 0; i < H; i++) {
			table[i] = sc.next().toCharArray();
		}
		String T = sc.next();
		for (int i = 0; i < H; i++) {
			for (int j = 0; j < W; j++) {
				int cnt = 0;
				if (table[i][j] == T.charAt(cnt)) {
					cnt++;
					if (cnt == T.length()) break;
					int tmpi = i, tmpj = j;
					while(tmpi + 1 < H) {
						if (table[tmpi+1][tmpj] == T.charAt(cnt)) {
							tmpi++;
							cnt++;
						}
					}
					
				}
			}
		}
	}
}
