package LeetCode;

public class No142 {
	public static void main(String[] args) {

	}
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
    public ListNode detectCycle(ListNode head) {
        if (head == null) return null;
        Map<ListNode, Integer> map = new HashMap<>();
        ListNode tmp = head;
        map.put(tmp,0);
        while (tmp.next != null){
            if (map.get(tmp.next) != null) {
                return tmp.next;
            }
            map.put(tmp.next,0);
            tmp = tmp.next;
        }
        return null;
    }
}
//smart
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
    public ListNode detectCycle(ListNode head) {
        if (head == null) return null;
        Map<ListNode, Integer> map = new HashMap<>();
        while(head != null && !map.containsKey(head)) {
            map.put(head,0);
            head = head.next;
        }
        return head;
    }
}
