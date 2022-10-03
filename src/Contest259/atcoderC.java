package Contest259;

import java.util.Scanner;

public class atcoderC {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		String T = sc.next();
		int cnt = 0;
		int tmp = 0;
		for (int i = 0; i < S.length(); i++) {
			if (S.charAt(i) == T.charAt(i+cnt)) {
				tmp++;
			} else {
				if (tmp == 0 || tmp == 1) {
					break;
				} else {
					cnt++;
					i--;
				}
			}
			if(i != S.length()-1 && S.charAt(i+1) == T.charAt(i+cnt+1) && S.charAt(i) != S.charAt(i+1)) {
				tmp = 0;
			}
			//System.out.print("i=" + i);
			if (tmp >= 2 && i == S.length()-1 && i+cnt+1 < T.length() && S.charAt(i) == T.charAt(i+cnt+1)) {
				if (i+cnt+1 != T.length()-1) i--;
				cnt++;
			}
			//System.out.println("count=" + cnt + "tmp=" + tmp);
		}
		if (cnt == T.length() - S.length()) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}
