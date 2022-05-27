package Contest236;

import java.util.Scanner;

public class atcoderB {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] list = new int[N+1];
		for (int i : list) {
			i = 0;
		}
		for (int i = 1; i <= 4 * N -1; i++) {
			int num = sc.nextInt();
			list[num]++;
		}
		int ans = 0;
		int count = 0;
		for (int i: list) {
			if (i == 3) {
				ans = count;
			}
			count++;
		}
		System.out.println(ans);
	}
}
