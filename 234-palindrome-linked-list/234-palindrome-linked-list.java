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
        
        
        if(head.next==null){
            return true;
        }
        
        ListNode slow=head;
        ListNode fast=head;
        
        while(fast.next!=null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        
        if(fast!=null){
            slow=slow.next;
        }
        
        ListNode revHead= reversed(slow);
        
        ListNode temp=head;
        while(revHead!=null){
            if(revHead.val==temp.val){
                revHead=revHead.next;
                temp=temp.next;
            }
            else{
                return false;
            }
            
            
        }
        return true;
    }
    public ListNode reversed(ListNode head){
        
        ListNode prev=null;
        while(head!=null){
            ListNode next=head.next;
            head.next=prev;
            prev=head;
            head=next;
          
        }
            return prev;
        }
        
        
        
        
        
//         List<Integer> ls=new ArrayList<>();
//         ListNode temp=head;
//         while(temp!=null){
//             ls.add(temp.val);
//             temp=temp.next;
//         }
//         int end=ls.size()-1;
//         int str=0;
        
//         while(str<end){
//             if(ls.get(str)!=ls.get(end)){
//                 return false;
//             }
//             str++;
//             end--;
//         }
        
        
        
//         while(temp2!=null && temp2.next!=null){
//             if(temp1.val==temp2.val){
//                 temp2=temp2.next;
//                 temp1=temp1.next;
                
//             }
//             else{
//                 return false;
//             }
//         }
        
        
        
        
        

}
