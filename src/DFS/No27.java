package DFS;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;
import java.util.Scanner;

public class No27 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int w = sc.nextInt();
		int h = sc.nextInt();
		List<Integer> counts = new ArrayList<Integer>();
		int[][] table = new int[h][w];
		List<Point> list = new ArrayList<Point>();
		boolean[][] checked = new boolean[h][w];
		for (int i = 0; i < h; i++) {
			for (int j = 0; j < w; j++) {
				table[i][j] = sc.nextInt();
				if (table[i][j] == 1) {
					list.add(new Point(i, j));
				}
			}
		}
		int[] dx = {0,1,0,-1};
		int[] dy = {1,0,-1,0};
		for (Point p : list) {
			if (checked[p.x][p.y]) continue;
			Deque<Point> stack = new ArrayDeque<Point>();
			stack.addFirst(p);
			checked[p.x][p.y] = true;
			while (!stack.isEmpty()) {
				Point P = stack.removeFirst();
				for (int i = 0; i < 4; i++) {
					int x = P.x + dx[i];
					int y = P.y + dy[i];
					if (x >= 0 && x < h && y >= 0 && y < w) {
						if (!checked[x][y] && table[x][y] == 1) {
							stack.add(new Point(x, y));
							checked[x][y] = true;
						}
					}
				}
			}
			int cnt = 0;
			for (int i = 0; i < h; i++) {
				for (int j = 0; j < w; j++) {
					if (checked[i][j]) cnt++;
				}
			}
			counts.add(cnt);
		}
		for (int cnt : counts) {
			System.out.println(cnt);
		}
	}
}
