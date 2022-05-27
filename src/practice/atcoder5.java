package practice;

import java.util.ArrayList;
import java.util.Scanner;

import javax.xml.transform.Templates;

public class atcoder5 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int Q = scan.nextInt();
		String[][] follow = new String[n+1][n+1];
		for (int i = 0; i <= n; i++) {
			for (int j = 0; j <= n; j++) {
				follow[i][j] = "N";
			}
		}
		for (int i = 0; i < Q; i++) {
			int doing = scan.nextInt();
			if(doing == 1) {
				int followPerson = scan.nextInt();
				int followedPerson = scan.nextInt();
				follow[followPerson][followedPerson] = "Y";
			} else if(doing == 2) {
				int personTwo = scan.nextInt();
				for(int j = 1; j <= n; j++) {
					if(follow[j][personTwo].equals("Y")) {
						follow[personTwo][j] = "Y";
					}
				}
			} else {
				int personThree = scan.nextInt();
				ArrayList<Integer> tmp = new ArrayList<Integer>();
				for (int j = 1; j <= n; j++) {
					if (j == personThree) continue;
					if (follow[personThree][j].equals("Y")) {
					tmp.add(j);
					}
				}
				for (int j = 0; j < tmp.size(); j++) {
					for (int k = 1; k<= n; k++) {
						if (follow[tmp.get(j)][k].equals("Y")) {
							follow[personThree][k] = "Y!";
						}
					}
				}
				for (int o = 1; o <= n; o++) {
					for(int j = 1; j <= n; j++) {
						if (follow[o][j].equals("Y!")) {
							follow[o][j] = "Y";
						}
					}
				}
			}
		}
		for (int i = 1; i<= n; i++) {
			follow[i][i] = "N";
		}
		for (int i = 1; i <= n; i++) {
			for(int j = 1; j <= n; j++) {
				System.out.print(follow[i][j]);
			}
			System.out.println("");
		}
	}
}
