/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(long val) { this.val = val; }
 *     ListNode(long val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode third = new ListNode(0);
        ListNode temp = third;
        int carry = 0, digit, digit1, digit2, sum;
        while(l1!=null || l2!=null || carry!=0) {
            digit1 = (l1 != null)?l1.val : 0;
            digit2 = (l2 != null)?l2.val : 0;
            sum = digit1 + digit2 + carry;
            digit = sum %10;
            carry = sum / 10;
            
            ListNode newnode = new ListNode(digit);
            temp.next =  newnode;
            temp = temp.next;
            
            l1 = (l1!= null)? l1.next : null;
            l2 = (l2!= null)? l2.next : null;
        }
        return third.next;
    }
}