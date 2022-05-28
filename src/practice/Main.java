package practice;

import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long N = sc.nextInt();
		long A = sc.nextInt();
		long B = sc.nextInt();
		long sum = sum(N);
		long lcm = lcm(A, B);
		System.out.println();
		System.out.println(sum - (A * sum(N / A) + B * sum(N / B) - lcm * sum(N / lcm) ));
	}
	
	static long sum(long N) {
		return N * (N + 1) / 2;
	}
	
	static long lcm(long a,long b) {
		long gcd = gcd(a, b);
		return a * b / gcd;
	}
	
	static long gcd(long a,long b) {
		long tmp;
		while (a % b != 0) {
			tmp = a;
			a = b;
			b = tmp % b;
		}
		return b;
	}
}
