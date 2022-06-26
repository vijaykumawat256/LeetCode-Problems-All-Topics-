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
    public ListNode rotateRight(ListNode head, int k) {
        if(k==0 || head==null){
            return head;
        }
   
        
        ListNode temp=head;
        int len=1;
        while(temp.next!=null){
            len++;
            temp=temp.next;
            
        }
        temp.next=head;
    
        k=k%len;
        
         ListNode right=head;
         for(int i=0;i<len-k-1;i++){
             right=right.next;;
         }
        
        head=right.next;
        right.next=null;
        
       
        
        return head;
        
    }
}