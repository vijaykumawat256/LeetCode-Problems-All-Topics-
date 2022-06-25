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
        
        ListNode ta=headA;
        ListNode tb=headB;
        
        while(ta!=tb){
            ta=  ta!=null ? ta.next : headB;
            tb = tb!=null ? tb.next : headA;
            
        }
        return tb;
        
        
    }
}