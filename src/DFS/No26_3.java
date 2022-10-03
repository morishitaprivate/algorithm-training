package DFS;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;
import java.util.Scanner;

public class No26_3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int Q = sc.nextInt();
		List<ArrayList<Integer>> lists = new ArrayList<ArrayList<Integer>>();
		for (int i = 0; i < N; i++) {
			lists.add(new ArrayList<Integer>());
		}
		List<Long> score = new ArrayList<Long>();
		for (int i = 0; i < N; i++) {
			score.add(0L);
		}
		for (int i = 0; i < N-1; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			lists.get(a-1).add(b-1);
			lists.get(b-1).add(a-1);//これが必要らしい。
		}
		for (int i = 0; i < Q; i++) {
			int p = sc.nextInt();
			long x = sc.nextLong();
			score.set(p-1, score.get(p-1) + x);
		}
		Deque<Integer> stack = new ArrayDeque<Integer>();
		boolean[] checked = new boolean[N];
		stack.addFirst(0);
		checked[0] = true;
		while(!stack.isEmpty()) {
			int tmp = stack.removeFirst();
			for (int n : lists.get(tmp)) {
				if (!checked[n]) {
					stack.addFirst(n);
					score.set(n, score.get(n) + score.get(tmp));
					checked[n] = true;
				}
			}
		}
		for (long l : score) {
			System.out.print(l + " ");
		}
	}
}
