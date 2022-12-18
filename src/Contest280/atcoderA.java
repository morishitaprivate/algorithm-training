package Contest280;

import java.util.Scanner;

public class atcoderA {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		int W = sc.nextInt();
		int cnt = 0;
		for (int i = 0; i < H; i++) {
			String S = sc.next();
			for (char ch : S.toCharArray()) {
				if (ch == '#') cnt++;
			}
		}
		System.out.println(cnt);
	}
}
