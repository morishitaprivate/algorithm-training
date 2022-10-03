package Contest258;

import java.util.Scanner;

public class atcoderB {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[][] A = new int[N][N];
		long ans = 0;
		for (int i = 0; i < N; i++) {
			String Astring = sc.next();
			for (int j = 0; j < N; j++) {
				A[i][j] = Character.getNumericValue(Astring.charAt(j));
			}
		}
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				long tmp = 0;
				//右
				for (int k = 0; k < N; k++) {
					tmp = tmp * 10 + A[i][(j+k)%N];
					//System.out.println("A[i][(j+k)%N]=" +  A[i][(j+k)%N] + " tmp =" + tmp);
				}
				ans = Math.max(ans, tmp);
				//System.out.println("ans=" + ans);
				tmp = 0;
				//下
				for (int k = 0; k < N; k++) {
					tmp = tmp * 10 + A[(i+k)%N][j];
				}
				ans = Math.max(ans, tmp);
				tmp = 0;
				//左
				for (int k = 0; k < N; k++) {
					tmp = tmp * 10 + A[i][(j-k+N)%N];
				}
				ans = Math.max(ans, tmp);
				tmp = 0;
				//上
				for (int k = 0; k < N; k++) {
					tmp = tmp * 10 + A[(i-k+N)%N][j];
				}
				ans = Math.max(ans, tmp);
				tmp = 0;
				//右上
				for (int k = 0; k < N; k++) {
					tmp = tmp * 10 + A[(i-k+N)%N][(j+k)%N];
				}
				ans = Math.max(ans, tmp);
				tmp = 0;
				//右下
				for (int k = 0; k < N; k++) {
					tmp = tmp * 10 + A[(i+k)%N][(j+k)%N];
				}
				ans = Math.max(ans, tmp);
				tmp = 0;
				//左下
				for (int k = 0; k < N; k++) {
					tmp = tmp * 10 + A[(i+k)%N][(j-k+N)%N];
				}
				ans = Math.max(ans, tmp);
				tmp = 0;
				//左上
				for (int k = 0; k < N; k++) {
					tmp = tmp * 10 + A[(i-k+N)%N][(j-k+N)%N];
				}
				ans = Math.max(ans, tmp);
			}
		}
		System.out.println(ans);
	}
}
