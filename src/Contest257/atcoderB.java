package Contest257;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class atcoderB {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		List<Integer> koma = new ArrayList<Integer>();
		koma.add(0);
		int[] list = new int[N+2];
		int K = sc.nextInt();
		int Q = sc.nextInt();
		for (int i = 1; i <= N; i++) {
			list[i] = 1; //not put = 1, put = 2;
		}
		for (int i = 0; i < K; i++) {
			int A = sc.nextInt();
			list[A] = 2;
			koma.add(A);
		}
		for (int i = 0; i < Q; i++) {
			int L = sc.nextInt();
			if (list[koma.get(L) + 1] == 1) {
				list[koma.get(L)] = 1;
				list[koma.get(L) + 1] = 2;
				koma.set(L, koma.get(L) + 1);
			}
		}
		for (int num : koma) {
			if (num == 0) continue;
			System.out.print(num + " ");
		}
	}
}
