package paiza;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class C046 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		Map<String, Integer> map = new HashMap<String, Integer>();
		for (int i = 0; i < N; i++) {
			map.put(sc.next(),0);
		}
		int M = sc.nextInt();
		for (int i = 0; i < M; i++) {
			String o = sc.next();
			int p = sc.nextInt();
			map.put(o,map.get(o) + p);
		}
		List<Entry<String, Integer>> list = new ArrayList<>(map.entrySet());
		list.sort(Entry.comparingByValue());
		for (int i = N-1; i >= 0; i--) {
			System.out.println(list.get(i).getKey());
		}
	}
}
