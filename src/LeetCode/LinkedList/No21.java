package LeetCode;

public class No21 {

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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        List<Integer> list = new ArrayList<>();
        ListNode listTmp1 = list1;
        ListNode listTmp2 = list2;
        ListNode ans = new ListNode(0);
        ListNode curr = ans;
        for (;listTmp1 != null;) {
            list.add(listTmp1.val);
            if (listTmp1.next == null) break;
            listTmp1 = listTmp1.next;
        }
        for (;listTmp2 != null;) {
            list.add(listTmp2.val);
            if (listTmp2.next == null) break;
            listTmp2 = listTmp2.next;
        }
        Collections.sort(list);
        for (int elem : list) {
            ListNode tmp = new ListNode(elem);
            curr.next = tmp;
            curr = curr.next;
        }
        return ans.next;
    }
}