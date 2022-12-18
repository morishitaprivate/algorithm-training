package Contest278;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class atcoderD_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long[] arr = new long[N];
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i = 0; i < N; i++) {
			arr[i] = sc.nextLong();
			map.put(i,-1);
		}
		long curr = -1;
		int now = -1;
		int Q = sc.nextInt();
		for (int i = 0; i < Q; i++) {
			int first = sc.nextInt();
			if (first == 1) {
				curr = sc.nextLong();
				now = i;
			} else if (first == 2) {
				int iq = sc.nextInt();
				if (map.get(iq-1) > now || curr == -1) {
					arr[iq-1] = arr[iq-1]+sc.nextLong();
				} else {
					arr[iq-1] = curr+sc.nextLong();
					map.put(iq-1, i);
				}
			} else {
				int iq = sc.nextInt();
				if (map.get(iq-1) > now || curr == -1) {
					System.out.println(arr[iq-1]);
				} else {
					System.out.println(curr);
				}
			}
		}
	}
}
