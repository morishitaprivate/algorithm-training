package Contest279;

import java.util.Scanner;

public class atcoderA {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		int cnt = 0;
		for (char ch : S.toCharArray()) {
			if(ch == 'v') cnt++;
			else cnt += 2;
		}
		System.out.println(cnt);
	}
}
