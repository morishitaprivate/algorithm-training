package ExhaustiveSearch;

import java.util.Scanner;

public class No13 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int R = sc.nextInt();
		int C = sc.nextInt();
		int[][] senbeis = new int[R][C];
		for (int i = 0; i < R; i++) {
			for (int j = 0; j < C; j++) {
				senbeis[i][j] = sc.nextInt();
			}
		}
		for (int bit = 0; bit < Math.pow(2,R); bit++) {
			for (int i = 0; i < C; i++) {
				for (int j = 0; j < R; j++) {
					if ((1 & bit >> j) == 1) {
						
					}
				}
			}
		}
	}
}
