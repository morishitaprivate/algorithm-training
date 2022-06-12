package paiza;

import java.util.Scanner;

public class D044 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s1 = sc.next();
		String s2 = sc.next();
		if (s2.equals("F")) {
			System.out.println("Hi, Ms. " + s1);
		} else {
			System.out.println("Hi, Mr. " + s1);
		}
	}
}
