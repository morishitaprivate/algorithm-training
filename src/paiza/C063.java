package paiza;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class C063 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i = 0; i < N; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			if (!map.containsKey(a + b)) {
				map.put(a+b,0);
			}
			map.put(a+b,map.get(a+b) + 1);
		}
		List<Entry<Integer, Integer>> list = new ArrayList<>(map.entrySet());
		list.sort(Entry.comparingByValue());
		int max = 0;
		for (Entry<Integer, Integer> et : list) {
			if (et.getValue() > max) {
				max = et.getValue();
			}
		}
		list.sort(Entry.comparingByKey());
		for (Entry<Integer, Integer> et : list) {
			if (et.getValue() == max) {
				System.out.println(et.getKey());
				break;
			}
		}
	}
}
