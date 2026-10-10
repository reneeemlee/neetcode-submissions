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
        ListNode prev = null;
        ListNode curr = head;

        while (curr != null) {
            // saves next node
            ListNode temp = curr.next;
            // reverse pointer
            curr.next = prev;
            // move previous pointer to curr
            prev = curr;
            // move curr pointer to next
            curr = temp;
        }

        // prev will be head of new reversed list
        return prev;
    }
}
