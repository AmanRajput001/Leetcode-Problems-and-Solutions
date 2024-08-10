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
    public ListNode oddEvenList(ListNode head) {
        if(head == null){
            return head;
        }
        
        ListNode temp = head;

        ListNode even = null;
        ListNode tempEven = even;

        ListNode odd = null;
        ListNode tempOdd = odd;

        boolean oddFlag = true;
        while(temp != null){
            
            if(oddFlag){
                oddFlag = false;
                if(odd == null){
                    ListNode node = new ListNode(temp.val);
                    tempOdd = node;
                    odd = tempOdd;                     
                }else{
                    ListNode node = new ListNode(temp.val);
                    tempOdd.next = node;
                    tempOdd = tempOdd.next;
                }

            }else{
                oddFlag = true;
                if(even == null){
                    ListNode node = new ListNode(temp.val);
                    tempEven = node;
                    even = tempEven;
                }else{
                    ListNode node = new ListNode(temp.val);
                    tempEven.next = node;
                    tempEven = tempEven.next;
                }
                
            }

            temp = temp.next;
        }
        
        tempOdd.next = even;
        head = odd;

        return head;
    }
}