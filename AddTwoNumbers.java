/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode p1=l1,p2=l2;
        ListNode head = new ListNode(-1);
        ListNode current=head;
        int carry=0;
        while(p1!=null || p2!=null)
        {
            
            int x= p1!=null?p1.val:0;
            int y= p2!=null?p2.val:0;
            int res = x+y+carry;
            carry=res/10;
            current.next=new ListNode(res%10);
            current=current.next;
            if(p1!=null) p1=p1.next;
            if(p2!=null) p2=p2.next;
            res=0;
            
        }
        if(carry>0)
            current.next = new ListNode(carry);
        return head.next;
    }
}