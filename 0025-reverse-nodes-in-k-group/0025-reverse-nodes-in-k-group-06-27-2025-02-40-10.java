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

    public ListNode reverseKGroup(ListNode head, int k) {
        if(head==null ||k==1) return head;

        ListNode dummy=new ListNode(0);

        ListNode groupStart=head, backConn=dummy;
        dummy.next=head;

        while(true){

            ListNode current=groupStart;
            int k2=1;

            while(k2!=k && current!=null){
                current=current.next;
                k2++;  
            }

            if(current==null) break;

            ListNode frontConn=current.next;

            ListNode groupEnd=reverse(groupStart,current);

            //back Connection
            backConn.next=groupEnd;

            //front Connection
            groupStart.next=frontConn;

            //moving pointers
            backConn=groupStart;
            groupStart=frontConn;

        }
        
        return dummy.next;
    }

    public ListNode reverse(ListNode head, ListNode Tail){

        ListNode current=head, prev=null, stop=Tail.next;

        while(current!=stop){
            ListNode nextNode=current.next;
            current.next=prev;
            prev=current;
            current=nextNode;
        }

        return prev;
    }
}