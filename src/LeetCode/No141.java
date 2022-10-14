package LeetCode;

public class No141 {

}
/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        List<ListNode> list = new ArrayList<>();
        ListNode tmp = head;
        if (tmp == null) return false;
        list.add(tmp);
        while (tmp.next != null) {
            tmp = tmp.next;
            if (list.contains(tmp)) return true;
            list.add(tmp);
        }
        return false;
    }
}
// public class Solution {

//     public boolean hasCycle(ListNode head) {
//         ListNode fast = head;
//         ListNode slow = head;
//         while (fast != null && fast.next != null) {
//             fast = fast.next.next;
//             slow = slow.next;
//             if (fast == slow) return true;
//         }
//         return false;
//     }
// }