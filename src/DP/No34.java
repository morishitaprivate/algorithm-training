package DP;

import java.util.Scanner;

public class No34 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long[] dp = new long[50];
		dp[0] = 1;
		dp[1] = 1;
		for (int i = 2; i <= N; i++) {
			dp[i] = dp[i-1] + dp[i-2];
		}
		System.out.println(dp[N]);
	}
}
