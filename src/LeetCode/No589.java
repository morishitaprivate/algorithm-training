package LeetCode;

public class No589 {

}
/*
//Definition for a Node.
class Node {
 public int val;
 public List<Node> children;

 public Node() {}

 public Node(int _val) {
     val = _val;
 }

 public Node(int _val, List<Node> _children) {
     val = _val;
     children = _children;
 }
};
*/

class Solution {
 public List<Integer> preorder(Node root) {
     if (root == null) return new ArrayList<Integer>();
     List<Integer> ans = new ArrayList<>();
     Deque<Node> stack = new ArrayDeque<>();
     stack.addFirst(root);
     while (!stack.isEmpty()) {
         Node N = stack.removeFirst();
         ans.add(N.val);
         for (int i = N.children.size() - 1; i >= 0; i--) {
             Node node = N.children.get(i);
             stack.addFirst(node);
         }
     }
     
     return ans;
 }
}
