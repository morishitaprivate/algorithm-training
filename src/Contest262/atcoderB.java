package Contest262;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class atcoderB {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int cnt = 0;
		int[][] table = new int[N+1][N+1];
		for (int i = 0; i < M; i++) {
			int U = sc.nextInt();
			int V = sc.nextInt();
			table[U][V] = 1;
		}
		for (int i = 1; i < N+1; i++) {
			for (int j = 1; j < i; j++) {
				for (int k = 1; k < j; k++) {
					if (judge(k, j, i, table)) {
						cnt++;
					}
				}
			}
		}
		System.out.println(cnt);
	}
	
	static boolean judge(int a, int b, int c, int[][] table) {
		if (table[a][b] == 1 && table[b][c] == 1 && table[a][c] == 1) {
			return true;
		} else {
			return false;
		}
	}
}
