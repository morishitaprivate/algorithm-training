package practice;

import java.util.Scanner;

class atcoder1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = Integer.parseInt(scan.nextLine());
		int fi = Integer.parseInt(scan.nextLine());
		for (int j = 0; j < n-1; j++) {
			int ne = Integer.parseInt(scan.nextLine());
			if (fi == ne) {
				System.out.println("stay");
			} else if (fi > ne) {
				System.out.println("down " + (fi - ne));
			} else {
				System.out.println("up " + (ne - fi));
			}
			fi = ne;
		}
	}
}
