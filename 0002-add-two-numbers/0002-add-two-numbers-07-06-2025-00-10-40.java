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
        
        long n1=0,n2=0,i=0;

        while(l1!=null && l2!=null){
            n1+=l1.val*Math.pow(10,i);
            n2+=l2.val*Math.pow(10,i);
            i++;
            l1=l1.next;
            l2=l2.next;
        }

        while(l1!=null){
            n1+=l1.val*Math.pow(10,i);
            i++;
            l1=l1.next;
        }        
        
        while(l2!=null){
            n2+=l2.val*Math.pow(10,i);
            i++;
            l2=l2.next;
        }

        long total=n1+n2;
        System.out.println(total);

        ListNode newHead=new ListNode(0);

        if (total==0) return newHead;
        ListNode current=newHead;

        while(total!=0){
            ListNode newNode=new ListNode((int) total%10);
            current.next=newNode;
            current=current.next;
            total=total/10;
        }

        return newHead.next;
    }
}