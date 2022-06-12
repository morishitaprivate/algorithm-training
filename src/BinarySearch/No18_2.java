package BinarySearch;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class No18_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int ans = 0;
		int n = sc.nextInt();
		List<Integer> S = new ArrayList<Integer>();
		for (int i = 0; i < n; i++) {
			S.add(sc.nextInt());
		}
		int qLength = sc.nextInt();
		for (int i = 0; i < qLength; i++) {
			int upper = S.size()-1;
			int lower = 0;
			int q = sc.nextInt();
			while (lower <= upper) {
				int mid = (lower + upper) / 2;
				if (q == S.get(mid)) {
					ans++;
					break;
				} else if (q > S.get(mid)) {
					lower = mid + 1;
				} else {
					upper = mid - 1;
				}
			}
		}
		System.out.println(ans);
	}
}
