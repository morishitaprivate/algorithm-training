package Contest280;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class atcoderD {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long K = sc.nextLong();
		int root = (int)Math.sqrt(K)+1;
		long curr = 1;
		boolean flag = false;
		for (int i = 2; i <= K / 2; i++) {
			curr = curr * i;
			if (curr % K == 0) {
				System.out.println(i);
				flag = true;
				break;
			} else {
				curr = curr % K;
			}
		}
		if (!flag) System.out.println(K);
	}
}
