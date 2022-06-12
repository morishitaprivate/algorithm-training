package Contest254;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class atcoderB {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] table = new int[50][50];
		int N = sc.nextInt();
		for (int i = 0; i < N; i++) {
			for (int j = 0; j <= i; j++) {
				if (j == 0 || j == i) {
					table[i][j] = 1;
				} else {
					table[i][j] = table[i-1][j-1] + table[i-1][j];
				}
				System.out.print(table[i][j] + " ");
			}
			System.out.println("");
		}
	}
}