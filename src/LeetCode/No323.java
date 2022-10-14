package LeetCode;

public class No323 {

}
class Solution {
    public int countComponents(int n, int[][] edges) {
        int ans = 0;
        List<List<Integer>> lists = new ArrayList<>();
        boolean[] checked = new boolean[n];
        for (int i = 0; i < n; i++) {
            List<Integer> list = new ArrayList<>();
            lists.add(list);
        }
        for (int i = 0; i < edges.length; i++) {
            lists.get(edges[i][0]).add(edges[i][1]);
            lists.get(edges[i][1]).add(edges[i][0]);
            
        }
        for (int i = 0; i < n; i++) {
            if (checked[i]) continue;
            Deque<Integer> stack = new ArrayDeque<>();
            stack.addFirst(i);
            checked[i] = true;
            while (!stack.isEmpty()) {
                int num = stack.removeFirst();
                for (int connected : lists.get(num)) {
                    if (!checked[connected]) {
                        stack.add(connected);
                        checked[connected] = true;
                    }
                }
            }
            ans++;
        }
        return ans;
    }
}
