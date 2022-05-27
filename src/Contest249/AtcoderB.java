package Contest249;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import javax.net.ssl.SNIHostName;

public class AtcoderB {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		int lower = 0;
		int upper = 0;
		int a = 0;
		Map<Character,Integer> checker = new HashMap<Character, Integer>();
		for (int i = 0; i < S.length(); i++) {
			if (Character.isLowerCase(S.charAt(i))) {
				lower++;
			} else if (Character.isUpperCase(S.charAt(i))) {
				upper++;
			}
			if (checker.get(S.charAt(i)) != null) {
				checker.put(S.charAt(i), checker.get(S.charAt(i)) + 1);
			} else {
				checker.put(S.charAt(i), 1);
			}
		}
		if (lower == S.length() || upper  == S.length()) {
			System.out.println("No");
			a = 1;
		} else {
			for (char ch : checker.keySet()) {
				if (checker.get(ch) > 1) {
					System.out.println("No");
					a++;
					break;
				}
			}
		}
		if (a == 0) {
			System.out.println("Yes");
		}
	}
}
