package Contest277;

import java.util.Scanner;
import java.util.TreeMap;

public class atcoderC {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		TreeMap<Integer, Integer> map = new TreeMap<Integer, Integer>();
		int N = sc.nextInt();
		for (int i = 0; i < N; i++) {
			int A = sc.nextInt();
			int B = sc.nextInt();
			int max = Math.max(A,B);
			int min = Math.min(A,B);
			if (map.containsKey(min)) {
				map.put(min, Math.max(map.get(min), max));
			} else {
				map.put(min,max);
			}
		}
		int ans = 1;
		for (int key : map.keySet()) {
			if (key > ans) break;
			ans = Math.max(ans, map.get(key));
		}
		System.out.println(ans);
	}
}
