package ExhaustiveSearch;
//check it on https://judge.u-aizu.ac.jp/onlinejudge/description.jsp?id=ITP1_7_B&lang=ja

import java.util.Scanner;

public class No1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = 0;
		while (true) {
			int n = sc.nextInt();
			int x = sc.nextInt();
			if (n == 0 && x == 0) {
				break;
			}
			for (int i = 1; i < n; i++) {
				for (int j = 1; j < i; j++) {
					for (int k = 1; k < j; k++) {
						if (i + j + k == x) {
							count++;
						}
					}
				}
			}
			System.out.println(count);
 		}
	}
}
