package LeetCode;

public class No876 {
	public static void main(String[] args) {
		int[] a;
	}
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
    public ListNode middleNode(ListNode head) {
        int size = 0;
        ListNode tmp = head;
        while (tmp != null) {
            size++;
            tmp = tmp.next;
        }
        int mid = size / 2 + 1;
        if (mid == 1) return head;
        ListNode cur = head;
        for (int i = 0; i < mid-1; i++) {
            cur = cur.next;
        }
        head.next = cur;
        return head.next;
     }
}
