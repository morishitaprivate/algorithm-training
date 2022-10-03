package Contest262;

import java.util.Scanner;

public class atcoderC {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] array = new int[N+1];
		long same = 0;
		long reverse = 0;
		for (int i = 1; i <= N; i++) {
			int a = sc.nextInt();
			array[i] = a;
			if (i == a) {
				same++;
			} else if (a < i && array[a] == i) {
				reverse++;
			}
		}
		System.out.println(same * (same - 1) / 2 + reverse);
	}
}
