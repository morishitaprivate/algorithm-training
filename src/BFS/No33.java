package BFS;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class No33 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		int W = sc.nextInt();
		int sx = 0, sy = 0, gx = H-1, gy = W-1;
		char[][] table = new char[H][W];
		boolean[][] checked = new boolean[H][W];
		int firstCnt = 0;
		boolean goal = false;
		for (int i = 0; i < H; i++) {
			String s = sc.next();
			table[i] = s.toCharArray();
			for (int j = 0; j < W; j++) {
				if (table[i][j] == '#') {
					firstCnt++;
				}
			}
		}
		int[] dx = {0,1,0,-1};
		int[] dy = {1,0,-1,0};
		Queue<Point> queue = new ArrayDeque<Point>();
		queue.add(new Point(sx, sy));
		checked[sx][sy] = true;
		int depth = 0;
		while(!queue.isEmpty()) {
			for (int a = queue.size(); a > 0; a--) {
				Point p = queue.poll();
				if (p.x == gx && p.y == gy) {
					goal = true;
					queue.clear();
					break;
				}
				for (int i = 0; i < 4; i++) {
					int x = p.x + dx[i];
					int y = p.y + dy[i];
					if (x >= 0 && x < H && y >= 0 && y < W) {
						if (!checked[x][y] && table[x][y] == '.') {
							queue.add(new Point(x, y));
							checked[x][y] = true;
						}
					}
				}
			}
			depth++;
		}
		if (goal) {
			System.out.println(H*W - firstCnt - depth);
		} else {
			System.out.println(-1);
		}
	}
}
