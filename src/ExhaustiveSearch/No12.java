package ExhaustiveSearch;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
//bit全探索
public class No12 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int ans = 0;
		int[][] relations = new int[N+1][N+1];
		for (int i = 0 ; i < M; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			relations[x][y] = 1;
			relations[y][x] = 1;
		}
		int[] list = new int[N+1];
		for (int i = 1; i <= N; i++) {
			list[i] = i;
		}
		for (int i = 0; i < Math.pow(2, N); i++) {
			List<Integer> array = new ArrayList<Integer>();
			for (int j = 0; j < N; j++) {
				if ((1 & i >> j) == 1) { //>>は2進数ビットシフト。 4(100)>>1は　(10)。
					array.add(list[j+1]);
				}
			}
			//for (int num : array) {
			//	System.out.print(num + " ");
			//}
			//System.out.println(""); 2ビット探索を確認。
			if (isGroup(relations, (ArrayList)array) && array.size() > ans) {
				ans = array.size();
			}
		}
		System.out.println(ans);
	}
	
	static boolean isGroup(int[][] relations, ArrayList<Integer> group) {
		for (int i = 0; i < group.size(); i++) {
			for (int j = 0; j < i; j++) {
				if (relations[group.get(j)][group.get(i)] == 0) {
					return false;
				}
			}
		}
		return true;
	}
}
