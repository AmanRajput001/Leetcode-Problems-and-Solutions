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
    public ListNode reverseList(ListNode head) {
        if (head != null && head.next != null) {
            ListNode temp = head;
            int size = 0;

            while (temp != null) {
                size++;
                temp = temp.next;
            }
            System.out.println(size);

            temp = head;
            int i = 0;
            while (i < size) {
                temp = head;
                int j = 0;
                while (j < size - i - 1) {
                    int num = temp.val;
                    temp.val = temp.next.val;
                    temp.next.val = num;
                    temp = temp.next;
                    j++;
                }
                i++;
            }

        }

        return head;
    }
}