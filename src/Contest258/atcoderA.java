package Contest258;

import java.util.Scanner;

public class atcoderA {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int K = sc.nextInt();
		int hour = 0;
		int minute = 0;
		if (K >= 60) {
			hour = 22;
			minute = K - 60;
		} else {
			hour = 21;
			minute = K;
		}
		if (minute < 10) {
			System.out.println(hour + ":0" + minute);
		} else {
			System.out.println(hour + ":" + minute);
		}
	}
}
