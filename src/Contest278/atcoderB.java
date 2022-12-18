package Contest278;

import java.util.Scanner;

public class atcoderB {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		int M = sc.nextInt();
		int A = H / 10;
		int B = H % 10;
		int C = M / 10;
		int D = M % 10;
		while(true) {
			if (10*A + C < 24 && 10*B + D < 60) {
				System.out.println((10*A + B) + " " + (10*C + D));
				break;
			}
			if (M == 59) {
				M = 0;
				H = H == 23 ? 0 : H+1;
			} else {
				M++;
			}
			A = H / 10;
			B = H % 10;
			C = M / 10;
			D = M % 10;
		}
	}
}
