package Contest262;

import java.util.Scanner;

public class atcoderA {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int Y = sc.nextInt();
		if (Y % 4 != 3) {
			System.out.println(4 * (Y / 4) + 2);
		} else {
			System.out.println(4 * (Y / 4) + 6 );
		}
	}
}

