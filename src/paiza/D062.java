package paiza;

import java.util.Scanner;

public class D062 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int cnt = 0;
		String S = "ABCDEFGHIJ";
		for (int i = 0; i < a; i++) {
			System.out.print(S.charAt(cnt));
			cnt++;
		}
		System.out.println("");
		for (int i = 0; i < b; i++) {
			System.out.print(S.charAt(cnt));
			cnt++;
		}
		System.out.println("");
		for (int i = 0; i < c; i++) {
			System.out.print(S.charAt(cnt));
			cnt++;
		}
	}
}
