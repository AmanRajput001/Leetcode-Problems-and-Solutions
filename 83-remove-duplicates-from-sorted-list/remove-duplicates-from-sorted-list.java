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
    public ListNode deleteDuplicates(ListNode head) {
        ListNode temp = head;

        while(temp != null){
            ListNode node = temp.next;
            int value = temp.val;
            while(node != null){
                if(node.val == value) {
                    node = node.next; 
                }else {
                    break;
                }
            }
            temp.next = node;
            temp = temp.next;
        }

        return head;
    }
}