package LeetCode;

public class No724 {

}
class Solution {
	public int pivotIndex(int[] nums) {
		int[] left = new int[nums.length];
		int[] right = new int[nums.length];
		int tmp = 0;
		for (int i = 0; i < nums.length; i++) {
			left[i] = tmp + nums[i];
			tmp += nums[i];
		}
		tmp = 0;
		for (int i = nums.length-1; i >= 0; i--) {
			right[i] = tmp + nums[i];
			tmp += nums[i];
		}
		for (int i = 0; i < nums.length; i++) { 
			if (right[i] == left[i]) {
				return i;
			}
		}
		return -1;
	}
}