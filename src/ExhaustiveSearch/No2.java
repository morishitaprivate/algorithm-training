package ExhaustiveSearch;
//check it on https://atcoder.jp/contests/abc106/tasks/abc106_b

import java.util.Scanner;

public class No2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int count = 0;
		for (int i = 1; i <= N; i = i + 2) {
			int tmp = 0;
			for (int j = 1; j <= i; j++) {
				if (i % j == 0) {
					tmp++;
				}
			}
			if (tmp == 8) {
				count++;
			}
		}
		System.out.println(count);
	}
}
