package paiza;

import java.util.Scanner;

public class D003 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int i = 1; i < 10; i++) {
			if (i == 9) {
				System.out.println(n * i);
				break;
			}
			System.out.print(n * i + " ");
		}
	}
}
