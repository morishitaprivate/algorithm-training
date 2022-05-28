package ExhaustiveSearch;
//check it on https://atcoder.jp/contests/s8pc-6/tasks/s8pc_6_b

import java.util.Scanner;

public class No8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[][] data = new int[N+1][N+1];
		int sumA = 0;
		int sumB = 0;
		for (int i = 1; i <= N; i++) {
			data[i][0] = sc.nextInt();
			data[i][1] = sc.nextInt();
			sumA += data[i][0];
			sumB += data[i][1];
		}
		long min = 0;
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++) {
				int en,ex;
				int sum = 0;
				if (i == 0) {
					en = sumA / N;
				} else {
					en = sumA / N + 1;
				}
				if (j == 0) {
					ex = sumB / N;
				} else {
					ex = sumB / N + 1;
				}
				for (int k = 1; k <= N; k++) {
					sum += spend(data[k][0], data[k][1], en, ex);
				}
				if (i == 0 && j == 0) {
					min = sum;
				}
				if (sum < min) {
					min = sum;
				}
			}
		}
		System.out.println(min);
	}
	
	static int spend (int A, int B, int en, int ex) {
		return Math.abs(en-A) + (B-A) + Math.abs(ex-B);
	}
}
