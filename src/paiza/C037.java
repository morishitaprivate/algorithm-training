package paiza;

import java.util.Scanner;

public class C037 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S1 = sc.next();
		String S2 = sc.next();
		int day = Character.getNumericValue(S1.charAt(3)) * 10 + Character.getNumericValue(S1.charAt(4));
		int hour = Character.getNumericValue(S2.charAt(0)) * 10 + Character.getNumericValue(S2.charAt(1));
		while (hour >= 24) {
			hour -= 24;
			day++;
		}
		for (int i = 0; i < 3; i++) {
			System.out.print(S1.charAt(i));
		}
		if (day < 10) {
			System.out.print("0" + day);
		} else {
			System.out.print(day);
		}
		System.out.print(" ");
		if (hour < 10) {
			System.out.print("0" + hour);
		} else {
			System.out.print(hour);
		}
		for (int i = 2; i < 5; i++) {
			System.out.print(S2.charAt(i));
		}
	}
}
