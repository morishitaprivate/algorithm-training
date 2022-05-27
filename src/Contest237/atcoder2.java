package Contest237;

import java.util.Scanner;

public class atcoder2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int H = scan.nextInt();
		int W = scan.nextInt();
		Long[][] A = new Long[H][W];
		for (int i = 0; i < H; i++) {
			for (int j = 0; j < W; j++) {
				A[i][j] = scan.nextLong();
			}
		}
		for (int i = 0; i < W; i++) {
			for (int j = 0; j < H; j++) {
				System.out.print(A[j][i] + " ");
			}
			System.out.println();
		}
	}
}
