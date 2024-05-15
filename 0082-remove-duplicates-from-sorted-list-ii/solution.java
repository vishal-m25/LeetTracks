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
    public ListNode deleteDuplicates(ListNode head) {
        ListNode dummy = new ListNode(-1);
        dummy.next=head;
        
        ListNode curr = dummy.next;
		
        ListNode prev = dummy;
       
        while(curr!=null){
        
            if(curr.next==null){
                break;
            }
            
            if(curr.next!=null && curr.next.val!=curr.val){
                prev=curr;
                curr=curr.next;
            }else{
                while(curr.next!=null && curr.next.val==curr.val){
                    curr=curr.next;
                }
                prev.next=curr.next;
                curr=curr.next;
            }
 
            
        }
        return dummy.next;
    }
}
