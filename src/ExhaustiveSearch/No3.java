package ExhaustiveSearch;
//check it on https://atcoder.jp/contests/abc122/tasks/abc122_b

import java.util.Scanner;

public class No3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		int max = 0;
		int count = 0;
		int tmp = 0;
		for (int i = 0; i < S.length(); i++) {
			if (S.charAt(i) == 'A' || S.charAt(i) == 'C' || S.charAt(i) == 'G' || S.charAt(i) == 'T') {
				count++;
				if (count == 1) {
					tmp = i;
				} else if (count > 1) {
					if (i != tmp + 1) {
						count = 1;
					}
					tmp = i;
				}
				if (count > max) {
					max = count;
				}
			}
		}
		System.out.println(max);
	}
}
