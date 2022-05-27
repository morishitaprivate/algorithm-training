package Contest239;

import java.util.Scanner;

public class atcoderA {
	public static void main(String[] args) {
		long H;
		Scanner scan = new Scanner(System.in);
		H = scan.nextLong();
		System.out.println(Math.sqrt(H * (12800000 + H)));
	}
}
