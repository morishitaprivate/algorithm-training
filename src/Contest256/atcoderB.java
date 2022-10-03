package Contest256;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class atcoderB {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int P = 0;
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < 4; i++) {
			list.add(0);
		}
		for (int i = 0; i < N; i++) {
			list.set(0, 1);
			int A = sc.nextInt();
			for (int j = 3; j >= 0; j--) {
				if (list.get(j) == 1) {
					if (j + A > 3) {
						P++;
					} else {
						list.set(j+A, 1);
					}
					list.set(j, 0);
				}
			}
		}
		System.out.println(P);
	}
}
