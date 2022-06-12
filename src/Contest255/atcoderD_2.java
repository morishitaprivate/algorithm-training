package Contest255;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class atcoderD_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Long N = sc.nextLong();
		Long Q = sc.nextLong();
		List<Long> As = new ArrayList<Long>();
		List<Long> Asums = new ArrayList<Long>();
		for (int i = 0; i < N; i++) {
			long A = sc.nextLong();
			As.add(A);
			
		}
		Collections.sort(As);
		long sum = 0;
		for (long A : As) {
			sum += A;
			Asums.add(sum);
		}
		
		//for (long num : As) {
		//	System.out.print(num + " ");
		//}
		//System.out.println("");
		
		for (int i = 0; i < Q; i++) {
			long X = sc.nextLong();
			int bS = Collections.binarySearch(As, X);
			if (bS == -1 || bS == -N-1) {
				System.out.println(Math.abs(Asums.get(Asums.size()-1) - N * X));
			} else if (bS >= 0) {
				System.out.println(Math.abs((bS+1) * X - Asums.get(bS)) + Math.abs((N-bS-1) * X - (Asums.get(Asums.size()-1) - Asums.get(bS))));
			} else {
				bS = -bS - 1;
				System.out.println(Math.abs((bS) * X - Asums.get(bS-1)) + Math.abs((N-bS) * X - (Asums.get(Asums.size()-1) - Asums.get(bS-1))));
			}
		}
	}
}
