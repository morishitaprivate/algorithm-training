package Contest254;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class atcoderC_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		List<Integer> arr = new ArrayList<Integer>();
		for (int i = 0; i < N; i++) {
			arr.add(sc.nextInt());
		}
		for (int i = 0; i < K; i++) {
			List<Integer> tmpList = new ArrayList<Integer>();
			for (int j = i; j < N; j += K) {
				tmpList.add(arr.get(j));
			}
			Collections.sort(tmpList);
			int tmp = i;
			for (int num : tmpList) {
				arr.set(tmp, num);
				tmp += K;
			}
		}
		if (isAscend(arr)) {
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
