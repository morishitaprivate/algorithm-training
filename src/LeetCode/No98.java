package LeetCode;

public class No98 {

}
class Solution {
    public boolean isValidBST(TreeNode root) {
        return isValid(root, null, null);
    }
    
    private boolean isValid(TreeNode node, Integer low, Integer high) {
        if (node == null) return true;
        if ((low != null && node.val <= low) || (high != null && high <= node.val)) {
            return false;
        }
        // 左右両方のノードが満たさなければいけないため。
        return isValid(node.left, low, node.val) && isValid(node.right, node.val, high);
    }
}
