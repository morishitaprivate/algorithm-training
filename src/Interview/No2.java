package Interview;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class No2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int d = sc.nextInt();
		int n = sc.nextInt();
		int m = sc.nextInt();
		List<Integer> shop = new ArrayList<Integer>();
		shop.add(0);
		for (int i = 0; i < n-1; i++) {
			shop.add(sc.nextInt());
		}
		shop.add(d);
		Collections.sort(shop);
		long ans = 0;
		for (int i = 0; i < m; i++) {
			int goal = sc.nextInt();
			int lower = 0;
			int upper = shop.size()-1;
			while (lower <= upper) {
				int mid = (lower + upper) / 2;
				if (goal >= shop.get(mid)) {
					lower = mid + 1;
				} else {
					upper = mid - 1;
				}
			}
			ans += Math.min(Math.abs(shop.get(lower) - goal), Math.abs(shop.get(upper) - goal));
		}
		System.out.println(ans);
	}
}
