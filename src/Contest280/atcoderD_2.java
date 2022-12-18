package Contest280;

import java.util.Scanner;

public class atcoderD_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int ans = 0;
		long K = sc.nextLong();
		int root = (int)Math.sqrt(K);
		for (int i = 2; i <= root; i++) {
//			System.out.println(i);
			int cnt = 0;
			while (K % i == 0) {
				K /= i;
				cnt++;
			}
			int curr = 0;
			while (cnt > 0) {
				curr += i;
				int tmp = curr;
				while (tmp % i == 0) {
					tmp /= i;
					cnt--;
				}
			}
			ans = Math.max(ans, curr);
		}
		System.out.println(Math.max(ans, K));
	}
}
