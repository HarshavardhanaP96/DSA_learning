class Solution {

    public ListNode reverseKGroup(ListNode head, int k) {
        if (head == null || k == 1) return head;

        // Dummy node to simplify head connection
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode prevGroupEnd = dummy;
        ListNode groupStart = head;

        while (true) {
            // Find the k-th node from groupStart
            ListNode groupEnd = prevGroupEnd;
            for (int i = 0; i < k && groupEnd != null; i++) {
                groupEnd = groupEnd.next;
            }

            if (groupEnd == null) break; // Less than k nodes left

            ListNode nextGroupStart = groupEnd.next;

            // Reverse current k-group
            ListNode prev = null, curr = groupStart;
            while (curr != nextGroupStart) {
                ListNode temp = curr.next;
                curr.next = prev;
                prev = curr;
                curr = temp;
            }

            // Connect previous group to the new head (prev)
            prevGroupEnd.next = prev;
            groupStart.next = nextGroupStart;

            // Move to the next group
            prevGroupEnd = groupStart;
            groupStart = nextGroupStart;
        }

        return dummy.next;
    }
}
