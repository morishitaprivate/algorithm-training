package Contest258;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;
import java.util.Scanner;

public class atcoderC {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int Q = sc.nextInt();
		String S = sc.next();
		int cnt = 0;
		for (int i = 0; i < Q; i++) {
			int pre = sc.nextInt();
			if (pre == 1) {
				cnt = (cnt + sc.nextInt()) % N;
			} else {
				int index = sc.nextInt()-1;
				System.out.println(S.charAt((index - cnt + N) % N));
			}
		}
	}
}
