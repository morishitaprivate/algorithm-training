package Contest250;

import java.util.Scanner;

public class atcoderB {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int A = sc.nextInt();
		int B = sc.nextInt();
		int tmp = 0;
		int tmp2 = 0;
		for (int i = 0; i < N; i++) {
			if (tmp2 == 0) {
				tmp2++;
			} else if (tmp2 == 1) {
				tmp2--;
			}
			for (int j = 0; j < A; j++) {
				if (tmp2 == 1) {
					tmp = 0;
				} else {
					tmp = 1;
				}
				for (int k = 0; k < N; k++) {
					for (int l = 0; l < B; l++) {
						if (tmp == 0) {
							System.out.print(".");
						} else {
							System.out.print("#");
						}
					}
					if (tmp == 0) {
						tmp ++;
					} else {
						tmp--;
					}
				}
				System.out.println("");
			}
		}
	}
}
