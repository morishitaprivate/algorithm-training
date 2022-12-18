package Contest278;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;

public class atcoderC {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int Q = sc.nextInt();
		Map<Integer, HashSet<Integer>> map = new HashMap();
		for (int i = 0; i < Q; i++) {
			int T = sc.nextInt();
			int A = sc.nextInt();
			int B = sc.nextInt();
			if (T == 1) {
				map.putIfAbsent(A, new HashSet<Integer>());
				map.get(A).add(B);
			} else if (T == 2) {
				if (map.containsKey(A) && map.get(A).contains(B)) {
					map.get(A).remove(B);
				}
			} else {
				if (map.containsKey(A) && map.get(A).contains(B) && map.containsKey(B) && map.get(B).contains(A)) {
					System.out.println("Yes");
				} else {
					System.out.println("No");
				}
			}
		}
	}
}
