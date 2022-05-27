package Contest237;

import java.util.Scanner;

public class atcoder3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String S = scan.next();
		int len = S.length();
		int missA = 0;
		for (int i = len-1; i >= 0; i--) {
			if (S.charAt(i) == 'a') missA++;
			else break;
		}
		for (int i = 0; i <= len-1; i++) {
			if (S.charAt(i) == 'a') missA--;
			else break;
		}
		StringBuilder stb = new StringBuilder();
		for (int i = 0; i < missA; i++) {
			stb.append('a');
		}
		S = stb + S;
		len = S.length();
		
		boolean flag = true;
		
		for (int i = 0; i < len / 2 + 1; i++) {
			if(S.charAt(i) != S.charAt(len - i - 1)) {
				flag = false;
			}
		}
		if (flag == true) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}
