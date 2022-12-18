package Contest278;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class atcoderD {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
//		boolean[] checked = new boolean[N];
//		Map<Integer, Long> map = new HashMap();
//		List<Long> list = new ArrayList<Long>();
		long[] arr = new long[N];
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i = 0; i < N; i++) {
//			list.add(sc.nextLong());
//			map.put(i, sc.nextLong());
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
//				checked = new boolean[N];
			} else if (first == 2) {
				int iq = sc.nextInt();
				if (map.get(iq-1) > now || curr == -1) {
//					list.set(iq-1, list.get(iq-1)+sc.nextLong());
//					map.put(iq-1, map.get(iq-1)+sc.nextLong());
					arr[iq-1] = arr[iq-1]+sc.nextLong();
				} else {
//					list.set(iq-1, curr+sc.nextLong());
//					map.put(iq-1, curr+sc.nextLong());
					arr[iq-1] = curr+sc.nextLong();
//					checked[iq-1] = true;
					map.put(iq-1, i);
				}
			} else {
				int iq = sc.nextInt();
				if (map.get(iq-1) > now || curr == -1) {
//					System.out.println(list.get(iq-1));
//					System.out.println(map.get(iq-1));
					System.out.println(arr[iq-1]);
				} else {
					System.out.println(curr);
				}
			}
		}
	}
}
