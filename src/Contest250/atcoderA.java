package Contest250;

import java.util.Scanner;

public class atcoderA {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		int W = sc.nextInt();
		int R = sc.nextInt();
		int C = sc.nextInt();
		int ans = 0;
		if (R != 1) {
			ans++;
		}
		if (R != H) {
			ans++;
		}
		if (C != 1) {
			ans++;
		}
		if (C != W) {
			ans++;
		}
		System.out.println(ans);
	}
}
