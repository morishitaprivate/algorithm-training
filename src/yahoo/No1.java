package yahoo;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class No1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i = 0; i < n; i++) {
			int a = sc.nextInt();
			map.putIfAbsent(a, 0);
			if (map.get(a) == null) {
				map.put(a,0);
			}
			map.put(a, map.get(a) + 1);
		}
		String ans = "NO";
		for (int key : map.keySet()) {
			if (map.get(key) >= 4) {
				ans = "YES";
			}
		}
		System.out.println(ans);
	}
}
