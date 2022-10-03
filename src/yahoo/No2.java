package yahoo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class No2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Map<String, Integer> upperMap = new HashMap<>();
		Map<String, Integer> lowerMap = new HashMap<>();
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			String s = sc.next();
			if (s.length() >= 2) {
				upperMap.put(s.substring(0,2),s.length());
				lowerMap.put(s.substring(s.length()-2), s.length());
			}
		}
		int max = -1;
		int a = 0;
		for (String key : lowerMap.keySet()) {
			System.out.print("key=" + key);
			int b = 0;
			for (String key2 : upperMap.keySet()) {
				System.out.println("key2=" + key2);
				if (a != b && key.equals(key2)) {
					max = Math.max(max, lowerMap.get(key) + upperMap.get(key2) - 2);
					System.out.println("max=" + max);
				}
				b++;
			}
			a++;
		}
		System.out.println(max);
	}
}
