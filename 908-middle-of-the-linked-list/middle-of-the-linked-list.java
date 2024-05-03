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
    public ListNode middleNode(ListNode head) {
        ListNode temp = head;
        int size = 0;

        while (temp != null) {
            size++;
            temp = temp.next;
        }

        System.out.println(size);
        int mid;

        if ((size + 1) % 2 == 0) {
            mid = (size + 1) / 2;
        } else {
            mid = (size + 2) / 2;
        }

        ListNode midList = new ListNode();
        ListNode mainList = new ListNode();

        temp = head;
        int i = 0;
        boolean flag = false;

        while (temp != null) {
            i++;

            if (i >= mid) {
                if (flag == false) {
                    mainList = new ListNode(temp.val);
                    midList = mainList;
                    flag = true;
                } else {
                    ListNode node = new ListNode(temp.val);
                    midList.next = node;
                    midList = midList.next;
                }
            }

            temp = temp.next;
        }

        return mainList;
    }
}