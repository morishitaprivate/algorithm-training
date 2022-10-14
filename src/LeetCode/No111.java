package LeetCode;

public class No111 {

}
//mine
class Solution {
    public int minDepth(TreeNode root) {
        if (root == null) return 0;
        int depth = 1;
        Queue<TreeNode> queue = new ArrayDeque<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int a = 0; a < size; a++) {
                TreeNode tn = queue.poll();
                System.out.print(tn.val +" ");
                if (tn.left == null && tn.right == null) return depth;
                if (tn.left != null) queue.add(tn.left);
                if (tn.right != null) queue.add(tn.right);
            }
            depth++;
        }
        return depth;
    }
}
//smart
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int minDepth(TreeNode root) {
        if (root == null) return 0;
        if (root.left == null) return minDepth(root.right) + 1;
        if (root.right == null) return minDepth(root.left) + 1;
        return Math.min(minDepth(root.left)+1, minDepth(root.right)+1);
    }
}
