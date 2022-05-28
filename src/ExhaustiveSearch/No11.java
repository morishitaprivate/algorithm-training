package ExhaustiveSearch;
//check it on https://atcoder.jp/contests/abc128/tasks/abc128_c

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class No11 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		List<ArrayList<Integer>> lightsInfo = new ArrayList<ArrayList<Integer>>();
		List<Integer> pList = new ArrayList<Integer>();
		for (int i = 0; i < M; i++) {
			int k = sc.nextInt();
			ArrayList<Integer> light = new ArrayList<Integer>();
			for (int j = 0; j < k; j++) {
				int s = sc.nextInt();
				light.add(s);
			}
			lightsInfo.add(light);
		}
		for (int i = 0; i < M; i++) {
			int p = sc.nextInt();
			pList.add(p);
		}
		int ans = 0;
		for (int i = 0; i < Math.pow(2, N); i++) {
			ArrayList<Integer> tmp = new ArrayList<Integer>();
			for (int j = 0; j < N; j++) {
				if ((1 & i >> j) == 1) {
					tmp.add(j + 1);
				}
			}
			int count = 0;
			for (int j = 0; j < M; j++) {
				if (isTurnedOn(lightsInfo.get(j), tmp, pList.get(j))) {
					count++;
				}
			}
			if (count == M) {
				ans++;
			}
		}
		System.out.println(ans);
	}
	
	static boolean isTurnedOn(ArrayList<Integer> light, ArrayList<Integer> switches, int p) {
		int count = 0;
		for (int i = 0; i < switches.size(); i++) {
			if (light.contains(switches.get(i))) {
				count++;
			}
		}
		if (count % 2 == p) {
			return true;
		} else {
			return false;
		}
	}
}
