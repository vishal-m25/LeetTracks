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
        if (head==null || head.next==null)
        return head;
        ListNode t=head;
        while (t.next!=null){
            if (t.val==t.next.val){
                t.next=t.next.next;
            }
            else
            t=t.next;
        }
        return head;
    }
}
