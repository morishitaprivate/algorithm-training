package Contest259;

import java.time.Year;
import java.util.Scanner;

public class atcoderB {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double d = sc.nextDouble();
		//double r = Math.sqrt(a * a + b * b);
		double dRadian = Math.toRadians(d);
		System.out.println((a * Math.cos(dRadian)- b * Math.sin(dRadian)) + " " + (a * Math.sin(dRadian) + b * Math.cos(dRadian)));
	}
}
