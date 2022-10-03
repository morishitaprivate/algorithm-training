package DFS;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;
import java.util.Scanner;

public class No26_4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int Q = sc.nextInt();
		boolean[] checked = new boolean[N];
		List<ArrayList<Integer>> lists = new ArrayList<ArrayList<Integer>>();
		List<Integer> score = new ArrayList<Integer>();
		for (int i = 0; i < N; i++) {
			ArrayList<Integer> list = new ArrayList<Integer>();
			lists.add(list);
			score.add(0);
		}
		for (int i = 0; i < N-1; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			lists.get(a-1).add(b-1);
			lists.get(b-1).add(a-1);
		}
		for (int i = 0; i < Q; i++) {
			int p = sc.nextInt();
			int x = sc.nextInt();
			score.set(p-1, score.get(p-1) + x);
		}
//		for (int result : score) {
//			System.out.print(result + " ");
//		}
//		System.out.println("");
		Deque<Integer> stack = new ArrayDeque<Integer>();
		stack.addFirst(0);
		checked[0] = true;
		while(!stack.isEmpty()) {
			int num = stack.removeFirst();
			for (int n : lists.get(num)) {
				if (!checked[n]) {
					score.set(n, score.get(n) + score.get(num));
					stack.add(n);
					checked[n] = true;
				}
			}
		}
		for (int result : score) {
			System.out.print(result + " ");
		}
	}
}
