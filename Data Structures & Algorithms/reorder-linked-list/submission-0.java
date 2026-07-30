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
    public void reorderList(ListNode head) {
        // break list in half
        ListNode slow = head;
        ListNode fast = head.next;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode curr2 = slow.next;
        slow.next = null;

        // reverse second half of list
        ListNode prev = null;
        
        while (curr2 != null) {
            ListNode temp = curr2.next;
            curr2.next = prev;
            prev = curr2;
            curr2 = temp;
        }

        curr2 = prev;

        // merge lists
        ListNode curr1 = head;

        while (curr1 != null && curr2 != null) {
            ListNode temp1 = curr1.next;
            ListNode temp2 = curr2.next;

            curr1.next = curr2;
            curr2.next = temp1;

            curr1 = temp1;
            curr2 = temp2;
        }
    }
}
