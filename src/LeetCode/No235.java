package LeetCode;

public class No235 {

}
// smart
class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        while (root != null) {
            if (root.val == p.val || root.val == q.val) return root;
            if (root.val > Math.min(p.val,q.val) && root.val < Math.max(p.val,q.val) )return root;
            root = root.val > p.val ? root.left : root.right; 
        }
        return root;
    }
}

//first
class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        List<TreeNode> ancestorP = new ArrayList<>();
        List<TreeNode> ancestorQ = new ArrayList<>();
        TreeNode tmp = root;
        while (tmp != null) {
            ancestorP.add(tmp);
            if (tmp.val == p.val) {
                break;
            }else if (tmp.val > p.val) {
                tmp = tmp.left;
            } else {
                tmp = tmp.right;
            }
        }
        tmp = root;
        while (tmp != null) {
            ancestorQ.add(tmp);
            if (tmp.val == q.val) {
                break;
            }else if (tmp.val > q.val) {
                tmp = tmp.left;
            } else {
                tmp = tmp.right;
            }
        }
        for (TreeNode tn : ancestorP) {
            System.out.print(tn.val + " ");
        }
        System.out.println("");
        for (TreeNode tn : ancestorQ) {
            System.out.print(tn.val + " ");
        }
        int minSize = Math.min(ancestorP.size(), ancestorQ.size());
        for (int i = 1; i < minSize; i++) {
            if (ancestorP.get(i) != ancestorQ.get(i)) {
                return ancestorP.get(i-1);
            }
        }
        return ancestorP.get(minSize-1);
    }
}
