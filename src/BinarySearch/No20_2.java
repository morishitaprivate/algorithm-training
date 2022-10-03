package BinarySearch;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class No20_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		List<Integer> A = new ArrayList<Integer>();
		List<Integer> B = new ArrayList<Integer>();
		List<Integer> C = new ArrayList<Integer>();
		long ans = 0;
		for (int i = 0; i < N; i++) {
			A.add(1);
		}
		for (int i = 0; i < N; i++) {
			B.add(3);
		}
		for (int i = 0; i < N; i++) {
			C.add(5);
		}
		Collections.sort(A);
		Collections.sort(C);
		for (int num : B) {
			long ansA = 0;
			long ansC = 0;
			int upperA = A.size() - 1;
			int lowerA = 0;
			int upperC = C.size() - 1;
			int lowerC = 0;
			while (upperA >= lowerA) {
				int midA = (upperA + lowerA) / 2;
				if (num > A.get(midA)) {
					lowerA = midA + 1;
				} else {
					upperA = midA - 1;
				}
			}
			ansA = lowerA;
			while (upperC >= lowerC) {
				int midC = (upperC + lowerC) / 2;
				if ((num+1) > C.get(midC)) {
					lowerC = midC + 1;
				} else {
					upperC = midC - 1;
				}
			}
			ansC = lowerC;
			ans += (ansA * (N - ansC));
		}
		System.out.println(ans);
		//ansA,ansCをlongにする必要があった。ansの最大値は10^10。int同士の掛け算がintの範疇を超えていたら桁溢れが発生。
	}
}
