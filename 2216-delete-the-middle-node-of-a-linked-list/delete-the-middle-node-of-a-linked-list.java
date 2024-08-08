/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode deleteMiddle(ListNode head) {
        ListNode slow = head;

        int len = 0;

        while (slow != null) {
            slow = slow.next;
            len++;
        }

        len = len / 2;
        slow = head;

        if (len > 0) {
            while (len-1 > 0  && slow != null) {
                slow = slow.next;
                len--;
            }

            slow.next = slow.next.next;
        }else{
            return null;
        }

        return head;
    }
}