package Contest269;

import java.util.Scanner;

public class atcoderB {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A=0,B=0,C=0,D=0;
		for (int i = 0; i < 10; i++) {
			String S = sc.next();
			for (int j = 0; j < 10; j++) {
				if (A == 0 && C == 0 && S.charAt(j) == '#') {
					C = j+1;
					A = i+1;
				}
				if (D == 0 && C != 0 && S.charAt(j) == '.') {
					D = j;
				} else if (D == 0 && S.charAt(9) == '#') {
					D = 10;
				}
			}
			if (B == 0 && A != 0 && S.charAt(C-1) == '.') {
				B = i;
			} else if (i == 9 && B == 0 && S.charAt(C-1) == '#'){
				B = 10;
			}
		}
		System.out.println(A + " " + B);
		System.out.println(C + " " + D);
	}
}
