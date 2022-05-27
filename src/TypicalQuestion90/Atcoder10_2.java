package TypicalQuestion90;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Atcoder10_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Map<Integer, Integer>> studentsInfo = new ArrayList<Map<Integer,Integer>>();
		int N = Integer.parseInt(sc.next());
		for (int i = 0; i < N; i++) {
			int C = Integer.parseInt(sc.next());
			int P = Integer.parseInt(sc.next());
			Map<Integer, Integer> student = new HashMap<Integer, Integer>();
			student.put(C,P);
			studentsInfo.add(student);
		}
		int Q = Integer.parseInt(sc.next());
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < Q; i++) {
			int L = Integer.parseInt(sc.next());
			int R = Integer.parseInt(sc.next());
			int A = 0;
			int B = 0;
			for (int j = L-1; j < R; j++) {
				if (studentsInfo.get(j).containsKey(1)) {
					A += studentsInfo.get(j).get(1);
				} else if (studentsInfo.get(j).containsKey(2)) {
					B += studentsInfo.get(j).get(2);
				}
			}
			sb.append(A + " " + B);
			sb.append("\n");
		}
		System.out.println(sb.toString());
	}
}
