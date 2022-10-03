package Contest267;
// 制限時間エラー

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class atcoderC {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		long ans = 0;
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < N; i++) {
			list.add(sc.nextInt());
		}
		for (int i = 0; i < N - M + 1; i++) {
			long tmp = 0;
			for (int j = 1; j <= M; j++) {
				tmp += j * list.get(i + j -1);
			}
			if (i == 0) {
				ans = tmp;
			} else {
				ans = Math.max(ans, tmp);
			}
		}
		System.out.println(ans);
	}
}
