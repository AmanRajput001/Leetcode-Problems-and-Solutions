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
    public ListNode removeNodes(ListNode head) {
        ListNode temp = head;
        ListNode prev = null, next = null;
        ListNode newList = new ListNode();

        while (temp != null) {            
            next = temp.next;
            temp.next = prev;
            prev = temp;
            temp = next;
        }

        temp = prev;
        head = prev;

        while (temp.next != null) {
            if(temp.val > temp.next.val){
                temp.next = temp.next.next;
            }else{
                temp = temp.next;
            }
        }

        temp = head;
        prev = null;
        next = null;
        
        while (temp != null) {            
            next = temp.next;
            temp.next = prev;
            prev = temp;
            temp = next;
        }
        
        return prev;
    }
}