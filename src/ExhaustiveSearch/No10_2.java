package ExhaustiveSearch;

import java.util.HashMap;
import java.util.Scanner;

public class No10_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		HashMap<Integer, Integer> sumData = new HashMap<Integer, Integer>();
		int[] list = new int[N];
		for (int i = 0; i < N; i++) {
			list[i] = sc.nextInt();
		}
		for (int i = 0; i < Math.pow(2, N); i++) {
			int sum = 0;
			for (int j = 0; j < N; j ++) {
				if ((1 & i >> j) == 1) {
					sum += list[j];
				}
			}
			sumData.put(sum,1);
		}
		int q = sc.nextInt();
		for (int i = 0; i < q; i++) {
			int m = sc.nextInt();
			if (sumData.containsKey(m)) {
				System.out.println("yes");
			} else {
				System.out.println("no");
			}
		}
	}
}
