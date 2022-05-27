package ExhaustiveSearch;
//check it on https://atcoder.jp/contests/pakencamp-2019-day3/tasks/pakencamp_2019_day3_c

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class No4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		long ans = 0;
		int[][] scores = new int[N][M];
		long[][] sum = new long[100][100];
		for (int i = 0; i < M; i++) {
			for (int j = 0; j < i; j++) {
				sum[i][j] = 0;
			}
		}
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				int A = sc.nextInt();
				scores[i][j] = A;
			}
		}
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				for (int k = 0; k < j; k++) {
					sum[j][k] += Math.max(scores[i][j], scores[i][k]);
				}
			}
		}
		
		for (int i = 0; i < M; i++) {
			for (int j = 0; j < i; j++) {
				if (sum[i][j] > ans) {
					ans = sum[i][j];
				}
			}
		}
		System.out.println(ans);
	}
}
