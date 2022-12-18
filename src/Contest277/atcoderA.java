package Contest277;

import java.util.Scanner;

public class atcoderA {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int X = sc.nextInt();
		int ans = 0;
		for (int i = 0; i < N; i++) {
			int num = sc.nextInt();
			if (num == X) ans = i+1;
		}
		System.out.println(ans);
	}
}
