package ExhaustiveSearch;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class No15 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		double ans = 0;
		List<Integer> x = new ArrayList<Integer>();
		List<Integer> y = new ArrayList<Integer>();
		for (int i = 0; i < N; i++) {
			x.add(sc.nextInt());
			y.add(sc.nextInt());
		}
		for (int i = 0; i < N; i++) {
			double tmp = 0;
			for (int j = 0; j < N; j++) {
				tmp += Math.sqrt((x.get(i) - x.get(j)) * (x.get(i) - x.get(j)) + (y.get(i) - y.get(j)) * (y.get(i) - y.get(j)));
			}
			ans += tmp / N;
		}
		System.out.println(ans);
	}
}
