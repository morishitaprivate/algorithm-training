package Contest279;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class atcoderC {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		int W = sc.nextInt();
		char[][] tableS = new char[H][W];
		char[][] tableT = new char[H][W];
		for (int i = 0; i < H; i++) {
			String S = sc.next();
			tableS[i] = S.toCharArray();
		}
		for (int i = 0; i < H; i++) {
			String T = sc.next();
			tableT[i] = T.toCharArray();
		}
		Map<String, Integer> mapS = new HashMap<String, Integer>();
		Map<String, Integer> mapT = new HashMap<String, Integer>();
		for (int i = 0; i < W; i++) {
			char[] tmpS = new char[H];
			char[] tmpT = new char[H];
			for (int j = 0; j < H; j++) {
				tmpS[j] = tableS[j][i];
				tmpT[j] = tableT[j][i];
			}
			String tmpSS = new String(tmpS);
			String tmpTT = new String(tmpT);
			mapS.putIfAbsent(tmpSS, 0);
			mapS.put(tmpSS, mapS.get(tmpSS)+1);
			mapT.putIfAbsent(tmpTT, 0);
			mapT.put(tmpTT, mapT.get(tmpTT)+1);
		}
		if (mapS.equals(mapT)) System.out.println("Yes");
		else System.out.println("No");
	}
}
