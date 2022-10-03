package BFS;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public class No28 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		boolean[] checked = new boolean[n];
		List<ArrayList<Integer>> lists = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			int u = sc.nextInt();
			int k = sc.nextInt();
			ArrayList<Integer> list = new ArrayList<Integer>();
			for (int j = 0; j < k; j++) {
				int v = sc.nextInt();
				list.add(v-1);
			}
			lists.add(list);
		}
		List<Integer> distance = new ArrayList<Integer>();
		for (int i = 0; i < n; i++) {
			distance.add(-1);
		}
		distance.set(0, 0);
		Queue<Integer> queue = new ArrayDeque<Integer>();
		queue.add(0);
		checked[0] = true;
		while(!queue.isEmpty()) {
			int num = queue.poll();
			for (int edge : lists.get(num)) {
				if (!checked[edge]) {
					checked[edge] = true;
					distance.set(edge, distance.get(num) + 1);
					queue.add(edge);
				} 
			}
		}
		for (int i = 0; i < n; i++) {
			System.out.println(i+1 + " " + distance.get(i));
		}
	}
}
