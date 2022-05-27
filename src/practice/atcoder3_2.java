package practice;

import java.util.ArrayList;
import java.util.Scanner;

public class atcoder3_2 {
	public static void main(String[] args) {;
		Scanner scan = new Scanner(System.in);
		ArrayList<Integer> intList = new ArrayList<Integer>();
		while(scan.hasNext()) {
			int word = scan.nextInt();
			intList.add(word);
		}
		scan.close();
		int maxnum = 0;
		for (int i = 0; i < 3; i++) {
			int max = 0;
			for (int k = 0; k < intList.size(); k++) {
				if (intList.get(k) > max) {
					max = intList.get(k);
					maxnum = k;
				}
			}
			intList.set(maxnum, 0);
			if (i == 2) {
				System.out.println(max);
			}
		}
	}

}
