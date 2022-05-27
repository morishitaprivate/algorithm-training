package Contest241;

import java.util.Scanner;

import javax.management.loading.MLet;

public class atcoderB {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int M = scan.nextInt();
		int[] A = new int[N];
		int[] B = new int[M];
		
		for (int i = 0; i < N; i++) {
			A[i] = scan.nextInt();
		}
		
		for (int i = 0; i < M; i++) {
			B[i] = scan.nextInt();
		}
		int count = 0;
		for (int i = 0; i < M; i++) {
			for(int j = 0; j < N; j++) {
				if (B[i] == A[j]) {
					A[j] = 0;
					count++;
					break;
				}
			}
		}
		if (count == M) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}
