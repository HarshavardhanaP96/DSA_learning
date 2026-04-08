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
        
        ListNode dummyNode=new ListNode(0);
        dummyNode.next=head;

        ListNode prevConn=dummyNode;
        ListNode groupStart=head;
        

        while(true){            
            // Find kth node
            ListNode current = groupStart;
            int count = 1;

            while (count < k && current != null) {
                current = current.next;
                count++;
            }

            if (current == null) break;

            ListNode nextGroup=current.next;

            //reverse the group
            ListNode groupEnd=reverse(groupStart,k);

            //managing connections
            prevConn.next=groupEnd;
            groupStart.next=nextGroup;

            //moving pointers
prevConn = groupStart;
groupStart = nextGroup;


        }

        return dummyNode.next;
    }


    public ListNode reverse(ListNode head,int k){
        ListNode prev=null,current=head;

        while(k>0){
            ListNode next=current.next;
            current.next=prev;
            prev=current;
            current=next;
            k--;
        }

        return prev;
    }
}