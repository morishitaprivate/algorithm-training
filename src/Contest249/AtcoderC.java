package Contest249;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class AtcoderC {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		Map<Integer, Integer> checker = new HashMap<Integer, Integer>();
		for (int i = 0; i < S.length(); i++) {
			int num = Character.getNumericValue(S.charAt(i));
			checker.put(num,1);
		}
		
		for (int i = 0; i < 10; i++) {
			if (checker.get(i) == null) {
				System.out.println(i);
				break;
			}
		}
	}
}
