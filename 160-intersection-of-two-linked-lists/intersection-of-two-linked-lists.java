/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode(int x) {
 * val = x;
 * next = null;
 * }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode tempA = headA;
        int lenA = 0;
        while (tempA != null) {
            tempA = tempA.next;
            lenA++;
        }

        ListNode tempB = headB;
        int lenB = 0;
        while (tempB != null) {
            tempB = tempB.next;
            lenB++;
        }

        int increment = 0;
        tempA = headA;
        tempB = headB;

        if (lenA > lenB) {
            increment = lenA - lenB;
            for(int i = 0 ; i < increment; i++){
                tempA = tempA.next;
            }
        } else if (lenA < lenB) {
            increment = lenB - lenA;            
            for(int i = 0 ; i < increment; i++){
                tempB = tempB.next;
            }
        } 

        while(tempA != tempB){
            tempA = tempA.next;
            tempB = tempB.next;
        }    

        return tempA;
    }
}