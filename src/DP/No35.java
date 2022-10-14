package DP;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

final class Product {
	int weight;
	int value;
	Product(int weight, int value) {
		this.weight = weight;
		this.value = value;
	}
}

public class No35 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int W = sc.nextInt();
		List<Product> products = new ArrayList<>();
		for (int i = 0; i < N; i++) {
			int v = sc.nextInt();
			int w = sc.nextInt();
			products.add(new Product(w, v));
		}
		int[][] dp = new int[N+1][W+1];
		for (int i = 0; i <= W; i++) dp[0][i] = 0;
		for (int i = 0; i < N; i++) {
			Product p = products.get(i);
			for (int j = 0; j <= W; j++) {
				if (j >= p.weight) {
					dp[i+1][j] = Math.max(dp[i][j], dp[i][j-p.weight] + p.value);
				} else {
					dp[i+1][j] = dp[i][j];
				}
			}
		}
		System.out.println(dp[N][W]);
	}
}
