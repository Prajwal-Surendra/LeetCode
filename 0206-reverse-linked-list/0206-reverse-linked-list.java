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
    public ListNode reverseList(ListNode head) {
        if(head==null)
            return null;
        ListNode cur=head,right=head,left=null;
        while(cur!=null)
        {
            right=cur.next;
            cur.next=left;
            left=cur;
            cur=right;
        }
        return left;
    }
}