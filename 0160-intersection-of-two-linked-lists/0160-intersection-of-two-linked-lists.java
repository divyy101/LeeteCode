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
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode t=headA;
        ListNode k=headB;
        while(t!=k){
            if(t!=null){
                t=t.next;
            }
            else
               t=headB;
            if(k!=null){
                k=k.next;
            }
            else
              k=headA;   
        }
        return t;
         
    }
}