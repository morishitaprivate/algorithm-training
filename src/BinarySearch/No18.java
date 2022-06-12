package BinarySearch;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class No18 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		int ans = 0;
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			int num = sc.nextInt();
			if (!map.containsKey(num)) {
				map.put(num,0);
			}
		}
		int q = sc.nextInt();
		for (int i = 0; i < q; i++) {
			int num = sc.nextInt();
			if (map.containsKey(num)) {
				ans++;
			}
		}
		System.out.println(ans);
	}
}
