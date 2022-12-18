package Contest279;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class atcoderE {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		List<Integer> list = new ArrayList<Integer>();
		int[] arr = new int[M+1];
		for (int i = 1; i <= M; i++) {
			arr[i] = sc.nextInt();
		}
		for (int i = 1; i <= M; i++) {
			int curr = 1;
			for (int j = 1; j <= M; j++) {
				if (i == j) continue;
				if (arr[j] == curr) curr = arr[j]+1;
				else if (arr[j]+1 == curr) curr = arr[j];
			}
			System.out.println(curr);
		}
	}
}
