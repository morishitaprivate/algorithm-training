package TypicalQuestion90;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Atcoder10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Map<Integer, Integer> class1 = new HashMap<Integer, Integer>();
		Map<Integer, Integer> class2 = new HashMap<Integer, Integer>();
		int N = Integer.parseInt(sc.next());
		for (int i = 1; i <= N; i++) {
			int C = Integer.parseInt(sc.next());
			int P = Integer.parseInt(sc.next());
			if (C == 1) {
				class1.put(i,P);
			} else {
				class2.put(i,P);
			}
		}
		List<Integer> sum1 = new ArrayList<Integer>();
		List<Integer> sum2 = new ArrayList<Integer>();
		sum1.add(0);
		sum2.add(0);
		for (int i = 1; i <= N; i ++) {
			if (class1.containsKey(i)) {
				sum1.add(sum1.get(i-1) + class1.get(i));
				sum2.add(sum2.get(i-1));
			} else {
				sum1.add(sum1.get(i-1));
				sum2.add(sum2.get(i-1) + class2.get(i));
			}
		}
		int Q = Integer.parseInt(sc.next());
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < Q; i++) {
			int L = Integer.parseInt(sc.next());
			int R = Integer.parseInt(sc.next());
			
			sb.append((sum1.get(R) - sum1.get(L-1)) + " " + (sum2.get(R) - sum2.get(L-1)));
			sb.append("\n");
		}
		System.out.println(sb.toString());
	}
}