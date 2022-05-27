package ExhaustiveSearch;
// check it on https://atcoder.jp/contests/abc095/tasks/arc096_a

import java.util.Scanner;

public class No5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int X = sc.nextInt();
		int Y = sc.nextInt();
		int money = 0;
		if (A + B <= 2 * C) {
			money += A * X + B * Y; 
		} else {
			money += (2 * C) * Math.min(X, Y);
			if (X > Y) {
				if (A > 2 * C) {
					money += (2 * C) * (X - Y);
				} else {
					money += A * (X - Y);
				}
			} else if (X < Y) {
				if (B > 2 * C) {
					money += (2 * C) * (Y - X);
				} else {
					money += B * (Y - X);
				}
			}
		}
		System.out.println(money);
	}
}
