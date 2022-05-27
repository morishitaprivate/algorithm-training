package TypicalQuestion90;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.swing.text.html.HTMLDocument.HTMLReader.SpecialAction;

public class Atcoder4_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int H = Integer.parseInt(sc.next());
		int W = Integer.parseInt(sc.next());
		int[][] list = new int[H+1][W+1];
		for (int i = 0; i < H; i ++) {
			for (int j = 0; j < W; j++) {
				int A = Integer.parseInt(sc.next());
				list[i][j] = A;
				list[i][W] += A;
				list[H][j] += A;
			}
		}
		
		StringBuilder sb = new StringBuilder(); 
		
		for (int i = 0; i < H; i++) {
			for (int j = 0; j < W; j++) {
				if (j != 0) {
					sb.append(" ");
				}
				sb.append(list[i][W] + list[H][j] - list[i][j]);
			}
			sb.append("\n");
		}
		System.out.println(sb.toString());
	}
}
