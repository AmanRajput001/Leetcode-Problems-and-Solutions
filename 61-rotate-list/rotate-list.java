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
    public ListNode rotateRight(ListNode head, int k) {
        // if(head == null || head.next == null) return head;

        // ListNode temp;

        // for (int i = 1; i <= k; i++) {
        //     temp = head;
        //     while (temp.next.next != null) {
        //         temp = temp.next;
        //     }            

        //     temp.next.next = head;
        //     head = temp.next;
        //     temp.next = null;
        // }

        if(head == null) return head;

        int length = 1;
        ListNode temp = head;

        while(temp.next != null){
            temp = temp.next;
            length++;
        }

        int rotate = k % length;

        if(rotate == 0) return head;
        
        temp.next = head;

        for(int i = 1; i <= length - rotate; i++){
            temp = temp.next;
        }

        head = temp.next;
        temp.next = null;

        return head;
    }
}