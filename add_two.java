// add two numbers in reverse order linked list representation
class solution {
    public ListNode addTwoNumber(ListNode l1, ListNode l2) {
        ListNode dummyHead = new ListNode(0);
        ListNode current = dummyHead;
        int carry = 0;
        while (l1 != null && l2 != null) {
            int val = l1.val + l2.val + carry;
            carry = val / 10;
            l3.next = new l3.next(val % 10);
            l3 = l3.next;
            l2 = l2.next;
            l1 = l1.next;

        }
        while (l1 != null) {
            int val = l1.val + carry;
            carry = val / 10;
            l3.next = new l3.next(val % 10);
            l3 = l3.next;
            l1 = l1.next;

        }
        while (l2 != null) {
            int val = l2.val + carry;
            carry = val / 10;
            l3.next = new l3.next(val % 10);
            l3 = l3.next;
            l2 = l2.next;
        }

        if (carry > 0) {
            l3.next = new ListNode(carry);

        }
        return dummyHead;
    }
}