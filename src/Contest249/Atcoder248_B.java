package Contest249;

import java.util.Scanner;

public class Atcoder248_B {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long A = sc.nextInt();
		long B = sc.nextInt();
		long K = sc.nextInt();
		int count = 0;
		while(A < B) {
			A *= K;
			count++;
		}
		System.out.println(count);
	}
}
