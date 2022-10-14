package LeetCode;

public class No349 {

}
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < nums1.length; i++) {
            map.putIfAbsent(nums1[i],0);
        }
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums2.length; i++){
            if (map.containsKey(nums2[i]) && !list.contains(nums2[i])) {
                list.add(nums2[i]);
            }
        }
        int[] ans = new int[list.size()];
        int cnt = 0;
        for (int num : list) {
            ans[cnt] = num;
            cnt++;
        }
        return ans;
    }
}
