package practice;
// https://atcoder.jp/contests/atc001/tasks/dfs_a

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

import org.omg.CORBA.DynamicImplementation;

class Point {
	int x;
	int y;
	Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
}

public class DFSreview {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		int W = sc.nextInt();
		char[][] table = new char[H][W];
		boolean[][] checked = new boolean[H][W];
		int sx=0,sy=0,gx=0,gy=0;
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
		int[] dx = {0,1,0,-1};
		int[] dy = {1,0,-1,0};
		
		Deque<Point> stack = new ArrayDeque<Point>();
		stack.addFirst(new Point(sx, sy));
		checked[sx][sy] = true;
		while (!stack.isEmpty()) {
			Point p = stack.removeFirst();
			for (int i = 0; i < 4; i++) {
				int x = p.x + dx[i];
				int y = p.y + dy[i];
				if (x >= 0 && x < H && y >= 0 && y < W) {
					if (!checked[x][y] && table[x][y] != '#') {
						stack.add(new Point(x, y));
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
