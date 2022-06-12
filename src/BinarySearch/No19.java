package BinarySearch;
//check it on https://atcoder.jp/contests/joi2009ho/tasks/joi2009ho_b

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class No19 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Integer> shopList = new ArrayList<Integer>();
		List<Integer> deliList = new ArrayList<Integer>();
		int ans = 0;
		shopList.add(0);
		int d = sc.nextInt();
		int n = sc.nextInt();
		int m = sc.nextInt();
		for (int i = 1; i < n; i++) {
			shopList.add(sc.nextInt());
			
		}
		shopList.add(d);
		for (int i = 0; i < m; i++) {
			deliList.add(sc.nextInt());
		}
		Collections.sort(shopList);
		for (int num : deliList) {
			int upper = shopList.size() - 1;
			int lower = 0;
			while (lower <= upper) {
				int mid = (lower + upper) / 2;
				if (num > shopList.get(mid)) {
					lower = mid + 1;
					if (num <= shopList.get(lower)) {
						ans += Math.min(num - shopList.get(lower-1), shopList.get(lower) - num);
						//System.out.println(Math.min(num - shopList.get(lower-1), shopList.get(lower) - num));
						break;
					}
				} else if (num < shopList.get(mid)) {
					upper = mid - 1;
					if (num >= shopList.get(upper)) {
						ans += Math.min(num - shopList.get(upper), shopList.get(upper+1) - num);
						//System.out.println(Math.min(num - shopList.get(upper), shopList.get(upper+1) - num));
						break;
					}
				} else {
					break;
				}
			}
		}
		System.out.println(ans);
	}
}
