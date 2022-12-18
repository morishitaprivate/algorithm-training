package Contest274;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public class atcoderD {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int x = sc.nextInt();
		int y = sc.nextInt();
		boolean[][] checked = new boolean[20000][20000];
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < N; i++) {
			list.add(sc.nextInt());
		}
		Queue<Point> queue = new ArrayDeque<Point>();
		queue.add(new Point(0, 0));
		checked[0+10000][0+10000] = true;
		int cnt = 0;
		int[] dx = {1,0,-1,0};
		int[] dy = {0,-1,0,1};
//		Point prevP = new Point(10000, 10000);
		while(!queue.isEmpty()) {
			int size = queue.size();
//			System.out.println("PrevP = " + prevP.x + ", " + prevP.y);
			for (int a = 0; a < size; a++) {
				Point p = queue.poll();
				for (int i = 0; i < 4; i++) {
					int X = p.x + dx[i]*list.get(cnt);
					int Y = p.y + dy[i]*list.get(cnt);
//					if (X != prevP.x && Y != prevP.y) {
					queue.add(new Point(X, Y));
//					System.out.println("X=" + X + " Y=" + Y);
					if (cnt == N-1) checked[X+10000][Y+10000] = true;
//					}
				}
//				prevP = p;
			}
//			System.out.println("");
			if (cnt == N-1) break;
			cnt++;
		}
		if (checked[x+10000][y+10000]) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}

class Point {
	int x;
	int y;
	Point (int x, int y) {
		this.x = x;
		this.y = y;
	}
}
