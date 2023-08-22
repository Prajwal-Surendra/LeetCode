/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
     public ListNode detectCycle(ListNode head) {
        int length =0;
        ListNode slow = head;
        ListNode fast = head;
        while(fast !=null && fast.next != null)
        {
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast) {
                length = lengthOfCycle(slow);
                break;
            }
        }
        ListNode f = head;
        ListNode s = head;
        if(length == 0)
            return null;
        while(length > 0)
        {
            s=s.next;
            length--;
        }
        while(f != s)
        {
            f=f.next;
            s=s.next;
        }
        return s;
    }
    public int lengthOfCycle(ListNode slow)
    {
        ListNode temp=slow;
        int len = 0;
        do{
            temp=temp.next;
            len++;
        }while(temp != slow);
        return len;
    }
}