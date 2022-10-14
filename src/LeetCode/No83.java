package LeetCode;

public class No83 {

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
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null) return head;
        ListNode curr = head;
        List<Integer> list = new ArrayList<>();
        list.add(curr.val);
        while (curr.next != null) {
            if (list.contains(curr.next.val)) {
                curr.next = curr.next.next;
                continue;
            }
            list.add(curr.next.val);
            curr = curr.next;
        }
        return head;
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
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null) return head;
        ListNode curr = head;
        while (curr.next != null) {
            if (curr.next.val == curr.val){
                curr.next = curr.next.next;
                continue;
            }
            curr = curr.next;
        }
        return head;
    }
}