package Contest255;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class atcoderC {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long X = sc.nextLong();
		long A = sc.nextLong();
		long D = sc.nextLong();
		long N = sc.nextLong();
		String XString = String.valueOf(X);
		String DString = String.valueOf(D);
		//System.out.println(XString.substring(XString.length()-3));
		//List<Long> list = new ArrayList<Long>();
		if (D > 0) {
			if (X < A) {
				System.out.println(A - X);
			} else if (X > A + (N-1) * D) {
				System.out.println(X - (A + (N-1) * D));
			} else {
				System.out.println(Math.min(Long.parseLong(XString.substring(DString.length()))%D, D - Long.parseLong(XString.substring(DString.length()))%D));
			}
		} else if (D < 0) {
			if (X > A) {
				System.out.println(X - A);
			} else if (X < A + (N-1) * D) {
				System.out.println((A + (N-1) * D) - X);
			} else {
				System.out.println(Math.min(Long.parseLong(XString.substring(DString.length()))%D, D - Long.parseLong(XString.substring(DString.length()))%D));
			}
		} else {
			System.out.println(Math.abs(X - A));
		}
		
		
		
		
		
		//for (long i = 1; i < 50; i = i + 3) {
		//	list.add(i);
		//	System.out.print(i + " ");
		//}
		//Collections.sort(list);
		//for (long num : list) {
		//	System.out.println(num);
		//}
		//System.out.println("serach = " + Collections.binarySearch(list, X));
		//if (Collections.binarySearch(list, X) == -1) {
		//	System.out.println(list.get(0) - X);
		//} else if (Collections.binarySearch(list, X) == -N-1) {
		//	System.out.println(X - list.get((int) N-1));
		//} else if (Collections.binarySearch(list, X) >=  0) {
		//	System.out.println(0);
		//} else {
		//	System.out.println(Math.min(list.get(-Collections.binarySearch(list, X) - 1) - X, X - list.get(-Collections.binarySearch(list, X) - 2)));
		//}
	}
}
