package Contest254;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class atcoderD {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Integer> squareList = new ArrayList<Integer>();
		int N = sc.nextInt();
		for (int i = 1; i * i <= N; i++) {
			squareList.add(i * i);
		}
		int ans = 0;
		for (int i = 1; i <= N; i++) {
			//for (int j = i; j <= N; j++) {
			for (int num : squareList) {
				if (i * num > N) {
					break;
				}
				System.out.println("i=" + i + "i*num=" + i*num);
				ans++;
			}
			//}
		}
		System.out.println(ans * 2 - N);
		
	}
	
	static boolean isSquare(long i, long j) {
		long tmp = i * j;
		long tmpSqrt = (long) Math.sqrt(tmp);
		if (tmpSqrt * tmpSqrt == tmp) {
			return true;
		} else {
			return false;
		}
	}
	
}
