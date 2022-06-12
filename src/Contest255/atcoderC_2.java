package Contest255;

import java.util.Scanner;

public class atcoderC_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long X = sc.nextLong();
		long A = sc.nextLong();
		long D = sc.nextLong();
		long N = sc.nextLong();
		long Smin = 0,Smax = 0;
		if (D > 0) {
			Smin = A;
			Smax = A + (N-1) * D;
		} else if (D < 0) {
			Smin = A + (N-1) * D;
			Smax = A;
		}
		
		
		if (D == 0) {
			System.out.println(Math.abs(X-A));
		} else if (X < Smin) {
			System.out.println(Smin - X);
		} else if (X > Smax) {
			System.out.println(X - Smax);
		} else {
			long SN1,SN2;
			SN1 = A + D * ((X-A)/D);
			SN2 = A + D * ((X-A)/D + 1);
			System.out.println(Math.min(Math.abs(X-SN1), Math.abs(X-SN2)));
		}
	}
}
