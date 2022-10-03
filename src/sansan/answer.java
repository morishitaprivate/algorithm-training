package sansan;
import java.util.*;

public class answer {
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
		int step = sc.nextInt();
    //ステップ１
		if (step == 1) {
			Map<Integer, Integer> map = new HashMap<Integer, Integer>();
			int M = sc.nextInt(); //メニューの種類
			for (int i = 0; i < M; i++) {
				int D = sc.nextInt(); //料理番号
				int S = sc.nextInt(); //初期在庫数
				int P = sc.nextInt(); //価格
				map.put(D,S);
			}
			while(sc.hasNext()) {
				String s = sc.next();
				int T = sc.nextInt();//席番号
				int D = sc.nextInt();//料理番号
				int N = sc.nextInt();//注文数
				if (map.get(D) < N) {
					System.out.println("sold out " + T);
				} else {
					for (int j = 0; j < N; j++) {
						System.out.println("received order " + T + " " + D);
					}
					map.put(D,map.get(D)-N);
				}
			}
		} else if (step == 2) { //ステップ2
      Map<Integer, Integer> map = new HashMap<Integer, Integer>();
			List<Integer> list = new ArrayList<Integer>();
			Queue<Integer> queue = new ArrayDeque<Integer>();
			int M = sc.nextInt();//注文情報
			int K = sc.nextInt();//レンジの個数
			for (int i = 0; i < M; i++) {
				int D = sc.nextInt(); //料理番号
				int S = sc.nextInt(); //初期在庫数
				int P = sc.nextInt(); //価格
				map.put(D,S);
			}
			while(sc.hasNext()) {
				String s = sc.next();
				if (s.equals("received")) {
					String s2 = sc.next();
					int T = sc.nextInt();
					int D = sc.nextInt();
					if (list.size() < K) {
						list.add(D);
						System.out.println(D);
					} else {
						queue.add(D);
						System.out.println("wait");
					}	
				} else if (s.equals("complete")) {
					int D = sc.nextInt();
					if (list.isEmpty() || list.indexOf(D) == -1) {
						System.out.println("unexpected input");
					} else if (!queue.isEmpty()) {
						int next = queue.poll();
						System.out.println("ok " + next);
						list.remove(list.indexOf(D));
						list.add(next);
					} else {
						System.out.println("ok");
						list.remove(list.indexOf(D));
					}
				}
			}
    } else if (step == 3) {
      Map<Integer, Integer> map = new HashMap<Integer, Integer>();
			Map<Integer, ArrayDeque<Integer>> map2 = new HashMap<Integer, ArrayDeque<Integer>>();
			int M = sc.nextInt();//注文情報個数
			for (int i = 0; i < M; i++) {
				int D = sc.nextInt(); //料理番号
				int S = sc.nextInt(); //初期在庫数
				int P = sc.nextInt(); //価格
				map.put(D,S);
			}
			while (sc.hasNext()) {
				String s = sc.next();
				if (s.equals("received")) {
					String s2 = sc.next();
					int T = sc.nextInt();
					int D = sc.nextInt();
					if (map2.get(D) == null) {
						ArrayDeque<Integer> queue = new ArrayDeque<Integer>();
						map2.put(D, queue);
					}
					map2.get(D).add(T);
				} else if (s.equals("complete")) {
					int D = sc.nextInt();
					int T = map2.get(D).poll();
					System.out.println("ready " + T + " " + D);
				}
			}
    } else {
      Map<Integer, Integer> check = new HashMap<Integer, Integer>();
			Map<Integer, Integer> product = new HashMap<Integer, Integer>();
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
