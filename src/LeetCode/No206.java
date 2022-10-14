package LeetCode;

public class No206 {

}
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode reverseList(ListNode head) {
        Deque<Integer> stack = new ArrayDeque<>();
        ListNode ans = new ListNode(0);
        ListNode curr = ans;
        ListNode tmp = head;
        for (;tmp != null;) {
            stack.addFirst(tmp.val);
            tmp = tmp.next;
        }
        for (;!stack.isEmpty();) {
            ListNode tmpListNode = new ListNode(stack.removeFirst());
            curr.next = tmpListNode;
            curr = curr.next;
        }
        return ans.next;
    }
}