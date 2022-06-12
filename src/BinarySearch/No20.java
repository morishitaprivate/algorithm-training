package BinarySearch;
//check it on https://atcoder.jp/contests/abc077/tasks/arc084_a

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class No20 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		List<Integer> A = new ArrayList<Integer>();
		List<Integer> B = new ArrayList<Integer>();
		List<Integer> C = new ArrayList<Integer>();
		for (int i = 0; i < N; i++) {
			A.add(sc.nextInt());
		}
		for (int i = 0; i < N; i++) {
			B.add(sc.nextInt());
		}
		for (int i = 0; i < N; i++) {
			C.add(sc.nextInt());
		}
		Collections.sort(B);
		Collections.sort(C);
		for (int numA : A) {
			int upperB = B.size()-1;
			int lowerB = 0;
			int numB = 0;
			while (lowerB <= upperB) {
				int midB = (lowerB + upperB) / 2;
				if (numA >= B.get(midB)) {
					System.out.println("up");
					lowerB = midB + 1;
					if (B.get(lowerB) > numA) {
						numB = B.get(lowerB);
						break;
					}
				} else {
					System.out.println("down");
					upperB = midB - 1;
					if (lowerB > upperB) {
						numB = B.get(upperB+1);
					} else if (B.get(upperB) <= numA) {
						numB = B.get(upperB + 1);
						break;
					}
				}
			}
			System.out.println("numB=" + numB);
		}
	}
}
