package BinarySearch;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Binary {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(1);
		list.add(1);
		list.add(2);
		list.add(5);
		list.add(5);
		
		int upper = list.size()-1;
		int lower = 0;
		int num = 5;
		int ans = 0;
		for (int n : list) {
			System.out.print(n + " ");
		}
		System.out.println("");
		while (upper >= lower) {
			int mid = (upper + lower) / 2;
			if (num > list.get(mid)) {
				lower = mid+1;
			} else {
				upper = mid-1;
			}
			ans = lower;
		}
		System.out.println(ans);
		System.out.println(Collections.binarySearch(list, 1)); //配列内に存在する数字ならば、それが書いてあるインデックス番号の最後の番号を返す。
		System.out.println(Collections.binarySearch(list, 4)); //配列内に存在しなければ、入るべきインデックス*-1 - 1されたものが返される。
		System.out.println(~Collections.binarySearch(list, 4)); //先頭に〜をつけることで、配列内に存在しなければ、入るべきインデックスを返してくれる。
		System.out.println(~Collections.binarySearch(list, 1)); //逆に、存在する数字だったら、入るべきインデックス*-1 -1されたものがくる。
		//このコレクションを使うのならば、~つけないバージョンが負の数だったら、〜をつけることで入るべきインデックスを得ることができる。みたいにつかうのかな？
		System.out.println(~Collections.binarySearch(list, 1, (x,y) -> x.compareTo(y)>=0?1:-1));
	}
}
