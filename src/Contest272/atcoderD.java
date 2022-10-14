package Contest272;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;
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

public class atcoderD {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int[][] table = new int[N][N];
		boolean[][] checked = new boolean[N][N];
		List<Integer> dx = new ArrayList<Integer>();
		List<Integer> dy = new ArrayList<Integer>();
		for (int i = -N; i < N+1; i++) {
			for (int j = -N; j < N+1; j++) {
				if (i * i + j * j == M) {
					dx.add(i);
					dy.add(j);
				}
			}
		}
		Queue<Point> queue = new ArrayDeque<Point>();
		queue.add(new Point(0,0));
		checked[0][0] = true;
		table[0][0] = 0;
		int size = dx.size(); // =dy.size()
		int depth = 1;
		while(!queue.isEmpty()) {
			for (int a = queue.size(); a > 0; a--) {
				Point p = queue.poll();
				for (int i = 0; i < size; i++) {
					int x = p.x + dx.get(i);
					int y = p.y + dy.get(i);
					if (x >= 0 && x < N && y >= 0 && y < N) {
						if (!checked[x][y]) {
							table[x][y] = depth;
							checked[x][y] = true;;
							queue.add(new Point(x, y));
						}
					}
				}
			}
			depth++;
		}
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				if (!checked[i][j]) {
					System.out.println(-1);
				} else {
					System.out.print(table[i][j] + "  ");
				}
			}
			System.out.println("");
		}
	}
}
