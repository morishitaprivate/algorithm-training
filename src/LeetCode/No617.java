package LeetCode;

public class No617 {

}
class Solution {
    public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
        if (root1 == null && root2 == null) return null;
        if (root1 == null) {
            return root2;
        } else if (root2 == null) {
            return root1;
        } else {
            root2.val += root1.val;
            root2.left = mergeTrees(root1.left, root2.left);
            root2.right = mergeTrees(root1.right, root2.right);
        }
        return root2;
    }
}