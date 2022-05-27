package Contest241;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.security.auth.kerberos.KerberosKey;

public class atcoderD {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int Q = scan.nextInt();
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < Q; i++) {
			int k = 0;
			int c = scan.nextInt();
			int x = scan.nextInt();
			if (c != 1) {
				k = scan.nextInt();
			}
			if (c == 1) {
				list.add(x);
			} else if(c == 2){
				if (k > list.size()) {
					System.out.println(-1);
					continue;
				}
				list.sort((a , b) -> a - b);
				int count = 0;
				for (int j = 0; j < list.size(); j++) {
					if (list.get(j) <= x) {
						count ++;
					}
				}
				if (count < k) {
					System.out.println(-1);
					continue;
				} else {
					System.out.println(list.get(count - k));
				}
			} else if(c == 3) {
				if (k > list.size()) {
					System.out.println(-1);
					continue;
				}
				int count = 0;
				for (int j = 0; j < list.size(); j++) {
					if (list.get(j) >= x) {
						count ++;
					}
				}
				if (count < k) {
					System.out.println(-1);
					continue;
				} else {
					System.out.println(list.get(list.size() - count + k - 1));
				}
			}
		}
	}
}
