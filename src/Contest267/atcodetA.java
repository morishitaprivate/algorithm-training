package Contest267;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class atcodetA {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("Monday", 5);
		map.put("Tuesday", 4);
		map.put("Wednesday", 3);
		map.put("Thursday", 2);
		map.put("Friday", 1);
		String S = sc.next();
		System.out.println(map.get(S));
	}
}
