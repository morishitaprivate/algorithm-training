package BinarySearch;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class No20_3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long ans = 0;
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
		Collections.sort(A);
		Collections.sort(C);
		
	}
}
