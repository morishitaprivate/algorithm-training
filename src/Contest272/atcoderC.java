package Contest272;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class atcoderC {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		List<Integer> EvenList = new ArrayList<Integer>();
		List<Integer> OddList = new ArrayList<Integer>();
		for (int i = 0; i < N; i++) {
			int A = sc.nextInt();
			if (A % 2 == 0) {
				EvenList.add(A);
			} else {
				OddList.add(A);
			}
		}
		Collections.sort(EvenList);
		Collections.sort(OddList);
		if (EvenList.size() <= 1 && OddList.size() <= 1) {
			System.out.println(-1);
		} else {
			if (EvenList.size() >= 2 && OddList.size() >= 2) {
				System.out.println(Math.max(EvenList.get(EvenList.size()-1) + EvenList.get(EvenList.size()-2), OddList.get(OddList.size()-1) + OddList.get(OddList.size()-2)));
			} else if (EvenList.size() >= 2) {
				System.out.println(EvenList.get(EvenList.size()-1) + EvenList.get(EvenList.size()-2));
			} else {
				System.out.println(OddList.get(OddList.size()-1) + OddList.get(OddList.size()-2));
			}
 		}
	}
}
