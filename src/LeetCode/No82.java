package LeetCode;

public class No82 {

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
        if (head == null || head.next == null) return head;
        List<Integer> list = new ArrayList<>();
        ListNode ans = new ListNode(0);
        ans.next = head;
        list.add(head.val);
        ListNode curr = ans;
        while (curr.next != null && curr.next.next != null) {
            if (!list.contains(curr.next.next.val)) {
                list.add(curr.next.next.val);
                curr = curr.next;
            } else {
                while (curr.next.next != null &&list.contains(curr.next.next.val)) {
                    curr.next = curr.next.next;
                }
                if (curr.next.next != null ) list.add(curr.next.next.val);
                curr.next = curr.next.next;
            }
        }
        return ans.next;
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
        if (head == null || head.next == null) return head;
        ListNode ans = new ListNode(0);
        ans.next = head;
        boolean checked = false;
        ListNode curr = ans;
        while(curr.next != null) {
            if (curr.next.next != null && curr.next.val == curr.next.next.val) {
                checked = true;
                curr.next = curr.next.next;
                continue;
            }
            if (checked) {
                curr.next = curr.next.next;
                checked = false;
                continue;
            }
            curr = curr.next;
            
        }
        return ans.next;
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
        if (head == null || head.next == null) return head;
        ListNode ans = new ListNode(0);
        ans.next = head;
        ListNode curr = ans;
        while(curr.next != null) {
            if (curr.next.next != null && curr.next.val == curr.next.next.val) {
                ListNode last = curr.next.next;
                while(last.next != null && last.val == last.next.val) {
                    last = last.next;
                }
                curr.next = last.next;
                continue;
            }
            curr = curr.next;
            
        }
        return ans.next;
    }
}
