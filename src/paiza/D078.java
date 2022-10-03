package paiza;

import java.util.Scanner;

public class D078 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		for (int i = 0; i < 7; i++) {
			sum += sc.nextInt();
		}
		int X = sc.nextInt();
		if (sum >= X * 7) {
			System.out.println("pass");
		} else {
			System.out.println("failure");
		}
	}
}
