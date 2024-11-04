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
    public ListNode sortList(ListNode head) {
        if (head == null || head.next == null) return head;

        ListNode mid= middleNode(head);
        ListNode leftHalf = sortList(head);
        ListNode rightHalf = sortList(mid);

        return merge(leftHalf, rightHalf);
    }
     public ListNode middleNode(ListNode head) {
        ListNode slow = head, fast = head, mid;
            while (fast.next != null && fast.next.next != null) {
                slow = slow.next;
                fast = fast.next.next;
            }
            mid = slow.next;
            slow.next = null;
            return mid;
    }
    
	// 21. Merge Two Sorted Lists
    public ListNode merge(ListNode list1, ListNode list2) {
        if(list1==null){
            return list2;
        }
        if(list2==null){
            return list1;
        }
        if(list1.val<=list2.val){
            list1.next=merge(list1.next,list2);
            return list1;
        }
        else{
             list2.next=merge(list1,list2.next);
            return list2;
        }
    }
}
