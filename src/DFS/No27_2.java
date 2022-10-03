package DFS;

import java.util.HashMap;
import java.util.Scanner;

import javax.naming.spi.ResolveResult;

public class No27_2 {
	
	static Scanner sc = new Scanner(System.in);
	static int w = sc.nextInt();
	static int h = sc.nextInt();
	
	public static void main(String[] args) {
		int[][] table = new int[h][w];
		for (int i = 0; i < h; i++) {
			for (int j = 0; j < w; j++) {
				table[i][j] = sc.nextInt();
			}
		}
		int ans = 0;
		for (int i = 0; i < h; i++) {
			for (int j = 0; j < w; j++) {
				if (table[i][j] == 1) {
					boolean[][] checked = new boolean[h][w];
					checked[i][j] = true;
					ans = Math.max(ans, dfs(i, j, checked, table));
				}
			}
		}
		System.out.println(ans);
	}
	
	static int dfs (int x, int y, boolean[][] checked, int[][] table) {
		int result = 0;
		int[] dx = {0,1,0,-1};
		int[] dy = {1,0,-1,0};
		for (int i = 0; i < 4; i++) {
			int nx = x + dx[i];
			int ny = y + dy[i];
			if (nx >= 0 && nx < h && ny >= 0 && ny < w) {
				if (!checked[nx][ny] && table[nx][ny] == 1) {
					checked[nx][ny] = true;
					result = Math.max(result, dfs(nx, ny, checked, table));
					checked[nx][ny] = false; // 別ルートで同じマスにたどり着いた場合に、そのルートでは探索していないことにしなければならない。
				}
			}
		}
		return result + 1;
	}
}
