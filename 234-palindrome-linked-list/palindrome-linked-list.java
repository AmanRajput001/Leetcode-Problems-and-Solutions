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
    public boolean isPalindrome(ListNode head) {
        //copy Link List
        ListNode s = head;
        ListNode headCopy = null;
        ListNode temp = headCopy;

        while(s != null){
            ListNode node = new ListNode(s.val);

            if(headCopy == null){
                temp = node;
                headCopy = temp;
            }else{
                temp.next = node;
                temp = temp.next;
            }

            s = s.next;
        }

        // Reverse Link List
        ListNode curr = head;
        ListNode prev = null;
        ListNode next = null;

        while(curr != null){
            next = curr.next;            
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        head = prev;
        
        // check
        while(head != null){
            if(head.val != headCopy.val) return false;
            head = head.next;
            headCopy = headCopy.next;
        }

        return true;
    }
}