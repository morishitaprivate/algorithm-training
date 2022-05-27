package TypicalQuestion90;

import java.util.Scanner;

public class Atcoder24 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		int count = 0;
		int[] array = new int[N];
		for (int i = 0; i < N; i++) {
			array[i] = sc.nextInt();
		}
		
		for (int i = 0; i < N; i++) {
			count += Math.abs(array[i] - sc.nextInt());
		}
		
		if (K >= count && (K - count) % 2 == 0) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}
