package ExhaustiveSearch;

import java.util.Scanner;

public class No6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String S = sc.next();
		int count = 0;
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				for (int k = 0; k < 10; k++) {
					int tmp = 0;
					int n1 = S.indexOf(String.valueOf(i));
					int n2 = S.indexOf(String.valueOf(j),n1+1);
					int n3 = S.indexOf(String.valueOf(k),n2+1);
					if (n1>=0 && n2>=0 && n3>=0) {
						count++;
					}
				}
			}
		}
		System.out.println(count);
	}
}
