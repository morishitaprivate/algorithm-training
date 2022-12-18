package Contest274;

import java.util.Scanner;

public class atcoderB {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		int W = sc.nextInt();
		char[][] table = new char[H][W];
		for (int i = 0; i < H; i++) {
			table[i] = sc.next().toCharArray();
		}
		for (int i = 0; i < W; i++) {
			int cnt = 0;
			for (int j = 0; j < H; j++) {
				if (table[j][i] == '#') cnt++;
			}
			System.out.print(cnt + " ");
		}
	}
}
