package Contest257;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class atcoderC {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long N = sc.nextLong();
		long ans = 0;
		List<Long> adluts = new ArrayList<Long>();
		List<Long> kids = new ArrayList<Long>();
		String S = sc.next();
		for (int i = 0; i < N; i++) {
			long W = sc.nextLong();
			if (S.charAt(i) == '0') {
				kids.add(W);
			} else {
				adluts.add(W);
			}
		}
		Collections.sort(adluts);
		Collections.sort(kids);
		for (int i = 0; i < adluts.size(); i++) {
			long tmp = adluts.size() - i;
			tmp += ~Collections.binarySearch(kids, adluts.get(i), (x,y) -> x.compareTo(y)>=0?1:-1);
			//if (Collections.binarySearch(kids, adluts.get(i)) < 0) {
			//	tmp += ~Collections.binarySearch(kids, adluts.get(i));
			//} else {
			//	tmp += Collections.binarySearch(kids, adluts.get(i));
			///}
			if (tmp > ans) ans = tmp;
		}
		if (adluts.size() == 0) ans = kids.size();
		System.out.println(ans);
	}
}
