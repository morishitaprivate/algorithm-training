package Contest274;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.HashSet;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public class atcoderD_3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int x = sc.nextInt();
		int y = sc.nextInt();
		List<Integer> A = new ArrayList<Integer>();
		for (int i = 0; i < N; i++) {
			A.add(sc.nextInt());
		}
		Queue<Integer> queueX = new ArrayDeque<Integer>();
		Queue<Integer> queueY = new ArrayDeque<Integer>();
		queueX.add(A.get(0));
		queueY.add(0);
		for (int i = 1; i < N; i++) {
			if (i % 2 == 0) {
				int size = queueX.size();
				for (int j = 0; j < size; j++) {
					int X = queueX.poll();
					queueX.add(X + A.get(i));
					queueX.add(X - A.get(i));
//					System.out.println("add " + (X+A.get(i)) + " & " + (X-A.get(i)));
				}
			} else {
				int size = queueY.size();
				for (int j = 0; j < size; j++) {
					int Y = queueY.poll();
					queueY.add(Y + A.get(i));
					queueY.add(Y- A.get(i));
				}
			}
		}
		if (queueX.contains(x) && queueY.contains(y)) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}
