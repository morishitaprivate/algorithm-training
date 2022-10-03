package paiza;

import java.util.Scanner;

public class D017 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int max = 0;
		int min = 0;
		for (int i = 0; i < 5; i++) {
			int num = sc.nextInt();
			if (i == 0) {
				max = num;
				min = num;
			}
			if (num > max) {
				max = num;
			}
			if (num < min) {
				min = num;
			}
		}
		System.out.println(max);
		System.out.println(min);
	}
}
