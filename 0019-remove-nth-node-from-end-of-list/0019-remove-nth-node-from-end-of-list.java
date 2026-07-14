class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {

        if (head == null) return null;

        ListNode t = head;
        int k = 0;

        while (t.next != null) {
            t = t.next;
            k++;
        }

        
        if (n == k + 1) {
            return head.next;
        }

        ListNode p = head;
        ListNode s = head;

        for (int i = 0; i <= n; i++) {
            p = p.next;
        }

        while (p != null) {
            p = p.next;
            s = s.next;
        }

        s.next = s.next.next;
        return head;
    }
}