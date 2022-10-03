package BFS;
// check it on https://atcoder.jp/contests/atc001/tasks/dfs_a

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;
import java.util.Scanner;


class Point {
	int x;
	int y;
	
	Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
}

public class Basic {
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
					sx = j;
					sy = i;
				}
				if (table[i][j] == 'g') {
					gx = j;
					gy = i;
				}
			}
		}
		
		int[] dx = {1,0,-1,0};
		int[] dy = {0,-1,0,1};
		Queue<Point> queue = new ArrayDeque<Point>();
		queue.add(new Point(sx, sy));
		checked[sy][sx] = true;
		while (!queue.isEmpty()) {
			Point point = queue.remove();
			for (int i = 0; i < 4; i++) {
				int x = point.x + dx[i];
				int y = point.y + dy[i];
				if (x >= 0 && x < W && y >= 0 && y < H) {
					if (checked[y][x] == false && table[y][x] != '#') {
						queue.add(new Point(x,y));
						checked[y][x] = true;
					}
				}
			}
		}
		if (checked[gy][gx] == true) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}
