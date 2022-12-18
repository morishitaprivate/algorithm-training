package Contest277;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class atcoderB {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean ans = true;
		String first = "HDCS";
		String second = "A23456789TJQK";
		Set<String> set = new HashSet<String>();
		int N = sc.nextInt();
		for (int i = 0; i < N; i++) {
			String S = sc.next();
			if (set.contains(S)) ans = false;
			set.add(S);
			if (!first.contains(String.valueOf(S.charAt(0))) || !second.contains(String.valueOf(S.charAt(1)))) {
				ans = false;
			}
		}
		if (ans) System.out.println("Yes");
		else System.out.println("No");
	}
}
