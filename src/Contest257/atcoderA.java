package Contest257;

import java.util.Scanner;

public class atcoderA {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int X = sc.nextInt();
		String S = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		int cnt = 0;
		int ans = 0;
		for (int i = 0; ; i++) {
			for (int j = 0; j < N; j++) {
				cnt++;
				if (cnt == X) {
					break;
				}
			}
			if (cnt == X) {
				ans = i;
				break;
			}
		}
		System.out.println(S.charAt(ans));
	}
}
