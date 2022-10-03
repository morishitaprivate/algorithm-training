package Contest267;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class atcoderB {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		List<Integer> list = new ArrayList<Integer>();
		int tmp = 0;
		
		if (S.charAt(0) == '1') {
			System.out.println("No");
		} else {
			columnNo(list, S);
			if (list.size() == 1) {
				System.out.println("No");
			} else {
				for (int i = 0; i < list.size()-1; i++) {
					if (list.get(i+1) - list.get(i) != 1) {
						System.out.println("Yes");
						tmp++;
						break;
					}
				}
				if (tmp == 0) {
					System.out.println("No");
				}
			}
		}
	}
	
	static List<Integer> columnNo (List<Integer> list, String S) {
		if (S.charAt(6) == '1') {
			list.add(1);
		}
		if (S.charAt(3) == '1') {
			list.add(2);
		}
		if (S.charAt(7) == '1' || S.charAt(1) == '1') {
			list.add(3);
		}
		if (S.charAt(4) == '1') {
			list.add(4);
		}
		if (S.charAt(8) == '1' || S.charAt(2) == '1') {
			list.add(5);
		}
		if (S.charAt(5) == '1') {
			list.add(6);
		}
		if (S.charAt(9) == '1') {
			list.add(7);
		}
		return list;
	}
}
