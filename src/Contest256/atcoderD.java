package Contest256;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.TreeMap;

public class atcoderD {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		TreeMap<Integer, Integer> map = new TreeMap<Integer, Integer>();
		for (int i = 0; i < N; i++) {
			int L = sc.nextInt();
			int R = sc.nextInt();
			map.put(L,R);
		}
		List<Map.Entry<Integer, Integer>> list = new ArrayList<>(map.entrySet());
		int cnt = 0;
		int tmp = 0;
		for (Map.Entry<Integer, Integer> et : list) {
			if (cnt == 0) {
				System.out.print(et.getKey() + " ");
				tmp = et.getValue();
				cnt++;
				continue;
			}
			if (et.getKey() <= tmp) {
				tmp = Math.max(tmp, et.getValue());
				if (et.getKey() == map.lastKey()) {
					System.out.println(tmp);
				}
			} else {
				System.out.println(tmp);
				System.out.print(et.getKey() + " ");
				tmp = et.getValue();
				if (et.getKey() == map.lastKey()) {
					System.out.println(tmp);
				}
			}
		}
	}
}
