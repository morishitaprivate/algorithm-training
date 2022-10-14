package DP;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class No38 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int q = sc.nextInt();
		for (int i = 0; i < q; i++) {
			List<Character> X = new ArrayList<Character>();
			List<Character> Y = new ArrayList<Character>();
			for (char ch : sc.next().toCharArray()) {
				X.add(ch);
			}
			for (char ch : sc.next().toCharArray()) {
				Y.add(ch);
			}
			int[][] dp = new int[X.size()+1][Y.size()+1];
			for (int j = 1; j <= X.size(); j++) {
				for (int k = 1; k <= Y.size(); k++) {
					if (X.get(j-1) == Y.get(k-1)) {
						dp[j][k] = dp[j-1][k-1] + 1;
					} else {
						dp[j][k] = Math.max(dp[j-1][k], dp[j][k-1]);
					}
				}
			}
			System.out.println(dp[X.size()][Y.size()]);
		}
	}
}
