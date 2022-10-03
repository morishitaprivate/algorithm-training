package paiza;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.TreeMap;

public class C053 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<String> list = new ArrayList<String>();
		int N = sc.nextInt();
		int max = 0;
		int sum = 0;
		for (int i = 0; i < N; i++) {
			String c = sc.next();
			if (!c.equals("x10")) {
				if (Integer.parseInt(c) > max) {
					max = Integer.parseInt(c);
				}
				sum += Integer.parseInt(c);
			}
			list.add(c);
		}
		if (list.contains("0")) {
			sum -= max;
		}
		if (list.contains("x10")) {
			sum *= 10;
		}
		System.out.println(sum);
	}
}
