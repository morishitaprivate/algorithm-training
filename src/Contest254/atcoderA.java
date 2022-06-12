package Contest254;

import java.util.Scanner;

public class atcoderA {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int digit1 = N % 10;
		N /= 10;
		int digit10 = N % 10;
		System.out.print(digit10);
		System.out.print(digit1);
	}
}
