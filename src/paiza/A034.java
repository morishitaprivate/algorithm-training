package paiza;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.TreeMap;

public class A034 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int X = sc.nextInt();
		List<Integer> prices = new ArrayList<Integer>();
		TreeMap<Integer, Integer> result = new TreeMap<Integer, Integer>();
		for (int i = 0; i < N; i++) {
			prices.add(sc.nextInt());
		}
		for (int i = 0; i < Math.pow(2, N); i++) {
			int sum = 0;
			int kind = 0;
			for (int j = 0; j < N; j++) {
				if ((1 & i >> j) == 1) {
					sum += prices.get(j);
					kind++;
				}
			}
			if (sum > X) continue;
			if (!result.containsKey(kind)) {
				result.put(kind,X-sum);
			}
			if (X-sum < result.get(kind)) {
				result.put(kind,X-sum);
			}
		}
		System.out.println(result.get(result.lastKey()));
	}
}
