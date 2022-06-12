package Contest255;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class atcoderD {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Long N = sc.nextLong();
		Long Q = sc.nextLong();
		List<Long> A = new ArrayList<Long>();
		for (int i = 0; i < N; i++) {
			A.add(sc.nextLong());
		}
		for (int i = 0; i < Q; i++) {
			long X = sc.nextLong();
			long sum = 0;
			for (int j = 0; j < N; j++) {
				sum += Math.abs(X-A.get(j));
			}
			System.out.println(sum);
		}
	}
}
