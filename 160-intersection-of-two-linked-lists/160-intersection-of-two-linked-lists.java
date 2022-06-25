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
        int lena=0;
        int lenb=0;
        
        while(ta!=null){
            ta=ta.next;
            lena++;
        }
        while(tb!=null){
            tb=tb.next;
            lenb++;
        }
        
        int diff=Math.abs(lena-lenb);
        
        ta=headA;
        tb=headB;
        
        if(lena>lenb){
            while(diff!=0){
                ta=ta.next;
                diff--;
            }
            
        }
        else{
            while(diff!=0){
                tb=tb.next;
                diff--;
            }
        }
        
        while(ta !=tb){
            ta=ta.next;
            tb=tb.next;
            
            if(ta==null || tb==null){
                return null;
            }
            
            
        }
        return tb;
        
    }
}