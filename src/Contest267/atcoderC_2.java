package Contest267;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class atcoderC_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		List<Long> list = new ArrayList<Long>();
		List<Long> B = new ArrayList<Long>();
		List<Long> sum = new ArrayList<Long>();
		sum.add((long)0);
		for (int i = 0; i < N; i++) {
			long A = sc.nextLong();
			list.add(A);
			sum.add(sum.get(i) + A);
		}
		long first = 0;
		for (int i = 1; i <= M; i++) {
			first += i * list.get(i-1);
		}
		long ans = first;
		
		B.add(first);
		for (int i = 1; i < N - M + 1; i++) {
			B.add(B.get(i-1) + M*list.get(i+M-1) - (sum.get(i+M-1) - sum.get(i-1)));
			ans = Math.max(ans, B.get(i));
		}
		System.out.println(ans);
	}
}
