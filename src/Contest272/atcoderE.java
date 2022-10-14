package Contest272;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class atcoderE {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < N; i++) {
			int A = sc.nextInt();
			list.add(A);
		}
		for (int i = 0; i < M; i++) {
			for (int j = 0; j < N; j++) {
				list.set(j, list.get(j) + j+1);
			}
			for (int j = 0; ;j++) {
				if (!list.contains(j)) {
					System.out.println(j);
					break;
				}
			}
//			List<Integer> tmp = new ArrayList<Integer>(list);
//			Collections.sort(tmp);
//			int upper = tmp.size()-1;
//			int lower = 0;
//			if (tmp.get(0) > 0) {
//				
//			}
		}
	}
}
