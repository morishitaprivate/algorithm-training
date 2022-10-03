package BFS;

import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map;
import java.util.Queue;
import java.util.Scanner;
import java.util.TreeMap;

public class No30 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		int W = sc.nextInt();
		int N = sc.nextInt();
		int sx=0,sy=0;
		TreeMap<Integer, Point> map = new TreeMap<Integer, Point>();
		char[][] table = new char[H][W];
		for (int i = 0; i < H; i++) {
			String S = sc.next();
			table[i] = S.toCharArray();
			for (int j = 0; j < W; j++) {
				if (table[i][j] == 'S') {
					sx = i;
					sy = j;
				} else if (table[i][j] != 'X' && table[i][j] != 'S' && table[i][j] != '.') {
					map.put(Character.getNumericValue(table[i][j]),new Point(i, j));
				}
			}
		}
		int[] dx = {0,1,0,-1};
		int[] dy = {1,0,-1,0};
		int ans = 0;
		for (int i = 1; i <= N; i++) {
			int gx = map.get(i).x;
			int gy = map.get(i).y;
			int cnt = 0;
			boolean[][] checked = new boolean[H][W];
			Queue<Point> queue = new ArrayDeque<Point>();
			queue.add(new Point(sx, sy));
			checked[sx][sy] = true;
			while(!queue.isEmpty()) {
				for (int a = queue.size(); a > 0; a--) {
					Point p = queue.poll();
					if (p.x == gx && p.y == gy) {
						ans += cnt;
						queue.clear();
						break;
					}
					for (int j = 0; j < 4; j++) {
						int x = p.x + dx[j];
						int y = p.y + dy[j];
						if (x >= 0 && x < H && y >= 0 && y < W) {
							if (!checked[x][y] && table[x][y] != 'X') {
								queue.add(new Point(x, y));
								checked[x][y] = true;
							}
						}
					}
				}
				cnt++;
			}
			sx = gx;
			sy = gy;
		}
		System.out.println(ans);
	}
}
