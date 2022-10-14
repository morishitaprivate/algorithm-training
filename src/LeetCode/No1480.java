package LeetCode;

public class No1480 {

}
class Solution {
	public int[] runningSum(int[] nums) {
		int[] ans = new int[nums.length];
		int tmp = 0;
		for (int i = 0; i < nums.length; i++) {
			ans[i] = tmp + nums[i];
			tmp += nums[i];
		}
		return ans;
	}
}
