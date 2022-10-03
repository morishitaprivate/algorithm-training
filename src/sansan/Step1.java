package sansan;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Scanner;

public class Step1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int step = sc.nextInt();
		if (step == 1) {
			// (料理番号,在庫数)を組み合わせたマップ。
			Map<Integer, Integer> map = new HashMap<Integer, Integer>();
			int M = sc.nextInt(); // メニューの種類
			for (int i = 0; i < M; i++) {
				int D = sc.nextInt(); // 料理番号
				int S = sc.nextInt(); // 初期在庫数
				int P = sc.nextInt(); // 価格
				map.put(D,S);
			}
			while(sc.hasNext()) {
				String s = sc.next();
				int T = sc.nextInt();// 席番号
				int D = sc.nextInt();// 料理番号
				int N = sc.nextInt();// 注文数
				if (map.get(D) < N) {
					System.out.println("sold out " + T);
				} else {
					for (int j = 0; j < N; j++) {
						System.out.println("received order " + T + " " + D);
					}
					map.put(D,map.get(D)-N);
				}
			}
		} else if (step == 2) {
			// 電子レンジの中に入っている商品番号を格納するリスト
			List<Integer> list = new ArrayList<Integer>();
			// 調理まち状態の商品をキューで保存する
			Queue<Integer> queue = new ArrayDeque<Integer>();
			int M = sc.nextInt();// 注文情報
			int K = sc.nextInt();// レンジの個数
			for (int i = 0; i < M; i++) {
				int D = sc.nextInt(); // 料理番号
				int S = sc.nextInt(); // 初期在庫数
				int P = sc.nextInt(); // 価格
			}
			while(sc.hasNext()) {
				String s = sc.next();
				if (s.equals("received")) {
					String s2 = sc.next();
					int T = sc.nextInt();// 席番号
					int D = sc.nextInt();// 料理番号
					if (list.size() < K) {// 電子レンジに空きがある場合
						list.add(D);
						System.out.println(D);
					} else {
						queue.add(D);// 空きがなければ、調理待ちになる
						System.out.println("wait");
					}	
				} else if (s.equals("complete")) {
					int D = sc.nextInt();
					if (list.isEmpty() || list.indexOf(D) == -1) {// 電子レンジに何もないもしくは調理中のものにDが存在しない
						System.out.println("unexpected input");
					} else if (!queue.isEmpty()) {// 調理待ちがある場合
						int next = queue.poll();
						System.out.println("ok " + next);
						list.remove(list.indexOf(D));
						list.add(next);
					} else {// 調理待ちがない場合
						System.out.println("ok");
						list.remove(list.indexOf(D));
					}
				}
			}
		} else if (step == 3) {
			// (料理番号,注文した席番号のキュー)のマップ。
			Map<Integer, ArrayDeque<Integer>> map = new HashMap<Integer, ArrayDeque<Integer>>();
			int M = sc.nextInt();// 注文情報個数
			for (int i = 0; i < M; i++) {
				int D = sc.nextInt(); // 料理番号
				int S = sc.nextInt(); // 初期在庫数
				int P = sc.nextInt(); // 価格
			}
			while (sc.hasNext()) {
				String s = sc.next();
				if (s.equals("received")) {
					String s2 = sc.next();
					int T = sc.nextInt();
					int D = sc.nextInt();
					if (map.get(D) == null) { // NullPointer対策
						ArrayDeque<Integer> queue = new ArrayDeque<Integer>();
						map.put(D, queue);
					}
					map.get(D).add(T); // 料理番号Dを待っている席番号Tを入れる。
				} else if (s.equals("complete")) {
					int D = sc.nextInt();
					int T = map.get(D).poll(); // 料理番号Dを待っている席の中から、先に注文した席から取り出す。
					System.out.println("ready " + T + " " + D);
				}
			}
		} else {
			// (席番号,会計額)のマップ
			Map<Integer, Integer> check = new HashMap<Integer, Integer>();
			// (料理番号,価格)のマップ
			Map<Integer, Integer> product = new HashMap<Integer, Integer>();
			// (席番号,現在待っている注文数)のマップ
			Map<Integer, Integer> waiting = new HashMap<Integer, Integer>();
			int M = sc.nextInt();//注文情報個数
			for (int i = 0; i < M; i++) {
				int D = sc.nextInt(); //料理番号
				int S = sc.nextInt(); //初期在庫数
				int P = sc.nextInt(); //価格
				product.put(D,P);
			}
			while(sc.hasNext()) {
				String s = sc.next();
				if (s.equals("received")) {
					String s2 = sc.next();
					int T = sc.nextInt();
					int D = sc.nextInt();
					if (waiting.get(T) == null) {
						waiting.put(T,0);
					}
					waiting.put(T,waiting.get(T) + 1);
				
				} else if (s.equals("ready")) {
					int T = sc.nextInt();
					int D = sc.nextInt();
					waiting.put(T,waiting.get(T) - 1);
					if (check.get(T) == null) {
						check.put(T,0);
					}
					// 会計額をここで加算していく
					check.put(T, check.get(T) + product.get(D));
				} else if (s.equals("check")) {
					int T = sc.nextInt();
					if (waiting.get(T) == null) {
						System.out.println(0);
					} else if (waiting.get(T) == 0) {
						System.out.println(check.get(T));
						check.put(T,0);
					} else {
						System.out.println("please wait");
					}
				}
			}
		}
	}
}
