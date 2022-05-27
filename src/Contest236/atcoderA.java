package Contest236;

import java.util.Scanner;

public class atcoderA {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.nextLine();
		int a = sc.nextInt();
		int b = sc.nextInt();
		char tmp;
		StringBuilder sb = new StringBuilder(S);
		tmp = S.charAt(a-1);
		sb.setCharAt(a-1, S.charAt(b-1));
		sb.setCharAt(b-1, tmp);
		System.out.println(sb);
	}
}
