package Contest279;

import java.util.Scanner;

public class atcoderD {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// n = (A/2B)^(2/3)-1
		long A = sc.nextLong();
		long B = sc.nextLong();
		double n = Math.pow(1.0*A/(2*B), 2.0/3)-1;
		double floor = B*Math.floor(n) + A/Math.sqrt(Math.floor(n)+1);
		double ceil = B*Math.ceil(n) + A/Math.sqrt(Math.ceil(n)+1);
		System.out.println(Math.min(floor, ceil));
	}
}
