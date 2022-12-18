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
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        List<Integer> list = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums1) {
            map.putIfAbsent(num,0);
        }
        for (int num : nums2) {
            if (map.containsKey(num)) {
                list.add(num);
                map.remove(num);
            }
        }
        int[] ans = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            ans[i] = list.get(i);
        }
        return ans;
    }
}
