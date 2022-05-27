package Contest237;

import java.util.Scanner;

public class atcoder4 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		String S = scan.next();
		int[] A = new int[N+1];
		int tmp = 0;
		for (int i = 0; i < S.length(); i++) {
			if (S.charAt(i) == 'R') {
				if(A[tmp+1] == 0) {
					A[tmp+1] = i+1;
				} else {
					for (int k = i; k > tmp; k--) {
						A[k+1] = A[k];
					}
					A[tmp+1] = i+1;
				}
				tmp++;
			} else {
				for (int k = i; k >= tmp; k--) {
					A[k+1] = A[k];
				}
				A[tmp] = i+1;
			}
		}
		for (int a : A) {
			System.out.print(a + " ");
		}
	}
}
