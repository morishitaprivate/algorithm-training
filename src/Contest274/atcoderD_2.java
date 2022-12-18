package Contest274;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public class atcoderD_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int x = sc.nextInt();
		int y = sc.nextInt();
		boolean[][] checked = new boolean[30000][30000];
		List<Integer> A = new ArrayList<Integer>();
		for (int i = 0; i < N; i++) {
			A.add(sc.nextInt());
		}
		Queue<Point> queue = new ArrayDeque<Point>();
		queue.add(new Point(A.get(0), 0));
		int count = 1;
		while(!queue.isEmpty()) {
			int size = queue.size();
			for (int a = 0; a < size; a++) {
				Point p = queue.poll();
				if (count % 2 == 1) {
					queue.add(new Point(p.x, p.y+A.get(count)));
					queue.add(new Point(p.x, p.y-A.get(count)));
					if (count == N-1) {
						checked[p.x+10000][p.y+A.get(count)+10000] = true;
						checked[p.x+10000][p.y-A.get(count)+10000] = true;
					}
				} else {
					queue.add(new Point(p.x+A.get(count), p.y));
					queue.add(new Point(p.x-A.get(count), p.y));
					if (count == N-1) {
						checked[p.x+A.get(count)+10000][p.y+10000] = true;
						checked[p.x-A.get(count)+10000][p.y+10000] = true;
					}
				}
			}
			if (count == N-1) break;
			count++;
		}
		if (checked[x+10000][y+10000]) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}
