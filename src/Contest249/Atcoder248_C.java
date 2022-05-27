package Contest249;

import java.util.Scanner;

public class Atcoder248_C {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int K = sc.nextInt();
		
	}
	
	static long combination(int n, int k) {
		double num = 1.0;
		for (int i = 0; i < k ; i++) {
			num = num * (n-i)/(k-i);
		}
		return (long)num;
	}
}
