package Contest274;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class atcoderD_4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int x = sc.nextInt();
		int y = sc.nextInt();
		boolean[] dpX = new boolean[20000];
		boolean[] dpY = new boolean[20000];
		List<Integer> A = new ArrayList<Integer>();
		for (int i = 0; i < N; i++) {
			A.add(sc.nextInt());
		}
		dpX[A.get(0) + 10000] = true;
		dpY[10000] = true;
		for (int i = 1; i < N; i++) {
			if (i % 2 == 0) {
				boolean[] nextX = new boolean[20000];
				for (int j = 0;j < dpX.length; j++) {
					if (dpX[j] && j+A.get(i) < dpX.length) nextX[j+A.get(i)] = true;
					if (dpX[j] && j-A.get(i) >= 0) nextX[j-A.get(i)] = true;
				}
				dpX = nextX;
			} else {
				boolean[] nextY = new boolean[20000];
				for (int j = 0;j < dpY.length; j++) {
					if (dpY[j] && j+A.get(i) < dpY.length) nextY[j+A.get(i)] = true;
					if (dpY[j] && j-A.get(i) >= 0) nextY[j-A.get(i)] = true;
				}
				dpY = nextY;
			}
		}
		if (dpX[x+10000] && dpY[y+10000]) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}
