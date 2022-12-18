package Contest280;

import java.util.Arrays;
import java.util.Scanner;

public class atcoderC {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		String T = sc.next();
		int[] s = new int[26];
		int[] t = new int[26];
		int ans = T.length();
		for (int i = 0; i < S.length(); i++) {
			s[S.charAt(i)-'a']++;
			t[T.charAt(i)-'a']++;
			if (!Arrays.equals(s, t)) {
				ans = i+1;
				break;
			}
		}
		System.out.println(ans);
	}
}
