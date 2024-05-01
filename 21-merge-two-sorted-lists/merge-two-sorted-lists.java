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
    ListNode merge;
    ListNode temp;

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode temp1 = list1;
        ListNode temp2 = list2;

        while (temp1 != null && temp2 != null) {
            if (temp1.val < temp2.val) {
                mergeIt(temp1.val);
                temp1 = temp1.next;
            } else {
                mergeIt(temp2.val);
                temp2 = temp2.next;
            }
        }

        if (temp1 != null) {
            while (temp1 != null) {
                mergeIt(temp1.val);
                temp1 = temp1.next;
            }
        }

        if (temp2 != null) {
            while (temp2 != null) {
                mergeIt(temp2.val);
                temp2 = temp2.next;
            }
        }

        return merge;
    }

    private void mergeIt(int val) {
        if (merge == null) {
            merge = new ListNode(val);
            temp = merge;
        } else {
            ListNode node = new ListNode(val);
            temp.next = node;
            temp = temp.next;
        }
    }
}