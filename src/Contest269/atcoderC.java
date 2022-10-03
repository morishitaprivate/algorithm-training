package Contest269;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class atcoderC {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long N = sc.nextLong();
		List<Long> list = new ArrayList<Long>();
		for (long i = 0; ; i++) {
			if (N >> i == 0) break;
			if ((1 & N >> i) == 1) {
				list.add(i);
			}
		}
		for (long i = 0; i < Math.pow(2, list.size()); i++) {
			long ans = 0;
			for (int j = 0; j < list.size(); j++) {
				if ((1 & i >> j) == 1) {
					ans += (long) Math.pow(2, list.get(j));
				}
			}
			System.out.println(ans);
		}
	}
}
