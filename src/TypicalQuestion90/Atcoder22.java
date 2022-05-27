package TypicalQuestion90;

import java.util.Scanner;

public class Atcoder22 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long A = sc.nextLong();
		long B = sc.nextLong();
		long C = sc.nextLong();
		long r = gcd(A, gcd(B, C));
		System.out.println((A/r-1) + (B/r-1) + (C/r-1));
	}
	
	static long gcd(long a, long b) {
		while (a % b != 0) {
			long tmp = a;
			a = b;
			b = tmp % b;
		}
		return b;
	}
}
