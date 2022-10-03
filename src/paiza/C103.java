package paiza;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C103 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		List<Integer> A = new ArrayList<Integer>();
		List<String> B = new ArrayList<String>();
		for (int i = 0; i < M; i++) {
			A.add(sc.nextInt());
			B.add(sc.next());
		}
		for (int i = 1; i <= N; i++) {
			int cnt = 0;
			for (int j = 0; j < M; j++) {
				if (i % A.get(j) == 0) {
					if (cnt == 0) {
						System.out.print(B.get(j));
						cnt++;
						continue;
					}
					System.out.print(" " + B.get(j));
					cnt++;
				}
			}
			if (cnt == 0) {
				System.out.print(i);
			}
			System.out.println("");
		}
	}
}
