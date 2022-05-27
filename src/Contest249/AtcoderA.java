package Contest249;

import java.util.Scanner;

public class AtcoderA {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int D = sc.nextInt();
		int E = sc.nextInt();
		int F = sc.nextInt();
		int X = sc.nextInt();
		if (calLength(A,B,C,X) > calLength(D,E,F,X)) {
			System.out.println("Takahashi");
		} else if (calLength(A,B,C,X) < calLength(D,E,F,X)) {
			System.out.println("Aoki");
		} else {
			System.out.println("Draw");
		}
	}
	
	public static int calLength(int A, int B, int C, int X) {
		int length = 0;
		while(X > A+C) {
			length += A * B;
			X -= A+C;
		}
		if (X < A) {
			length += B * X;
		} else {
			length += B * A;
		}
		
		return length;
	}
}
