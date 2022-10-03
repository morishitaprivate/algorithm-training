package DFS;
// check it on https://atcoder.jp/contests/atc001/tasks/dfs_a

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Basic2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		int W = sc.nextInt();
		int sx = 0, sy = 0, gx = 0, gy = 0;
		char[][] table = new char[H][W];
		boolean[][] checked = new  boolean[H][W];
		for (int i = 0; i < H; i++) {
			table[i] = sc.next().toCharArray();
			for (int j = 0; j < W; j++) {
				if (table[i][j] == 's') {
					sx = i;
					sy = j;
				}
				if (table[i][j] == 'g') {
					gx = i;
					gy = j;
				}
			}
		}
		
		int[] dx = {1,0,-1,0};
		int[] dy = {0,-1,0,1};
		Deque<Point> stack = new ArrayDeque<Point>();
		stack.addFirst(new Point(sx, sy));
		checked[sx][sy] = true;
		while (!stack.isEmpty()) {
			Point point = stack.removeFirst();
			for (int i = 0; i < 4; i++) {
				int x = point.x + dx[i];
				int y = point.y + dy[i];
				if (x >= 0 && x < H && y >= 0 && y < W) {
					if (checked[x][y] == false && table[x][y] != '#') {
						stack.add(new Point(x,y));
						checked[x][y] = true;
					}
				}
			}
		}
		if (checked[gx][gy] == true) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}
