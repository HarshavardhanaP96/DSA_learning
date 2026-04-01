/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        
        if(headA==null||headB==null) return null;

        ListNode current1=headA;
        ListNode current2=headB;

        while(current1!=current2){ //this condition itself enough for the if there is no join as well


            if(current1==null){
                current1=headB;
            }else{
                current1=current1.next;
            }

            if(current2==null){
                current2=headA;

            }else{
                current2=current2.next;
            }


        }

        return current1;

    }
}