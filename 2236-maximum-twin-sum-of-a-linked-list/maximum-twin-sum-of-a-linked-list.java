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
    public int pairSum(ListNode head) {
        // if(head.next.next == null){
        //     return head.val + head.next.val;
        // }

        ListNode fast = head.next;
        ListNode slow = head;

        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }

        ListNode prev = null;
        ListNode next;
        ListNode curr = slow;

        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        ListNode twin = prev; 
        ListNode temp = head;
        int max = Integer.MIN_VALUE;
        while(twin.next != null){
            int sum = temp.val + twin.val;
            if(max < (sum)) max = sum;
            temp = temp.next;
            twin = twin.next;
        }

        return max;
    }
}