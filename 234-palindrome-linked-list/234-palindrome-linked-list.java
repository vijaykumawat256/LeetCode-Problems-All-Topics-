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
        
        
//         if(head.next==null){
//             return true;
//         }
        
//         ListNode slow=head;
//         ListNode fast=head;
        
//         while(fast!=null && fast.next!=null){
//             slow=slow.next;
//             fast=fast.next.next;
//         }
        
//         ListNode curr=slow;
//         ListNode prev=null;
//         ListNode next=curr.next;
        
//         while(curr!=null && curr.next!=null){
//             curr.next=prev;
            
//             prev=curr;
//             curr=next;
//             next=next.next;
//         }
//         ListNode temp=head;
//         while(curr!=null){
//             if(curr.val==temp.val){
//                 curr=curr.next;
//                 temp=temp.next;
//             }
//             else{
//                 return false;
//             }
//         }
        
        
        
        
        
        List<Integer> ls=new ArrayList<>();
        ListNode temp=head;
        while(temp!=null){
            ls.add(temp.val);
            temp=temp.next;
        }
        int end=ls.size()-1;
        int str=0;
        
        while(str<end){
            if(ls.get(str)!=ls.get(end)){
                return false;
            }
            str++;
            end--;
        }
        
        
        
//         while(temp2!=null && temp2.next!=null){
//             if(temp1.val==temp2.val){
//                 temp2=temp2.next;
//                 temp1=temp1.next;
                
//             }
//             else{
//                 return false;
//             }
//         }
        
        
        
        
        
        return true;
    }
}