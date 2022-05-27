package ExhaustiveSearch;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class No7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		double max = 0;
		List<ArrayList<Integer>> points = new ArrayList<ArrayList<Integer>>();
		for (int i = 0; i < N; i++) {
			ArrayList<Integer> point = new ArrayList<Integer>();
			point.add(sc.nextInt());//x
			point.add(sc.nextInt());//y
			points.add(point);
		}
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < i; j++) {
				for (int k = 0; k < j; k++) {
					for (int l = 0; l <k; l++) {
						if (isSquare(points.get(i), points.get(j), points.get(k), points.get(l))) {
							double d12 = distance(points.get(i).get(0), points.get(i).get(1), points.get(j).get(0), points.get(j).get(1));
							double d13 = distance(points.get(i).get(0), points.get(i).get(1), points.get(k).get(0), points.get(k).get(1));
							double area = Math.min(d12, d13) * Math.min(d12, d13);
							if (area > max) {
								max = area;
							}
						}
					}
				}
			}
		}
		System.out.println((int)max);
	}
	
	static boolean isSquare(ArrayList<Integer> point1,ArrayList<Integer> point2,ArrayList<Integer> point3,ArrayList<Integer> point4) {
		double d12 = distance(point1.get(0), point1.get(1), point2.get(0), point2.get(1));
		double d23 = distance(point2.get(0), point2.get(1), point3.get(0), point3.get(1));
		double d34 = distance(point3.get(0), point3.get(1), point4.get(0), point4.get(1));
		double d41 = distance(point4.get(0), point4.get(1), point1.get(0), point1.get(1));
		double d13 = distance(point1.get(0), point1.get(1), point3.get(0), point3.get(1));
		double d24 = distance(point2.get(0), point2.get(1), point4.get(0), point4.get(1));
		if (d41 == d23 && d12 == d34 && d13 == d24) {
			return true;
		} else {
			return false;
		}
	}
	
	static double distance(int x1, int y1, int x2, int y2) {
		return Math.sqrt((x2-x1)*(x2-x1)+ (y2-y1)*(y2-y1));
	}
}
