package DFS;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class No26 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int Q = sc.nextInt();
		int[][] table = new int[N+1][N+1];
		List<Integer> score = new ArrayList<Integer>();
		for (int i = 1; i < N+1; i++) {
			score.set(i,0);
		}
		for (int i = 0; i < N-1; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			table[a][b] = 1;
		}
		for (int i = 0; i < Q; i++) {
			int p = sc.nextInt();
			int x = sc.nextInt();
			score.set(p,score.get(p) + x);
			boolean[][] checked = new boolean[N+1][N+1];
			for (int j = p+1; j < N+1; j++) {
				if(table[p][j] == 1) {
					Deque<Point> stack = new ArrayDeque<Point>();
					stack.addFirst(new Point(p, j));
					checked[p][j] = true;
					while(!stack.isEmpty()) {
						Point P = stack.removeFirst();
						for (int k = P.y+1; k < N+1; k++) {
							if (table[P.y][k] == 1 && !checked[P.y][k]) {
								stack.add(new Point(P.y, k));
								checked[P.y][k] = true;
							}
						}
					}
				}
			}
		}
	}
}
