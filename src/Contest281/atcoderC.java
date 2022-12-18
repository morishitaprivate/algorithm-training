package Contest281;

import java.util.Scanner;
import java.util.TreeMap;

public class atcoderC {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long N = sc.nextLong();
		long T = sc.nextLong();
		long sum = 0;
		long prev = 0;
		TreeMap<Long, Long> map = new TreeMap();
		TreeMap<Long, Long> map2 = new TreeMap();
		for (int i = 0; i < N; i++) {
			if (i == 0) map.put(0L,0L);
			long A = sc.nextLong();
			sum += A;
			map.put(prev, prev+A);
			map2.put(prev,(long) (i+1));
			prev = map.get(prev);
		}
		long tmp = T % sum;
		long song = map.floorKey(tmp);
		System.out.println(map2.get(song) + " " + (tmp-song));
		
	}
}
