package Contest259;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class atcoderC_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		String T = sc.next();
		int cnt = 0;
		List<TreeMap<Character, Integer>> Slist = new ArrayList<TreeMap<Character,Integer>>();
		List<TreeMap<Character, Integer>> Tlist = new ArrayList<TreeMap<Character,Integer>>();
		for (int i = 0; i < S.length(); i++) {
			if (i != S.length()-1 && S.charAt(i) == S.charAt(i+1)) {
				cnt++;
			} else {
				TreeMap<Character, Integer> tmp = new TreeMap<Character, Integer>();
				tmp.put(S.charAt(i), cnt+1);
				Slist.add(tmp);
				cnt = 0;
			}
		}
		cnt = 0;
		for (int i = 0; i < T.length(); i++) {
			if (i != T.length()-1 && T.charAt(i) == T.charAt(i+1)) {
				cnt++;
			} else {
				TreeMap<Character, Integer> tmp = new TreeMap<Character, Integer>();
				tmp.put(T.charAt(i), cnt+1);
				Tlist.add(tmp);
				cnt = 0;
			}
		}
		if (Slist.size() != Tlist.size()) {
			System.out.println("No");
		} else {
			for (int i = 0; i < Slist.size(); i++) {//Slist.size = Tlist.size
				if (Slist.get(i).firstKey() != Tlist.get(i).firstKey() || (Slist.get(i).get(Slist.get(i).firstKey()) < Tlist.get(i).get(Tlist.get(i).firstKey()) && Slist.get(i).get(Slist.get(i).firstKey()) == 1) || Slist.get(i).get(Slist.get(i).firstKey()) > Tlist.get(i).get(Tlist.get(i).firstKey())) {
					System.out.println("No");
					break;
				}
				if (i == Slist.size()-1) {
					System.out.println("Yes");
				}
			}
		}
	}
}
