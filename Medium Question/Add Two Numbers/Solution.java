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
        ListNode result = new ListNode();
        ListNode tail = result;
        int carry = 0;
        while(l1 != null && l2 != null){
            int out = (l1.val + l2.val+ carry)%10;
            carry = (l1.val+ l2.val + carry )/10;
            tail.next = new ListNode(out);
            tail = tail.next;
            l1 = l1.next;
            l2 = l2.next;
        }

        while (l1 != null && carry != 0){
            int out = (l1.val + carry)%10;
            carry = (l1.val + carry )/10;
            tail.next = new ListNode(out);
            tail = tail.next;
            l1 = l1.next;
        }
        if(l1 != null){
            tail.next = l1;
        }

        while (l2 != null && carry != 0){
            int out = (l2.val + carry)%10;
            carry = (l2.val + carry )/10;
            tail.next = new ListNode(out);
            tail = tail.next;
            l2 = l2.next;
        }
        if(l2 != null){
            tail.next = l2;
        }

        if(carry != 0){
            tail.next = new ListNode(carry);
        }

        return result.next;
    }
}
