package Contest239;

import java.util.Scanner;

public class atcoder3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int x1, y1, x2, y2;
		x1 = scan.nextInt();
		y1 = scan.nextInt();
		x2 = scan.nextInt();
		y2 = scan.nextInt();
		
		if((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1) <= 20) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}
