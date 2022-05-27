package Contest237;

import java.util.Scanner;

public class atcoder1 {
	public static void main(String[] args) {
		long num = 1;
		long num2 = -1;
		for (int i = 0; i < 31; i++) {
			num *= 2;
			num2 *= 2;
		}
		Scanner scan = new Scanner(System.in);
		long N = scan.nextLong();
		if (N >= num || N < num2) {
			System.out.println("No");
		} else {
			System.out.println("Yes");
		}
	}
}
