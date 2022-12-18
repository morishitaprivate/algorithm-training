package Contest280;

import java.util.Scanner;

public class atcoderB {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// An = Sn - Sn-1
		int N = sc.nextInt();
		int[] S = new int[N];
		for (int i = 0; i < N; i++) {
			S[i] = sc.nextInt();
		}
		System.out.print(S[0] + " ");
		for (int i = 1; i < N; i++) {
			System.out.print((S[i] - S[i-1]) + " ");
		}
	}
}
