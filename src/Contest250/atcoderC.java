package Contest250;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class atcoderC {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Integer> ballList = new ArrayList<Integer>();
		List<Integer> pos = new ArrayList<Integer>();
		int N = sc.nextInt();
		int Q = sc.nextInt();
		for (int i = 0; i <= N; i++) {
			ballList.add(i);
			pos.add(i);
		}
		for (int i = 0; i < Q; i++) {
			int x = sc.nextInt();
			int pos1 = pos.get(x);//pos1 番目にxがある。
			int pos2 = pos1;
			if (pos2 == N) {
				pos2--;
			} else {
				pos2++;
			}
			int val1 = ballList.get(pos1);
			int val2 = ballList.get(pos2);
			Collections.swap(ballList, pos1, pos2);
			Collections.swap(pos, val1, val2);
		}
		for (int i = 1; i < ballList.size(); i++) {
			System.out.print(ballList.get(i) + " ");
		}
	}
}
