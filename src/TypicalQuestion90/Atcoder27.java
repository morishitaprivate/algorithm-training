package TypicalQuestion90;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Atcoder27 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		Map<String, Integer> data = new HashMap<String, Integer>();
		for (int i = 1; i <= N; i++) {
			String S = sc.next();
			if (!data.containsKey(S)) {
				data.put(S,1);
				System.out.println(i);
			}
		}
	}
}
