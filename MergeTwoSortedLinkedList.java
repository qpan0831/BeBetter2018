/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1==null)
            return l2;
        if(l2==null)
            return l1;
        ListNode p1,p2,head,current;
        p1=l1;
        p2=l2;
        head = new ListNode(-1);
        current = head;
        while(p1!=null&&p2!=null)
        {
            if(p1.val>p2.val)
            {
                current.next = new ListNode(p2.val);
                current=current.next;
                p2=p2.next;
            }
            else
            {
                current.next = new ListNode(p1.val);
                current=current.next;
                p1=p1.next;
            }
        }
        while(p1!=null)
        {
                            current.next = new ListNode(p1.val);
                current=current.next;
                p1=p1.next;
        }
        while(p2!=null)
        {
                            current.next = new ListNode(p2.val);
                current=current.next;
                p2=p2.next;
        }
        return head.next;
    }
}