package DP;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class No37 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		List<Integer> coins = new ArrayList<Integer>();
		for (int i = 0; i < m; i++) {
			coins.add(sc.nextInt());
		}
		int[][] dp = new int[m+1][n+1];
		for (int i = 0; i <= n; i++) {
			dp[0][i] = i;
		}
		for (int i = 0; i < m; i++) {
			int coin = coins.get(i);
			for (int j = 0; j <= n; j++) {
				if (j >= coin) {
					dp[i+1][j] = Math.min(dp[i][j], dp[i+1][j-coin] + 1);
				} else {
					dp[i+1][j] = dp[i][j];
				}
			}
			
		}
		System.out.println(dp[m][n]);
	}
}
