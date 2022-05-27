package Contest239;

import java.util.Scanner;

public class atcoderB {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		long X;
		X = scan.nextLong();
		if (X > 0) {
			System.out.println(X/10);
		} else if (X <= 0 && X % 10 == 0) {
			System.out.println(X/10);
		} else {
			System.out.println(X/10 -1);
		}
	}
}
