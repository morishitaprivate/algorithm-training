package Contest279;

import java.util.Scanner;

public class atcoderB {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		String T = sc.next();
		boolean ans = false;
		if (S.length() < T.length()) ans = false;
		else {
			int tLen = T.length();
			int left = 0;
			for (int right = tLen; right <= S.length(); right++) {
				if (T.equals(S.substring(left,right))) {
					ans = true;
					break;
				} else {
					left++;
				}
			}
		}
		if (ans) System.out.println("Yes");
		else System.out.println("No");
	}
}
