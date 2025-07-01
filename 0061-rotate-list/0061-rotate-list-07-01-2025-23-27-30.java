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
        
        if(head==null||head.next==null||k==0) return head;

        int l=1;
        ListNode current=head;

        while(current.next!=null){
            current=current.next;
            l++;
        }

        current.next=head;
        k=k%l;

        if(k==0) return head;
        int ptr=1;
        current=head;

        while(ptr<=k){
            current=current.next;
            ptr++;
        }

        ListNode newHead=current.next;
        current.next=null;
        return newHead;

    }
}