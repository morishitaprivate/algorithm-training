package DFS;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;
import java.util.Scanner;

import org.omg.CORBA.DynamicImplementation;

public class No25＿2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			List<Point> list = new ArrayList<Point>();
			int cnt = 0;
			int w = sc.nextInt();
			int h = sc.nextInt();
			if (h == 0 && w == 0) break;
			int[][] table = new int[h][w];
			boolean[][] checked = new boolean[h][w];
			for (int i = 0; i < h; i++) {
				for (int j = 0; j < w; j++) {
					table[i][j] = sc.nextInt();
					if (table[i][j] == 1) {
						list.add(new Point(i, j));
					}
				}
			}
			int[] dx = {0,1,1,1,0,-1,-1,-1};
			int[] dy = {1,1,0,-1,-1,-1,0,1};
			for (Point p : list) {
				if (checked[p.x][p.y]) continue;
				Deque<Point> stack = new ArrayDeque<Point>();
				stack.addFirst(p);
				checked[p.x][p.y] = true;
				while(!stack.isEmpty()) {
					Point P = stack.removeFirst();
					for (int i = 0; i < 8; i++) {
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
				cnt++;
			}
			System.out.println(cnt);
		}
	}
}
