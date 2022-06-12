package Contest255;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class atcoderB {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		List<Integer> A = new ArrayList<Integer>();
		List<Integer> X = new ArrayList<Integer>();
		List<Integer> Y = new ArrayList<Integer>();
		Map<Integer, Double> map = new HashMap<Integer, Double>();
		for (int i = 0; i < K; i++) {
			A.add(sc.nextInt());
		}
		for (int i = 0; i < N; i++) {
			X.add(sc.nextInt());
			Y.add(sc.nextInt());
		}
		for (int num : A) {
			for (int j = 0; j < N; j++) {
				double dis = distance(X.get(num-1), Y.get(num-1), X.get(j), Y.get(j));
				if (map.containsKey(j) && map.get(j) < dis) continue;
				map.put(j,dis);
			}
		}
		double ans = 0;
		for (int i = 0; i < N; i++) {
			if (map.get(i) > ans) ans = map.get(i);
		}
		System.out.println(ans);
	}
	
	static double distance(long x1, long y1, long x2, long y2) {
		return Math.sqrt((x1-x2)*(x1-x2)+ (y1-y2)*(y1-y2));
	}
}
