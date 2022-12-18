package Contest277;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class atcoderD {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int ans = Integer.MAX_VALUE;
		long SUM = 0;
		TreeMap<Integer, Integer> map = new TreeMap<Integer, Integer>();
		int N = sc.nextInt();
		int M = sc.nextInt();
		for (int i = 0; i < N; i++) {
			int A = sc.nextInt();
			map.putIfAbsent(A, 0);
			map.put(A, map.get(A)+1);
			SUM += A;
		}
		List<Integer> list = new ArrayList<Integer>();
		for (int num : map.keySet()) {
			if (list.contains(num-1)) list.add(list.get(num-1) + num*map.get(num));
			else list.add(num * map.get(num));
		}
//		List<Integer> list = new ArrayList<Integer>(map.keySet());
		for (int num : map.keySet()) {
			TreeMap<Integer, Integer> tm = new TreeMap<Integer, Integer>(map);
			int curr = num;
			long sum = SUM;
//			System.out.print(sum + " ");
			while (tm.get(curr) != null) {
				sum -= curr * tm.get(curr);
				tm.remove(curr);
				curr = (curr+1) % M;
//				System.out.print(sum + " ");
			}
			ans = Math.min(ans, (int)sum);
//			System.out.println("");
		}
		System.out.println(ans);
	}
}
