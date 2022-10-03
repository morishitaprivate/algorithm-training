package Interview;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class No1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < n; i++) {
			list.add(sc.nextInt());
		}
		int q = sc.nextInt();
		int cnt = 0;
		for (int i = 0; i < q; i++) {
			int qCont = sc.nextInt();
			if (isExist(qCont, list)) cnt++;
		}
		System.out.println(cnt);
	}
	
	static boolean isExist (int n, List<Integer> list) {
		int a = 0;
		int b = list.size()-1;
		while (a <= b) {
			int mid = (a + b) / 2;
			if (n == list.get(mid)) return true;
			
			if (n > list.get(mid)) {
				a = mid+1;
			} else {
				b = mid-1;
			}
		}
		return false;
	}
}
