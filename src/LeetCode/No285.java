package LeetCode;

public class No285 {

}
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public TreeNode inorderSuccessor(TreeNode root, TreeNode p) {
        TreeMap<Integer, TreeNode> map = new TreeMap<>();
        Deque<TreeNode> stack = new ArrayDeque<>();
        stack.addFirst(root);
        while (!stack.isEmpty()) {
            TreeNode tn = stack.removeFirst();
            map.put(tn.val, tn);
            if (tn.left != null) stack.addFirst(tn.left);
            if (tn.right != null) stack.addFirst(tn.right);
        }
        for (int key : map.keySet()) {
            if (key > p.val) return map.get(key);
        }
        return null;
    }
}
//smart
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public TreeNode inorderSuccessor(TreeNode root, TreeNode p) {
        TreeNode ans = null;
        while (root != null) {
            if (root.val <= p.val) {
                root = root.right;
            } else {
                ans = root;
                root = root.left;
            }
        }
        return ans;
    }
}