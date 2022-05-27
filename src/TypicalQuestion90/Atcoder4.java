package TypicalQuestion90;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Atcoder4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		int W = sc.nextInt();
		List<Integer> sumRow = new ArrayList<Integer>();
		List<Integer> sumColumn = new ArrayList<Integer>();
		int[][] list = new int[H][W];
		for (int i = 0; i < H; i ++) {
			sumRow.add(0);
			for (int j = 0; j < W; j++) {
				if (i == 0) {
					sumColumn.add(0);
				}
				int A = sc.nextInt();
				list[i][j] = A;
				sumRow.set(i, sumRow.get(i) + A);
				sumColumn.set(j, sumColumn.get(j) + A);
			}
		}
		for (int i = 0; i < H; i++) {
			for (int j = 0; j < W; j++) {
				System.out.print(sumRow.get(i) + sumColumn.get(j) - list[i][j] + " ");
			}
			System.out.println("");
		}
	}
}
