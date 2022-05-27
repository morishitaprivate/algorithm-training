package TypicalQuestion90;

import java.util.Scanner;

public class Atcoder33 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		int W = sc.nextInt();
		if (H == 1 || W == 1) {
			System.out.println(H * W);
		} else {
			if (H % 2 != 0) {
				H += 1;
			}
			if (W % 2 != 0) {
				W += 1;
			}
			System.out.println((H/2) * (W/2));
		}
	}
}