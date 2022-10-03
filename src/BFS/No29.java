package BFS;

import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map;
import java.util.Queue;
import java.util.Scanner;

public class No29 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		int H = sc.nextInt();
		int W = sc.nextInt();
		int sx = sc.nextInt();
		int sy = sc.nextInt();
		int gx = sc.nextInt();
		int gy = sc.nextInt();
		char[][] table = new char[H][W];
		boolean[][] checked = new boolean[H][W];
		for (int i = 0; i < H; i++) {
			String S = sc.next();
			table[i] = S.toCharArray();
		}
		int[] dx = {0,1,0,-1};
		int[] dy = {1,0,-1,0};
		Queue<Point> queue = new ArrayDeque<Point>();
		queue.add(new Point(sx-1, sy-1));
		checked[sx-1][sy-1] = true;
		int cnt = 0;
		while(!queue.isEmpty()) {
			for (int a = queue.size(); a > 0; a--) {
				Point p = queue.poll();
				if (p.x == gx-1 && p.y == gy-1) {
					System.out.println(cnt);
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
			cnt++;
		}
		//System.out.println(map.get(10*(gx-1) + gy-1));
		
	}
}
