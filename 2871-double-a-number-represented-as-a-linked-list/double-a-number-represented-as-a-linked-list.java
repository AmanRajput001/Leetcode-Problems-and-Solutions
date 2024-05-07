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
    public ListNode doubleIt(ListNode head) {
        // ListNode temp = head;
        // long num = 0;

        // while (temp != null) {
        // num = num * 10 + temp.val;
        // temp = temp.next;
        // }

        // if (num == 0) {
        // return new ListNode(0);
        // }

        // long dnum = num * 2;

        // ListNode prev = null;

        // while (dnum != 0) {
        // temp = new ListNode();

        // long r = dnum % 10;
        // dnum = dnum / 10;

        // temp.next = prev;
        // temp.val = (int)r;
        // prev = temp;
        // }

        // return temp;

        ListNode temp = head;
        int carry = 0;
        ListNode prev = null;

        while (temp != null) {
            ListNode next = temp.next;
            temp.next = prev;
            prev = temp;
            temp = next;
        }

        temp = prev;

        while (temp != null) {
            int num = temp.val * 2;

            if (carry != 0) {
                num += carry;
                carry = 0;
            }

            if (num > 9) {
                temp.val = num % 10;
                carry = num / 10;
            } else {
                temp.val = num;
            }

            temp = temp.next;
        }

        temp = prev;
        prev = null;

        while (temp != null) {
            ListNode next = temp.next;
            temp.next = prev;
            prev = temp;
            temp = next;
        }

        if (carry != 0) {
            ListNode node = new ListNode(carry);
            node.next = prev;
            prev = node;

        }

        return prev;
    }
}