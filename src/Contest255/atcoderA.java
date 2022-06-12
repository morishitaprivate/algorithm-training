package Contest255;

import java.util.Scanner;

public class atcoderA {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int R = sc.nextInt();
		int C = sc.nextInt();
		int[][] A = new int[3][3];
		for (int i = 1; i <= 2; i++) {
			for (int j = 1; j <= 2; j++) {
				A[i][j] = sc.nextInt();	
			}
		}
		System.out.println(A[R][C]);
	}
}
