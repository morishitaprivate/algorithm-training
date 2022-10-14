package LeetCode;

public class No1 {

}
class Solution {
    public int[] twoSum(int[] nums, int target) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i++){
            list.add(nums[i]);
        }
        int ans1 = 0; 
        int ans2 = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.contains(target - list.get(i))) {
                ans1 = i;
                ans2 = list.indexOf(target-list.get(i));
                if (ans1 == ans2) continue;
                break;
            }
        }
        int[] ans = {ans1, ans2};
        return ans;
    }
}
class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            if (map.containsKey(target-num)) {
                return new int[] {map.get(target-num), i};
            }
            map.put(num,i);
        }
        return new int[] {};
    }
}
