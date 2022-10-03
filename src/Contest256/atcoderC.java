package Contest256;

import java.util.Scanner;

public class atcoderC {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long ans = 0;
		int h1 = sc.nextInt();
		int h2 = sc.nextInt();
		int h3 = sc.nextInt();
		int w1 = sc.nextInt();
		int w2 = sc.nextInt();
		int w3 = sc.nextInt();
		for (int a = 1; a < 30; a++) {
			for (int b = 1; b < 30; b++) {
				for (int c = 1; c < 30; c++) {
					for (int d = 1; d < 30; d++) {
						if (a + b >= h1 || c + d >= h2 || a + c >= w1 || b + d >= w2 || h1 + h2 - (a + b + c + d) >= w3 || w1 + w2 - (a + b + c + d) >= h3 || w3 - (h1 + h2 - (a + b + c + d)) != h3 - (w1 + w2 - (a + b + c + d))) {
							continue;
						} 
						ans++;
					}
				}
			}
		}
		System.out.println(ans);
	}
}
