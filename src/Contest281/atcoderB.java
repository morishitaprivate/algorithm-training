package Contest281;

import java.util.Scanner;

public class atcoderB {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		boolean flag = true;
		if (S.length() != 8) {
			System.out.println("No");
		} else if (!Character.isUpperCase(S.charAt(0)) || !Character.isUpperCase(S.charAt(7))) {
			System.out.println("No");
		} else {
			try {
				Integer num = Integer.parseInt(S.substring(1, 7));
//				System.out.println(num);
				if (num < 100000 || num >= 1000000) {
					throw new NumberFormatException();
				}
			} catch (NumberFormatException e) {
				System.out.println("No");
				flag = false;
			} finally {
				if (flag) System.out.println("Yes");
			}
		}
		
	}
}
