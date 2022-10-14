package paiza;

import java.util.List;
import java.util.Scanner;

public class D092 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] x = new int[2];
		int[] y = new int[2];
		int[] p = new int[2];
		
		for (int i = 0; i < 2; i++) {
			x[i] = sc.nextInt();
			y[i] = sc.nextInt();
			p[i] = sc.nextInt();
		}
		
		double first = (double)p[0] / (x[0] * y[0]);
		double second = (double)p[1] / (x[1] * y[1]);
		if (first < second) {
			System.out.println(x[0] + " " + y[0] + " " + p[0]);
		} else if (first > second) {
			System.out.println(x[1] + " " + y[1] + " " + p[1]);
		} else {
			System.out.println("DRAW");
		}
	}
}

