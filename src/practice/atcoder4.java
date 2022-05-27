package practice;

import java.util.Scanner;

public class atcoder4 {
	public static void main(String[] args) {
		int missnum = 0;
		int wrongnum = 0;
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] array = new int[n];
		int[] numCheck = new int[n];
		for (int i = 0; i < n; i++) {
			numCheck[i] = 0;
		}
		for (int i = 0; i < n; i++) {
			array[i] = scan.nextInt();
		}
		for (int j : array) {
				numCheck[j-1]++;
		}
		for (int i = 0; i < n; i++) {
			if (numCheck[i] == 2) {
				wrongnum = i + 1;
			} else if (numCheck[i] == 0) {
				missnum = i + 1;
			}
		}
		if (missnum == 0) {
			System.out.println("Correct");
		} else {
			System.out.println(wrongnum + " " + missnum);
		}
	}
}
