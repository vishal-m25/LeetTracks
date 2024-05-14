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
        if (head==null || head.next==null || k==0){
            return head;
        }
        int sum=1;
        ListNode tt=head,ff=head;
        while(tt.next!=null){
            tt=tt.next;
            sum++;
        }
        k=k%sum;
        for (int i=0;i<k;i++){
            ListNode f=ff;
            while(f.next.next!=null){
                f=f.next;
            }
            ListNode t=f.next;
            f.next=null;
            t.next=ff;
            ff=t;
        }
        return ff;
        
    }
}
