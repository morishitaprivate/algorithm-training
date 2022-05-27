package practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i = 1; i <= 31; i++) {
			map.put(i, 0);
		}
		for (int i = 0; i < N; i++) {
			int s = sc.nextInt();
			int e = sc.nextInt();
			for (int j = s; j <= e; j++) {
				map.put(j,map.get(j) + 1);
			}
		}
		for (int i = 1; i <= 31; i++) {
			if (map.get(i) == N) {
				System.out.println("OK");
				break;
			}
			if (i == 31 && map.get(i) != N) {
				System.out.println("NG");
			}
		}
	}
}

