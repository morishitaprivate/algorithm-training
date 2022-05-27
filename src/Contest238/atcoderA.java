package Contest238;

import java.util.Scanner;

public class atcoderA {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		long n = scan.nextInt();
		long njo = 1;
		long nijo = n * n;
		for (int i = 0; i< n; i++) {
			njo *= 2;
		}
		if (n > 4 || njo > nijo) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}
