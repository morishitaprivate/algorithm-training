package LeetCode;

public class No104 {

}
//mine
class Solution {
    public int maxDepth(TreeNode root) {
        if (root == null) return 0;
        int depth = 0;
        Queue<TreeNode> queue = new ArrayDeque<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int a = 0; a < size; a++) {
                TreeNode tn = queue.poll();
                System.out.print(tn.val + " ");
                if (tn.left != null) queue.add(tn.left);
                if (tn.right != null) queue.add(tn.right);
            }
            System.out.println("");
            depth++;
        }
        return depth;
    }
}
//smart
class Solution {
	  public int maxDepth(TreeNode root) {
	    if (root == null) {
	      return 0;
	    } else {
	      int left_height = maxDepth(root.left);
	      int right_height = maxDepth(root.right);
	      return java.lang.Math.max(left_height, right_height) + 1;
	    }
	  }
	}