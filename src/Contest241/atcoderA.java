package Contest241;

import java.util.Scanner;

public class atcoderA {
	 public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] list = new int[10];
		for (int i = 0; i < 10; i++) {
			list[i] = scan.nextInt();
		}
		int ans = 0;
		for (int i = 1; i <= 3; i++) {
			if (i == 1) {
				ans = list[0];
			} else {
				ans = list[ans];
			}
		}
		System.out.println(ans);
	}

}
