package Contest272;

import java.util.Scanner;

public class atcoderA {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int sum = 0;
		for (int i = 0; i < N; i++) {
			sum += sc.nextInt();
		}
		System.out.println(sum);
	}
}
