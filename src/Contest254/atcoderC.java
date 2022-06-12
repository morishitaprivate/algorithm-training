package Contest254;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class atcoderC {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < N; i++) {
			list.add(sc.nextInt());
		}
		for (int i = N - K - 1; i >= 0; i--) {
			if (list.get(i) > list.get(i + K)) {
				Collections.swap(list, i, i + K);
			}
			int j = i + K + K;
			while (j < N-1) {
				if (list.get(j - K) > list.get(j)) {
					Collections.swap(list, j-K, j);
				}
				j += K;
			}
		}
		if (isAscend(list)) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
	
	static boolean isAscend(List<Integer> list) {
		for (int i = 0; i < list.size()-1; i++) {
			if (list.get(i) > list.get(i+1)) {
				return false;
			}
		}
		return true;
	}
}