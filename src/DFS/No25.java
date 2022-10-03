package DFS;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;
import java.util.Scanner;

public class No25 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			int w = sc.nextInt();
			int h = sc.nextInt();
			if (w == 0 && h == 0) break;
			List<Point> list = new ArrayList<Point>();
			int[][] table = new int[h][w];
			boolean[][] checked = new boolean[h][w];
			for (int i = 0; i < h; i++) {
				for (int j = 0; j < w; j++) {
					table[i][j] = sc.nextInt();
					if (table[i][j] == 1) {
						list.add(new Point(j, i));
					}
				}
			}
			int ans = 0;
			int[] dx = {1,1,0,-1,-1,-1,0,1};
			int[] dy = {0,1,1,1,0,-1,-1,-1};
			//for (Point p : list) {
			//	System.out.println("x=" + p.x);
			//	System.out.println("y=" + p.y);
			//}
			while (!list.isEmpty()) {
				Point island = list.get(0);
				list.remove(island);
				Deque<Point> stack = new ArrayDeque<Point>();
				stack.addFirst(island);
				checked[island.y][island.x] = true;
				while(!stack.isEmpty()) {
					Point p = stack.removeFirst();
					for (int i = 0; i < 8; i++) {
						int x = p.x + dx[i];
						int y = p.y + dy[i];
						if (x >= 0 && x < w && y >= 0 && y < h) {
							if (!checked[y][x] && table[y][x] == 1) {
								stack.add(new Point(x, y));
								checked[y][x] = true;
								Point removeP = null;
								for (Point pp : list) {
									if (pp.x == x && pp.y == y) {
										removeP = pp;
									}
								}
								list.remove(removeP);
							}
						}
					}
				}
				ans++;
			}
			System.out.println(ans);
		}
	}
}
