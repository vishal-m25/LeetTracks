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
        int a=0;
        ListNode l=new ListNode(0,head);
        ListNode t=l;
        while(n>0){
            head=head.next;
            n-=1;
        }
        while(head!=null){
            head=head.next;
            t=t.next;
        }
        try{
        t.next=t.next.next;
        }
        catch(Exception e){
            t.next=null;
        }
        return l.next;

    }
}
