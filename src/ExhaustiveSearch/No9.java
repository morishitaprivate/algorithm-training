package ExhaustiveSearch;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class No9 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<HashMap<Integer, Integer>> data = new ArrayList<HashMap<Integer,Integer>>();
		int N = sc.nextInt();
		String[] Ss = new String[N];
		int ans = 0;
		for (int i = 0; i < N; i++) {
			Ss[i] = sc.next();
		}
		for (int i = 0; i < 10; i++) {
			HashMap<Integer, Integer> tmp = new HashMap<Integer, Integer>();
			for (String S : Ss) {
				int num = S.indexOf(String.valueOf(i)) + 1;
				if (tmp.get(num) == null) {
					tmp.put(num,1);
				} else {
					tmp.put(num,tmp.get(num) + 1);
				}
			}
			data.add(tmp);
		}
		for (int i = 0; i < 10; i ++) {
			int mode = 0;
			int tmp=0;
			for (int j = 1; j <= 10; j ++) {
				if (data.get(i).get(j) != null && data.get(i).get(j) >= mode) {
					mode = data.get(i).get(j);
					tmp = j;
				}
			}
			int time = (mode - 1) * 10 + (tmp - 1);
			if (i == 0) {
				ans = time;
			} else {
				if (time < ans) {
					ans = time;
				}
			}
		}
		System.out.println(ans);
	}
}
