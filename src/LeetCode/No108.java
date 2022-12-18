package LeetCode;

public class No108 {

}
//first
class Solution {
    public TreeNode sortedArrayToBST(int[] nums) {
        if (nums == null || nums.length == 0) return null;
        TreeNode root = new TreeNode(nums[(nums.length-1)/2]);
        int[] numsLeft = new int[(nums.length-1)/2];
        int[] numsRight = new int[nums.length/2];
        for (int i = 0; i < (nums.length-1)/2; i++) {
            numsLeft[i] = nums[i];
        }
        for (int i = 0; i < nums.length/2; i++) {
            numsRight[i] = nums[i+(nums.length+1)/2];
        }
        if (numsLeft.length != 0) root.left = sortedArrayToBST(numsLeft);
        if (numsRight.length != 0) root.right = sortedArrayToBST(numsRight);
        return root;
    }
}
