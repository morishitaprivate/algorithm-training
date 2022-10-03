package DFS;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;
import java.util.Scanner;

public class No26_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int Q = sc.nextInt();
		List<Long> score = new ArrayList<Long>();
		List<Long> tmpList = new ArrayList<Long>();
		for (int i = 0; i < N+10; i++) {
			score.add(0L);
			tmpList.add(0L);
		}
		int[][] table = new int[N+10][N+10];
		for (int i = 0; i < N-1; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			table[a][b] = 1;
		}
		for (int i = 0; i < Q; i++) {
			int p = sc.nextInt();
			long x = sc.nextLong();
			tmpList.set(p, tmpList.get(p) + x);
			score.set(p, score.get(p) + x);
		}
		// i=Nは末端のため評価しなくていい
		for (int i = 1; i < N; i++) {
			Deque<Integer> stack = new ArrayDeque<Integer>();
			boolean[] checked = new boolean[N+1];
			stack.addFirst(i);
			checked[i] = true;
			while(!stack.isEmpty()) {
				// for (int n : table[stack.removeFirst()]) {
				int tmp = stack.removeFirst();
				// System.out.println(tmp + "がスタックから除かれました。スタックサイズ:" + stack.size());
				for (int j = tmp+1; j <= N; j++) {
					if (table[tmp][j] == 1 && !checked[j]) {
						stack.addFirst(j);
					// 	System.out.println(j + "がスタックに追加されました。");
						score.set(j, score.get(j) + tmpList.get(i));
						checked[j] = true;
					}
				}
			}
			// System.out.println(i + "が終了。");
			// for (int k = 1; k <= N; k++) {
			// 	System.out.print(score.get(k) + " ");
			// }
			//System.out.println("");
		}
		for (int i = 1; i <= N; i++) {
			System.out.print(score.get(i) + " ");
		}
	}
}
