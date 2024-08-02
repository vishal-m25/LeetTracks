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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
         ListNode kl=new ListNode(0);
        ListNode ll=kl;
        int c=0;
        while(l1!=null || l2!=null||c!=0){
            int a=(l1!=null) ?l1.val:0;
            int b=(l2!=null)?l2.val:0;
            int s=(a+b+c)%10;
            c=(a+b+c)/10;
            ll.next=new ListNode(s);
            ll=ll.next;
            l1=(l1!=null)? l1.next :null;
            l2=(l2!=null)? l2.next :null;
        }
        ListNode kk= kl.next;
        kl.next=null;
        return kk;
    }
}
