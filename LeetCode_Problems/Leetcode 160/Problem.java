/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public int findlength(ListNode head){
        int count = 0;
        ListNode temp = head;
        while(temp != null){
            count = count + 1;
            temp = temp.next;
        }
        return count;
    }
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int n1 = findlength(headA);
        int n2 = findlength(headB);
        ListNode tempA = headA; ListNode tempB = headB;
        int d = Math.abs(n1 - n2);
        if(n2 > n1){
            while(d != 0){
                d = d - 1;
                tempB = tempB.next;
            }
        }
        else if(n1 > n2){
            while(d != 0){
                d = d - 1;
                tempA = tempA.next;
            }
        }
        while(tempA != null){
            if(tempA == tempB){
                return tempA;
            }
            tempA = tempA.next;
            tempB = tempB.next;
        }
        return null;
    }
}