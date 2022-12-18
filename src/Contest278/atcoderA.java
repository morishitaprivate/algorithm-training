package Contest278;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class atcoderA {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		for (int i = 0; i < Math.min(N, K); i++) {
			int tmp = sc.nextInt();
		}
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < N-K; i++) {
			list.add(sc.nextInt());
		}
		for (int i = 0; i < N; i++) {
			int cont = list.size() > i ? list.get(i) : 0;
			System.out.print(cont + " ");
		}
	}
}
