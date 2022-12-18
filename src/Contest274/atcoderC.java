package Contest274;

import java.util.Scanner;

public class atcoderC {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		System.out.println(0);
		for (int i = 0; i < N; i++) {
			int A = sc.nextInt();
			int cnt = 0;
			while (A * 2 > 1) {
				A /= 2;
				cnt++;
			}
			System.out.println(cnt);
			System.out.println(cnt);
		}
	}
}
