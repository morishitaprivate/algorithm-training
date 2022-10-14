package Contest272;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import paiza.A034;

public class atcoderB {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		String ans = "Yes";
		int[][] table = new int[N][N];
		for (int i = 0; i < M; i++) {
			int k = sc.nextInt();
			List<Integer> list = new ArrayList<Integer>();
			for (int j = 0; j < k; j++) {
				list.add(sc.nextInt());
			}
			for (int j = 0; j  < list.size(); j++) {
				for (int l = j+1; l < list.size(); l++) {
					//System.out.println(list.get(j) + " " + list.get(l));
					table[list.get(j)-1][list.get(l)-1] = 1;
				}
			}
		}
		for (int i = 0; i < N; i++) {
			for (int j = i+1; j < N; j++) {
//				System.out.println(i + " " + j);
				if (table[i][j] == 0) ans = "No";
			}
		}
		System.out.println(ans);
	}
}
