package Contest262;

import java.util.Scanner;

public class atcoderD {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for (int i = 1; i <= 100; i++) {
			System.out.println("2^" + i + "= " + (long)Math.pow(2,i));
		}
	}
}
