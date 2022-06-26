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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        
        if(head.next==null){
            return null;
        }
        ListNode temp=head;
        int len=0;
        while(temp!=null){
            len++;
            temp=temp.next;
            
        }
        ListNode temp1=head;
        for(int i=1;i<len-n;i++){
            temp1=temp1.next;
        }
        if(len==n){
            head=head.next;
        }
        else{
            temp1.next=temp1.next.next;
        }
        
        
        return head;
        
    }
}